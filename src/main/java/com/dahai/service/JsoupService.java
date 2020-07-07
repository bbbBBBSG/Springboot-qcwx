package com.dahai.service;


import com.alibaba.fastjson.JSON;
import com.dahai.NavJson;
import com.dahai.bean.NavJsonBean;
import com.dahai.bean.QxNewsDetail;
import com.dahai.dao.QxListDetailDAO;
import com.dahai.dao.model.QxListDetail;
import com.dahai.utils.SHA256Util;
import com.dahai.utils.StringUtils;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * 爬虫服务
 */
@Service
public class JsoupService {

    @Autowired
    private QxListDetailDAO qxListDetailDAO;

    /**
     * 获取所有列表数据
     */
    public void loadQxNewsList(String url, String type, String typeName, String typeTwo, String typeNameTwo) throws Exception {
        Document doc = Jsoup.connect(url).get();
        Elements elementsByClass = doc.getElementsByClass("box-log-list");
        if (elementsByClass.size()>0) {
            Element element = elementsByClass.get(0);
            Elements loops = element.getElementsByClass("loop");
            for (Element loop : loops) {
                Elements thumb = loop.getElementsByClass("thumb");
                if (thumb.size()<=0) continue;
                String href = thumb.get(0).getElementsByTag("a").attr("href");
                String image = thumb.get(0).getElementsByTag("img").attr("src");
                Elements wraps = loop.getElementsByClass("wrap");
                Element wrap = wraps.get(0);
                String title = wrap.getElementsByTag("a").text();
                String info = wrap.getElementsByClass("info").text();
                if (info!=null) {
                    info = info.replaceAll("\r|\n", "");
                } else {
                    continue;
                }
                String date = wrap.getElementsByClass("meta").text();

                String id = SHA256Util.getSHA256StrJava(href);
                QxListDetail qxListDetail = new QxListDetail();
                qxListDetail.setCreateDate(new Date());
                qxListDetail.setId(id);
                qxListDetail.setIntro(info);
                qxListDetail.setLikes(0);
                qxListDetail.setContent("");
                qxListDetail.setShareUrl("");
                qxListDetail.setTitle(title);
                qxListDetail.setThumb(image);
                qxListDetail.setTypeOne(type);
                qxListDetail.setTypeOneName(typeName);
                qxListDetail.setTypeTwo(typeTwo);
                qxListDetail.setTypeTwoName(typeNameTwo);

                try {
                    QxNewsDetail qxNewsDetail = getNewsDetail(href);
                    String html = qxNewsDetail.getHtml();
                    if (!StringUtils.checkStrNull(html)) {
                        qxListDetail.setContent(html);
                        qxListDetailDAO.insertNotSame(qxListDetail);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /**
     * 获取详情
     */
    public QxNewsDetail getNewsDetail(String url) throws Exception {
        QxNewsDetail qxNewsDetail = new QxNewsDetail();
        Document doc = Jsoup.connect(url).get();
        Elements elementsByClass = doc.getElementsByClass("box-log-content");
        if (elementsByClass.size()>0) {
            Element content = elementsByClass.get(0);
            String title = content.getElementsByClass("entry-title").get(0).text();
            Elements entryMeta = content.getElementsByClass("entry-meta");
            Elements a = entryMeta.get(0).getElementsByTag("a");
            String date = entryMeta.text();
            date = date.substring(date.lastIndexOf(" ")+1);
            String source = a.text();
            Elements detail = content.getElementsByClass("entry-content");
            String html = detail.html();
            Elements tagsElements = content.getElementsByClass("entry-tags");
            String[] tags = new String[tagsElements.size()];
            for (int j = 0; j < tagsElements.size(); j++) {
                String tag = tagsElements.get(j).getElementsByTag("i").text();
                tags[j] = tag;
            }

            qxNewsDetail.setUrl(url);
            qxNewsDetail.setTitle(title);
            qxNewsDetail.setDate(date);
            qxNewsDetail.setSource(source);
            qxNewsDetail.setHtml(html);
            qxNewsDetail.setTags(tags);
        }
        return qxNewsDetail;
    }

    /**
     * 分类数据
     */
    public void loadNavList() throws Exception {
        NavJsonBean navJsonBean = JSON.parseObject(NavJson.navJson, NavJsonBean.class);
        if (navJsonBean!=null) {
            List<NavJsonBean.ResultBean> result = navJsonBean.getResult();
            for (NavJsonBean.ResultBean bean : result) {
                String oneUrl = bean.getHref();
                String type_one = bean.getType_one();
                String type_one_name = bean.getType_one_name();

                loadQxNewsList(oneUrl,type_one,type_one_name,null,null);
                List<NavJsonBean.ResultBean.SonsBean> sons = bean.getSons();
                for (NavJsonBean.ResultBean.SonsBean son : sons) {
                    String twoUrl = son.getHref();
                    String type_two = son.getType_two();
                    String type_two_name = son.getType_two_name();
                    loadQxNewsList(twoUrl,type_one,type_one_name,type_two,type_two_name);
                }
            }
        }
    }
}
