package com.dahai.bean;

import java.util.Arrays;

public class QxNewsDetail {


    private String url;
    private String title;
    private String source;
    private String date;
    private String html;
    private String[] tags;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getHtml() {
        return html;
    }

    public void setHtml(String html) {
        this.html = html;
    }

    public String[] getTags() {
        return tags;
    }

    public void setTags(String[] tags) {
        this.tags = tags;
    }

    @Override
    public String toString() {
        return "QxNewsDetail{" +
                ", url='" + url + '\'' +
                ", title='" + title + '\'' +
                ", source='" + source + '\'' +
                ", date='" + date + '\'' +
                ", html='" + html + '\'' +
                ", tags=" + Arrays.toString(tags) +
                '}';
    }
}
