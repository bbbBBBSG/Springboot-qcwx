package com.dahai.dao.model;

import java.util.ArrayList;
import java.util.List;

public class QxHomeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    private Boolean forUpdate;

    public QxHomeExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setOffset(Long offset) {
        this.offset = offset;
    }

    public Long getOffset() {
        return offset;
    }

    public void setForUpdate(Boolean forUpdate) {
        this.forUpdate = forUpdate;
    }

    public Boolean getForUpdate() {
        return forUpdate;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andTitleIsNull() {
            addCriterion("title is null");
            return (Criteria) this;
        }

        public Criteria andTitleIsNotNull() {
            addCriterion("title is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEqualTo(String value) {
            addCriterion("title =", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotEqualTo(String value) {
            addCriterion("title <>", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThan(String value) {
            addCriterion("title >", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("title >=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThan(String value) {
            addCriterion("title <", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("title <=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLike(String value) {
            addCriterion("title like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotLike(String value) {
            addCriterion("title not like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleIn(List<String> values) {
            addCriterion("title in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotIn(List<String> values) {
            addCriterion("title not in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleBetween(String value1, String value2) {
            addCriterion("title between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("title not between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andIntroIsNull() {
            addCriterion("intro is null");
            return (Criteria) this;
        }

        public Criteria andIntroIsNotNull() {
            addCriterion("intro is not null");
            return (Criteria) this;
        }

        public Criteria andIntroEqualTo(String value) {
            addCriterion("intro =", value, "intro");
            return (Criteria) this;
        }

        public Criteria andIntroNotEqualTo(String value) {
            addCriterion("intro <>", value, "intro");
            return (Criteria) this;
        }

        public Criteria andIntroGreaterThan(String value) {
            addCriterion("intro >", value, "intro");
            return (Criteria) this;
        }

        public Criteria andIntroGreaterThanOrEqualTo(String value) {
            addCriterion("intro >=", value, "intro");
            return (Criteria) this;
        }

        public Criteria andIntroLessThan(String value) {
            addCriterion("intro <", value, "intro");
            return (Criteria) this;
        }

        public Criteria andIntroLessThanOrEqualTo(String value) {
            addCriterion("intro <=", value, "intro");
            return (Criteria) this;
        }

        public Criteria andIntroLike(String value) {
            addCriterion("intro like", value, "intro");
            return (Criteria) this;
        }

        public Criteria andIntroNotLike(String value) {
            addCriterion("intro not like", value, "intro");
            return (Criteria) this;
        }

        public Criteria andIntroIn(List<String> values) {
            addCriterion("intro in", values, "intro");
            return (Criteria) this;
        }

        public Criteria andIntroNotIn(List<String> values) {
            addCriterion("intro not in", values, "intro");
            return (Criteria) this;
        }

        public Criteria andIntroBetween(String value1, String value2) {
            addCriterion("intro between", value1, value2, "intro");
            return (Criteria) this;
        }

        public Criteria andIntroNotBetween(String value1, String value2) {
            addCriterion("intro not between", value1, value2, "intro");
            return (Criteria) this;
        }

        public Criteria andUrlIsNull() {
            addCriterion("url is null");
            return (Criteria) this;
        }

        public Criteria andUrlIsNotNull() {
            addCriterion("url is not null");
            return (Criteria) this;
        }

        public Criteria andUrlEqualTo(String value) {
            addCriterion("url =", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotEqualTo(String value) {
            addCriterion("url <>", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlGreaterThan(String value) {
            addCriterion("url >", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlGreaterThanOrEqualTo(String value) {
            addCriterion("url >=", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLessThan(String value) {
            addCriterion("url <", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLessThanOrEqualTo(String value) {
            addCriterion("url <=", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLike(String value) {
            addCriterion("url like", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotLike(String value) {
            addCriterion("url not like", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlIn(List<String> values) {
            addCriterion("url in", values, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotIn(List<String> values) {
            addCriterion("url not in", values, "url");
            return (Criteria) this;
        }

        public Criteria andUrlBetween(String value1, String value2) {
            addCriterion("url between", value1, value2, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotBetween(String value1, String value2) {
            addCriterion("url not between", value1, value2, "url");
            return (Criteria) this;
        }

        public Criteria andDateIsNull() {
            addCriterion("`date` is null");
            return (Criteria) this;
        }

        public Criteria andDateIsNotNull() {
            addCriterion("`date` is not null");
            return (Criteria) this;
        }

        public Criteria andDateEqualTo(String value) {
            addCriterion("`date` =", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotEqualTo(String value) {
            addCriterion("`date` <>", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateGreaterThan(String value) {
            addCriterion("`date` >", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateGreaterThanOrEqualTo(String value) {
            addCriterion("`date` >=", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateLessThan(String value) {
            addCriterion("`date` <", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateLessThanOrEqualTo(String value) {
            addCriterion("`date` <=", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateLike(String value) {
            addCriterion("`date` like", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotLike(String value) {
            addCriterion("`date` not like", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateIn(List<String> values) {
            addCriterion("`date` in", values, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotIn(List<String> values) {
            addCriterion("`date` not in", values, "date");
            return (Criteria) this;
        }

        public Criteria andDateBetween(String value1, String value2) {
            addCriterion("`date` between", value1, value2, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotBetween(String value1, String value2) {
            addCriterion("`date` not between", value1, value2, "date");
            return (Criteria) this;
        }

        public Criteria andThumbIsNull() {
            addCriterion("thumb is null");
            return (Criteria) this;
        }

        public Criteria andThumbIsNotNull() {
            addCriterion("thumb is not null");
            return (Criteria) this;
        }

        public Criteria andThumbEqualTo(String value) {
            addCriterion("thumb =", value, "thumb");
            return (Criteria) this;
        }

        public Criteria andThumbNotEqualTo(String value) {
            addCriterion("thumb <>", value, "thumb");
            return (Criteria) this;
        }

        public Criteria andThumbGreaterThan(String value) {
            addCriterion("thumb >", value, "thumb");
            return (Criteria) this;
        }

        public Criteria andThumbGreaterThanOrEqualTo(String value) {
            addCriterion("thumb >=", value, "thumb");
            return (Criteria) this;
        }

        public Criteria andThumbLessThan(String value) {
            addCriterion("thumb <", value, "thumb");
            return (Criteria) this;
        }

        public Criteria andThumbLessThanOrEqualTo(String value) {
            addCriterion("thumb <=", value, "thumb");
            return (Criteria) this;
        }

        public Criteria andThumbLike(String value) {
            addCriterion("thumb like", value, "thumb");
            return (Criteria) this;
        }

        public Criteria andThumbNotLike(String value) {
            addCriterion("thumb not like", value, "thumb");
            return (Criteria) this;
        }

        public Criteria andThumbIn(List<String> values) {
            addCriterion("thumb in", values, "thumb");
            return (Criteria) this;
        }

        public Criteria andThumbNotIn(List<String> values) {
            addCriterion("thumb not in", values, "thumb");
            return (Criteria) this;
        }

        public Criteria andThumbBetween(String value1, String value2) {
            addCriterion("thumb between", value1, value2, "thumb");
            return (Criteria) this;
        }

        public Criteria andThumbNotBetween(String value1, String value2) {
            addCriterion("thumb not between", value1, value2, "thumb");
            return (Criteria) this;
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andTypeOneIsNull() {
            addCriterion("type_one is null");
            return (Criteria) this;
        }

        public Criteria andTypeOneIsNotNull() {
            addCriterion("type_one is not null");
            return (Criteria) this;
        }

        public Criteria andTypeOneEqualTo(String value) {
            addCriterion("type_one =", value, "typeOne");
            return (Criteria) this;
        }

        public Criteria andTypeOneNotEqualTo(String value) {
            addCriterion("type_one <>", value, "typeOne");
            return (Criteria) this;
        }

        public Criteria andTypeOneGreaterThan(String value) {
            addCriterion("type_one >", value, "typeOne");
            return (Criteria) this;
        }

        public Criteria andTypeOneGreaterThanOrEqualTo(String value) {
            addCriterion("type_one >=", value, "typeOne");
            return (Criteria) this;
        }

        public Criteria andTypeOneLessThan(String value) {
            addCriterion("type_one <", value, "typeOne");
            return (Criteria) this;
        }

        public Criteria andTypeOneLessThanOrEqualTo(String value) {
            addCriterion("type_one <=", value, "typeOne");
            return (Criteria) this;
        }

        public Criteria andTypeOneLike(String value) {
            addCriterion("type_one like", value, "typeOne");
            return (Criteria) this;
        }

        public Criteria andTypeOneNotLike(String value) {
            addCriterion("type_one not like", value, "typeOne");
            return (Criteria) this;
        }

        public Criteria andTypeOneIn(List<String> values) {
            addCriterion("type_one in", values, "typeOne");
            return (Criteria) this;
        }

        public Criteria andTypeOneNotIn(List<String> values) {
            addCriterion("type_one not in", values, "typeOne");
            return (Criteria) this;
        }

        public Criteria andTypeOneBetween(String value1, String value2) {
            addCriterion("type_one between", value1, value2, "typeOne");
            return (Criteria) this;
        }

        public Criteria andTypeOneNotBetween(String value1, String value2) {
            addCriterion("type_one not between", value1, value2, "typeOne");
            return (Criteria) this;
        }

        public Criteria andTypeTwoIsNull() {
            addCriterion("type_two is null");
            return (Criteria) this;
        }

        public Criteria andTypeTwoIsNotNull() {
            addCriterion("type_two is not null");
            return (Criteria) this;
        }

        public Criteria andTypeTwoEqualTo(String value) {
            addCriterion("type_two =", value, "typeTwo");
            return (Criteria) this;
        }

        public Criteria andTypeTwoNotEqualTo(String value) {
            addCriterion("type_two <>", value, "typeTwo");
            return (Criteria) this;
        }

        public Criteria andTypeTwoGreaterThan(String value) {
            addCriterion("type_two >", value, "typeTwo");
            return (Criteria) this;
        }

        public Criteria andTypeTwoGreaterThanOrEqualTo(String value) {
            addCriterion("type_two >=", value, "typeTwo");
            return (Criteria) this;
        }

        public Criteria andTypeTwoLessThan(String value) {
            addCriterion("type_two <", value, "typeTwo");
            return (Criteria) this;
        }

        public Criteria andTypeTwoLessThanOrEqualTo(String value) {
            addCriterion("type_two <=", value, "typeTwo");
            return (Criteria) this;
        }

        public Criteria andTypeTwoLike(String value) {
            addCriterion("type_two like", value, "typeTwo");
            return (Criteria) this;
        }

        public Criteria andTypeTwoNotLike(String value) {
            addCriterion("type_two not like", value, "typeTwo");
            return (Criteria) this;
        }

        public Criteria andTypeTwoIn(List<String> values) {
            addCriterion("type_two in", values, "typeTwo");
            return (Criteria) this;
        }

        public Criteria andTypeTwoNotIn(List<String> values) {
            addCriterion("type_two not in", values, "typeTwo");
            return (Criteria) this;
        }

        public Criteria andTypeTwoBetween(String value1, String value2) {
            addCriterion("type_two between", value1, value2, "typeTwo");
            return (Criteria) this;
        }

        public Criteria andTypeTwoNotBetween(String value1, String value2) {
            addCriterion("type_two not between", value1, value2, "typeTwo");
            return (Criteria) this;
        }

        public Criteria andTypeOneNameIsNull() {
            addCriterion("type_one_name is null");
            return (Criteria) this;
        }

        public Criteria andTypeOneNameIsNotNull() {
            addCriterion("type_one_name is not null");
            return (Criteria) this;
        }

        public Criteria andTypeOneNameEqualTo(String value) {
            addCriterion("type_one_name =", value, "typeOneName");
            return (Criteria) this;
        }

        public Criteria andTypeOneNameNotEqualTo(String value) {
            addCriterion("type_one_name <>", value, "typeOneName");
            return (Criteria) this;
        }

        public Criteria andTypeOneNameGreaterThan(String value) {
            addCriterion("type_one_name >", value, "typeOneName");
            return (Criteria) this;
        }

        public Criteria andTypeOneNameGreaterThanOrEqualTo(String value) {
            addCriterion("type_one_name >=", value, "typeOneName");
            return (Criteria) this;
        }

        public Criteria andTypeOneNameLessThan(String value) {
            addCriterion("type_one_name <", value, "typeOneName");
            return (Criteria) this;
        }

        public Criteria andTypeOneNameLessThanOrEqualTo(String value) {
            addCriterion("type_one_name <=", value, "typeOneName");
            return (Criteria) this;
        }

        public Criteria andTypeOneNameLike(String value) {
            addCriterion("type_one_name like", value, "typeOneName");
            return (Criteria) this;
        }

        public Criteria andTypeOneNameNotLike(String value) {
            addCriterion("type_one_name not like", value, "typeOneName");
            return (Criteria) this;
        }

        public Criteria andTypeOneNameIn(List<String> values) {
            addCriterion("type_one_name in", values, "typeOneName");
            return (Criteria) this;
        }

        public Criteria andTypeOneNameNotIn(List<String> values) {
            addCriterion("type_one_name not in", values, "typeOneName");
            return (Criteria) this;
        }

        public Criteria andTypeOneNameBetween(String value1, String value2) {
            addCriterion("type_one_name between", value1, value2, "typeOneName");
            return (Criteria) this;
        }

        public Criteria andTypeOneNameNotBetween(String value1, String value2) {
            addCriterion("type_one_name not between", value1, value2, "typeOneName");
            return (Criteria) this;
        }

        public Criteria andTypeTwoNameIsNull() {
            addCriterion("type_two_name is null");
            return (Criteria) this;
        }

        public Criteria andTypeTwoNameIsNotNull() {
            addCriterion("type_two_name is not null");
            return (Criteria) this;
        }

        public Criteria andTypeTwoNameEqualTo(String value) {
            addCriterion("type_two_name =", value, "typeTwoName");
            return (Criteria) this;
        }

        public Criteria andTypeTwoNameNotEqualTo(String value) {
            addCriterion("type_two_name <>", value, "typeTwoName");
            return (Criteria) this;
        }

        public Criteria andTypeTwoNameGreaterThan(String value) {
            addCriterion("type_two_name >", value, "typeTwoName");
            return (Criteria) this;
        }

        public Criteria andTypeTwoNameGreaterThanOrEqualTo(String value) {
            addCriterion("type_two_name >=", value, "typeTwoName");
            return (Criteria) this;
        }

        public Criteria andTypeTwoNameLessThan(String value) {
            addCriterion("type_two_name <", value, "typeTwoName");
            return (Criteria) this;
        }

        public Criteria andTypeTwoNameLessThanOrEqualTo(String value) {
            addCriterion("type_two_name <=", value, "typeTwoName");
            return (Criteria) this;
        }

        public Criteria andTypeTwoNameLike(String value) {
            addCriterion("type_two_name like", value, "typeTwoName");
            return (Criteria) this;
        }

        public Criteria andTypeTwoNameNotLike(String value) {
            addCriterion("type_two_name not like", value, "typeTwoName");
            return (Criteria) this;
        }

        public Criteria andTypeTwoNameIn(List<String> values) {
            addCriterion("type_two_name in", values, "typeTwoName");
            return (Criteria) this;
        }

        public Criteria andTypeTwoNameNotIn(List<String> values) {
            addCriterion("type_two_name not in", values, "typeTwoName");
            return (Criteria) this;
        }

        public Criteria andTypeTwoNameBetween(String value1, String value2) {
            addCriterion("type_two_name between", value1, value2, "typeTwoName");
            return (Criteria) this;
        }

        public Criteria andTypeTwoNameNotBetween(String value1, String value2) {
            addCriterion("type_two_name not between", value1, value2, "typeTwoName");
            return (Criteria) this;
        }

        public Criteria andSortIsNull() {
            addCriterion("sort is null");
            return (Criteria) this;
        }

        public Criteria andSortIsNotNull() {
            addCriterion("sort is not null");
            return (Criteria) this;
        }

        public Criteria andSortEqualTo(String value) {
            addCriterion("sort =", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotEqualTo(String value) {
            addCriterion("sort <>", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortGreaterThan(String value) {
            addCriterion("sort >", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortGreaterThanOrEqualTo(String value) {
            addCriterion("sort >=", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortLessThan(String value) {
            addCriterion("sort <", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortLessThanOrEqualTo(String value) {
            addCriterion("sort <=", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortLike(String value) {
            addCriterion("sort like", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotLike(String value) {
            addCriterion("sort not like", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortIn(List<String> values) {
            addCriterion("sort in", values, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotIn(List<String> values) {
            addCriterion("sort not in", values, "sort");
            return (Criteria) this;
        }

        public Criteria andSortBetween(String value1, String value2) {
            addCriterion("sort between", value1, value2, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotBetween(String value1, String value2) {
            addCriterion("sort not between", value1, value2, "sort");
            return (Criteria) this;
        }

        public Criteria andContentIsNull() {
            addCriterion("content is null");
            return (Criteria) this;
        }

        public Criteria andContentIsNotNull() {
            addCriterion("content is not null");
            return (Criteria) this;
        }

        public Criteria andContentEqualTo(String value) {
            addCriterion("content =", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotEqualTo(String value) {
            addCriterion("content <>", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThan(String value) {
            addCriterion("content >", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThanOrEqualTo(String value) {
            addCriterion("content >=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThan(String value) {
            addCriterion("content <", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThanOrEqualTo(String value) {
            addCriterion("content <=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLike(String value) {
            addCriterion("content like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotLike(String value) {
            addCriterion("content not like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentIn(List<String> values) {
            addCriterion("content in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotIn(List<String> values) {
            addCriterion("content not in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentBetween(String value1, String value2) {
            addCriterion("content between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotBetween(String value1, String value2) {
            addCriterion("content not between", value1, value2, "content");
            return (Criteria) this;
        }
    }

    /**
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}