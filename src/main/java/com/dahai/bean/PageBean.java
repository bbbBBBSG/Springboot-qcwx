package com.dahai.bean;

import java.util.List;

public class PageBean<T> {

    public int page;
    public long count;
    public int totalPage;

    public List<T> listData;
}
