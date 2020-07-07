package com.dahai.dao.model;

import java.io.Serializable;

/**
 * @author 
 */
public class Banner implements Serializable {
    private Integer id;

    /**
     * 渠道type，区分不同地方的广告
     */
    private String canneltype;

    /**
     * 跳转类型，1本地，2网页
     */
    private String classtype;

    /**
     * classType=2时才有的跳转url
     */
    private String jumpurl;

    /**
     * classType=1时才有的跳转本地类全路径
     */
    private String localpath;

    /**
     * 是否需要登录，1需要登录，0不需要登录
     */
    private Integer needlogin;

    /**
     * 该字段返回json类型数据，一般在本地跳转时使用
     */
    private String param;

    /**
     * 是否显示该图片
     */
    private Integer isshow;

    /**
     * 封面图片
     */
    private String coverimage;

    /**
     * 标题
     */
    private String title;

    /**
     * 简介
     */
    private String intro;

    /**
     * 是否可用，可跳转，1正常使用，2可以显示不能跳转
     */
    private Integer isenable;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCanneltype() {
        return canneltype;
    }

    public void setCanneltype(String canneltype) {
        this.canneltype = canneltype;
    }

    public String getClasstype() {
        return classtype;
    }

    public void setClasstype(String classtype) {
        this.classtype = classtype;
    }

    public String getJumpurl() {
        return jumpurl;
    }

    public void setJumpurl(String jumpurl) {
        this.jumpurl = jumpurl;
    }

    public String getLocalpath() {
        return localpath;
    }

    public void setLocalpath(String localpath) {
        this.localpath = localpath;
    }

    public Integer getNeedlogin() {
        return needlogin;
    }

    public void setNeedlogin(Integer needlogin) {
        this.needlogin = needlogin;
    }

    public String getParam() {
        return param;
    }

    public void setParam(String param) {
        this.param = param;
    }

    public Integer getIsshow() {
        return isshow;
    }

    public void setIsshow(Integer isshow) {
        this.isshow = isshow;
    }

    public String getCoverimage() {
        return coverimage;
    }

    public void setCoverimage(String coverimage) {
        this.coverimage = coverimage;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIntro() {
        return intro;
    }

    public void setIntro(String intro) {
        this.intro = intro;
    }

    public Integer getIsenable() {
        return isenable;
    }

    public void setIsenable(Integer isenable) {
        this.isenable = isenable;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Banner other = (Banner) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getCanneltype() == null ? other.getCanneltype() == null : this.getCanneltype().equals(other.getCanneltype()))
            && (this.getClasstype() == null ? other.getClasstype() == null : this.getClasstype().equals(other.getClasstype()))
            && (this.getJumpurl() == null ? other.getJumpurl() == null : this.getJumpurl().equals(other.getJumpurl()))
            && (this.getLocalpath() == null ? other.getLocalpath() == null : this.getLocalpath().equals(other.getLocalpath()))
            && (this.getNeedlogin() == null ? other.getNeedlogin() == null : this.getNeedlogin().equals(other.getNeedlogin()))
            && (this.getParam() == null ? other.getParam() == null : this.getParam().equals(other.getParam()))
            && (this.getIsshow() == null ? other.getIsshow() == null : this.getIsshow().equals(other.getIsshow()))
            && (this.getCoverimage() == null ? other.getCoverimage() == null : this.getCoverimage().equals(other.getCoverimage()))
            && (this.getTitle() == null ? other.getTitle() == null : this.getTitle().equals(other.getTitle()))
            && (this.getIntro() == null ? other.getIntro() == null : this.getIntro().equals(other.getIntro()))
            && (this.getIsenable() == null ? other.getIsenable() == null : this.getIsenable().equals(other.getIsenable()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getCanneltype() == null) ? 0 : getCanneltype().hashCode());
        result = prime * result + ((getClasstype() == null) ? 0 : getClasstype().hashCode());
        result = prime * result + ((getJumpurl() == null) ? 0 : getJumpurl().hashCode());
        result = prime * result + ((getLocalpath() == null) ? 0 : getLocalpath().hashCode());
        result = prime * result + ((getNeedlogin() == null) ? 0 : getNeedlogin().hashCode());
        result = prime * result + ((getParam() == null) ? 0 : getParam().hashCode());
        result = prime * result + ((getIsshow() == null) ? 0 : getIsshow().hashCode());
        result = prime * result + ((getCoverimage() == null) ? 0 : getCoverimage().hashCode());
        result = prime * result + ((getTitle() == null) ? 0 : getTitle().hashCode());
        result = prime * result + ((getIntro() == null) ? 0 : getIntro().hashCode());
        result = prime * result + ((getIsenable() == null) ? 0 : getIsenable().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", canneltype=").append(canneltype);
        sb.append(", classtype=").append(classtype);
        sb.append(", jumpurl=").append(jumpurl);
        sb.append(", localpath=").append(localpath);
        sb.append(", needlogin=").append(needlogin);
        sb.append(", param=").append(param);
        sb.append(", isshow=").append(isshow);
        sb.append(", coverimage=").append(coverimage);
        sb.append(", title=").append(title);
        sb.append(", intro=").append(intro);
        sb.append(", isenable=").append(isenable);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}