package com.dahai.dao.model;

import java.io.Serializable;
import java.util.Date;

/**
 * qx_list_detail
 * @author 
 */
public class QxListDetail implements Serializable {
    private String id;

    /**
     * 标题
     */
    private String title;

    /**
     * 简介
     */
    private String intro;

    /**
     * 创建时间
     */
    private Date createDate;

    /**
     * 封面
     */
    private String thumb;

    /**
     * 1.最新资讯 2.维修案例 3.汽车问题 4.技术标准 5.电路图 6.故障码 7.维修图书 8.维修手册 9.工具使用
     */
    private String typeOne;

    private String typeTwo;

    private String typeTwoName;

    /**
     * 1.最新资讯 2.维修案例 3.汽车问题 4.技术标准 5.电路图 6.故障码 7.维修图书 8.维修手册 9.工具使用
     */
    private String typeOneName;

    private Integer likes;

    private String content;

    private String shareUrl;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getThumb() {
        return thumb;
    }

    public void setThumb(String thumb) {
        this.thumb = thumb;
    }

    public String getTypeOne() {
        return typeOne;
    }

    public void setTypeOne(String typeOne) {
        this.typeOne = typeOne;
    }

    public String getTypeTwo() {
        return typeTwo;
    }

    public void setTypeTwo(String typeTwo) {
        this.typeTwo = typeTwo;
    }

    public String getTypeTwoName() {
        return typeTwoName;
    }

    public void setTypeTwoName(String typeTwoName) {
        this.typeTwoName = typeTwoName;
    }

    public String getTypeOneName() {
        return typeOneName;
    }

    public void setTypeOneName(String typeOneName) {
        this.typeOneName = typeOneName;
    }

    public Integer getLikes() {
        return likes;
    }

    public void setLikes(Integer likes) {
        this.likes = likes;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getShareUrl() {
        return shareUrl;
    }

    public void setShareUrl(String shareUrl) {
        this.shareUrl = shareUrl;
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
        QxListDetail other = (QxListDetail) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getTitle() == null ? other.getTitle() == null : this.getTitle().equals(other.getTitle()))
            && (this.getIntro() == null ? other.getIntro() == null : this.getIntro().equals(other.getIntro()))
            && (this.getCreateDate() == null ? other.getCreateDate() == null : this.getCreateDate().equals(other.getCreateDate()))
            && (this.getThumb() == null ? other.getThumb() == null : this.getThumb().equals(other.getThumb()))
            && (this.getTypeOne() == null ? other.getTypeOne() == null : this.getTypeOne().equals(other.getTypeOne()))
            && (this.getTypeTwo() == null ? other.getTypeTwo() == null : this.getTypeTwo().equals(other.getTypeTwo()))
            && (this.getTypeTwoName() == null ? other.getTypeTwoName() == null : this.getTypeTwoName().equals(other.getTypeTwoName()))
            && (this.getTypeOneName() == null ? other.getTypeOneName() == null : this.getTypeOneName().equals(other.getTypeOneName()))
            && (this.getLikes() == null ? other.getLikes() == null : this.getLikes().equals(other.getLikes()))
            && (this.getContent() == null ? other.getContent() == null : this.getContent().equals(other.getContent()))
            && (this.getShareUrl() == null ? other.getShareUrl() == null : this.getShareUrl().equals(other.getShareUrl()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getTitle() == null) ? 0 : getTitle().hashCode());
        result = prime * result + ((getIntro() == null) ? 0 : getIntro().hashCode());
        result = prime * result + ((getCreateDate() == null) ? 0 : getCreateDate().hashCode());
        result = prime * result + ((getThumb() == null) ? 0 : getThumb().hashCode());
        result = prime * result + ((getTypeOne() == null) ? 0 : getTypeOne().hashCode());
        result = prime * result + ((getTypeTwo() == null) ? 0 : getTypeTwo().hashCode());
        result = prime * result + ((getTypeTwoName() == null) ? 0 : getTypeTwoName().hashCode());
        result = prime * result + ((getTypeOneName() == null) ? 0 : getTypeOneName().hashCode());
        result = prime * result + ((getLikes() == null) ? 0 : getLikes().hashCode());
        result = prime * result + ((getContent() == null) ? 0 : getContent().hashCode());
        result = prime * result + ((getShareUrl() == null) ? 0 : getShareUrl().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", title=").append(title);
        sb.append(", intro=").append(intro);
        sb.append(", createDate=").append(createDate);
        sb.append(", thumb=").append(thumb);
        sb.append(", typeOne=").append(typeOne);
        sb.append(", typeTwo=").append(typeTwo);
        sb.append(", typeTwoName=").append(typeTwoName);
        sb.append(", typeOneName=").append(typeOneName);
        sb.append(", likes=").append(likes);
        sb.append(", content=").append(content);
        sb.append(", shareUrl=").append(shareUrl);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}