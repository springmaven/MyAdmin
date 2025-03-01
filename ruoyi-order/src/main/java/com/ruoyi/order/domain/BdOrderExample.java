package com.ruoyi.order.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class BdOrderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public BdOrderExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andGmtCreateIsNull() {
            addCriterion("gmt_create is null");
            return (Criteria) this;
        }

        public Criteria andGmtCreateIsNotNull() {
            addCriterion("gmt_create is not null");
            return (Criteria) this;
        }

        public Criteria andGmtCreateEqualTo(Date value) {
            addCriterionForJDBCDate("gmt_create =", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateNotEqualTo(Date value) {
            addCriterionForJDBCDate("gmt_create <>", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateGreaterThan(Date value) {
            addCriterionForJDBCDate("gmt_create >", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("gmt_create >=", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateLessThan(Date value) {
            addCriterionForJDBCDate("gmt_create <", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("gmt_create <=", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateIn(List<Date> values) {
            addCriterionForJDBCDate("gmt_create in", values, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateNotIn(List<Date> values) {
            addCriterionForJDBCDate("gmt_create not in", values, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("gmt_create between", value1, value2, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("gmt_create not between", value1, value2, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedIsNull() {
            addCriterion("gmt_modified is null");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedIsNotNull() {
            addCriterion("gmt_modified is not null");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedEqualTo(Date value) {
            addCriterionForJDBCDate("gmt_modified =", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedNotEqualTo(Date value) {
            addCriterionForJDBCDate("gmt_modified <>", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedGreaterThan(Date value) {
            addCriterionForJDBCDate("gmt_modified >", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("gmt_modified >=", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedLessThan(Date value) {
            addCriterionForJDBCDate("gmt_modified <", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("gmt_modified <=", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedIn(List<Date> values) {
            addCriterionForJDBCDate("gmt_modified in", values, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedNotIn(List<Date> values) {
            addCriterionForJDBCDate("gmt_modified not in", values, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("gmt_modified between", value1, value2, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("gmt_modified not between", value1, value2, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andModifierIsNull() {
            addCriterion("modifier is null");
            return (Criteria) this;
        }

        public Criteria andModifierIsNotNull() {
            addCriterion("modifier is not null");
            return (Criteria) this;
        }

        public Criteria andModifierEqualTo(String value) {
            addCriterion("modifier =", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierNotEqualTo(String value) {
            addCriterion("modifier <>", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierGreaterThan(String value) {
            addCriterion("modifier >", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierGreaterThanOrEqualTo(String value) {
            addCriterion("modifier >=", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierLessThan(String value) {
            addCriterion("modifier <", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierLessThanOrEqualTo(String value) {
            addCriterion("modifier <=", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierLike(String value) {
            addCriterion("modifier like", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierNotLike(String value) {
            addCriterion("modifier not like", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierIn(List<String> values) {
            addCriterion("modifier in", values, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierNotIn(List<String> values) {
            addCriterion("modifier not in", values, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierBetween(String value1, String value2) {
            addCriterion("modifier between", value1, value2, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierNotBetween(String value1, String value2) {
            addCriterion("modifier not between", value1, value2, "modifier");
            return (Criteria) this;
        }

        public Criteria andCreatorIsNull() {
            addCriterion("creator is null");
            return (Criteria) this;
        }

        public Criteria andCreatorIsNotNull() {
            addCriterion("creator is not null");
            return (Criteria) this;
        }

        public Criteria andCreatorEqualTo(String value) {
            addCriterion("creator =", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotEqualTo(String value) {
            addCriterion("creator <>", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorGreaterThan(String value) {
            addCriterion("creator >", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorGreaterThanOrEqualTo(String value) {
            addCriterion("creator >=", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorLessThan(String value) {
            addCriterion("creator <", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorLessThanOrEqualTo(String value) {
            addCriterion("creator <=", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorLike(String value) {
            addCriterion("creator like", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotLike(String value) {
            addCriterion("creator not like", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorIn(List<String> values) {
            addCriterion("creator in", values, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotIn(List<String> values) {
            addCriterion("creator not in", values, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorBetween(String value1, String value2) {
            addCriterion("creator between", value1, value2, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotBetween(String value1, String value2) {
            addCriterion("creator not between", value1, value2, "creator");
            return (Criteria) this;
        }

        public Criteria andIsDeletedIsNull() {
            addCriterion("is_deleted is null");
            return (Criteria) this;
        }

        public Criteria andIsDeletedIsNotNull() {
            addCriterion("is_deleted is not null");
            return (Criteria) this;
        }

        public Criteria andIsDeletedEqualTo(String value) {
            addCriterion("is_deleted =", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedNotEqualTo(String value) {
            addCriterion("is_deleted <>", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedGreaterThan(String value) {
            addCriterion("is_deleted >", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedGreaterThanOrEqualTo(String value) {
            addCriterion("is_deleted >=", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedLessThan(String value) {
            addCriterion("is_deleted <", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedLessThanOrEqualTo(String value) {
            addCriterion("is_deleted <=", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedLike(String value) {
            addCriterion("is_deleted like", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedNotLike(String value) {
            addCriterion("is_deleted not like", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedIn(List<String> values) {
            addCriterion("is_deleted in", values, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedNotIn(List<String> values) {
            addCriterion("is_deleted not in", values, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedBetween(String value1, String value2) {
            addCriterion("is_deleted between", value1, value2, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedNotBetween(String value1, String value2) {
            addCriterion("is_deleted not between", value1, value2, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andMailNoIsNull() {
            addCriterion("mail_no is null");
            return (Criteria) this;
        }

        public Criteria andMailNoIsNotNull() {
            addCriterion("mail_no is not null");
            return (Criteria) this;
        }

        public Criteria andMailNoEqualTo(String value) {
            addCriterion("mail_no =", value, "mailNo");
            return (Criteria) this;
        }

        public Criteria andMailNoNotEqualTo(String value) {
            addCriterion("mail_no <>", value, "mailNo");
            return (Criteria) this;
        }

        public Criteria andMailNoGreaterThan(String value) {
            addCriterion("mail_no >", value, "mailNo");
            return (Criteria) this;
        }

        public Criteria andMailNoGreaterThanOrEqualTo(String value) {
            addCriterion("mail_no >=", value, "mailNo");
            return (Criteria) this;
        }

        public Criteria andMailNoLessThan(String value) {
            addCriterion("mail_no <", value, "mailNo");
            return (Criteria) this;
        }

        public Criteria andMailNoLessThanOrEqualTo(String value) {
            addCriterion("mail_no <=", value, "mailNo");
            return (Criteria) this;
        }

        public Criteria andMailNoLike(String value) {
            addCriterion("mail_no like", value, "mailNo");
            return (Criteria) this;
        }

        public Criteria andMailNoNotLike(String value) {
            addCriterion("mail_no not like", value, "mailNo");
            return (Criteria) this;
        }

        public Criteria andMailNoIn(List<String> values) {
            addCriterion("mail_no in", values, "mailNo");
            return (Criteria) this;
        }

        public Criteria andMailNoNotIn(List<String> values) {
            addCriterion("mail_no not in", values, "mailNo");
            return (Criteria) this;
        }

        public Criteria andMailNoBetween(String value1, String value2) {
            addCriterion("mail_no between", value1, value2, "mailNo");
            return (Criteria) this;
        }

        public Criteria andMailNoNotBetween(String value1, String value2) {
            addCriterion("mail_no not between", value1, value2, "mailNo");
            return (Criteria) this;
        }

        public Criteria andOutBizNoIsNull() {
            addCriterion("out_biz_no is null");
            return (Criteria) this;
        }

        public Criteria andOutBizNoIsNotNull() {
            addCriterion("out_biz_no is not null");
            return (Criteria) this;
        }

        public Criteria andOutBizNoEqualTo(String value) {
            addCriterion("out_biz_no =", value, "outBizNo");
            return (Criteria) this;
        }

        public Criteria andOutBizNoNotEqualTo(String value) {
            addCriterion("out_biz_no <>", value, "outBizNo");
            return (Criteria) this;
        }

        public Criteria andOutBizNoGreaterThan(String value) {
            addCriterion("out_biz_no >", value, "outBizNo");
            return (Criteria) this;
        }

        public Criteria andOutBizNoGreaterThanOrEqualTo(String value) {
            addCriterion("out_biz_no >=", value, "outBizNo");
            return (Criteria) this;
        }

        public Criteria andOutBizNoLessThan(String value) {
            addCriterion("out_biz_no <", value, "outBizNo");
            return (Criteria) this;
        }

        public Criteria andOutBizNoLessThanOrEqualTo(String value) {
            addCriterion("out_biz_no <=", value, "outBizNo");
            return (Criteria) this;
        }

        public Criteria andOutBizNoLike(String value) {
            addCriterion("out_biz_no like", value, "outBizNo");
            return (Criteria) this;
        }

        public Criteria andOutBizNoNotLike(String value) {
            addCriterion("out_biz_no not like", value, "outBizNo");
            return (Criteria) this;
        }

        public Criteria andOutBizNoIn(List<String> values) {
            addCriterion("out_biz_no in", values, "outBizNo");
            return (Criteria) this;
        }

        public Criteria andOutBizNoNotIn(List<String> values) {
            addCriterion("out_biz_no not in", values, "outBizNo");
            return (Criteria) this;
        }

        public Criteria andOutBizNoBetween(String value1, String value2) {
            addCriterion("out_biz_no between", value1, value2, "outBizNo");
            return (Criteria) this;
        }

        public Criteria andOutBizNoNotBetween(String value1, String value2) {
            addCriterion("out_biz_no not between", value1, value2, "outBizNo");
            return (Criteria) this;
        }

        public Criteria andFromProvinceIsNull() {
            addCriterion("from_province is null");
            return (Criteria) this;
        }

        public Criteria andFromProvinceIsNotNull() {
            addCriterion("from_province is not null");
            return (Criteria) this;
        }

        public Criteria andFromProvinceEqualTo(String value) {
            addCriterion("from_province =", value, "fromProvince");
            return (Criteria) this;
        }

        public Criteria andFromProvinceNotEqualTo(String value) {
            addCriterion("from_province <>", value, "fromProvince");
            return (Criteria) this;
        }

        public Criteria andFromProvinceGreaterThan(String value) {
            addCriterion("from_province >", value, "fromProvince");
            return (Criteria) this;
        }

        public Criteria andFromProvinceGreaterThanOrEqualTo(String value) {
            addCriterion("from_province >=", value, "fromProvince");
            return (Criteria) this;
        }

        public Criteria andFromProvinceLessThan(String value) {
            addCriterion("from_province <", value, "fromProvince");
            return (Criteria) this;
        }

        public Criteria andFromProvinceLessThanOrEqualTo(String value) {
            addCriterion("from_province <=", value, "fromProvince");
            return (Criteria) this;
        }

        public Criteria andFromProvinceLike(String value) {
            addCriterion("from_province like", value, "fromProvince");
            return (Criteria) this;
        }

        public Criteria andFromProvinceNotLike(String value) {
            addCriterion("from_province not like", value, "fromProvince");
            return (Criteria) this;
        }

        public Criteria andFromProvinceIn(List<String> values) {
            addCriterion("from_province in", values, "fromProvince");
            return (Criteria) this;
        }

        public Criteria andFromProvinceNotIn(List<String> values) {
            addCriterion("from_province not in", values, "fromProvince");
            return (Criteria) this;
        }

        public Criteria andFromProvinceBetween(String value1, String value2) {
            addCriterion("from_province between", value1, value2, "fromProvince");
            return (Criteria) this;
        }

        public Criteria andFromProvinceNotBetween(String value1, String value2) {
            addCriterion("from_province not between", value1, value2, "fromProvince");
            return (Criteria) this;
        }

        public Criteria andFromCityIsNull() {
            addCriterion("from_city is null");
            return (Criteria) this;
        }

        public Criteria andFromCityIsNotNull() {
            addCriterion("from_city is not null");
            return (Criteria) this;
        }

        public Criteria andFromCityEqualTo(String value) {
            addCriterion("from_city =", value, "fromCity");
            return (Criteria) this;
        }

        public Criteria andFromCityNotEqualTo(String value) {
            addCriterion("from_city <>", value, "fromCity");
            return (Criteria) this;
        }

        public Criteria andFromCityGreaterThan(String value) {
            addCriterion("from_city >", value, "fromCity");
            return (Criteria) this;
        }

        public Criteria andFromCityGreaterThanOrEqualTo(String value) {
            addCriterion("from_city >=", value, "fromCity");
            return (Criteria) this;
        }

        public Criteria andFromCityLessThan(String value) {
            addCriterion("from_city <", value, "fromCity");
            return (Criteria) this;
        }

        public Criteria andFromCityLessThanOrEqualTo(String value) {
            addCriterion("from_city <=", value, "fromCity");
            return (Criteria) this;
        }

        public Criteria andFromCityLike(String value) {
            addCriterion("from_city like", value, "fromCity");
            return (Criteria) this;
        }

        public Criteria andFromCityNotLike(String value) {
            addCriterion("from_city not like", value, "fromCity");
            return (Criteria) this;
        }

        public Criteria andFromCityIn(List<String> values) {
            addCriterion("from_city in", values, "fromCity");
            return (Criteria) this;
        }

        public Criteria andFromCityNotIn(List<String> values) {
            addCriterion("from_city not in", values, "fromCity");
            return (Criteria) this;
        }

        public Criteria andFromCityBetween(String value1, String value2) {
            addCriterion("from_city between", value1, value2, "fromCity");
            return (Criteria) this;
        }

        public Criteria andFromCityNotBetween(String value1, String value2) {
            addCriterion("from_city not between", value1, value2, "fromCity");
            return (Criteria) this;
        }

        public Criteria andFromAreaIsNull() {
            addCriterion("from_area is null");
            return (Criteria) this;
        }

        public Criteria andFromAreaIsNotNull() {
            addCriterion("from_area is not null");
            return (Criteria) this;
        }

        public Criteria andFromAreaEqualTo(String value) {
            addCriterion("from_area =", value, "fromArea");
            return (Criteria) this;
        }

        public Criteria andFromAreaNotEqualTo(String value) {
            addCriterion("from_area <>", value, "fromArea");
            return (Criteria) this;
        }

        public Criteria andFromAreaGreaterThan(String value) {
            addCriterion("from_area >", value, "fromArea");
            return (Criteria) this;
        }

        public Criteria andFromAreaGreaterThanOrEqualTo(String value) {
            addCriterion("from_area >=", value, "fromArea");
            return (Criteria) this;
        }

        public Criteria andFromAreaLessThan(String value) {
            addCriterion("from_area <", value, "fromArea");
            return (Criteria) this;
        }

        public Criteria andFromAreaLessThanOrEqualTo(String value) {
            addCriterion("from_area <=", value, "fromArea");
            return (Criteria) this;
        }

        public Criteria andFromAreaLike(String value) {
            addCriterion("from_area like", value, "fromArea");
            return (Criteria) this;
        }

        public Criteria andFromAreaNotLike(String value) {
            addCriterion("from_area not like", value, "fromArea");
            return (Criteria) this;
        }

        public Criteria andFromAreaIn(List<String> values) {
            addCriterion("from_area in", values, "fromArea");
            return (Criteria) this;
        }

        public Criteria andFromAreaNotIn(List<String> values) {
            addCriterion("from_area not in", values, "fromArea");
            return (Criteria) this;
        }

        public Criteria andFromAreaBetween(String value1, String value2) {
            addCriterion("from_area between", value1, value2, "fromArea");
            return (Criteria) this;
        }

        public Criteria andFromAreaNotBetween(String value1, String value2) {
            addCriterion("from_area not between", value1, value2, "fromArea");
            return (Criteria) this;
        }

        public Criteria andFromAddressIsNull() {
            addCriterion("from_address is null");
            return (Criteria) this;
        }

        public Criteria andFromAddressIsNotNull() {
            addCriterion("from_address is not null");
            return (Criteria) this;
        }

        public Criteria andFromAddressEqualTo(String value) {
            addCriterion("from_address =", value, "fromAddress");
            return (Criteria) this;
        }

        public Criteria andFromAddressNotEqualTo(String value) {
            addCriterion("from_address <>", value, "fromAddress");
            return (Criteria) this;
        }

        public Criteria andFromAddressGreaterThan(String value) {
            addCriterion("from_address >", value, "fromAddress");
            return (Criteria) this;
        }

        public Criteria andFromAddressGreaterThanOrEqualTo(String value) {
            addCriterion("from_address >=", value, "fromAddress");
            return (Criteria) this;
        }

        public Criteria andFromAddressLessThan(String value) {
            addCriterion("from_address <", value, "fromAddress");
            return (Criteria) this;
        }

        public Criteria andFromAddressLessThanOrEqualTo(String value) {
            addCriterion("from_address <=", value, "fromAddress");
            return (Criteria) this;
        }

        public Criteria andFromAddressLike(String value) {
            addCriterion("from_address like", value, "fromAddress");
            return (Criteria) this;
        }

        public Criteria andFromAddressNotLike(String value) {
            addCriterion("from_address not like", value, "fromAddress");
            return (Criteria) this;
        }

        public Criteria andFromAddressIn(List<String> values) {
            addCriterion("from_address in", values, "fromAddress");
            return (Criteria) this;
        }

        public Criteria andFromAddressNotIn(List<String> values) {
            addCriterion("from_address not in", values, "fromAddress");
            return (Criteria) this;
        }

        public Criteria andFromAddressBetween(String value1, String value2) {
            addCriterion("from_address between", value1, value2, "fromAddress");
            return (Criteria) this;
        }

        public Criteria andFromAddressNotBetween(String value1, String value2) {
            addCriterion("from_address not between", value1, value2, "fromAddress");
            return (Criteria) this;
        }

        public Criteria andToProvinceIsNull() {
            addCriterion("to_province is null");
            return (Criteria) this;
        }

        public Criteria andToProvinceIsNotNull() {
            addCriterion("to_province is not null");
            return (Criteria) this;
        }

        public Criteria andToProvinceEqualTo(String value) {
            addCriterion("to_province =", value, "toProvince");
            return (Criteria) this;
        }

        public Criteria andToProvinceNotEqualTo(String value) {
            addCriterion("to_province <>", value, "toProvince");
            return (Criteria) this;
        }

        public Criteria andToProvinceGreaterThan(String value) {
            addCriterion("to_province >", value, "toProvince");
            return (Criteria) this;
        }

        public Criteria andToProvinceGreaterThanOrEqualTo(String value) {
            addCriterion("to_province >=", value, "toProvince");
            return (Criteria) this;
        }

        public Criteria andToProvinceLessThan(String value) {
            addCriterion("to_province <", value, "toProvince");
            return (Criteria) this;
        }

        public Criteria andToProvinceLessThanOrEqualTo(String value) {
            addCriterion("to_province <=", value, "toProvince");
            return (Criteria) this;
        }

        public Criteria andToProvinceLike(String value) {
            addCriterion("to_province like", value, "toProvince");
            return (Criteria) this;
        }

        public Criteria andToProvinceNotLike(String value) {
            addCriterion("to_province not like", value, "toProvince");
            return (Criteria) this;
        }

        public Criteria andToProvinceIn(List<String> values) {
            addCriterion("to_province in", values, "toProvince");
            return (Criteria) this;
        }

        public Criteria andToProvinceNotIn(List<String> values) {
            addCriterion("to_province not in", values, "toProvince");
            return (Criteria) this;
        }

        public Criteria andToProvinceBetween(String value1, String value2) {
            addCriterion("to_province between", value1, value2, "toProvince");
            return (Criteria) this;
        }

        public Criteria andToProvinceNotBetween(String value1, String value2) {
            addCriterion("to_province not between", value1, value2, "toProvince");
            return (Criteria) this;
        }

        public Criteria andToCityIsNull() {
            addCriterion("to_city is null");
            return (Criteria) this;
        }

        public Criteria andToCityIsNotNull() {
            addCriterion("to_city is not null");
            return (Criteria) this;
        }

        public Criteria andToCityEqualTo(String value) {
            addCriterion("to_city =", value, "toCity");
            return (Criteria) this;
        }

        public Criteria andToCityNotEqualTo(String value) {
            addCriterion("to_city <>", value, "toCity");
            return (Criteria) this;
        }

        public Criteria andToCityGreaterThan(String value) {
            addCriterion("to_city >", value, "toCity");
            return (Criteria) this;
        }

        public Criteria andToCityGreaterThanOrEqualTo(String value) {
            addCriterion("to_city >=", value, "toCity");
            return (Criteria) this;
        }

        public Criteria andToCityLessThan(String value) {
            addCriterion("to_city <", value, "toCity");
            return (Criteria) this;
        }

        public Criteria andToCityLessThanOrEqualTo(String value) {
            addCriterion("to_city <=", value, "toCity");
            return (Criteria) this;
        }

        public Criteria andToCityLike(String value) {
            addCriterion("to_city like", value, "toCity");
            return (Criteria) this;
        }

        public Criteria andToCityNotLike(String value) {
            addCriterion("to_city not like", value, "toCity");
            return (Criteria) this;
        }

        public Criteria andToCityIn(List<String> values) {
            addCriterion("to_city in", values, "toCity");
            return (Criteria) this;
        }

        public Criteria andToCityNotIn(List<String> values) {
            addCriterion("to_city not in", values, "toCity");
            return (Criteria) this;
        }

        public Criteria andToCityBetween(String value1, String value2) {
            addCriterion("to_city between", value1, value2, "toCity");
            return (Criteria) this;
        }

        public Criteria andToCityNotBetween(String value1, String value2) {
            addCriterion("to_city not between", value1, value2, "toCity");
            return (Criteria) this;
        }

        public Criteria andToAreaIsNull() {
            addCriterion("to_area is null");
            return (Criteria) this;
        }

        public Criteria andToAreaIsNotNull() {
            addCriterion("to_area is not null");
            return (Criteria) this;
        }

        public Criteria andToAreaEqualTo(String value) {
            addCriterion("to_area =", value, "toArea");
            return (Criteria) this;
        }

        public Criteria andToAreaNotEqualTo(String value) {
            addCriterion("to_area <>", value, "toArea");
            return (Criteria) this;
        }

        public Criteria andToAreaGreaterThan(String value) {
            addCriterion("to_area >", value, "toArea");
            return (Criteria) this;
        }

        public Criteria andToAreaGreaterThanOrEqualTo(String value) {
            addCriterion("to_area >=", value, "toArea");
            return (Criteria) this;
        }

        public Criteria andToAreaLessThan(String value) {
            addCriterion("to_area <", value, "toArea");
            return (Criteria) this;
        }

        public Criteria andToAreaLessThanOrEqualTo(String value) {
            addCriterion("to_area <=", value, "toArea");
            return (Criteria) this;
        }

        public Criteria andToAreaLike(String value) {
            addCriterion("to_area like", value, "toArea");
            return (Criteria) this;
        }

        public Criteria andToAreaNotLike(String value) {
            addCriterion("to_area not like", value, "toArea");
            return (Criteria) this;
        }

        public Criteria andToAreaIn(List<String> values) {
            addCriterion("to_area in", values, "toArea");
            return (Criteria) this;
        }

        public Criteria andToAreaNotIn(List<String> values) {
            addCriterion("to_area not in", values, "toArea");
            return (Criteria) this;
        }

        public Criteria andToAreaBetween(String value1, String value2) {
            addCriterion("to_area between", value1, value2, "toArea");
            return (Criteria) this;
        }

        public Criteria andToAreaNotBetween(String value1, String value2) {
            addCriterion("to_area not between", value1, value2, "toArea");
            return (Criteria) this;
        }

        public Criteria andToAddressIsNull() {
            addCriterion("to_address is null");
            return (Criteria) this;
        }

        public Criteria andToAddressIsNotNull() {
            addCriterion("to_address is not null");
            return (Criteria) this;
        }

        public Criteria andToAddressEqualTo(String value) {
            addCriterion("to_address =", value, "toAddress");
            return (Criteria) this;
        }

        public Criteria andToAddressNotEqualTo(String value) {
            addCriterion("to_address <>", value, "toAddress");
            return (Criteria) this;
        }

        public Criteria andToAddressGreaterThan(String value) {
            addCriterion("to_address >", value, "toAddress");
            return (Criteria) this;
        }

        public Criteria andToAddressGreaterThanOrEqualTo(String value) {
            addCriterion("to_address >=", value, "toAddress");
            return (Criteria) this;
        }

        public Criteria andToAddressLessThan(String value) {
            addCriterion("to_address <", value, "toAddress");
            return (Criteria) this;
        }

        public Criteria andToAddressLessThanOrEqualTo(String value) {
            addCriterion("to_address <=", value, "toAddress");
            return (Criteria) this;
        }

        public Criteria andToAddressLike(String value) {
            addCriterion("to_address like", value, "toAddress");
            return (Criteria) this;
        }

        public Criteria andToAddressNotLike(String value) {
            addCriterion("to_address not like", value, "toAddress");
            return (Criteria) this;
        }

        public Criteria andToAddressIn(List<String> values) {
            addCriterion("to_address in", values, "toAddress");
            return (Criteria) this;
        }

        public Criteria andToAddressNotIn(List<String> values) {
            addCriterion("to_address not in", values, "toAddress");
            return (Criteria) this;
        }

        public Criteria andToAddressBetween(String value1, String value2) {
            addCriterion("to_address between", value1, value2, "toAddress");
            return (Criteria) this;
        }

        public Criteria andToAddressNotBetween(String value1, String value2) {
            addCriterion("to_address not between", value1, value2, "toAddress");
            return (Criteria) this;
        }

        public Criteria andReceiverPhoneIsNull() {
            addCriterion("receiver_phone is null");
            return (Criteria) this;
        }

        public Criteria andReceiverPhoneIsNotNull() {
            addCriterion("receiver_phone is not null");
            return (Criteria) this;
        }

        public Criteria andReceiverPhoneEqualTo(String value) {
            addCriterion("receiver_phone =", value, "receiverPhone");
            return (Criteria) this;
        }

        public Criteria andReceiverPhoneNotEqualTo(String value) {
            addCriterion("receiver_phone <>", value, "receiverPhone");
            return (Criteria) this;
        }

        public Criteria andReceiverPhoneGreaterThan(String value) {
            addCriterion("receiver_phone >", value, "receiverPhone");
            return (Criteria) this;
        }

        public Criteria andReceiverPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("receiver_phone >=", value, "receiverPhone");
            return (Criteria) this;
        }

        public Criteria andReceiverPhoneLessThan(String value) {
            addCriterion("receiver_phone <", value, "receiverPhone");
            return (Criteria) this;
        }

        public Criteria andReceiverPhoneLessThanOrEqualTo(String value) {
            addCriterion("receiver_phone <=", value, "receiverPhone");
            return (Criteria) this;
        }

        public Criteria andReceiverPhoneLike(String value) {
            addCriterion("receiver_phone like", value, "receiverPhone");
            return (Criteria) this;
        }

        public Criteria andReceiverPhoneNotLike(String value) {
            addCriterion("receiver_phone not like", value, "receiverPhone");
            return (Criteria) this;
        }

        public Criteria andReceiverPhoneIn(List<String> values) {
            addCriterion("receiver_phone in", values, "receiverPhone");
            return (Criteria) this;
        }

        public Criteria andReceiverPhoneNotIn(List<String> values) {
            addCriterion("receiver_phone not in", values, "receiverPhone");
            return (Criteria) this;
        }

        public Criteria andReceiverPhoneBetween(String value1, String value2) {
            addCriterion("receiver_phone between", value1, value2, "receiverPhone");
            return (Criteria) this;
        }

        public Criteria andReceiverPhoneNotBetween(String value1, String value2) {
            addCriterion("receiver_phone not between", value1, value2, "receiverPhone");
            return (Criteria) this;
        }

        public Criteria andCleanAddressIsNull() {
            addCriterion("clean_address is null");
            return (Criteria) this;
        }

        public Criteria andCleanAddressIsNotNull() {
            addCriterion("clean_address is not null");
            return (Criteria) this;
        }

        public Criteria andCleanAddressEqualTo(String value) {
            addCriterion("clean_address =", value, "cleanAddress");
            return (Criteria) this;
        }

        public Criteria andCleanAddressNotEqualTo(String value) {
            addCriterion("clean_address <>", value, "cleanAddress");
            return (Criteria) this;
        }

        public Criteria andCleanAddressGreaterThan(String value) {
            addCriterion("clean_address >", value, "cleanAddress");
            return (Criteria) this;
        }

        public Criteria andCleanAddressGreaterThanOrEqualTo(String value) {
            addCriterion("clean_address >=", value, "cleanAddress");
            return (Criteria) this;
        }

        public Criteria andCleanAddressLessThan(String value) {
            addCriterion("clean_address <", value, "cleanAddress");
            return (Criteria) this;
        }

        public Criteria andCleanAddressLessThanOrEqualTo(String value) {
            addCriterion("clean_address <=", value, "cleanAddress");
            return (Criteria) this;
        }

        public Criteria andCleanAddressLike(String value) {
            addCriterion("clean_address like", value, "cleanAddress");
            return (Criteria) this;
        }

        public Criteria andCleanAddressNotLike(String value) {
            addCriterion("clean_address not like", value, "cleanAddress");
            return (Criteria) this;
        }

        public Criteria andCleanAddressIn(List<String> values) {
            addCriterion("clean_address in", values, "cleanAddress");
            return (Criteria) this;
        }

        public Criteria andCleanAddressNotIn(List<String> values) {
            addCriterion("clean_address not in", values, "cleanAddress");
            return (Criteria) this;
        }

        public Criteria andCleanAddressBetween(String value1, String value2) {
            addCriterion("clean_address between", value1, value2, "cleanAddress");
            return (Criteria) this;
        }

        public Criteria andCleanAddressNotBetween(String value1, String value2) {
            addCriterion("clean_address not between", value1, value2, "cleanAddress");
            return (Criteria) this;
        }

        public Criteria andHekaIsNull() {
            addCriterion("heka is null");
            return (Criteria) this;
        }

        public Criteria andHekaIsNotNull() {
            addCriterion("heka is not null");
            return (Criteria) this;
        }

        public Criteria andHekaEqualTo(String value) {
            addCriterion("heka =", value, "heka");
            return (Criteria) this;
        }

        public Criteria andHekaNotEqualTo(String value) {
            addCriterion("heka <>", value, "heka");
            return (Criteria) this;
        }

        public Criteria andHekaGreaterThan(String value) {
            addCriterion("heka >", value, "heka");
            return (Criteria) this;
        }

        public Criteria andHekaGreaterThanOrEqualTo(String value) {
            addCriterion("heka >=", value, "heka");
            return (Criteria) this;
        }

        public Criteria andHekaLessThan(String value) {
            addCriterion("heka <", value, "heka");
            return (Criteria) this;
        }

        public Criteria andHekaLessThanOrEqualTo(String value) {
            addCriterion("heka <=", value, "heka");
            return (Criteria) this;
        }

        public Criteria andHekaLike(String value) {
            addCriterion("heka like", value, "heka");
            return (Criteria) this;
        }

        public Criteria andHekaNotLike(String value) {
            addCriterion("heka not like", value, "heka");
            return (Criteria) this;
        }

        public Criteria andHekaIn(List<String> values) {
            addCriterion("heka in", values, "heka");
            return (Criteria) this;
        }

        public Criteria andHekaNotIn(List<String> values) {
            addCriterion("heka not in", values, "heka");
            return (Criteria) this;
        }

        public Criteria andHekaBetween(String value1, String value2) {
            addCriterion("heka between", value1, value2, "heka");
            return (Criteria) this;
        }

        public Criteria andHekaNotBetween(String value1, String value2) {
            addCriterion("heka not between", value1, value2, "heka");
            return (Criteria) this;
        }

        public Criteria andDeliveryDateIsNull() {
            addCriterion("delivery_date is null");
            return (Criteria) this;
        }

        public Criteria andDeliveryDateIsNotNull() {
            addCriterion("delivery_date is not null");
            return (Criteria) this;
        }

        public Criteria andDeliveryDateEqualTo(String value) {
            addCriterion("delivery_date =", value, "deliveryDate");
            return (Criteria) this;
        }

        public Criteria andDeliveryDateNotEqualTo(String value) {
            addCriterion("delivery_date <>", value, "deliveryDate");
            return (Criteria) this;
        }

        public Criteria andDeliveryDateGreaterThan(String value) {
            addCriterion("delivery_date >", value, "deliveryDate");
            return (Criteria) this;
        }

        public Criteria andDeliveryDateGreaterThanOrEqualTo(String value) {
            addCriterion("delivery_date >=", value, "deliveryDate");
            return (Criteria) this;
        }

        public Criteria andDeliveryDateLessThan(String value) {
            addCriterion("delivery_date <", value, "deliveryDate");
            return (Criteria) this;
        }

        public Criteria andDeliveryDateLessThanOrEqualTo(String value) {
            addCriterion("delivery_date <=", value, "deliveryDate");
            return (Criteria) this;
        }

        public Criteria andDeliveryDateLike(String value) {
            addCriterion("delivery_date like", value, "deliveryDate");
            return (Criteria) this;
        }

        public Criteria andDeliveryDateNotLike(String value) {
            addCriterion("delivery_date not like", value, "deliveryDate");
            return (Criteria) this;
        }

        public Criteria andDeliveryDateIn(List<String> values) {
            addCriterion("delivery_date in", values, "deliveryDate");
            return (Criteria) this;
        }

        public Criteria andDeliveryDateNotIn(List<String> values) {
            addCriterion("delivery_date not in", values, "deliveryDate");
            return (Criteria) this;
        }

        public Criteria andDeliveryDateBetween(String value1, String value2) {
            addCriterion("delivery_date between", value1, value2, "deliveryDate");
            return (Criteria) this;
        }

        public Criteria andDeliveryDateNotBetween(String value1, String value2) {
            addCriterion("delivery_date not between", value1, value2, "deliveryDate");
            return (Criteria) this;
        }

        public Criteria andDeliveryTypeIsNull() {
            addCriterion("delivery_type is null");
            return (Criteria) this;
        }

        public Criteria andDeliveryTypeIsNotNull() {
            addCriterion("delivery_type is not null");
            return (Criteria) this;
        }

        public Criteria andDeliveryTypeEqualTo(String value) {
            addCriterion("delivery_type =", value, "deliveryType");
            return (Criteria) this;
        }

        public Criteria andDeliveryTypeNotEqualTo(String value) {
            addCriterion("delivery_type <>", value, "deliveryType");
            return (Criteria) this;
        }

        public Criteria andDeliveryTypeGreaterThan(String value) {
            addCriterion("delivery_type >", value, "deliveryType");
            return (Criteria) this;
        }

        public Criteria andDeliveryTypeGreaterThanOrEqualTo(String value) {
            addCriterion("delivery_type >=", value, "deliveryType");
            return (Criteria) this;
        }

        public Criteria andDeliveryTypeLessThan(String value) {
            addCriterion("delivery_type <", value, "deliveryType");
            return (Criteria) this;
        }

        public Criteria andDeliveryTypeLessThanOrEqualTo(String value) {
            addCriterion("delivery_type <=", value, "deliveryType");
            return (Criteria) this;
        }

        public Criteria andDeliveryTypeLike(String value) {
            addCriterion("delivery_type like", value, "deliveryType");
            return (Criteria) this;
        }

        public Criteria andDeliveryTypeNotLike(String value) {
            addCriterion("delivery_type not like", value, "deliveryType");
            return (Criteria) this;
        }

        public Criteria andDeliveryTypeIn(List<String> values) {
            addCriterion("delivery_type in", values, "deliveryType");
            return (Criteria) this;
        }

        public Criteria andDeliveryTypeNotIn(List<String> values) {
            addCriterion("delivery_type not in", values, "deliveryType");
            return (Criteria) this;
        }

        public Criteria andDeliveryTypeBetween(String value1, String value2) {
            addCriterion("delivery_type between", value1, value2, "deliveryType");
            return (Criteria) this;
        }

        public Criteria andDeliveryTypeNotBetween(String value1, String value2) {
            addCriterion("delivery_type not between", value1, value2, "deliveryType");
            return (Criteria) this;
        }

        public Criteria andDistributorIsNull() {
            addCriterion("distributor is null");
            return (Criteria) this;
        }

        public Criteria andDistributorIsNotNull() {
            addCriterion("distributor is not null");
            return (Criteria) this;
        }

        public Criteria andDistributorEqualTo(String value) {
            addCriterion("distributor =", value, "distributor");
            return (Criteria) this;
        }

        public Criteria andDistributorNotEqualTo(String value) {
            addCriterion("distributor <>", value, "distributor");
            return (Criteria) this;
        }

        public Criteria andDistributorGreaterThan(String value) {
            addCriterion("distributor >", value, "distributor");
            return (Criteria) this;
        }

        public Criteria andDistributorGreaterThanOrEqualTo(String value) {
            addCriterion("distributor >=", value, "distributor");
            return (Criteria) this;
        }

        public Criteria andDistributorLessThan(String value) {
            addCriterion("distributor <", value, "distributor");
            return (Criteria) this;
        }

        public Criteria andDistributorLessThanOrEqualTo(String value) {
            addCriterion("distributor <=", value, "distributor");
            return (Criteria) this;
        }

        public Criteria andDistributorLike(String value) {
            addCriterion("distributor like", value, "distributor");
            return (Criteria) this;
        }

        public Criteria andDistributorNotLike(String value) {
            addCriterion("distributor not like", value, "distributor");
            return (Criteria) this;
        }

        public Criteria andDistributorIn(List<String> values) {
            addCriterion("distributor in", values, "distributor");
            return (Criteria) this;
        }

        public Criteria andDistributorNotIn(List<String> values) {
            addCriterion("distributor not in", values, "distributor");
            return (Criteria) this;
        }

        public Criteria andDistributorBetween(String value1, String value2) {
            addCriterion("distributor between", value1, value2, "distributor");
            return (Criteria) this;
        }

        public Criteria andDistributorNotBetween(String value1, String value2) {
            addCriterion("distributor not between", value1, value2, "distributor");
            return (Criteria) this;
        }

        public Criteria andDistributorNumIsNull() {
            addCriterion("distributor_num is null");
            return (Criteria) this;
        }

        public Criteria andDistributorNumIsNotNull() {
            addCriterion("distributor_num is not null");
            return (Criteria) this;
        }

        public Criteria andDistributorNumEqualTo(String value) {
            addCriterion("distributor_num =", value, "distributorNum");
            return (Criteria) this;
        }

        public Criteria andDistributorNumNotEqualTo(String value) {
            addCriterion("distributor_num <>", value, "distributorNum");
            return (Criteria) this;
        }

        public Criteria andDistributorNumGreaterThan(String value) {
            addCriterion("distributor_num >", value, "distributorNum");
            return (Criteria) this;
        }

        public Criteria andDistributorNumGreaterThanOrEqualTo(String value) {
            addCriterion("distributor_num >=", value, "distributorNum");
            return (Criteria) this;
        }

        public Criteria andDistributorNumLessThan(String value) {
            addCriterion("distributor_num <", value, "distributorNum");
            return (Criteria) this;
        }

        public Criteria andDistributorNumLessThanOrEqualTo(String value) {
            addCriterion("distributor_num <=", value, "distributorNum");
            return (Criteria) this;
        }

        public Criteria andDistributorNumLike(String value) {
            addCriterion("distributor_num like", value, "distributorNum");
            return (Criteria) this;
        }

        public Criteria andDistributorNumNotLike(String value) {
            addCriterion("distributor_num not like", value, "distributorNum");
            return (Criteria) this;
        }

        public Criteria andDistributorNumIn(List<String> values) {
            addCriterion("distributor_num in", values, "distributorNum");
            return (Criteria) this;
        }

        public Criteria andDistributorNumNotIn(List<String> values) {
            addCriterion("distributor_num not in", values, "distributorNum");
            return (Criteria) this;
        }

        public Criteria andDistributorNumBetween(String value1, String value2) {
            addCriterion("distributor_num between", value1, value2, "distributorNum");
            return (Criteria) this;
        }

        public Criteria andDistributorNumNotBetween(String value1, String value2) {
            addCriterion("distributor_num not between", value1, value2, "distributorNum");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("`status` is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("`status` is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("`status` =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("`status` <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("`status` >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("`status` >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("`status` <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("`status` <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("`status` like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("`status` not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("`status` in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("`status` not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("`status` between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("`status` not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andPriceIsNull() {
            addCriterion("price is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("price is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(Long value) {
            addCriterion("price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(Long value) {
            addCriterion("price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(Long value) {
            addCriterion("price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(Long value) {
            addCriterion("price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(Long value) {
            addCriterion("price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(Long value) {
            addCriterion("price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<Long> values) {
            addCriterion("price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<Long> values) {
            addCriterion("price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(Long value1, Long value2) {
            addCriterion("price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(Long value1, Long value2) {
            addCriterion("price not between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andImgIsNull() {
            addCriterion("img is null");
            return (Criteria) this;
        }

        public Criteria andImgIsNotNull() {
            addCriterion("img is not null");
            return (Criteria) this;
        }

        public Criteria andImgEqualTo(String value) {
            addCriterion("img =", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgNotEqualTo(String value) {
            addCriterion("img <>", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgGreaterThan(String value) {
            addCriterion("img >", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgGreaterThanOrEqualTo(String value) {
            addCriterion("img >=", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgLessThan(String value) {
            addCriterion("img <", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgLessThanOrEqualTo(String value) {
            addCriterion("img <=", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgLike(String value) {
            addCriterion("img like", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgNotLike(String value) {
            addCriterion("img not like", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgIn(List<String> values) {
            addCriterion("img in", values, "img");
            return (Criteria) this;
        }

        public Criteria andImgNotIn(List<String> values) {
            addCriterion("img not in", values, "img");
            return (Criteria) this;
        }

        public Criteria andImgBetween(String value1, String value2) {
            addCriterion("img between", value1, value2, "img");
            return (Criteria) this;
        }

        public Criteria andImgNotBetween(String value1, String value2) {
            addCriterion("img not between", value1, value2, "img");
            return (Criteria) this;
        }

        public Criteria andIsPrintIsNull() {
            addCriterion("is_print is null");
            return (Criteria) this;
        }

        public Criteria andIsPrintIsNotNull() {
            addCriterion("is_print is not null");
            return (Criteria) this;
        }

        public Criteria andIsPrintEqualTo(String value) {
            addCriterion("is_print =", value, "isPrint");
            return (Criteria) this;
        }

        public Criteria andIsPrintNotEqualTo(String value) {
            addCriterion("is_print <>", value, "isPrint");
            return (Criteria) this;
        }

        public Criteria andIsPrintGreaterThan(String value) {
            addCriterion("is_print >", value, "isPrint");
            return (Criteria) this;
        }

        public Criteria andIsPrintGreaterThanOrEqualTo(String value) {
            addCriterion("is_print >=", value, "isPrint");
            return (Criteria) this;
        }

        public Criteria andIsPrintLessThan(String value) {
            addCriterion("is_print <", value, "isPrint");
            return (Criteria) this;
        }

        public Criteria andIsPrintLessThanOrEqualTo(String value) {
            addCriterion("is_print <=", value, "isPrint");
            return (Criteria) this;
        }

        public Criteria andIsPrintLike(String value) {
            addCriterion("is_print like", value, "isPrint");
            return (Criteria) this;
        }

        public Criteria andIsPrintNotLike(String value) {
            addCriterion("is_print not like", value, "isPrint");
            return (Criteria) this;
        }

        public Criteria andIsPrintIn(List<String> values) {
            addCriterion("is_print in", values, "isPrint");
            return (Criteria) this;
        }

        public Criteria andIsPrintNotIn(List<String> values) {
            addCriterion("is_print not in", values, "isPrint");
            return (Criteria) this;
        }

        public Criteria andIsPrintBetween(String value1, String value2) {
            addCriterion("is_print between", value1, value2, "isPrint");
            return (Criteria) this;
        }

        public Criteria andIsPrintNotBetween(String value1, String value2) {
            addCriterion("is_print not between", value1, value2, "isPrint");
            return (Criteria) this;
        }

        public Criteria andSenderIsNull() {
            addCriterion("sender is null");
            return (Criteria) this;
        }

        public Criteria andSenderIsNotNull() {
            addCriterion("sender is not null");
            return (Criteria) this;
        }

        public Criteria andSenderEqualTo(String value) {
            addCriterion("sender =", value, "sender");
            return (Criteria) this;
        }

        public Criteria andSenderNotEqualTo(String value) {
            addCriterion("sender <>", value, "sender");
            return (Criteria) this;
        }

        public Criteria andSenderGreaterThan(String value) {
            addCriterion("sender >", value, "sender");
            return (Criteria) this;
        }

        public Criteria andSenderGreaterThanOrEqualTo(String value) {
            addCriterion("sender >=", value, "sender");
            return (Criteria) this;
        }

        public Criteria andSenderLessThan(String value) {
            addCriterion("sender <", value, "sender");
            return (Criteria) this;
        }

        public Criteria andSenderLessThanOrEqualTo(String value) {
            addCriterion("sender <=", value, "sender");
            return (Criteria) this;
        }

        public Criteria andSenderLike(String value) {
            addCriterion("sender like", value, "sender");
            return (Criteria) this;
        }

        public Criteria andSenderNotLike(String value) {
            addCriterion("sender not like", value, "sender");
            return (Criteria) this;
        }

        public Criteria andSenderIn(List<String> values) {
            addCriterion("sender in", values, "sender");
            return (Criteria) this;
        }

        public Criteria andSenderNotIn(List<String> values) {
            addCriterion("sender not in", values, "sender");
            return (Criteria) this;
        }

        public Criteria andSenderBetween(String value1, String value2) {
            addCriterion("sender between", value1, value2, "sender");
            return (Criteria) this;
        }

        public Criteria andSenderNotBetween(String value1, String value2) {
            addCriterion("sender not between", value1, value2, "sender");
            return (Criteria) this;
        }

        public Criteria andClientNameIsNull() {
            addCriterion("client_name is null");
            return (Criteria) this;
        }

        public Criteria andClientNameIsNotNull() {
            addCriterion("client_name is not null");
            return (Criteria) this;
        }

        public Criteria andClientNameEqualTo(String value) {
            addCriterion("client_name =", value, "clientName");
            return (Criteria) this;
        }

        public Criteria andClientNameNotEqualTo(String value) {
            addCriterion("client_name <>", value, "clientName");
            return (Criteria) this;
        }

        public Criteria andClientNameGreaterThan(String value) {
            addCriterion("client_name >", value, "clientName");
            return (Criteria) this;
        }

        public Criteria andClientNameGreaterThanOrEqualTo(String value) {
            addCriterion("client_name >=", value, "clientName");
            return (Criteria) this;
        }

        public Criteria andClientNameLessThan(String value) {
            addCriterion("client_name <", value, "clientName");
            return (Criteria) this;
        }

        public Criteria andClientNameLessThanOrEqualTo(String value) {
            addCriterion("client_name <=", value, "clientName");
            return (Criteria) this;
        }

        public Criteria andClientNameLike(String value) {
            addCriterion("client_name like", value, "clientName");
            return (Criteria) this;
        }

        public Criteria andClientNameNotLike(String value) {
            addCriterion("client_name not like", value, "clientName");
            return (Criteria) this;
        }

        public Criteria andClientNameIn(List<String> values) {
            addCriterion("client_name in", values, "clientName");
            return (Criteria) this;
        }

        public Criteria andClientNameNotIn(List<String> values) {
            addCriterion("client_name not in", values, "clientName");
            return (Criteria) this;
        }

        public Criteria andClientNameBetween(String value1, String value2) {
            addCriterion("client_name between", value1, value2, "clientName");
            return (Criteria) this;
        }

        public Criteria andClientNameNotBetween(String value1, String value2) {
            addCriterion("client_name not between", value1, value2, "clientName");
            return (Criteria) this;
        }

        public Criteria andTenantCodeIsNull() {
            addCriterion("tenant_code is null");
            return (Criteria) this;
        }

        public Criteria andTenantCodeIsNotNull() {
            addCriterion("tenant_code is not null");
            return (Criteria) this;
        }

        public Criteria andTenantCodeEqualTo(String value) {
            addCriterion("tenant_code =", value, "tenantCode");
            return (Criteria) this;
        }

        public Criteria andTenantCodeNotEqualTo(String value) {
            addCriterion("tenant_code <>", value, "tenantCode");
            return (Criteria) this;
        }

        public Criteria andTenantCodeGreaterThan(String value) {
            addCriterion("tenant_code >", value, "tenantCode");
            return (Criteria) this;
        }

        public Criteria andTenantCodeGreaterThanOrEqualTo(String value) {
            addCriterion("tenant_code >=", value, "tenantCode");
            return (Criteria) this;
        }

        public Criteria andTenantCodeLessThan(String value) {
            addCriterion("tenant_code <", value, "tenantCode");
            return (Criteria) this;
        }

        public Criteria andTenantCodeLessThanOrEqualTo(String value) {
            addCriterion("tenant_code <=", value, "tenantCode");
            return (Criteria) this;
        }

        public Criteria andTenantCodeLike(String value) {
            addCriterion("tenant_code like", value, "tenantCode");
            return (Criteria) this;
        }

        public Criteria andTenantCodeNotLike(String value) {
            addCriterion("tenant_code not like", value, "tenantCode");
            return (Criteria) this;
        }

        public Criteria andTenantCodeIn(List<String> values) {
            addCriterion("tenant_code in", values, "tenantCode");
            return (Criteria) this;
        }

        public Criteria andTenantCodeNotIn(List<String> values) {
            addCriterion("tenant_code not in", values, "tenantCode");
            return (Criteria) this;
        }

        public Criteria andTenantCodeBetween(String value1, String value2) {
            addCriterion("tenant_code between", value1, value2, "tenantCode");
            return (Criteria) this;
        }

        public Criteria andTenantCodeNotBetween(String value1, String value2) {
            addCriterion("tenant_code not between", value1, value2, "tenantCode");
            return (Criteria) this;
        }

        public Criteria andSortingNoIsNull() {
            addCriterion("sorting_no is null");
            return (Criteria) this;
        }

        public Criteria andSortingNoIsNotNull() {
            addCriterion("sorting_no is not null");
            return (Criteria) this;
        }

        public Criteria andSortingNoEqualTo(String value) {
            addCriterion("sorting_no =", value, "sortingNo");
            return (Criteria) this;
        }

        public Criteria andSortingNoNotEqualTo(String value) {
            addCriterion("sorting_no <>", value, "sortingNo");
            return (Criteria) this;
        }

        public Criteria andSortingNoGreaterThan(String value) {
            addCriterion("sorting_no >", value, "sortingNo");
            return (Criteria) this;
        }

        public Criteria andSortingNoGreaterThanOrEqualTo(String value) {
            addCriterion("sorting_no >=", value, "sortingNo");
            return (Criteria) this;
        }

        public Criteria andSortingNoLessThan(String value) {
            addCriterion("sorting_no <", value, "sortingNo");
            return (Criteria) this;
        }

        public Criteria andSortingNoLessThanOrEqualTo(String value) {
            addCriterion("sorting_no <=", value, "sortingNo");
            return (Criteria) this;
        }

        public Criteria andSortingNoLike(String value) {
            addCriterion("sorting_no like", value, "sortingNo");
            return (Criteria) this;
        }

        public Criteria andSortingNoNotLike(String value) {
            addCriterion("sorting_no not like", value, "sortingNo");
            return (Criteria) this;
        }

        public Criteria andSortingNoIn(List<String> values) {
            addCriterion("sorting_no in", values, "sortingNo");
            return (Criteria) this;
        }

        public Criteria andSortingNoNotIn(List<String> values) {
            addCriterion("sorting_no not in", values, "sortingNo");
            return (Criteria) this;
        }

        public Criteria andSortingNoBetween(String value1, String value2) {
            addCriterion("sorting_no between", value1, value2, "sortingNo");
            return (Criteria) this;
        }

        public Criteria andSortingNoNotBetween(String value1, String value2) {
            addCriterion("sorting_no not between", value1, value2, "sortingNo");
            return (Criteria) this;
        }

        public Criteria andSenderPhoneIsNull() {
            addCriterion("sender_phone is null");
            return (Criteria) this;
        }

        public Criteria andSenderPhoneIsNotNull() {
            addCriterion("sender_phone is not null");
            return (Criteria) this;
        }

        public Criteria andSenderPhoneEqualTo(String value) {
            addCriterion("sender_phone =", value, "senderPhone");
            return (Criteria) this;
        }

        public Criteria andSenderPhoneNotEqualTo(String value) {
            addCriterion("sender_phone <>", value, "senderPhone");
            return (Criteria) this;
        }

        public Criteria andSenderPhoneGreaterThan(String value) {
            addCriterion("sender_phone >", value, "senderPhone");
            return (Criteria) this;
        }

        public Criteria andSenderPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("sender_phone >=", value, "senderPhone");
            return (Criteria) this;
        }

        public Criteria andSenderPhoneLessThan(String value) {
            addCriterion("sender_phone <", value, "senderPhone");
            return (Criteria) this;
        }

        public Criteria andSenderPhoneLessThanOrEqualTo(String value) {
            addCriterion("sender_phone <=", value, "senderPhone");
            return (Criteria) this;
        }

        public Criteria andSenderPhoneLike(String value) {
            addCriterion("sender_phone like", value, "senderPhone");
            return (Criteria) this;
        }

        public Criteria andSenderPhoneNotLike(String value) {
            addCriterion("sender_phone not like", value, "senderPhone");
            return (Criteria) this;
        }

        public Criteria andSenderPhoneIn(List<String> values) {
            addCriterion("sender_phone in", values, "senderPhone");
            return (Criteria) this;
        }

        public Criteria andSenderPhoneNotIn(List<String> values) {
            addCriterion("sender_phone not in", values, "senderPhone");
            return (Criteria) this;
        }

        public Criteria andSenderPhoneBetween(String value1, String value2) {
            addCriterion("sender_phone between", value1, value2, "senderPhone");
            return (Criteria) this;
        }

        public Criteria andSenderPhoneNotBetween(String value1, String value2) {
            addCriterion("sender_phone not between", value1, value2, "senderPhone");
            return (Criteria) this;
        }

        public Criteria andOrderPriceIsNull() {
            addCriterion("order_price is null");
            return (Criteria) this;
        }

        public Criteria andOrderPriceIsNotNull() {
            addCriterion("order_price is not null");
            return (Criteria) this;
        }

        public Criteria andOrderPriceEqualTo(Float value) {
            addCriterion("order_price =", value, "orderPrice");
            return (Criteria) this;
        }

        public Criteria andOrderPriceNotEqualTo(Float value) {
            addCriterion("order_price <>", value, "orderPrice");
            return (Criteria) this;
        }

        public Criteria andOrderPriceGreaterThan(Float value) {
            addCriterion("order_price >", value, "orderPrice");
            return (Criteria) this;
        }

        public Criteria andOrderPriceGreaterThanOrEqualTo(Float value) {
            addCriterion("order_price >=", value, "orderPrice");
            return (Criteria) this;
        }

        public Criteria andOrderPriceLessThan(Float value) {
            addCriterion("order_price <", value, "orderPrice");
            return (Criteria) this;
        }

        public Criteria andOrderPriceLessThanOrEqualTo(Float value) {
            addCriterion("order_price <=", value, "orderPrice");
            return (Criteria) this;
        }

        public Criteria andOrderPriceIn(List<Float> values) {
            addCriterion("order_price in", values, "orderPrice");
            return (Criteria) this;
        }

        public Criteria andOrderPriceNotIn(List<Float> values) {
            addCriterion("order_price not in", values, "orderPrice");
            return (Criteria) this;
        }

        public Criteria andOrderPriceBetween(Float value1, Float value2) {
            addCriterion("order_price between", value1, value2, "orderPrice");
            return (Criteria) this;
        }

        public Criteria andOrderPriceNotBetween(Float value1, Float value2) {
            addCriterion("order_price not between", value1, value2, "orderPrice");
            return (Criteria) this;
        }

        public Criteria andDeliveryCostIsNull() {
            addCriterion("delivery_cost is null");
            return (Criteria) this;
        }

        public Criteria andDeliveryCostIsNotNull() {
            addCriterion("delivery_cost is not null");
            return (Criteria) this;
        }

        public Criteria andDeliveryCostEqualTo(Float value) {
            addCriterion("delivery_cost =", value, "deliveryCost");
            return (Criteria) this;
        }

        public Criteria andDeliveryCostNotEqualTo(Float value) {
            addCriterion("delivery_cost <>", value, "deliveryCost");
            return (Criteria) this;
        }

        public Criteria andDeliveryCostGreaterThan(Float value) {
            addCriterion("delivery_cost >", value, "deliveryCost");
            return (Criteria) this;
        }

        public Criteria andDeliveryCostGreaterThanOrEqualTo(Float value) {
            addCriterion("delivery_cost >=", value, "deliveryCost");
            return (Criteria) this;
        }

        public Criteria andDeliveryCostLessThan(Float value) {
            addCriterion("delivery_cost <", value, "deliveryCost");
            return (Criteria) this;
        }

        public Criteria andDeliveryCostLessThanOrEqualTo(Float value) {
            addCriterion("delivery_cost <=", value, "deliveryCost");
            return (Criteria) this;
        }

        public Criteria andDeliveryCostIn(List<Float> values) {
            addCriterion("delivery_cost in", values, "deliveryCost");
            return (Criteria) this;
        }

        public Criteria andDeliveryCostNotIn(List<Float> values) {
            addCriterion("delivery_cost not in", values, "deliveryCost");
            return (Criteria) this;
        }

        public Criteria andDeliveryCostBetween(Float value1, Float value2) {
            addCriterion("delivery_cost between", value1, value2, "deliveryCost");
            return (Criteria) this;
        }

        public Criteria andDeliveryCostNotBetween(Float value1, Float value2) {
            addCriterion("delivery_cost not between", value1, value2, "deliveryCost");
            return (Criteria) this;
        }

        public Criteria andDetailIsNull() {
            addCriterion("detail is null");
            return (Criteria) this;
        }

        public Criteria andDetailIsNotNull() {
            addCriterion("detail is not null");
            return (Criteria) this;
        }

        public Criteria andDetailEqualTo(String value) {
            addCriterion("detail =", value, "detail");
            return (Criteria) this;
        }

        public Criteria andDetailNotEqualTo(String value) {
            addCriterion("detail <>", value, "detail");
            return (Criteria) this;
        }

        public Criteria andDetailGreaterThan(String value) {
            addCriterion("detail >", value, "detail");
            return (Criteria) this;
        }

        public Criteria andDetailGreaterThanOrEqualTo(String value) {
            addCriterion("detail >=", value, "detail");
            return (Criteria) this;
        }

        public Criteria andDetailLessThan(String value) {
            addCriterion("detail <", value, "detail");
            return (Criteria) this;
        }

        public Criteria andDetailLessThanOrEqualTo(String value) {
            addCriterion("detail <=", value, "detail");
            return (Criteria) this;
        }

        public Criteria andDetailLike(String value) {
            addCriterion("detail like", value, "detail");
            return (Criteria) this;
        }

        public Criteria andDetailNotLike(String value) {
            addCriterion("detail not like", value, "detail");
            return (Criteria) this;
        }

        public Criteria andDetailIn(List<String> values) {
            addCriterion("detail in", values, "detail");
            return (Criteria) this;
        }

        public Criteria andDetailNotIn(List<String> values) {
            addCriterion("detail not in", values, "detail");
            return (Criteria) this;
        }

        public Criteria andDetailBetween(String value1, String value2) {
            addCriterion("detail between", value1, value2, "detail");
            return (Criteria) this;
        }

        public Criteria andDetailNotBetween(String value1, String value2) {
            addCriterion("detail not between", value1, value2, "detail");
            return (Criteria) this;
        }

        public Criteria andLngIsNull() {
            addCriterion("lng is null");
            return (Criteria) this;
        }

        public Criteria andLngIsNotNull() {
            addCriterion("lng is not null");
            return (Criteria) this;
        }

        public Criteria andLngEqualTo(Float value) {
            addCriterion("lng =", value, "lng");
            return (Criteria) this;
        }

        public Criteria andLngNotEqualTo(Float value) {
            addCriterion("lng <>", value, "lng");
            return (Criteria) this;
        }

        public Criteria andLngGreaterThan(Float value) {
            addCriterion("lng >", value, "lng");
            return (Criteria) this;
        }

        public Criteria andLngGreaterThanOrEqualTo(Float value) {
            addCriterion("lng >=", value, "lng");
            return (Criteria) this;
        }

        public Criteria andLngLessThan(Float value) {
            addCriterion("lng <", value, "lng");
            return (Criteria) this;
        }

        public Criteria andLngLessThanOrEqualTo(Float value) {
            addCriterion("lng <=", value, "lng");
            return (Criteria) this;
        }

        public Criteria andLngIn(List<Float> values) {
            addCriterion("lng in", values, "lng");
            return (Criteria) this;
        }

        public Criteria andLngNotIn(List<Float> values) {
            addCriterion("lng not in", values, "lng");
            return (Criteria) this;
        }

        public Criteria andLngBetween(Float value1, Float value2) {
            addCriterion("lng between", value1, value2, "lng");
            return (Criteria) this;
        }

        public Criteria andLngNotBetween(Float value1, Float value2) {
            addCriterion("lng not between", value1, value2, "lng");
            return (Criteria) this;
        }

        public Criteria andLatIsNull() {
            addCriterion("lat is null");
            return (Criteria) this;
        }

        public Criteria andLatIsNotNull() {
            addCriterion("lat is not null");
            return (Criteria) this;
        }

        public Criteria andLatEqualTo(Float value) {
            addCriterion("lat =", value, "lat");
            return (Criteria) this;
        }

        public Criteria andLatNotEqualTo(Float value) {
            addCriterion("lat <>", value, "lat");
            return (Criteria) this;
        }

        public Criteria andLatGreaterThan(Float value) {
            addCriterion("lat >", value, "lat");
            return (Criteria) this;
        }

        public Criteria andLatGreaterThanOrEqualTo(Float value) {
            addCriterion("lat >=", value, "lat");
            return (Criteria) this;
        }

        public Criteria andLatLessThan(Float value) {
            addCriterion("lat <", value, "lat");
            return (Criteria) this;
        }

        public Criteria andLatLessThanOrEqualTo(Float value) {
            addCriterion("lat <=", value, "lat");
            return (Criteria) this;
        }

        public Criteria andLatIn(List<Float> values) {
            addCriterion("lat in", values, "lat");
            return (Criteria) this;
        }

        public Criteria andLatNotIn(List<Float> values) {
            addCriterion("lat not in", values, "lat");
            return (Criteria) this;
        }

        public Criteria andLatBetween(Float value1, Float value2) {
            addCriterion("lat between", value1, value2, "lat");
            return (Criteria) this;
        }

        public Criteria andLatNotBetween(Float value1, Float value2) {
            addCriterion("lat not between", value1, value2, "lat");
            return (Criteria) this;
        }

        public Criteria andOrderSourceIsNull() {
            addCriterion("order_source is null");
            return (Criteria) this;
        }

        public Criteria andOrderSourceIsNotNull() {
            addCriterion("order_source is not null");
            return (Criteria) this;
        }

        public Criteria andOrderSourceEqualTo(String value) {
            addCriterion("order_source =", value, "orderSource");
            return (Criteria) this;
        }

        public Criteria andOrderSourceNotEqualTo(String value) {
            addCriterion("order_source <>", value, "orderSource");
            return (Criteria) this;
        }

        public Criteria andOrderSourceGreaterThan(String value) {
            addCriterion("order_source >", value, "orderSource");
            return (Criteria) this;
        }

        public Criteria andOrderSourceGreaterThanOrEqualTo(String value) {
            addCriterion("order_source >=", value, "orderSource");
            return (Criteria) this;
        }

        public Criteria andOrderSourceLessThan(String value) {
            addCriterion("order_source <", value, "orderSource");
            return (Criteria) this;
        }

        public Criteria andOrderSourceLessThanOrEqualTo(String value) {
            addCriterion("order_source <=", value, "orderSource");
            return (Criteria) this;
        }

        public Criteria andOrderSourceLike(String value) {
            addCriterion("order_source like", value, "orderSource");
            return (Criteria) this;
        }

        public Criteria andOrderSourceNotLike(String value) {
            addCriterion("order_source not like", value, "orderSource");
            return (Criteria) this;
        }

        public Criteria andOrderSourceIn(List<String> values) {
            addCriterion("order_source in", values, "orderSource");
            return (Criteria) this;
        }

        public Criteria andOrderSourceNotIn(List<String> values) {
            addCriterion("order_source not in", values, "orderSource");
            return (Criteria) this;
        }

        public Criteria andOrderSourceBetween(String value1, String value2) {
            addCriterion("order_source between", value1, value2, "orderSource");
            return (Criteria) this;
        }

        public Criteria andOrderSourceNotBetween(String value1, String value2) {
            addCriterion("order_source not between", value1, value2, "orderSource");
            return (Criteria) this;
        }

        public Criteria andAddressUnitIsNull() {
            addCriterion("address_unit is null");
            return (Criteria) this;
        }

        public Criteria andAddressUnitIsNotNull() {
            addCriterion("address_unit is not null");
            return (Criteria) this;
        }

        public Criteria andAddressUnitEqualTo(String value) {
            addCriterion("address_unit =", value, "addressUnit");
            return (Criteria) this;
        }

        public Criteria andAddressUnitNotEqualTo(String value) {
            addCriterion("address_unit <>", value, "addressUnit");
            return (Criteria) this;
        }

        public Criteria andAddressUnitGreaterThan(String value) {
            addCriterion("address_unit >", value, "addressUnit");
            return (Criteria) this;
        }

        public Criteria andAddressUnitGreaterThanOrEqualTo(String value) {
            addCriterion("address_unit >=", value, "addressUnit");
            return (Criteria) this;
        }

        public Criteria andAddressUnitLessThan(String value) {
            addCriterion("address_unit <", value, "addressUnit");
            return (Criteria) this;
        }

        public Criteria andAddressUnitLessThanOrEqualTo(String value) {
            addCriterion("address_unit <=", value, "addressUnit");
            return (Criteria) this;
        }

        public Criteria andAddressUnitLike(String value) {
            addCriterion("address_unit like", value, "addressUnit");
            return (Criteria) this;
        }

        public Criteria andAddressUnitNotLike(String value) {
            addCriterion("address_unit not like", value, "addressUnit");
            return (Criteria) this;
        }

        public Criteria andAddressUnitIn(List<String> values) {
            addCriterion("address_unit in", values, "addressUnit");
            return (Criteria) this;
        }

        public Criteria andAddressUnitNotIn(List<String> values) {
            addCriterion("address_unit not in", values, "addressUnit");
            return (Criteria) this;
        }

        public Criteria andAddressUnitBetween(String value1, String value2) {
            addCriterion("address_unit between", value1, value2, "addressUnit");
            return (Criteria) this;
        }

        public Criteria andAddressUnitNotBetween(String value1, String value2) {
            addCriterion("address_unit not between", value1, value2, "addressUnit");
            return (Criteria) this;
        }

        public Criteria andPayStatusIsNull() {
            addCriterion("pay_status is null");
            return (Criteria) this;
        }

        public Criteria andPayStatusIsNotNull() {
            addCriterion("pay_status is not null");
            return (Criteria) this;
        }

        public Criteria andPayStatusEqualTo(String value) {
            addCriterion("pay_status =", value, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusNotEqualTo(String value) {
            addCriterion("pay_status <>", value, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusGreaterThan(String value) {
            addCriterion("pay_status >", value, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusGreaterThanOrEqualTo(String value) {
            addCriterion("pay_status >=", value, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusLessThan(String value) {
            addCriterion("pay_status <", value, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusLessThanOrEqualTo(String value) {
            addCriterion("pay_status <=", value, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusLike(String value) {
            addCriterion("pay_status like", value, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusNotLike(String value) {
            addCriterion("pay_status not like", value, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusIn(List<String> values) {
            addCriterion("pay_status in", values, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusNotIn(List<String> values) {
            addCriterion("pay_status not in", values, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusBetween(String value1, String value2) {
            addCriterion("pay_status between", value1, value2, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusNotBetween(String value1, String value2) {
            addCriterion("pay_status not between", value1, value2, "payStatus");
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