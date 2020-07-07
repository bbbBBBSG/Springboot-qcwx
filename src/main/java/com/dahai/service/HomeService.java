package com.dahai.service;

import com.dahai.dao.QxHomeDAO;
import com.dahai.dao.QxListDetailDAO;
import com.dahai.dao.model.QxHome;
import com.dahai.dao.model.QxHomeExample;
import com.dahai.dao.model.QxListDetail;
import com.dahai.dao.model.QxListDetailExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service
public class HomeService {

    @Autowired
    private QxHomeDAO qxHomeDAO;

    @Autowired
    private QxListDetailDAO qxListDetailDAO;

    /**
     * 定时添加数据到首页
     */
    public void insertHome() {
        qxHomeDAO.deleteAll();

        QxListDetailExample example = new QxListDetailExample();
        example.setLimit(4);
        example.setOffset(0L);
        example.setOrderByClause("create_date desc");
        QxListDetailExample.Criteria criteria = example.createCriteria();
        criteria.andTypeOneEqualTo("1");
        List<QxListDetail> qxListDetails_news = qxListDetailDAO.selectByExample(example);
        int sort=0;
        for (QxListDetail detail : qxListDetails_news) {
            sort++;
            QxHome qxHome = new QxHome();
            qxHome.setContent(detail.getContent());
            Date createDate = detail.getCreateDate();
            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String date = format.format(createDate);
            qxHome.setDate(date);
            qxHome.setId(detail.getId());
            qxHome.setIntro(detail.getIntro());
            qxHome.setSort(String.valueOf(sort));
            qxHome.setThumb(detail.getThumb());
            qxHome.setTitle(detail.getTitle());
            qxHome.setTypeOne(detail.getTypeOne());
            qxHome.setTypeOneName(detail.getTypeOneName());
            qxHome.setTypeTwo(detail.getTypeTwo());
            qxHome.setTypeTwoName(detail.getTypeTwoName());
            qxHomeDAO.insert(qxHome);
        }
        sort=0;
        example.clear();
        example.setLimit(4);
        example.setOffset(0L);
        example.setOrderByClause("create_date desc");
        example.createCriteria().andTypeOneEqualTo("2");
        List<QxListDetail> qxList_weixiuanli = qxListDetailDAO.selectByExample(example);
        for (QxListDetail detail : qxList_weixiuanli) {
            sort++;
            QxHome qxHome = new QxHome();
            qxHome.setContent(detail.getContent());
            Date createDate = detail.getCreateDate();
            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String date = format.format(createDate);
            qxHome.setDate(date);
            qxHome.setId(detail.getId());
            qxHome.setIntro(detail.getIntro());
            qxHome.setSort(String.valueOf(sort));
            qxHome.setThumb(detail.getThumb());
            qxHome.setTitle(detail.getTitle());
            qxHome.setTypeOne(detail.getTypeOne());
            qxHome.setTypeOneName(detail.getTypeOneName());
            qxHome.setTypeTwo(detail.getTypeTwo());
            qxHome.setTypeTwoName(detail.getTypeTwoName());
            qxHomeDAO.insert(qxHome);
        }
        sort=0;
        example.clear();
        example.setLimit(4);
        example.setOffset(0L);
        example.setOrderByClause("create_date desc");
        example.createCriteria().andTypeOneEqualTo("3");
        List<QxListDetail> qxList_qcwtjd = qxListDetailDAO.selectByExample(example);
        for (QxListDetail detail : qxList_qcwtjd) {
            sort++;
            QxHome qxHome = new QxHome();
            qxHome.setContent(detail.getContent());
            Date createDate = detail.getCreateDate();
            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String date = format.format(createDate);
            qxHome.setDate(date);
            qxHome.setId(detail.getId());
            qxHome.setIntro(detail.getIntro());
            qxHome.setSort(String.valueOf(sort));
            qxHome.setThumb(detail.getThumb());
            qxHome.setTitle(detail.getTitle());
            qxHome.setTypeOne(detail.getTypeOne());
            qxHome.setTypeOneName(detail.getTypeOneName());
            qxHome.setTypeTwo(detail.getTypeTwo());
            qxHome.setTypeTwoName(detail.getTypeTwoName());
            qxHomeDAO.insert(qxHome);
        }
        sort=0;
        example.clear();
        example.setLimit(4);
        example.setOffset(0L);
        example.setOrderByClause("create_date desc");
        example.createCriteria().andTypeOneEqualTo("4");
        List<QxListDetail> qxList_qcxljsbj = qxListDetailDAO.selectByExample(example);
        for (QxListDetail detail : qxList_qcxljsbj) {
            sort++;
            QxHome qxHome = new QxHome();
            qxHome.setContent(detail.getContent());
            Date createDate = detail.getCreateDate();
            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String date = format.format(createDate);
            qxHome.setDate(date);
            qxHome.setId(detail.getId());
            qxHome.setIntro(detail.getIntro());
            qxHome.setSort(String.valueOf(sort));
            qxHome.setThumb(detail.getThumb());
            qxHome.setTitle(detail.getTitle());
            qxHome.setTypeOne(detail.getTypeOne());
            qxHome.setTypeOneName(detail.getTypeOneName());
            qxHome.setTypeTwo(detail.getTypeTwo());
            qxHome.setTypeTwoName(detail.getTypeTwoName());
            qxHomeDAO.insert(qxHome);
        }
    }

    /**
     * 加载首页数据
     */
    public List<QxHome> getHomeData() {
        QxHomeExample example = new QxHomeExample();
        return qxHomeDAO.selectByExample(example);
    }
}
