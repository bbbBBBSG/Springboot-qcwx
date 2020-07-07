package com.dahai.dao.model;

import java.util.ArrayList;
import java.util.List;

public class BannerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public BannerExample() {
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

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public Integer getOffset() {
        return offset;
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andCanneltypeIsNull() {
            addCriterion("cannelType is null");
            return (Criteria) this;
        }

        public Criteria andCanneltypeIsNotNull() {
            addCriterion("cannelType is not null");
            return (Criteria) this;
        }

        public Criteria andCanneltypeEqualTo(String value) {
            addCriterion("cannelType =", value, "canneltype");
            return (Criteria) this;
        }

        public Criteria andCanneltypeNotEqualTo(String value) {
            addCriterion("cannelType <>", value, "canneltype");
            return (Criteria) this;
        }

        public Criteria andCanneltypeGreaterThan(String value) {
            addCriterion("cannelType >", value, "canneltype");
            return (Criteria) this;
        }

        public Criteria andCanneltypeGreaterThanOrEqualTo(String value) {
            addCriterion("cannelType >=", value, "canneltype");
            return (Criteria) this;
        }

        public Criteria andCanneltypeLessThan(String value) {
            addCriterion("cannelType <", value, "canneltype");
            return (Criteria) this;
        }

        public Criteria andCanneltypeLessThanOrEqualTo(String value) {
            addCriterion("cannelType <=", value, "canneltype");
            return (Criteria) this;
        }

        public Criteria andCanneltypeLike(String value) {
            addCriterion("cannelType like", value, "canneltype");
            return (Criteria) this;
        }

        public Criteria andCanneltypeNotLike(String value) {
            addCriterion("cannelType not like", value, "canneltype");
            return (Criteria) this;
        }

        public Criteria andCanneltypeIn(List<String> values) {
            addCriterion("cannelType in", values, "canneltype");
            return (Criteria) this;
        }

        public Criteria andCanneltypeNotIn(List<String> values) {
            addCriterion("cannelType not in", values, "canneltype");
            return (Criteria) this;
        }

        public Criteria andCanneltypeBetween(String value1, String value2) {
            addCriterion("cannelType between", value1, value2, "canneltype");
            return (Criteria) this;
        }

        public Criteria andCanneltypeNotBetween(String value1, String value2) {
            addCriterion("cannelType not between", value1, value2, "canneltype");
            return (Criteria) this;
        }

        public Criteria andClasstypeIsNull() {
            addCriterion("classType is null");
            return (Criteria) this;
        }

        public Criteria andClasstypeIsNotNull() {
            addCriterion("classType is not null");
            return (Criteria) this;
        }

        public Criteria andClasstypeEqualTo(String value) {
            addCriterion("classType =", value, "classtype");
            return (Criteria) this;
        }

        public Criteria andClasstypeNotEqualTo(String value) {
            addCriterion("classType <>", value, "classtype");
            return (Criteria) this;
        }

        public Criteria andClasstypeGreaterThan(String value) {
            addCriterion("classType >", value, "classtype");
            return (Criteria) this;
        }

        public Criteria andClasstypeGreaterThanOrEqualTo(String value) {
            addCriterion("classType >=", value, "classtype");
            return (Criteria) this;
        }

        public Criteria andClasstypeLessThan(String value) {
            addCriterion("classType <", value, "classtype");
            return (Criteria) this;
        }

        public Criteria andClasstypeLessThanOrEqualTo(String value) {
            addCriterion("classType <=", value, "classtype");
            return (Criteria) this;
        }

        public Criteria andClasstypeLike(String value) {
            addCriterion("classType like", value, "classtype");
            return (Criteria) this;
        }

        public Criteria andClasstypeNotLike(String value) {
            addCriterion("classType not like", value, "classtype");
            return (Criteria) this;
        }

        public Criteria andClasstypeIn(List<String> values) {
            addCriterion("classType in", values, "classtype");
            return (Criteria) this;
        }

        public Criteria andClasstypeNotIn(List<String> values) {
            addCriterion("classType not in", values, "classtype");
            return (Criteria) this;
        }

        public Criteria andClasstypeBetween(String value1, String value2) {
            addCriterion("classType between", value1, value2, "classtype");
            return (Criteria) this;
        }

        public Criteria andClasstypeNotBetween(String value1, String value2) {
            addCriterion("classType not between", value1, value2, "classtype");
            return (Criteria) this;
        }

        public Criteria andJumpurlIsNull() {
            addCriterion("jumpUrl is null");
            return (Criteria) this;
        }

        public Criteria andJumpurlIsNotNull() {
            addCriterion("jumpUrl is not null");
            return (Criteria) this;
        }

        public Criteria andJumpurlEqualTo(String value) {
            addCriterion("jumpUrl =", value, "jumpurl");
            return (Criteria) this;
        }

        public Criteria andJumpurlNotEqualTo(String value) {
            addCriterion("jumpUrl <>", value, "jumpurl");
            return (Criteria) this;
        }

        public Criteria andJumpurlGreaterThan(String value) {
            addCriterion("jumpUrl >", value, "jumpurl");
            return (Criteria) this;
        }

        public Criteria andJumpurlGreaterThanOrEqualTo(String value) {
            addCriterion("jumpUrl >=", value, "jumpurl");
            return (Criteria) this;
        }

        public Criteria andJumpurlLessThan(String value) {
            addCriterion("jumpUrl <", value, "jumpurl");
            return (Criteria) this;
        }

        public Criteria andJumpurlLessThanOrEqualTo(String value) {
            addCriterion("jumpUrl <=", value, "jumpurl");
            return (Criteria) this;
        }

        public Criteria andJumpurlLike(String value) {
            addCriterion("jumpUrl like", value, "jumpurl");
            return (Criteria) this;
        }

        public Criteria andJumpurlNotLike(String value) {
            addCriterion("jumpUrl not like", value, "jumpurl");
            return (Criteria) this;
        }

        public Criteria andJumpurlIn(List<String> values) {
            addCriterion("jumpUrl in", values, "jumpurl");
            return (Criteria) this;
        }

        public Criteria andJumpurlNotIn(List<String> values) {
            addCriterion("jumpUrl not in", values, "jumpurl");
            return (Criteria) this;
        }

        public Criteria andJumpurlBetween(String value1, String value2) {
            addCriterion("jumpUrl between", value1, value2, "jumpurl");
            return (Criteria) this;
        }

        public Criteria andJumpurlNotBetween(String value1, String value2) {
            addCriterion("jumpUrl not between", value1, value2, "jumpurl");
            return (Criteria) this;
        }

        public Criteria andLocalpathIsNull() {
            addCriterion("localPath is null");
            return (Criteria) this;
        }

        public Criteria andLocalpathIsNotNull() {
            addCriterion("localPath is not null");
            return (Criteria) this;
        }

        public Criteria andLocalpathEqualTo(String value) {
            addCriterion("localPath =", value, "localpath");
            return (Criteria) this;
        }

        public Criteria andLocalpathNotEqualTo(String value) {
            addCriterion("localPath <>", value, "localpath");
            return (Criteria) this;
        }

        public Criteria andLocalpathGreaterThan(String value) {
            addCriterion("localPath >", value, "localpath");
            return (Criteria) this;
        }

        public Criteria andLocalpathGreaterThanOrEqualTo(String value) {
            addCriterion("localPath >=", value, "localpath");
            return (Criteria) this;
        }

        public Criteria andLocalpathLessThan(String value) {
            addCriterion("localPath <", value, "localpath");
            return (Criteria) this;
        }

        public Criteria andLocalpathLessThanOrEqualTo(String value) {
            addCriterion("localPath <=", value, "localpath");
            return (Criteria) this;
        }

        public Criteria andLocalpathLike(String value) {
            addCriterion("localPath like", value, "localpath");
            return (Criteria) this;
        }

        public Criteria andLocalpathNotLike(String value) {
            addCriterion("localPath not like", value, "localpath");
            return (Criteria) this;
        }

        public Criteria andLocalpathIn(List<String> values) {
            addCriterion("localPath in", values, "localpath");
            return (Criteria) this;
        }

        public Criteria andLocalpathNotIn(List<String> values) {
            addCriterion("localPath not in", values, "localpath");
            return (Criteria) this;
        }

        public Criteria andLocalpathBetween(String value1, String value2) {
            addCriterion("localPath between", value1, value2, "localpath");
            return (Criteria) this;
        }

        public Criteria andLocalpathNotBetween(String value1, String value2) {
            addCriterion("localPath not between", value1, value2, "localpath");
            return (Criteria) this;
        }

        public Criteria andNeedloginIsNull() {
            addCriterion("needLogin is null");
            return (Criteria) this;
        }

        public Criteria andNeedloginIsNotNull() {
            addCriterion("needLogin is not null");
            return (Criteria) this;
        }

        public Criteria andNeedloginEqualTo(Integer value) {
            addCriterion("needLogin =", value, "needlogin");
            return (Criteria) this;
        }

        public Criteria andNeedloginNotEqualTo(Integer value) {
            addCriterion("needLogin <>", value, "needlogin");
            return (Criteria) this;
        }

        public Criteria andNeedloginGreaterThan(Integer value) {
            addCriterion("needLogin >", value, "needlogin");
            return (Criteria) this;
        }

        public Criteria andNeedloginGreaterThanOrEqualTo(Integer value) {
            addCriterion("needLogin >=", value, "needlogin");
            return (Criteria) this;
        }

        public Criteria andNeedloginLessThan(Integer value) {
            addCriterion("needLogin <", value, "needlogin");
            return (Criteria) this;
        }

        public Criteria andNeedloginLessThanOrEqualTo(Integer value) {
            addCriterion("needLogin <=", value, "needlogin");
            return (Criteria) this;
        }

        public Criteria andNeedloginIn(List<Integer> values) {
            addCriterion("needLogin in", values, "needlogin");
            return (Criteria) this;
        }

        public Criteria andNeedloginNotIn(List<Integer> values) {
            addCriterion("needLogin not in", values, "needlogin");
            return (Criteria) this;
        }

        public Criteria andNeedloginBetween(Integer value1, Integer value2) {
            addCriterion("needLogin between", value1, value2, "needlogin");
            return (Criteria) this;
        }

        public Criteria andNeedloginNotBetween(Integer value1, Integer value2) {
            addCriterion("needLogin not between", value1, value2, "needlogin");
            return (Criteria) this;
        }

        public Criteria andParamIsNull() {
            addCriterion("param is null");
            return (Criteria) this;
        }

        public Criteria andParamIsNotNull() {
            addCriterion("param is not null");
            return (Criteria) this;
        }

        public Criteria andParamEqualTo(String value) {
            addCriterion("param =", value, "param");
            return (Criteria) this;
        }

        public Criteria andParamNotEqualTo(String value) {
            addCriterion("param <>", value, "param");
            return (Criteria) this;
        }

        public Criteria andParamGreaterThan(String value) {
            addCriterion("param >", value, "param");
            return (Criteria) this;
        }

        public Criteria andParamGreaterThanOrEqualTo(String value) {
            addCriterion("param >=", value, "param");
            return (Criteria) this;
        }

        public Criteria andParamLessThan(String value) {
            addCriterion("param <", value, "param");
            return (Criteria) this;
        }

        public Criteria andParamLessThanOrEqualTo(String value) {
            addCriterion("param <=", value, "param");
            return (Criteria) this;
        }

        public Criteria andParamLike(String value) {
            addCriterion("param like", value, "param");
            return (Criteria) this;
        }

        public Criteria andParamNotLike(String value) {
            addCriterion("param not like", value, "param");
            return (Criteria) this;
        }

        public Criteria andParamIn(List<String> values) {
            addCriterion("param in", values, "param");
            return (Criteria) this;
        }

        public Criteria andParamNotIn(List<String> values) {
            addCriterion("param not in", values, "param");
            return (Criteria) this;
        }

        public Criteria andParamBetween(String value1, String value2) {
            addCriterion("param between", value1, value2, "param");
            return (Criteria) this;
        }

        public Criteria andParamNotBetween(String value1, String value2) {
            addCriterion("param not between", value1, value2, "param");
            return (Criteria) this;
        }

        public Criteria andIsshowIsNull() {
            addCriterion("isShow is null");
            return (Criteria) this;
        }

        public Criteria andIsshowIsNotNull() {
            addCriterion("isShow is not null");
            return (Criteria) this;
        }

        public Criteria andIsshowEqualTo(Integer value) {
            addCriterion("isShow =", value, "isshow");
            return (Criteria) this;
        }

        public Criteria andIsshowNotEqualTo(Integer value) {
            addCriterion("isShow <>", value, "isshow");
            return (Criteria) this;
        }

        public Criteria andIsshowGreaterThan(Integer value) {
            addCriterion("isShow >", value, "isshow");
            return (Criteria) this;
        }

        public Criteria andIsshowGreaterThanOrEqualTo(Integer value) {
            addCriterion("isShow >=", value, "isshow");
            return (Criteria) this;
        }

        public Criteria andIsshowLessThan(Integer value) {
            addCriterion("isShow <", value, "isshow");
            return (Criteria) this;
        }

        public Criteria andIsshowLessThanOrEqualTo(Integer value) {
            addCriterion("isShow <=", value, "isshow");
            return (Criteria) this;
        }

        public Criteria andIsshowIn(List<Integer> values) {
            addCriterion("isShow in", values, "isshow");
            return (Criteria) this;
        }

        public Criteria andIsshowNotIn(List<Integer> values) {
            addCriterion("isShow not in", values, "isshow");
            return (Criteria) this;
        }

        public Criteria andIsshowBetween(Integer value1, Integer value2) {
            addCriterion("isShow between", value1, value2, "isshow");
            return (Criteria) this;
        }

        public Criteria andIsshowNotBetween(Integer value1, Integer value2) {
            addCriterion("isShow not between", value1, value2, "isshow");
            return (Criteria) this;
        }

        public Criteria andCoverimageIsNull() {
            addCriterion("coverImage is null");
            return (Criteria) this;
        }

        public Criteria andCoverimageIsNotNull() {
            addCriterion("coverImage is not null");
            return (Criteria) this;
        }

        public Criteria andCoverimageEqualTo(String value) {
            addCriterion("coverImage =", value, "coverimage");
            return (Criteria) this;
        }

        public Criteria andCoverimageNotEqualTo(String value) {
            addCriterion("coverImage <>", value, "coverimage");
            return (Criteria) this;
        }

        public Criteria andCoverimageGreaterThan(String value) {
            addCriterion("coverImage >", value, "coverimage");
            return (Criteria) this;
        }

        public Criteria andCoverimageGreaterThanOrEqualTo(String value) {
            addCriterion("coverImage >=", value, "coverimage");
            return (Criteria) this;
        }

        public Criteria andCoverimageLessThan(String value) {
            addCriterion("coverImage <", value, "coverimage");
            return (Criteria) this;
        }

        public Criteria andCoverimageLessThanOrEqualTo(String value) {
            addCriterion("coverImage <=", value, "coverimage");
            return (Criteria) this;
        }

        public Criteria andCoverimageLike(String value) {
            addCriterion("coverImage like", value, "coverimage");
            return (Criteria) this;
        }

        public Criteria andCoverimageNotLike(String value) {
            addCriterion("coverImage not like", value, "coverimage");
            return (Criteria) this;
        }

        public Criteria andCoverimageIn(List<String> values) {
            addCriterion("coverImage in", values, "coverimage");
            return (Criteria) this;
        }

        public Criteria andCoverimageNotIn(List<String> values) {
            addCriterion("coverImage not in", values, "coverimage");
            return (Criteria) this;
        }

        public Criteria andCoverimageBetween(String value1, String value2) {
            addCriterion("coverImage between", value1, value2, "coverimage");
            return (Criteria) this;
        }

        public Criteria andCoverimageNotBetween(String value1, String value2) {
            addCriterion("coverImage not between", value1, value2, "coverimage");
            return (Criteria) this;
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

        public Criteria andIsenableIsNull() {
            addCriterion("isEnable is null");
            return (Criteria) this;
        }

        public Criteria andIsenableIsNotNull() {
            addCriterion("isEnable is not null");
            return (Criteria) this;
        }

        public Criteria andIsenableEqualTo(Integer value) {
            addCriterion("isEnable =", value, "isenable");
            return (Criteria) this;
        }

        public Criteria andIsenableNotEqualTo(Integer value) {
            addCriterion("isEnable <>", value, "isenable");
            return (Criteria) this;
        }

        public Criteria andIsenableGreaterThan(Integer value) {
            addCriterion("isEnable >", value, "isenable");
            return (Criteria) this;
        }

        public Criteria andIsenableGreaterThanOrEqualTo(Integer value) {
            addCriterion("isEnable >=", value, "isenable");
            return (Criteria) this;
        }

        public Criteria andIsenableLessThan(Integer value) {
            addCriterion("isEnable <", value, "isenable");
            return (Criteria) this;
        }

        public Criteria andIsenableLessThanOrEqualTo(Integer value) {
            addCriterion("isEnable <=", value, "isenable");
            return (Criteria) this;
        }

        public Criteria andIsenableIn(List<Integer> values) {
            addCriterion("isEnable in", values, "isenable");
            return (Criteria) this;
        }

        public Criteria andIsenableNotIn(List<Integer> values) {
            addCriterion("isEnable not in", values, "isenable");
            return (Criteria) this;
        }

        public Criteria andIsenableBetween(Integer value1, Integer value2) {
            addCriterion("isEnable between", value1, value2, "isenable");
            return (Criteria) this;
        }

        public Criteria andIsenableNotBetween(Integer value1, Integer value2) {
            addCriterion("isEnable not between", value1, value2, "isenable");
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