package com.dahai.dao.model;

import java.io.Serializable;

/**
 * qx_home
 * @author 
 */
public class QxHome implements Serializable {
    private String title;

    private String intro;

    private String url;

    private String date;

    private String thumb;

    private String id;

    private String typeOne;

    private String typeTwo;

    private String typeOneName;

    private String typeTwoName;

    private String sort;

    private String content;

    private static final long serialVersionUID = 1L;

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

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getThumb() {
        return thumb;
    }

    public void setThumb(String thumb) {
        this.thumb = thumb;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public String getTypeOneName() {
        return typeOneName;
    }

    public void setTypeOneName(String typeOneName) {
        this.typeOneName = typeOneName;
    }

    public String getTypeTwoName() {
        return typeTwoName;
    }

    public void setTypeTwoName(String typeTwoName) {
        this.typeTwoName = typeTwoName;
    }

    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
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
        QxHome other = (QxHome) that;
        return (this.getTitle() == null ? other.getTitle() == null : this.getTitle().equals(other.getTitle()))
            && (this.getIntro() == null ? other.getIntro() == null : this.getIntro().equals(other.getIntro()))
            && (this.getUrl() == null ? other.getUrl() == null : this.getUrl().equals(other.getUrl()))
            && (this.getDate() == null ? other.getDate() == null : this.getDate().equals(other.getDate()))
            && (this.getThumb() == null ? other.getThumb() == null : this.getThumb().equals(other.getThumb()))
            && (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getTypeOne() == null ? other.getTypeOne() == null : this.getTypeOne().equals(other.getTypeOne()))
            && (this.getTypeTwo() == null ? other.getTypeTwo() == null : this.getTypeTwo().equals(other.getTypeTwo()))
            && (this.getTypeOneName() == null ? other.getTypeOneName() == null : this.getTypeOneName().equals(other.getTypeOneName()))
            && (this.getTypeTwoName() == null ? other.getTypeTwoName() == null : this.getTypeTwoName().equals(other.getTypeTwoName()))
            && (this.getSort() == null ? other.getSort() == null : this.getSort().equals(other.getSort()))
            && (this.getContent() == null ? other.getContent() == null : this.getContent().equals(other.getContent()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getTitle() == null) ? 0 : getTitle().hashCode());
        result = prime * result + ((getIntro() == null) ? 0 : getIntro().hashCode());
        result = prime * result + ((getUrl() == null) ? 0 : getUrl().hashCode());
        result = prime * result + ((getDate() == null) ? 0 : getDate().hashCode());
        result = prime * result + ((getThumb() == null) ? 0 : getThumb().hashCode());
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getTypeOne() == null) ? 0 : getTypeOne().hashCode());
        result = prime * result + ((getTypeTwo() == null) ? 0 : getTypeTwo().hashCode());
        result = prime * result + ((getTypeOneName() == null) ? 0 : getTypeOneName().hashCode());
        result = prime * result + ((getTypeTwoName() == null) ? 0 : getTypeTwoName().hashCode());
        result = prime * result + ((getSort() == null) ? 0 : getSort().hashCode());
        result = prime * result + ((getContent() == null) ? 0 : getContent().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", title=").append(title);
        sb.append(", intro=").append(intro);
        sb.append(", url=").append(url);
        sb.append(", date=").append(date);
        sb.append(", thumb=").append(thumb);
        sb.append(", id=").append(id);
        sb.append(", typeOne=").append(typeOne);
        sb.append(", typeTwo=").append(typeTwo);
        sb.append(", typeOneName=").append(typeOneName);
        sb.append(", typeTwoName=").append(typeTwoName);
        sb.append(", sort=").append(sort);
        sb.append(", content=").append(content);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}