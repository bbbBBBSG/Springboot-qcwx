package com.dahai.service;

import com.alibaba.fastjson.JSON;
import com.dahai.NavJson;
import com.dahai.bean.*;
import com.dahai.dao.CommentDAO;
import com.dahai.dao.QxListDetailDAO;
import com.dahai.dao.UserMapper;
import com.dahai.dao.model.*;
import com.dahai.utils.DateUtils;
import com.dahai.utils.StringUtils;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@Service
public class QxService {

    @Autowired
    private CommentDAO commentDAO;

    @Autowired
    private QxListDetailDAO qxListDetailDAO;

    @Autowired
    private UserService userService;

    /**
     * 获取分类
     */
    public List<NavJsonBean.ResultBean> navTree() throws Exception {

        NavJsonBean navJsonBean = JSON.parseObject(NavJson.navJson, NavJsonBean.class);
        List<NavJsonBean.ResultBean> result = navJsonBean.getResult();
        return result;
    }

    /**
     * 获取汽车维修技术网最新资讯
     */
    public List<QxListDetail> getQxList(int page,int pageSize,String typeOne,String typeTwo) throws Exception {
        QxListDetailExample example = new QxListDetailExample();
        example.setLimit(pageSize);
        example.setOffset((long) ((page-1)*pageSize));
        example.setOrderByClause("create_date desc");
        QxListDetailExample.Criteria criteria = example.createCriteria();
        if (!StringUtils.checkStrNull(typeOne)) {
            criteria.andTypeOneEqualTo(typeOne);
        }
        if (!StringUtils.checkStrNull(typeTwo)) {
            criteria.andTypeTwoEqualTo(typeTwo);
        }

        List<QxListDetail> qxListDetails = qxListDetailDAO.selectByExample(example);
        return qxListDetails;
    }

    /**
     * 获取详情
     */
    public QxListDetail getNewsDetail(String id) throws Exception {
        QxListDetailExample example = new QxListDetailExample();
        QxListDetailExample.Criteria criteria = example.createCriteria();
        criteria.andIdEqualTo(id);
        List<QxListDetail> qxListDetails = qxListDetailDAO.selectByExample(example);
        if (qxListDetails!=null && qxListDetails.size()>0) {
            return qxListDetails.get(0);
        } else {
            throw new Exception("数据不存在");
        }
    }

    public void addQxList(QxListDetail detail) {
        detail.setCreateDate(new Date());
        detail.setId(UUID.randomUUID().toString());
        detail.setIntro(detail.getTitle());
        detail.setLikes(0);
        detail.setShareUrl("");

        // 获取封面
        String content = detail.getContent();
        Document doc = Jsoup.parse(content);
        Elements elementsByClass = doc.getElementsByTag("img");
        if (elementsByClass!=null && elementsByClass.size()>0) {
            String src = elementsByClass.get(0).attr("src");
            detail.setThumb(src);
        }
        System.out.println("=================================="+detail.toString());
        qxListDetailDAO.insertNotSame(detail);
    }

/* *********************************************************************************************************************** */
    /**
     * 评论
     * @param userId 用户id
     * @param qxDetailId qxDetailId
     * @param content 评论内容
     */
    public void comment(String userId,String qxDetailId,String content) {
        Comment record = new Comment();
        record.setContent(content);
        record.setQxdetailid(qxDetailId);
        record.setUserid(userId);
        record.setCreatedtime(new Date());
        record.setLikes(0);
        commentDAO.insert(record);
    }

    /**
     * 获取评论
     */
    public List<CommentResponse> getComment(int page, int pageSize, String id) {
        if (page<=0) {
            page = 1;
        }
        if (pageSize<=0) {
            pageSize =10;
        }
        CommentExample example = new CommentExample();
        example.setLimit(pageSize);
        example.setOffset((long) ((page-1)*pageSize));
        example.setOrderByClause("createdtime desc");
        CommentExample.Criteria criteria = example.createCriteria();
        criteria.andQxdetailidEqualTo(id);

        List<CommentResponse> commentResponses = new ArrayList<CommentResponse>();
        List<Comment> comments = commentDAO.selectByExample(example);
        for (Comment comment : comments) {
            List<User> userByUserId = userService.findUserByUserId(comment.getUserid());
            if (userByUserId.size()>0) {
                User user = userByUserId.get(0);
                UserResponse userResponse = new UserResponse();
                userResponse.setHeadpic(user.getHeadpic());
                userResponse.setUserid(user.getUserid());
                userResponse.setUsername(user.getUsername());
                CommentResponse response = new CommentResponse();
                response.setComment(comment);
                response.setUser(userResponse);
                commentResponses.add(response);
            }
        }

        return commentResponses;
    }

    /**
     * 点赞评论
     */
    public void likeComment(Integer id) {
        Comment comment = commentDAO.selectByPrimaryKey(id);
        if (comment==null) {
            return;
        }

        comment.setLikes(comment.getLikes()+1);
        CommentExample example = new CommentExample();
        CommentExample.Criteria criteria = example.createCriteria();
        criteria.andIdEqualTo(id);
        commentDAO.updateByExample(comment, example);
    }

    /**
     * 点赞详情
     */
    public void likeDetail(String id) {
        QxListDetail qxListDetail = qxListDetailDAO.selectByPrimaryKey(id);
        if (qxListDetail==null) {
            return;
        }
        qxListDetail.setLikes(qxListDetail.getLikes()+1);
        QxListDetailExample example = new QxListDetailExample();
        QxListDetailExample.Criteria criteria = example.createCriteria();
        criteria.andIdEqualTo(id);
        qxListDetailDAO.updateByExample(qxListDetail, example);
    }

    /* *********************************************************************************************************************** */

    /**
     * 获取汽车维修技术网所有列表
     */
    public List<QxListDetail> getQxList(int page,int pageSize) throws Exception {
        QxListDetailExample example = new QxListDetailExample();
        example.setLimit(pageSize);
        example.setOffset((long) ((page-1)*pageSize));
        example.setOrderByClause("create_date desc");
        List<QxListDetail> qxListDetails = qxListDetailDAO.selectByExample(example);
        return qxListDetails;
    }

    /**
     * 获取总数
     */
    public long getQxCount() {
        return qxListDetailDAO.countByExample(new QxListDetailExample());
    }
}
