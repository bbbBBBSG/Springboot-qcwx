package com.dahai.controller;

import com.dahai.bean.*;
import com.dahai.dao.model.QxHome;
import com.dahai.dao.model.QxListDetail;
import com.dahai.service.HomeService;
import com.dahai.service.QxService;
import com.dahai.service.UserService;
import com.dahai.utils.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController()
public class QxController {

    @Autowired
    private UserService userService;
    @Autowired
    private QxService qxService;
    @Autowired
    private HomeService homeService;

    @GetMapping("test")
    public BaseResponse test() {
        homeService.insertHome();
        return new BaseResponse();
    }

    /**
     * 首页数据
     */
    @GetMapping("/home/getHomeNews")
    public BaseResponse getHomeNews() {
        BaseResponse response = new BaseResponse();
        List<QxHome> homeNews = homeService.getHomeData();
        List<Map<String, Object>> maps = new ArrayList<Map<String, Object>>();
        if (homeNews != null) {
            // 最新资讯
            Map<String, Object> newsMaps = new HashMap<String, Object>();
            List<QxHome> newsLists = new ArrayList<QxHome>();
            // 维修案例
            Map<String, Object> caseMaps = new HashMap<String, Object>();
            List<QxHome> caseLists = new ArrayList<QxHome>();
            // 汽车问题
            Map<String, Object> questionMaps = new HashMap<String, Object>();
            List<QxHome> questionLists = new ArrayList<QxHome>();
            // 技术标准
            Map<String, Object> tecMaps = new HashMap<String, Object>();
            List<QxHome> tecLists = new ArrayList<QxHome>();
            // 近期热门
            Map<String, Object> hotMaps = new HashMap<String, Object>();
            for (QxHome homeNew : homeNews) {
                if ("1".equalsIgnoreCase(homeNew.getTypeOne())) {
                    newsLists.add(homeNew);
                } else if ("2".equalsIgnoreCase(homeNew.getTypeOne())) {
                    caseLists.add(homeNew);
                } else if ("3".equalsIgnoreCase(homeNew.getTypeOne())) {
                    questionLists.add(homeNew);
                } else if ("4".equalsIgnoreCase(homeNew.getTypeOne())) {
                    tecLists.add(homeNew);
                }
            }
            // 排序
            Collections.sort(newsLists, new Comparator<QxHome>() {
                @Override
                public int compare(QxHome o1, QxHome o2) {
                    return Integer.valueOf(o1.getSort()) - Integer.valueOf(o2.getSort());
                }
            });
            Collections.sort(caseLists, new Comparator<QxHome>() {
                @Override
                public int compare(QxHome o1, QxHome o2) {
                    return Integer.valueOf(o1.getSort()) - Integer.valueOf(o2.getSort());
                }
            });
            Collections.sort(questionLists, new Comparator<QxHome>() {
                @Override
                public int compare(QxHome o1, QxHome o2) {
                    return Integer.valueOf(o1.getSort()) - Integer.valueOf(o2.getSort());
                }
            });
            Collections.sort(tecLists, new Comparator<QxHome>() {
                @Override
                public int compare(QxHome o1, QxHome o2) {
                    return Integer.valueOf(o1.getSort()) - Integer.valueOf(o2.getSort());
                }
            });
            newsMaps.put("items", newsLists);
            newsMaps.put("title", "最新资讯");
            caseMaps.put("items", caseLists);
            caseMaps.put("title", "维修案例");
            questionMaps.put("items", questionLists);
            questionMaps.put("title", "汽车问题");
            tecMaps.put("items", tecLists);
            tecMaps.put("title", "技术标准");
            maps.add(newsMaps);
            maps.add(caseMaps);
            maps.add(questionMaps);
            maps.add(tecMaps);
        }

        response.result = maps;

        return response;
    }

    @GetMapping("/home/getNavTree")
    public BaseResponse getNavTree() {
        BaseResponse response = new BaseResponse();
        try {
            response.result = qxService.navTree();
        } catch (Exception e) {
            e.printStackTrace();
            response.error_code = "1050";
            response.reason = "服务器异常";
        }
        return response;
    }


    @GetMapping("/detail/getNewsDetail")
    public BaseResponse getNewsDetail(String id) {
        BaseResponse response = new BaseResponse();
        try {
            response.result = qxService.getNewsDetail(id);
        } catch (Exception e) {
            e.printStackTrace();
            response.error_code = "1050";
            response.reason = "服务器异常";
        }
        return response;
    }

    @GetMapping("detail/getComment")
    public BaseResponse getComment(int page, int pageSize, String id) {
        BaseResponse response = new BaseResponse();
        if (StringUtils.checkStrNull(id)) {
            response.error_code = "1001";
            response.reason = "参数异常";
            return response;
        }
        response.result = qxService.getComment(page,pageSize,id);

        return response;
    }

    /**
     * 列表
     *
     * @param typeOne 类型：1.最新资讯 2.维修案例 3.汽车问题 4.技术标准
     *                5.电路图 6.故障码 7.维修图书 8.维修手册 9.工具使用
     *                11-20.分类里的数据
     */
    @GetMapping("/list/getQxNews")
    public BaseResponse getQxLatestNews(int page, int pageSize, String typeOne, String typeTwo) {
        BaseResponse response = new BaseResponse();
        try {
            response.result = qxService.getQxList(page, pageSize, typeOne, typeTwo);
        } catch (Exception e) {
            e.printStackTrace();
            response.error_code = "1050";
            response.reason = "服务器异常";
        }
        return response;
    }

    /**
     * 发表评论
     */
    @PostMapping("detail/comment")
    public BaseResponse comment(@RequestBody QxDetailCommentRequest request) {
        BaseResponse response = new BaseResponse();
        if (StringUtils.checkStrNull(request.getUserId()) ||
                StringUtils.checkStrNull(request.getQxId()) ||
                StringUtils.checkStrNull(request.getContent())) {
            response.error_code = "1001";
            response.reason = "参数异常";
            return response;
        }

        if (userService.findUserByUserId(request.getUserId()).size()==0) {
            response.error_code = "1001";
            response.reason = "用户不存在";
            return response;
        }
        qxService.comment(request.getUserId(),request.getQxId(),request.getContent());

        return response;
    }

    /**
     * 点赞文章
     */
    @GetMapping("detail/likeDetail")
    public BaseResponse likeDetail(String id,String userId) {
        BaseResponse response = new BaseResponse();
        if (StringUtils.checkStrNull(id) || StringUtils.checkStrNull(userId)) {
            response.error_code = "1001";
            response.reason = "参数异常";
            return response;
        }

        if (userService.findUserByUserId(userId).size()==0) {
            response.error_code = "1001";
            response.reason = "用户不存在";
            return response;
        }
        qxService.likeDetail(id);

        return response;
    }

    /**
     * 点赞评论
     */
    @GetMapping("detail/likeComment")
    public BaseResponse likeComment(int id,String userId) {
        BaseResponse response = new BaseResponse();
        if ( id==0 || StringUtils.checkStrNull(userId)) {
            response.error_code = "1001";
            response.reason = "参数异常";
            return response;
        }

        if (userService.findUserByUserId(userId).size()==0) {
            response.error_code = "1001";
            response.reason = "用户不存在";
            return response;
        }
        qxService.likeComment(id);

        return response;
    }

    @GetMapping("/list/getQxList")
    public BaseResponse getQxList(int page,int pageSize) {
        BaseResponse response = new BaseResponse();
        if (page==0) {
            page =1;
        }
        if (pageSize==0) {
            pageSize = 15;
        }
        try {
            List<QxListDetail> qxList = qxService.getQxList(page, pageSize);
            long qxCount = qxService.getQxCount();
            PageBean<QxListDetail> pageBean = new PageBean<QxListDetail>();
            pageBean.listData = qxList;
            pageBean.page = page;
            pageBean.count = qxCount;
            float a = (qxCount*1f) / pageSize;
            pageBean.totalPage = (int) Math.ceil(a);
            response.result = pageBean;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return response;
    }

    @PostMapping("/list/addQxList")
    public BaseResponse addQxList(@RequestBody QxListDetail detail) {
        BaseResponse response = new BaseResponse();
        if (StringUtils.checkStrNull(detail.getTitle()) || StringUtils.checkStrNull(detail.getTypeOneName()) || StringUtils.checkStrNull(detail.getContent())) {
            response.error_code = "1001";
            response.reason = "参数缺失";
            return response;
        }
        qxService.addQxList(detail);

        return response;
    }
}
