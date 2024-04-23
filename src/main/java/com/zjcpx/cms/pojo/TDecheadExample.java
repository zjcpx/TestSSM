package com.zjcpx.cms.pojo;

import java.util.ArrayList;
import java.util.List;

public class TDecheadExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TDecheadExample() {
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

        public Criteria andCustommasterIsNull() {
            addCriterion("custommaster is null");
            return (Criteria) this;
        }

        public Criteria andCustommasterIsNotNull() {
            addCriterion("custommaster is not null");
            return (Criteria) this;
        }

        public Criteria andCustommasterEqualTo(String value) {
            addCriterion("custommaster =", value, "custommaster");
            return (Criteria) this;
        }

        public Criteria andCustommasterNotEqualTo(String value) {
            addCriterion("custommaster <>", value, "custommaster");
            return (Criteria) this;
        }

        public Criteria andCustommasterGreaterThan(String value) {
            addCriterion("custommaster >", value, "custommaster");
            return (Criteria) this;
        }

        public Criteria andCustommasterGreaterThanOrEqualTo(String value) {
            addCriterion("custommaster >=", value, "custommaster");
            return (Criteria) this;
        }

        public Criteria andCustommasterLessThan(String value) {
            addCriterion("custommaster <", value, "custommaster");
            return (Criteria) this;
        }

        public Criteria andCustommasterLessThanOrEqualTo(String value) {
            addCriterion("custommaster <=", value, "custommaster");
            return (Criteria) this;
        }

        public Criteria andCustommasterLike(String value) {
            addCriterion("custommaster like", value, "custommaster");
            return (Criteria) this;
        }

        public Criteria andCustommasterNotLike(String value) {
            addCriterion("custommaster not like", value, "custommaster");
            return (Criteria) this;
        }

        public Criteria andCustommasterIn(List<String> values) {
            addCriterion("custommaster in", values, "custommaster");
            return (Criteria) this;
        }

        public Criteria andCustommasterNotIn(List<String> values) {
            addCriterion("custommaster not in", values, "custommaster");
            return (Criteria) this;
        }

        public Criteria andCustommasterBetween(String value1, String value2) {
            addCriterion("custommaster between", value1, value2, "custommaster");
            return (Criteria) this;
        }

        public Criteria andCustommasterNotBetween(String value1, String value2) {
            addCriterion("custommaster not between", value1, value2, "custommaster");
            return (Criteria) this;
        }

        public Criteria andCustomsdeclarationnoIsNull() {
            addCriterion("customsdeclarationno is null");
            return (Criteria) this;
        }

        public Criteria andCustomsdeclarationnoIsNotNull() {
            addCriterion("customsdeclarationno is not null");
            return (Criteria) this;
        }

        public Criteria andCustomsdeclarationnoEqualTo(String value) {
            addCriterion("customsdeclarationno =", value, "customsdeclarationno");
            return (Criteria) this;
        }

        public Criteria andCustomsdeclarationnoNotEqualTo(String value) {
            addCriterion("customsdeclarationno <>", value, "customsdeclarationno");
            return (Criteria) this;
        }

        public Criteria andCustomsdeclarationnoGreaterThan(String value) {
            addCriterion("customsdeclarationno >", value, "customsdeclarationno");
            return (Criteria) this;
        }

        public Criteria andCustomsdeclarationnoGreaterThanOrEqualTo(String value) {
            addCriterion("customsdeclarationno >=", value, "customsdeclarationno");
            return (Criteria) this;
        }

        public Criteria andCustomsdeclarationnoLessThan(String value) {
            addCriterion("customsdeclarationno <", value, "customsdeclarationno");
            return (Criteria) this;
        }

        public Criteria andCustomsdeclarationnoLessThanOrEqualTo(String value) {
            addCriterion("customsdeclarationno <=", value, "customsdeclarationno");
            return (Criteria) this;
        }

        public Criteria andCustomsdeclarationnoLike(String value) {
            addCriterion("customsdeclarationno like", value, "customsdeclarationno");
            return (Criteria) this;
        }

        public Criteria andCustomsdeclarationnoNotLike(String value) {
            addCriterion("customsdeclarationno not like", value, "customsdeclarationno");
            return (Criteria) this;
        }

        public Criteria andCustomsdeclarationnoIn(List<String> values) {
            addCriterion("customsdeclarationno in", values, "customsdeclarationno");
            return (Criteria) this;
        }

        public Criteria andCustomsdeclarationnoNotIn(List<String> values) {
            addCriterion("customsdeclarationno not in", values, "customsdeclarationno");
            return (Criteria) this;
        }

        public Criteria andCustomsdeclarationnoBetween(String value1, String value2) {
            addCriterion("customsdeclarationno between", value1, value2, "customsdeclarationno");
            return (Criteria) this;
        }

        public Criteria andCustomsdeclarationnoNotBetween(String value1, String value2) {
            addCriterion("customsdeclarationno not between", value1, value2, "customsdeclarationno");
            return (Criteria) this;
        }

        public Criteria andPreentryidIsNull() {
            addCriterion("preentryid is null");
            return (Criteria) this;
        }

        public Criteria andPreentryidIsNotNull() {
            addCriterion("preentryid is not null");
            return (Criteria) this;
        }

        public Criteria andPreentryidEqualTo(String value) {
            addCriterion("preentryid =", value, "preentryid");
            return (Criteria) this;
        }

        public Criteria andPreentryidNotEqualTo(String value) {
            addCriterion("preentryid <>", value, "preentryid");
            return (Criteria) this;
        }

        public Criteria andPreentryidGreaterThan(String value) {
            addCriterion("preentryid >", value, "preentryid");
            return (Criteria) this;
        }

        public Criteria andPreentryidGreaterThanOrEqualTo(String value) {
            addCriterion("preentryid >=", value, "preentryid");
            return (Criteria) this;
        }

        public Criteria andPreentryidLessThan(String value) {
            addCriterion("preentryid <", value, "preentryid");
            return (Criteria) this;
        }

        public Criteria andPreentryidLessThanOrEqualTo(String value) {
            addCriterion("preentryid <=", value, "preentryid");
            return (Criteria) this;
        }

        public Criteria andPreentryidLike(String value) {
            addCriterion("preentryid like", value, "preentryid");
            return (Criteria) this;
        }

        public Criteria andPreentryidNotLike(String value) {
            addCriterion("preentryid not like", value, "preentryid");
            return (Criteria) this;
        }

        public Criteria andPreentryidIn(List<String> values) {
            addCriterion("preentryid in", values, "preentryid");
            return (Criteria) this;
        }

        public Criteria andPreentryidNotIn(List<String> values) {
            addCriterion("preentryid not in", values, "preentryid");
            return (Criteria) this;
        }

        public Criteria andPreentryidBetween(String value1, String value2) {
            addCriterion("preentryid between", value1, value2, "preentryid");
            return (Criteria) this;
        }

        public Criteria andPreentryidNotBetween(String value1, String value2) {
            addCriterion("preentryid not between", value1, value2, "preentryid");
            return (Criteria) this;
        }

        public Criteria andDdateIsNull() {
            addCriterion("ddate is null");
            return (Criteria) this;
        }

        public Criteria andDdateIsNotNull() {
            addCriterion("ddate is not null");
            return (Criteria) this;
        }

        public Criteria andDdateEqualTo(String value) {
            addCriterion("ddate =", value, "ddate");
            return (Criteria) this;
        }

        public Criteria andDdateNotEqualTo(String value) {
            addCriterion("ddate <>", value, "ddate");
            return (Criteria) this;
        }

        public Criteria andDdateGreaterThan(String value) {
            addCriterion("ddate >", value, "ddate");
            return (Criteria) this;
        }

        public Criteria andDdateGreaterThanOrEqualTo(String value) {
            addCriterion("ddate >=", value, "ddate");
            return (Criteria) this;
        }

        public Criteria andDdateLessThan(String value) {
            addCriterion("ddate <", value, "ddate");
            return (Criteria) this;
        }

        public Criteria andDdateLessThanOrEqualTo(String value) {
            addCriterion("ddate <=", value, "ddate");
            return (Criteria) this;
        }

        public Criteria andDdateLike(String value) {
            addCriterion("ddate like", value, "ddate");
            return (Criteria) this;
        }

        public Criteria andDdateNotLike(String value) {
            addCriterion("ddate not like", value, "ddate");
            return (Criteria) this;
        }

        public Criteria andDdateIn(List<String> values) {
            addCriterion("ddate in", values, "ddate");
            return (Criteria) this;
        }

        public Criteria andDdateNotIn(List<String> values) {
            addCriterion("ddate not in", values, "ddate");
            return (Criteria) this;
        }

        public Criteria andDdateBetween(String value1, String value2) {
            addCriterion("ddate between", value1, value2, "ddate");
            return (Criteria) this;
        }

        public Criteria andDdateNotBetween(String value1, String value2) {
            addCriterion("ddate not between", value1, value2, "ddate");
            return (Criteria) this;
        }

        public Criteria andIeflagIsNull() {
            addCriterion("ieflag is null");
            return (Criteria) this;
        }

        public Criteria andIeflagIsNotNull() {
            addCriterion("ieflag is not null");
            return (Criteria) this;
        }

        public Criteria andIeflagEqualTo(String value) {
            addCriterion("ieflag =", value, "ieflag");
            return (Criteria) this;
        }

        public Criteria andIeflagNotEqualTo(String value) {
            addCriterion("ieflag <>", value, "ieflag");
            return (Criteria) this;
        }

        public Criteria andIeflagGreaterThan(String value) {
            addCriterion("ieflag >", value, "ieflag");
            return (Criteria) this;
        }

        public Criteria andIeflagGreaterThanOrEqualTo(String value) {
            addCriterion("ieflag >=", value, "ieflag");
            return (Criteria) this;
        }

        public Criteria andIeflagLessThan(String value) {
            addCriterion("ieflag <", value, "ieflag");
            return (Criteria) this;
        }

        public Criteria andIeflagLessThanOrEqualTo(String value) {
            addCriterion("ieflag <=", value, "ieflag");
            return (Criteria) this;
        }

        public Criteria andIeflagLike(String value) {
            addCriterion("ieflag like", value, "ieflag");
            return (Criteria) this;
        }

        public Criteria andIeflagNotLike(String value) {
            addCriterion("ieflag not like", value, "ieflag");
            return (Criteria) this;
        }

        public Criteria andIeflagIn(List<String> values) {
            addCriterion("ieflag in", values, "ieflag");
            return (Criteria) this;
        }

        public Criteria andIeflagNotIn(List<String> values) {
            addCriterion("ieflag not in", values, "ieflag");
            return (Criteria) this;
        }

        public Criteria andIeflagBetween(String value1, String value2) {
            addCriterion("ieflag between", value1, value2, "ieflag");
            return (Criteria) this;
        }

        public Criteria andIeflagNotBetween(String value1, String value2) {
            addCriterion("ieflag not between", value1, value2, "ieflag");
            return (Criteria) this;
        }

        public Criteria andIeportIsNull() {
            addCriterion("ieport is null");
            return (Criteria) this;
        }

        public Criteria andIeportIsNotNull() {
            addCriterion("ieport is not null");
            return (Criteria) this;
        }

        public Criteria andIeportEqualTo(String value) {
            addCriterion("ieport =", value, "ieport");
            return (Criteria) this;
        }

        public Criteria andIeportNotEqualTo(String value) {
            addCriterion("ieport <>", value, "ieport");
            return (Criteria) this;
        }

        public Criteria andIeportGreaterThan(String value) {
            addCriterion("ieport >", value, "ieport");
            return (Criteria) this;
        }

        public Criteria andIeportGreaterThanOrEqualTo(String value) {
            addCriterion("ieport >=", value, "ieport");
            return (Criteria) this;
        }

        public Criteria andIeportLessThan(String value) {
            addCriterion("ieport <", value, "ieport");
            return (Criteria) this;
        }

        public Criteria andIeportLessThanOrEqualTo(String value) {
            addCriterion("ieport <=", value, "ieport");
            return (Criteria) this;
        }

        public Criteria andIeportLike(String value) {
            addCriterion("ieport like", value, "ieport");
            return (Criteria) this;
        }

        public Criteria andIeportNotLike(String value) {
            addCriterion("ieport not like", value, "ieport");
            return (Criteria) this;
        }

        public Criteria andIeportIn(List<String> values) {
            addCriterion("ieport in", values, "ieport");
            return (Criteria) this;
        }

        public Criteria andIeportNotIn(List<String> values) {
            addCriterion("ieport not in", values, "ieport");
            return (Criteria) this;
        }

        public Criteria andIeportBetween(String value1, String value2) {
            addCriterion("ieport between", value1, value2, "ieport");
            return (Criteria) this;
        }

        public Criteria andIeportNotBetween(String value1, String value2) {
            addCriterion("ieport not between", value1, value2, "ieport");
            return (Criteria) this;
        }

        public Criteria andIedateIsNull() {
            addCriterion("iedate is null");
            return (Criteria) this;
        }

        public Criteria andIedateIsNotNull() {
            addCriterion("iedate is not null");
            return (Criteria) this;
        }

        public Criteria andIedateEqualTo(String value) {
            addCriterion("iedate =", value, "iedate");
            return (Criteria) this;
        }

        public Criteria andIedateNotEqualTo(String value) {
            addCriterion("iedate <>", value, "iedate");
            return (Criteria) this;
        }

        public Criteria andIedateGreaterThan(String value) {
            addCriterion("iedate >", value, "iedate");
            return (Criteria) this;
        }

        public Criteria andIedateGreaterThanOrEqualTo(String value) {
            addCriterion("iedate >=", value, "iedate");
            return (Criteria) this;
        }

        public Criteria andIedateLessThan(String value) {
            addCriterion("iedate <", value, "iedate");
            return (Criteria) this;
        }

        public Criteria andIedateLessThanOrEqualTo(String value) {
            addCriterion("iedate <=", value, "iedate");
            return (Criteria) this;
        }

        public Criteria andIedateLike(String value) {
            addCriterion("iedate like", value, "iedate");
            return (Criteria) this;
        }

        public Criteria andIedateNotLike(String value) {
            addCriterion("iedate not like", value, "iedate");
            return (Criteria) this;
        }

        public Criteria andIedateIn(List<String> values) {
            addCriterion("iedate in", values, "iedate");
            return (Criteria) this;
        }

        public Criteria andIedateNotIn(List<String> values) {
            addCriterion("iedate not in", values, "iedate");
            return (Criteria) this;
        }

        public Criteria andIedateBetween(String value1, String value2) {
            addCriterion("iedate between", value1, value2, "iedate");
            return (Criteria) this;
        }

        public Criteria andIedateNotBetween(String value1, String value2) {
            addCriterion("iedate not between", value1, value2, "iedate");
            return (Criteria) this;
        }

        public Criteria andManualnoIsNull() {
            addCriterion("manualno is null");
            return (Criteria) this;
        }

        public Criteria andManualnoIsNotNull() {
            addCriterion("manualno is not null");
            return (Criteria) this;
        }

        public Criteria andManualnoEqualTo(String value) {
            addCriterion("manualno =", value, "manualno");
            return (Criteria) this;
        }

        public Criteria andManualnoNotEqualTo(String value) {
            addCriterion("manualno <>", value, "manualno");
            return (Criteria) this;
        }

        public Criteria andManualnoGreaterThan(String value) {
            addCriterion("manualno >", value, "manualno");
            return (Criteria) this;
        }

        public Criteria andManualnoGreaterThanOrEqualTo(String value) {
            addCriterion("manualno >=", value, "manualno");
            return (Criteria) this;
        }

        public Criteria andManualnoLessThan(String value) {
            addCriterion("manualno <", value, "manualno");
            return (Criteria) this;
        }

        public Criteria andManualnoLessThanOrEqualTo(String value) {
            addCriterion("manualno <=", value, "manualno");
            return (Criteria) this;
        }

        public Criteria andManualnoLike(String value) {
            addCriterion("manualno like", value, "manualno");
            return (Criteria) this;
        }

        public Criteria andManualnoNotLike(String value) {
            addCriterion("manualno not like", value, "manualno");
            return (Criteria) this;
        }

        public Criteria andManualnoIn(List<String> values) {
            addCriterion("manualno in", values, "manualno");
            return (Criteria) this;
        }

        public Criteria andManualnoNotIn(List<String> values) {
            addCriterion("manualno not in", values, "manualno");
            return (Criteria) this;
        }

        public Criteria andManualnoBetween(String value1, String value2) {
            addCriterion("manualno between", value1, value2, "manualno");
            return (Criteria) this;
        }

        public Criteria andManualnoNotBetween(String value1, String value2) {
            addCriterion("manualno not between", value1, value2, "manualno");
            return (Criteria) this;
        }

        public Criteria andContrnoIsNull() {
            addCriterion("contrno is null");
            return (Criteria) this;
        }

        public Criteria andContrnoIsNotNull() {
            addCriterion("contrno is not null");
            return (Criteria) this;
        }

        public Criteria andContrnoEqualTo(String value) {
            addCriterion("contrno =", value, "contrno");
            return (Criteria) this;
        }

        public Criteria andContrnoNotEqualTo(String value) {
            addCriterion("contrno <>", value, "contrno");
            return (Criteria) this;
        }

        public Criteria andContrnoGreaterThan(String value) {
            addCriterion("contrno >", value, "contrno");
            return (Criteria) this;
        }

        public Criteria andContrnoGreaterThanOrEqualTo(String value) {
            addCriterion("contrno >=", value, "contrno");
            return (Criteria) this;
        }

        public Criteria andContrnoLessThan(String value) {
            addCriterion("contrno <", value, "contrno");
            return (Criteria) this;
        }

        public Criteria andContrnoLessThanOrEqualTo(String value) {
            addCriterion("contrno <=", value, "contrno");
            return (Criteria) this;
        }

        public Criteria andContrnoLike(String value) {
            addCriterion("contrno like", value, "contrno");
            return (Criteria) this;
        }

        public Criteria andContrnoNotLike(String value) {
            addCriterion("contrno not like", value, "contrno");
            return (Criteria) this;
        }

        public Criteria andContrnoIn(List<String> values) {
            addCriterion("contrno in", values, "contrno");
            return (Criteria) this;
        }

        public Criteria andContrnoNotIn(List<String> values) {
            addCriterion("contrno not in", values, "contrno");
            return (Criteria) this;
        }

        public Criteria andContrnoBetween(String value1, String value2) {
            addCriterion("contrno between", value1, value2, "contrno");
            return (Criteria) this;
        }

        public Criteria andContrnoNotBetween(String value1, String value2) {
            addCriterion("contrno not between", value1, value2, "contrno");
            return (Criteria) this;
        }

        public Criteria andTradecosccIsNull() {
            addCriterion("tradecoscc is null");
            return (Criteria) this;
        }

        public Criteria andTradecosccIsNotNull() {
            addCriterion("tradecoscc is not null");
            return (Criteria) this;
        }

        public Criteria andTradecosccEqualTo(String value) {
            addCriterion("tradecoscc =", value, "tradecoscc");
            return (Criteria) this;
        }

        public Criteria andTradecosccNotEqualTo(String value) {
            addCriterion("tradecoscc <>", value, "tradecoscc");
            return (Criteria) this;
        }

        public Criteria andTradecosccGreaterThan(String value) {
            addCriterion("tradecoscc >", value, "tradecoscc");
            return (Criteria) this;
        }

        public Criteria andTradecosccGreaterThanOrEqualTo(String value) {
            addCriterion("tradecoscc >=", value, "tradecoscc");
            return (Criteria) this;
        }

        public Criteria andTradecosccLessThan(String value) {
            addCriterion("tradecoscc <", value, "tradecoscc");
            return (Criteria) this;
        }

        public Criteria andTradecosccLessThanOrEqualTo(String value) {
            addCriterion("tradecoscc <=", value, "tradecoscc");
            return (Criteria) this;
        }

        public Criteria andTradecosccLike(String value) {
            addCriterion("tradecoscc like", value, "tradecoscc");
            return (Criteria) this;
        }

        public Criteria andTradecosccNotLike(String value) {
            addCriterion("tradecoscc not like", value, "tradecoscc");
            return (Criteria) this;
        }

        public Criteria andTradecosccIn(List<String> values) {
            addCriterion("tradecoscc in", values, "tradecoscc");
            return (Criteria) this;
        }

        public Criteria andTradecosccNotIn(List<String> values) {
            addCriterion("tradecoscc not in", values, "tradecoscc");
            return (Criteria) this;
        }

        public Criteria andTradecosccBetween(String value1, String value2) {
            addCriterion("tradecoscc between", value1, value2, "tradecoscc");
            return (Criteria) this;
        }

        public Criteria andTradecosccNotBetween(String value1, String value2) {
            addCriterion("tradecoscc not between", value1, value2, "tradecoscc");
            return (Criteria) this;
        }

        public Criteria andTradecoIsNull() {
            addCriterion("tradeco is null");
            return (Criteria) this;
        }

        public Criteria andTradecoIsNotNull() {
            addCriterion("tradeco is not null");
            return (Criteria) this;
        }

        public Criteria andTradecoEqualTo(String value) {
            addCriterion("tradeco =", value, "tradeco");
            return (Criteria) this;
        }

        public Criteria andTradecoNotEqualTo(String value) {
            addCriterion("tradeco <>", value, "tradeco");
            return (Criteria) this;
        }

        public Criteria andTradecoGreaterThan(String value) {
            addCriterion("tradeco >", value, "tradeco");
            return (Criteria) this;
        }

        public Criteria andTradecoGreaterThanOrEqualTo(String value) {
            addCriterion("tradeco >=", value, "tradeco");
            return (Criteria) this;
        }

        public Criteria andTradecoLessThan(String value) {
            addCriterion("tradeco <", value, "tradeco");
            return (Criteria) this;
        }

        public Criteria andTradecoLessThanOrEqualTo(String value) {
            addCriterion("tradeco <=", value, "tradeco");
            return (Criteria) this;
        }

        public Criteria andTradecoLike(String value) {
            addCriterion("tradeco like", value, "tradeco");
            return (Criteria) this;
        }

        public Criteria andTradecoNotLike(String value) {
            addCriterion("tradeco not like", value, "tradeco");
            return (Criteria) this;
        }

        public Criteria andTradecoIn(List<String> values) {
            addCriterion("tradeco in", values, "tradeco");
            return (Criteria) this;
        }

        public Criteria andTradecoNotIn(List<String> values) {
            addCriterion("tradeco not in", values, "tradeco");
            return (Criteria) this;
        }

        public Criteria andTradecoBetween(String value1, String value2) {
            addCriterion("tradeco between", value1, value2, "tradeco");
            return (Criteria) this;
        }

        public Criteria andTradecoNotBetween(String value1, String value2) {
            addCriterion("tradeco not between", value1, value2, "tradeco");
            return (Criteria) this;
        }

        public Criteria andTradeciqcodeIsNull() {
            addCriterion("tradeciqcode is null");
            return (Criteria) this;
        }

        public Criteria andTradeciqcodeIsNotNull() {
            addCriterion("tradeciqcode is not null");
            return (Criteria) this;
        }

        public Criteria andTradeciqcodeEqualTo(String value) {
            addCriterion("tradeciqcode =", value, "tradeciqcode");
            return (Criteria) this;
        }

        public Criteria andTradeciqcodeNotEqualTo(String value) {
            addCriterion("tradeciqcode <>", value, "tradeciqcode");
            return (Criteria) this;
        }

        public Criteria andTradeciqcodeGreaterThan(String value) {
            addCriterion("tradeciqcode >", value, "tradeciqcode");
            return (Criteria) this;
        }

        public Criteria andTradeciqcodeGreaterThanOrEqualTo(String value) {
            addCriterion("tradeciqcode >=", value, "tradeciqcode");
            return (Criteria) this;
        }

        public Criteria andTradeciqcodeLessThan(String value) {
            addCriterion("tradeciqcode <", value, "tradeciqcode");
            return (Criteria) this;
        }

        public Criteria andTradeciqcodeLessThanOrEqualTo(String value) {
            addCriterion("tradeciqcode <=", value, "tradeciqcode");
            return (Criteria) this;
        }

        public Criteria andTradeciqcodeLike(String value) {
            addCriterion("tradeciqcode like", value, "tradeciqcode");
            return (Criteria) this;
        }

        public Criteria andTradeciqcodeNotLike(String value) {
            addCriterion("tradeciqcode not like", value, "tradeciqcode");
            return (Criteria) this;
        }

        public Criteria andTradeciqcodeIn(List<String> values) {
            addCriterion("tradeciqcode in", values, "tradeciqcode");
            return (Criteria) this;
        }

        public Criteria andTradeciqcodeNotIn(List<String> values) {
            addCriterion("tradeciqcode not in", values, "tradeciqcode");
            return (Criteria) this;
        }

        public Criteria andTradeciqcodeBetween(String value1, String value2) {
            addCriterion("tradeciqcode between", value1, value2, "tradeciqcode");
            return (Criteria) this;
        }

        public Criteria andTradeciqcodeNotBetween(String value1, String value2) {
            addCriterion("tradeciqcode not between", value1, value2, "tradeciqcode");
            return (Criteria) this;
        }

        public Criteria andTradenameIsNull() {
            addCriterion("tradename is null");
            return (Criteria) this;
        }

        public Criteria andTradenameIsNotNull() {
            addCriterion("tradename is not null");
            return (Criteria) this;
        }

        public Criteria andTradenameEqualTo(String value) {
            addCriterion("tradename =", value, "tradename");
            return (Criteria) this;
        }

        public Criteria andTradenameNotEqualTo(String value) {
            addCriterion("tradename <>", value, "tradename");
            return (Criteria) this;
        }

        public Criteria andTradenameGreaterThan(String value) {
            addCriterion("tradename >", value, "tradename");
            return (Criteria) this;
        }

        public Criteria andTradenameGreaterThanOrEqualTo(String value) {
            addCriterion("tradename >=", value, "tradename");
            return (Criteria) this;
        }

        public Criteria andTradenameLessThan(String value) {
            addCriterion("tradename <", value, "tradename");
            return (Criteria) this;
        }

        public Criteria andTradenameLessThanOrEqualTo(String value) {
            addCriterion("tradename <=", value, "tradename");
            return (Criteria) this;
        }

        public Criteria andTradenameLike(String value) {
            addCriterion("tradename like", value, "tradename");
            return (Criteria) this;
        }

        public Criteria andTradenameNotLike(String value) {
            addCriterion("tradename not like", value, "tradename");
            return (Criteria) this;
        }

        public Criteria andTradenameIn(List<String> values) {
            addCriterion("tradename in", values, "tradename");
            return (Criteria) this;
        }

        public Criteria andTradenameNotIn(List<String> values) {
            addCriterion("tradename not in", values, "tradename");
            return (Criteria) this;
        }

        public Criteria andTradenameBetween(String value1, String value2) {
            addCriterion("tradename between", value1, value2, "tradename");
            return (Criteria) this;
        }

        public Criteria andTradenameNotBetween(String value1, String value2) {
            addCriterion("tradename not between", value1, value2, "tradename");
            return (Criteria) this;
        }

        public Criteria andOverseasconsigneecodeIsNull() {
            addCriterion("overseasconsigneecode is null");
            return (Criteria) this;
        }

        public Criteria andOverseasconsigneecodeIsNotNull() {
            addCriterion("overseasconsigneecode is not null");
            return (Criteria) this;
        }

        public Criteria andOverseasconsigneecodeEqualTo(String value) {
            addCriterion("overseasconsigneecode =", value, "overseasconsigneecode");
            return (Criteria) this;
        }

        public Criteria andOverseasconsigneecodeNotEqualTo(String value) {
            addCriterion("overseasconsigneecode <>", value, "overseasconsigneecode");
            return (Criteria) this;
        }

        public Criteria andOverseasconsigneecodeGreaterThan(String value) {
            addCriterion("overseasconsigneecode >", value, "overseasconsigneecode");
            return (Criteria) this;
        }

        public Criteria andOverseasconsigneecodeGreaterThanOrEqualTo(String value) {
            addCriterion("overseasconsigneecode >=", value, "overseasconsigneecode");
            return (Criteria) this;
        }

        public Criteria andOverseasconsigneecodeLessThan(String value) {
            addCriterion("overseasconsigneecode <", value, "overseasconsigneecode");
            return (Criteria) this;
        }

        public Criteria andOverseasconsigneecodeLessThanOrEqualTo(String value) {
            addCriterion("overseasconsigneecode <=", value, "overseasconsigneecode");
            return (Criteria) this;
        }

        public Criteria andOverseasconsigneecodeLike(String value) {
            addCriterion("overseasconsigneecode like", value, "overseasconsigneecode");
            return (Criteria) this;
        }

        public Criteria andOverseasconsigneecodeNotLike(String value) {
            addCriterion("overseasconsigneecode not like", value, "overseasconsigneecode");
            return (Criteria) this;
        }

        public Criteria andOverseasconsigneecodeIn(List<String> values) {
            addCriterion("overseasconsigneecode in", values, "overseasconsigneecode");
            return (Criteria) this;
        }

        public Criteria andOverseasconsigneecodeNotIn(List<String> values) {
            addCriterion("overseasconsigneecode not in", values, "overseasconsigneecode");
            return (Criteria) this;
        }

        public Criteria andOverseasconsigneecodeBetween(String value1, String value2) {
            addCriterion("overseasconsigneecode between", value1, value2, "overseasconsigneecode");
            return (Criteria) this;
        }

        public Criteria andOverseasconsigneecodeNotBetween(String value1, String value2) {
            addCriterion("overseasconsigneecode not between", value1, value2, "overseasconsigneecode");
            return (Criteria) this;
        }

        public Criteria andOverseasconsignorenameIsNull() {
            addCriterion("overseasconsignorename is null");
            return (Criteria) this;
        }

        public Criteria andOverseasconsignorenameIsNotNull() {
            addCriterion("overseasconsignorename is not null");
            return (Criteria) this;
        }

        public Criteria andOverseasconsignorenameEqualTo(String value) {
            addCriterion("overseasconsignorename =", value, "overseasconsignorename");
            return (Criteria) this;
        }

        public Criteria andOverseasconsignorenameNotEqualTo(String value) {
            addCriterion("overseasconsignorename <>", value, "overseasconsignorename");
            return (Criteria) this;
        }

        public Criteria andOverseasconsignorenameGreaterThan(String value) {
            addCriterion("overseasconsignorename >", value, "overseasconsignorename");
            return (Criteria) this;
        }

        public Criteria andOverseasconsignorenameGreaterThanOrEqualTo(String value) {
            addCriterion("overseasconsignorename >=", value, "overseasconsignorename");
            return (Criteria) this;
        }

        public Criteria andOverseasconsignorenameLessThan(String value) {
            addCriterion("overseasconsignorename <", value, "overseasconsignorename");
            return (Criteria) this;
        }

        public Criteria andOverseasconsignorenameLessThanOrEqualTo(String value) {
            addCriterion("overseasconsignorename <=", value, "overseasconsignorename");
            return (Criteria) this;
        }

        public Criteria andOverseasconsignorenameLike(String value) {
            addCriterion("overseasconsignorename like", value, "overseasconsignorename");
            return (Criteria) this;
        }

        public Criteria andOverseasconsignorenameNotLike(String value) {
            addCriterion("overseasconsignorename not like", value, "overseasconsignorename");
            return (Criteria) this;
        }

        public Criteria andOverseasconsignorenameIn(List<String> values) {
            addCriterion("overseasconsignorename in", values, "overseasconsignorename");
            return (Criteria) this;
        }

        public Criteria andOverseasconsignorenameNotIn(List<String> values) {
            addCriterion("overseasconsignorename not in", values, "overseasconsignorename");
            return (Criteria) this;
        }

        public Criteria andOverseasconsignorenameBetween(String value1, String value2) {
            addCriterion("overseasconsignorename between", value1, value2, "overseasconsignorename");
            return (Criteria) this;
        }

        public Criteria andOverseasconsignorenameNotBetween(String value1, String value2) {
            addCriterion("overseasconsignorename not between", value1, value2, "overseasconsignorename");
            return (Criteria) this;
        }

        public Criteria andOwnercodesccIsNull() {
            addCriterion("ownercodescc is null");
            return (Criteria) this;
        }

        public Criteria andOwnercodesccIsNotNull() {
            addCriterion("ownercodescc is not null");
            return (Criteria) this;
        }

        public Criteria andOwnercodesccEqualTo(String value) {
            addCriterion("ownercodescc =", value, "ownercodescc");
            return (Criteria) this;
        }

        public Criteria andOwnercodesccNotEqualTo(String value) {
            addCriterion("ownercodescc <>", value, "ownercodescc");
            return (Criteria) this;
        }

        public Criteria andOwnercodesccGreaterThan(String value) {
            addCriterion("ownercodescc >", value, "ownercodescc");
            return (Criteria) this;
        }

        public Criteria andOwnercodesccGreaterThanOrEqualTo(String value) {
            addCriterion("ownercodescc >=", value, "ownercodescc");
            return (Criteria) this;
        }

        public Criteria andOwnercodesccLessThan(String value) {
            addCriterion("ownercodescc <", value, "ownercodescc");
            return (Criteria) this;
        }

        public Criteria andOwnercodesccLessThanOrEqualTo(String value) {
            addCriterion("ownercodescc <=", value, "ownercodescc");
            return (Criteria) this;
        }

        public Criteria andOwnercodesccLike(String value) {
            addCriterion("ownercodescc like", value, "ownercodescc");
            return (Criteria) this;
        }

        public Criteria andOwnercodesccNotLike(String value) {
            addCriterion("ownercodescc not like", value, "ownercodescc");
            return (Criteria) this;
        }

        public Criteria andOwnercodesccIn(List<String> values) {
            addCriterion("ownercodescc in", values, "ownercodescc");
            return (Criteria) this;
        }

        public Criteria andOwnercodesccNotIn(List<String> values) {
            addCriterion("ownercodescc not in", values, "ownercodescc");
            return (Criteria) this;
        }

        public Criteria andOwnercodesccBetween(String value1, String value2) {
            addCriterion("ownercodescc between", value1, value2, "ownercodescc");
            return (Criteria) this;
        }

        public Criteria andOwnercodesccNotBetween(String value1, String value2) {
            addCriterion("ownercodescc not between", value1, value2, "ownercodescc");
            return (Criteria) this;
        }

        public Criteria andOwnercodeIsNull() {
            addCriterion("ownercode is null");
            return (Criteria) this;
        }

        public Criteria andOwnercodeIsNotNull() {
            addCriterion("ownercode is not null");
            return (Criteria) this;
        }

        public Criteria andOwnercodeEqualTo(String value) {
            addCriterion("ownercode =", value, "ownercode");
            return (Criteria) this;
        }

        public Criteria andOwnercodeNotEqualTo(String value) {
            addCriterion("ownercode <>", value, "ownercode");
            return (Criteria) this;
        }

        public Criteria andOwnercodeGreaterThan(String value) {
            addCriterion("ownercode >", value, "ownercode");
            return (Criteria) this;
        }

        public Criteria andOwnercodeGreaterThanOrEqualTo(String value) {
            addCriterion("ownercode >=", value, "ownercode");
            return (Criteria) this;
        }

        public Criteria andOwnercodeLessThan(String value) {
            addCriterion("ownercode <", value, "ownercode");
            return (Criteria) this;
        }

        public Criteria andOwnercodeLessThanOrEqualTo(String value) {
            addCriterion("ownercode <=", value, "ownercode");
            return (Criteria) this;
        }

        public Criteria andOwnercodeLike(String value) {
            addCriterion("ownercode like", value, "ownercode");
            return (Criteria) this;
        }

        public Criteria andOwnercodeNotLike(String value) {
            addCriterion("ownercode not like", value, "ownercode");
            return (Criteria) this;
        }

        public Criteria andOwnercodeIn(List<String> values) {
            addCriterion("ownercode in", values, "ownercode");
            return (Criteria) this;
        }

        public Criteria andOwnercodeNotIn(List<String> values) {
            addCriterion("ownercode not in", values, "ownercode");
            return (Criteria) this;
        }

        public Criteria andOwnercodeBetween(String value1, String value2) {
            addCriterion("ownercode between", value1, value2, "ownercode");
            return (Criteria) this;
        }

        public Criteria andOwnercodeNotBetween(String value1, String value2) {
            addCriterion("ownercode not between", value1, value2, "ownercode");
            return (Criteria) this;
        }

        public Criteria andOwnerciqcodeIsNull() {
            addCriterion("ownerciqcode is null");
            return (Criteria) this;
        }

        public Criteria andOwnerciqcodeIsNotNull() {
            addCriterion("ownerciqcode is not null");
            return (Criteria) this;
        }

        public Criteria andOwnerciqcodeEqualTo(String value) {
            addCriterion("ownerciqcode =", value, "ownerciqcode");
            return (Criteria) this;
        }

        public Criteria andOwnerciqcodeNotEqualTo(String value) {
            addCriterion("ownerciqcode <>", value, "ownerciqcode");
            return (Criteria) this;
        }

        public Criteria andOwnerciqcodeGreaterThan(String value) {
            addCriterion("ownerciqcode >", value, "ownerciqcode");
            return (Criteria) this;
        }

        public Criteria andOwnerciqcodeGreaterThanOrEqualTo(String value) {
            addCriterion("ownerciqcode >=", value, "ownerciqcode");
            return (Criteria) this;
        }

        public Criteria andOwnerciqcodeLessThan(String value) {
            addCriterion("ownerciqcode <", value, "ownerciqcode");
            return (Criteria) this;
        }

        public Criteria andOwnerciqcodeLessThanOrEqualTo(String value) {
            addCriterion("ownerciqcode <=", value, "ownerciqcode");
            return (Criteria) this;
        }

        public Criteria andOwnerciqcodeLike(String value) {
            addCriterion("ownerciqcode like", value, "ownerciqcode");
            return (Criteria) this;
        }

        public Criteria andOwnerciqcodeNotLike(String value) {
            addCriterion("ownerciqcode not like", value, "ownerciqcode");
            return (Criteria) this;
        }

        public Criteria andOwnerciqcodeIn(List<String> values) {
            addCriterion("ownerciqcode in", values, "ownerciqcode");
            return (Criteria) this;
        }

        public Criteria andOwnerciqcodeNotIn(List<String> values) {
            addCriterion("ownerciqcode not in", values, "ownerciqcode");
            return (Criteria) this;
        }

        public Criteria andOwnerciqcodeBetween(String value1, String value2) {
            addCriterion("ownerciqcode between", value1, value2, "ownerciqcode");
            return (Criteria) this;
        }

        public Criteria andOwnerciqcodeNotBetween(String value1, String value2) {
            addCriterion("ownerciqcode not between", value1, value2, "ownerciqcode");
            return (Criteria) this;
        }

        public Criteria andOwnernameIsNull() {
            addCriterion("ownername is null");
            return (Criteria) this;
        }

        public Criteria andOwnernameIsNotNull() {
            addCriterion("ownername is not null");
            return (Criteria) this;
        }

        public Criteria andOwnernameEqualTo(String value) {
            addCriterion("ownername =", value, "ownername");
            return (Criteria) this;
        }

        public Criteria andOwnernameNotEqualTo(String value) {
            addCriterion("ownername <>", value, "ownername");
            return (Criteria) this;
        }

        public Criteria andOwnernameGreaterThan(String value) {
            addCriterion("ownername >", value, "ownername");
            return (Criteria) this;
        }

        public Criteria andOwnernameGreaterThanOrEqualTo(String value) {
            addCriterion("ownername >=", value, "ownername");
            return (Criteria) this;
        }

        public Criteria andOwnernameLessThan(String value) {
            addCriterion("ownername <", value, "ownername");
            return (Criteria) this;
        }

        public Criteria andOwnernameLessThanOrEqualTo(String value) {
            addCriterion("ownername <=", value, "ownername");
            return (Criteria) this;
        }

        public Criteria andOwnernameLike(String value) {
            addCriterion("ownername like", value, "ownername");
            return (Criteria) this;
        }

        public Criteria andOwnernameNotLike(String value) {
            addCriterion("ownername not like", value, "ownername");
            return (Criteria) this;
        }

        public Criteria andOwnernameIn(List<String> values) {
            addCriterion("ownername in", values, "ownername");
            return (Criteria) this;
        }

        public Criteria andOwnernameNotIn(List<String> values) {
            addCriterion("ownername not in", values, "ownername");
            return (Criteria) this;
        }

        public Criteria andOwnernameBetween(String value1, String value2) {
            addCriterion("ownername between", value1, value2, "ownername");
            return (Criteria) this;
        }

        public Criteria andOwnernameNotBetween(String value1, String value2) {
            addCriterion("ownername not between", value1, value2, "ownername");
            return (Criteria) this;
        }

        public Criteria andAgentcodesccIsNull() {
            addCriterion("agentcodescc is null");
            return (Criteria) this;
        }

        public Criteria andAgentcodesccIsNotNull() {
            addCriterion("agentcodescc is not null");
            return (Criteria) this;
        }

        public Criteria andAgentcodesccEqualTo(String value) {
            addCriterion("agentcodescc =", value, "agentcodescc");
            return (Criteria) this;
        }

        public Criteria andAgentcodesccNotEqualTo(String value) {
            addCriterion("agentcodescc <>", value, "agentcodescc");
            return (Criteria) this;
        }

        public Criteria andAgentcodesccGreaterThan(String value) {
            addCriterion("agentcodescc >", value, "agentcodescc");
            return (Criteria) this;
        }

        public Criteria andAgentcodesccGreaterThanOrEqualTo(String value) {
            addCriterion("agentcodescc >=", value, "agentcodescc");
            return (Criteria) this;
        }

        public Criteria andAgentcodesccLessThan(String value) {
            addCriterion("agentcodescc <", value, "agentcodescc");
            return (Criteria) this;
        }

        public Criteria andAgentcodesccLessThanOrEqualTo(String value) {
            addCriterion("agentcodescc <=", value, "agentcodescc");
            return (Criteria) this;
        }

        public Criteria andAgentcodesccLike(String value) {
            addCriterion("agentcodescc like", value, "agentcodescc");
            return (Criteria) this;
        }

        public Criteria andAgentcodesccNotLike(String value) {
            addCriterion("agentcodescc not like", value, "agentcodescc");
            return (Criteria) this;
        }

        public Criteria andAgentcodesccIn(List<String> values) {
            addCriterion("agentcodescc in", values, "agentcodescc");
            return (Criteria) this;
        }

        public Criteria andAgentcodesccNotIn(List<String> values) {
            addCriterion("agentcodescc not in", values, "agentcodescc");
            return (Criteria) this;
        }

        public Criteria andAgentcodesccBetween(String value1, String value2) {
            addCriterion("agentcodescc between", value1, value2, "agentcodescc");
            return (Criteria) this;
        }

        public Criteria andAgentcodesccNotBetween(String value1, String value2) {
            addCriterion("agentcodescc not between", value1, value2, "agentcodescc");
            return (Criteria) this;
        }

        public Criteria andAgentcodeIsNull() {
            addCriterion("agentcode is null");
            return (Criteria) this;
        }

        public Criteria andAgentcodeIsNotNull() {
            addCriterion("agentcode is not null");
            return (Criteria) this;
        }

        public Criteria andAgentcodeEqualTo(String value) {
            addCriterion("agentcode =", value, "agentcode");
            return (Criteria) this;
        }

        public Criteria andAgentcodeNotEqualTo(String value) {
            addCriterion("agentcode <>", value, "agentcode");
            return (Criteria) this;
        }

        public Criteria andAgentcodeGreaterThan(String value) {
            addCriterion("agentcode >", value, "agentcode");
            return (Criteria) this;
        }

        public Criteria andAgentcodeGreaterThanOrEqualTo(String value) {
            addCriterion("agentcode >=", value, "agentcode");
            return (Criteria) this;
        }

        public Criteria andAgentcodeLessThan(String value) {
            addCriterion("agentcode <", value, "agentcode");
            return (Criteria) this;
        }

        public Criteria andAgentcodeLessThanOrEqualTo(String value) {
            addCriterion("agentcode <=", value, "agentcode");
            return (Criteria) this;
        }

        public Criteria andAgentcodeLike(String value) {
            addCriterion("agentcode like", value, "agentcode");
            return (Criteria) this;
        }

        public Criteria andAgentcodeNotLike(String value) {
            addCriterion("agentcode not like", value, "agentcode");
            return (Criteria) this;
        }

        public Criteria andAgentcodeIn(List<String> values) {
            addCriterion("agentcode in", values, "agentcode");
            return (Criteria) this;
        }

        public Criteria andAgentcodeNotIn(List<String> values) {
            addCriterion("agentcode not in", values, "agentcode");
            return (Criteria) this;
        }

        public Criteria andAgentcodeBetween(String value1, String value2) {
            addCriterion("agentcode between", value1, value2, "agentcode");
            return (Criteria) this;
        }

        public Criteria andAgentcodeNotBetween(String value1, String value2) {
            addCriterion("agentcode not between", value1, value2, "agentcode");
            return (Criteria) this;
        }

        public Criteria andDeclciqcodeIsNull() {
            addCriterion("declciqcode is null");
            return (Criteria) this;
        }

        public Criteria andDeclciqcodeIsNotNull() {
            addCriterion("declciqcode is not null");
            return (Criteria) this;
        }

        public Criteria andDeclciqcodeEqualTo(String value) {
            addCriterion("declciqcode =", value, "declciqcode");
            return (Criteria) this;
        }

        public Criteria andDeclciqcodeNotEqualTo(String value) {
            addCriterion("declciqcode <>", value, "declciqcode");
            return (Criteria) this;
        }

        public Criteria andDeclciqcodeGreaterThan(String value) {
            addCriterion("declciqcode >", value, "declciqcode");
            return (Criteria) this;
        }

        public Criteria andDeclciqcodeGreaterThanOrEqualTo(String value) {
            addCriterion("declciqcode >=", value, "declciqcode");
            return (Criteria) this;
        }

        public Criteria andDeclciqcodeLessThan(String value) {
            addCriterion("declciqcode <", value, "declciqcode");
            return (Criteria) this;
        }

        public Criteria andDeclciqcodeLessThanOrEqualTo(String value) {
            addCriterion("declciqcode <=", value, "declciqcode");
            return (Criteria) this;
        }

        public Criteria andDeclciqcodeLike(String value) {
            addCriterion("declciqcode like", value, "declciqcode");
            return (Criteria) this;
        }

        public Criteria andDeclciqcodeNotLike(String value) {
            addCriterion("declciqcode not like", value, "declciqcode");
            return (Criteria) this;
        }

        public Criteria andDeclciqcodeIn(List<String> values) {
            addCriterion("declciqcode in", values, "declciqcode");
            return (Criteria) this;
        }

        public Criteria andDeclciqcodeNotIn(List<String> values) {
            addCriterion("declciqcode not in", values, "declciqcode");
            return (Criteria) this;
        }

        public Criteria andDeclciqcodeBetween(String value1, String value2) {
            addCriterion("declciqcode between", value1, value2, "declciqcode");
            return (Criteria) this;
        }

        public Criteria andDeclciqcodeNotBetween(String value1, String value2) {
            addCriterion("declciqcode not between", value1, value2, "declciqcode");
            return (Criteria) this;
        }

        public Criteria andAgentnameIsNull() {
            addCriterion("agentname is null");
            return (Criteria) this;
        }

        public Criteria andAgentnameIsNotNull() {
            addCriterion("agentname is not null");
            return (Criteria) this;
        }

        public Criteria andAgentnameEqualTo(String value) {
            addCriterion("agentname =", value, "agentname");
            return (Criteria) this;
        }

        public Criteria andAgentnameNotEqualTo(String value) {
            addCriterion("agentname <>", value, "agentname");
            return (Criteria) this;
        }

        public Criteria andAgentnameGreaterThan(String value) {
            addCriterion("agentname >", value, "agentname");
            return (Criteria) this;
        }

        public Criteria andAgentnameGreaterThanOrEqualTo(String value) {
            addCriterion("agentname >=", value, "agentname");
            return (Criteria) this;
        }

        public Criteria andAgentnameLessThan(String value) {
            addCriterion("agentname <", value, "agentname");
            return (Criteria) this;
        }

        public Criteria andAgentnameLessThanOrEqualTo(String value) {
            addCriterion("agentname <=", value, "agentname");
            return (Criteria) this;
        }

        public Criteria andAgentnameLike(String value) {
            addCriterion("agentname like", value, "agentname");
            return (Criteria) this;
        }

        public Criteria andAgentnameNotLike(String value) {
            addCriterion("agentname not like", value, "agentname");
            return (Criteria) this;
        }

        public Criteria andAgentnameIn(List<String> values) {
            addCriterion("agentname in", values, "agentname");
            return (Criteria) this;
        }

        public Criteria andAgentnameNotIn(List<String> values) {
            addCriterion("agentname not in", values, "agentname");
            return (Criteria) this;
        }

        public Criteria andAgentnameBetween(String value1, String value2) {
            addCriterion("agentname between", value1, value2, "agentname");
            return (Criteria) this;
        }

        public Criteria andAgentnameNotBetween(String value1, String value2) {
            addCriterion("agentname not between", value1, value2, "agentname");
            return (Criteria) this;
        }

        public Criteria andTrafmodeIsNull() {
            addCriterion("trafmode is null");
            return (Criteria) this;
        }

        public Criteria andTrafmodeIsNotNull() {
            addCriterion("trafmode is not null");
            return (Criteria) this;
        }

        public Criteria andTrafmodeEqualTo(String value) {
            addCriterion("trafmode =", value, "trafmode");
            return (Criteria) this;
        }

        public Criteria andTrafmodeNotEqualTo(String value) {
            addCriterion("trafmode <>", value, "trafmode");
            return (Criteria) this;
        }

        public Criteria andTrafmodeGreaterThan(String value) {
            addCriterion("trafmode >", value, "trafmode");
            return (Criteria) this;
        }

        public Criteria andTrafmodeGreaterThanOrEqualTo(String value) {
            addCriterion("trafmode >=", value, "trafmode");
            return (Criteria) this;
        }

        public Criteria andTrafmodeLessThan(String value) {
            addCriterion("trafmode <", value, "trafmode");
            return (Criteria) this;
        }

        public Criteria andTrafmodeLessThanOrEqualTo(String value) {
            addCriterion("trafmode <=", value, "trafmode");
            return (Criteria) this;
        }

        public Criteria andTrafmodeLike(String value) {
            addCriterion("trafmode like", value, "trafmode");
            return (Criteria) this;
        }

        public Criteria andTrafmodeNotLike(String value) {
            addCriterion("trafmode not like", value, "trafmode");
            return (Criteria) this;
        }

        public Criteria andTrafmodeIn(List<String> values) {
            addCriterion("trafmode in", values, "trafmode");
            return (Criteria) this;
        }

        public Criteria andTrafmodeNotIn(List<String> values) {
            addCriterion("trafmode not in", values, "trafmode");
            return (Criteria) this;
        }

        public Criteria andTrafmodeBetween(String value1, String value2) {
            addCriterion("trafmode between", value1, value2, "trafmode");
            return (Criteria) this;
        }

        public Criteria andTrafmodeNotBetween(String value1, String value2) {
            addCriterion("trafmode not between", value1, value2, "trafmode");
            return (Criteria) this;
        }

        public Criteria andShipnameenIsNull() {
            addCriterion("shipnameen is null");
            return (Criteria) this;
        }

        public Criteria andShipnameenIsNotNull() {
            addCriterion("shipnameen is not null");
            return (Criteria) this;
        }

        public Criteria andShipnameenEqualTo(String value) {
            addCriterion("shipnameen =", value, "shipnameen");
            return (Criteria) this;
        }

        public Criteria andShipnameenNotEqualTo(String value) {
            addCriterion("shipnameen <>", value, "shipnameen");
            return (Criteria) this;
        }

        public Criteria andShipnameenGreaterThan(String value) {
            addCriterion("shipnameen >", value, "shipnameen");
            return (Criteria) this;
        }

        public Criteria andShipnameenGreaterThanOrEqualTo(String value) {
            addCriterion("shipnameen >=", value, "shipnameen");
            return (Criteria) this;
        }

        public Criteria andShipnameenLessThan(String value) {
            addCriterion("shipnameen <", value, "shipnameen");
            return (Criteria) this;
        }

        public Criteria andShipnameenLessThanOrEqualTo(String value) {
            addCriterion("shipnameen <=", value, "shipnameen");
            return (Criteria) this;
        }

        public Criteria andShipnameenLike(String value) {
            addCriterion("shipnameen like", value, "shipnameen");
            return (Criteria) this;
        }

        public Criteria andShipnameenNotLike(String value) {
            addCriterion("shipnameen not like", value, "shipnameen");
            return (Criteria) this;
        }

        public Criteria andShipnameenIn(List<String> values) {
            addCriterion("shipnameen in", values, "shipnameen");
            return (Criteria) this;
        }

        public Criteria andShipnameenNotIn(List<String> values) {
            addCriterion("shipnameen not in", values, "shipnameen");
            return (Criteria) this;
        }

        public Criteria andShipnameenBetween(String value1, String value2) {
            addCriterion("shipnameen between", value1, value2, "shipnameen");
            return (Criteria) this;
        }

        public Criteria andShipnameenNotBetween(String value1, String value2) {
            addCriterion("shipnameen not between", value1, value2, "shipnameen");
            return (Criteria) this;
        }

        public Criteria andVoyagenoIsNull() {
            addCriterion("voyageno is null");
            return (Criteria) this;
        }

        public Criteria andVoyagenoIsNotNull() {
            addCriterion("voyageno is not null");
            return (Criteria) this;
        }

        public Criteria andVoyagenoEqualTo(String value) {
            addCriterion("voyageno =", value, "voyageno");
            return (Criteria) this;
        }

        public Criteria andVoyagenoNotEqualTo(String value) {
            addCriterion("voyageno <>", value, "voyageno");
            return (Criteria) this;
        }

        public Criteria andVoyagenoGreaterThan(String value) {
            addCriterion("voyageno >", value, "voyageno");
            return (Criteria) this;
        }

        public Criteria andVoyagenoGreaterThanOrEqualTo(String value) {
            addCriterion("voyageno >=", value, "voyageno");
            return (Criteria) this;
        }

        public Criteria andVoyagenoLessThan(String value) {
            addCriterion("voyageno <", value, "voyageno");
            return (Criteria) this;
        }

        public Criteria andVoyagenoLessThanOrEqualTo(String value) {
            addCriterion("voyageno <=", value, "voyageno");
            return (Criteria) this;
        }

        public Criteria andVoyagenoLike(String value) {
            addCriterion("voyageno like", value, "voyageno");
            return (Criteria) this;
        }

        public Criteria andVoyagenoNotLike(String value) {
            addCriterion("voyageno not like", value, "voyageno");
            return (Criteria) this;
        }

        public Criteria andVoyagenoIn(List<String> values) {
            addCriterion("voyageno in", values, "voyageno");
            return (Criteria) this;
        }

        public Criteria andVoyagenoNotIn(List<String> values) {
            addCriterion("voyageno not in", values, "voyageno");
            return (Criteria) this;
        }

        public Criteria andVoyagenoBetween(String value1, String value2) {
            addCriterion("voyageno between", value1, value2, "voyageno");
            return (Criteria) this;
        }

        public Criteria andVoyagenoNotBetween(String value1, String value2) {
            addCriterion("voyageno not between", value1, value2, "voyageno");
            return (Criteria) this;
        }

        public Criteria andBillnoIsNull() {
            addCriterion("billno is null");
            return (Criteria) this;
        }

        public Criteria andBillnoIsNotNull() {
            addCriterion("billno is not null");
            return (Criteria) this;
        }

        public Criteria andBillnoEqualTo(String value) {
            addCriterion("billno =", value, "billno");
            return (Criteria) this;
        }

        public Criteria andBillnoNotEqualTo(String value) {
            addCriterion("billno <>", value, "billno");
            return (Criteria) this;
        }

        public Criteria andBillnoGreaterThan(String value) {
            addCriterion("billno >", value, "billno");
            return (Criteria) this;
        }

        public Criteria andBillnoGreaterThanOrEqualTo(String value) {
            addCriterion("billno >=", value, "billno");
            return (Criteria) this;
        }

        public Criteria andBillnoLessThan(String value) {
            addCriterion("billno <", value, "billno");
            return (Criteria) this;
        }

        public Criteria andBillnoLessThanOrEqualTo(String value) {
            addCriterion("billno <=", value, "billno");
            return (Criteria) this;
        }

        public Criteria andBillnoLike(String value) {
            addCriterion("billno like", value, "billno");
            return (Criteria) this;
        }

        public Criteria andBillnoNotLike(String value) {
            addCriterion("billno not like", value, "billno");
            return (Criteria) this;
        }

        public Criteria andBillnoIn(List<String> values) {
            addCriterion("billno in", values, "billno");
            return (Criteria) this;
        }

        public Criteria andBillnoNotIn(List<String> values) {
            addCriterion("billno not in", values, "billno");
            return (Criteria) this;
        }

        public Criteria andBillnoBetween(String value1, String value2) {
            addCriterion("billno between", value1, value2, "billno");
            return (Criteria) this;
        }

        public Criteria andBillnoNotBetween(String value1, String value2) {
            addCriterion("billno not between", value1, value2, "billno");
            return (Criteria) this;
        }

        public Criteria andTrademodeIsNull() {
            addCriterion("trademode is null");
            return (Criteria) this;
        }

        public Criteria andTrademodeIsNotNull() {
            addCriterion("trademode is not null");
            return (Criteria) this;
        }

        public Criteria andTrademodeEqualTo(String value) {
            addCriterion("trademode =", value, "trademode");
            return (Criteria) this;
        }

        public Criteria andTrademodeNotEqualTo(String value) {
            addCriterion("trademode <>", value, "trademode");
            return (Criteria) this;
        }

        public Criteria andTrademodeGreaterThan(String value) {
            addCriterion("trademode >", value, "trademode");
            return (Criteria) this;
        }

        public Criteria andTrademodeGreaterThanOrEqualTo(String value) {
            addCriterion("trademode >=", value, "trademode");
            return (Criteria) this;
        }

        public Criteria andTrademodeLessThan(String value) {
            addCriterion("trademode <", value, "trademode");
            return (Criteria) this;
        }

        public Criteria andTrademodeLessThanOrEqualTo(String value) {
            addCriterion("trademode <=", value, "trademode");
            return (Criteria) this;
        }

        public Criteria andTrademodeLike(String value) {
            addCriterion("trademode like", value, "trademode");
            return (Criteria) this;
        }

        public Criteria andTrademodeNotLike(String value) {
            addCriterion("trademode not like", value, "trademode");
            return (Criteria) this;
        }

        public Criteria andTrademodeIn(List<String> values) {
            addCriterion("trademode in", values, "trademode");
            return (Criteria) this;
        }

        public Criteria andTrademodeNotIn(List<String> values) {
            addCriterion("trademode not in", values, "trademode");
            return (Criteria) this;
        }

        public Criteria andTrademodeBetween(String value1, String value2) {
            addCriterion("trademode between", value1, value2, "trademode");
            return (Criteria) this;
        }

        public Criteria andTrademodeNotBetween(String value1, String value2) {
            addCriterion("trademode not between", value1, value2, "trademode");
            return (Criteria) this;
        }

        public Criteria andCutmodeIsNull() {
            addCriterion("cutmode is null");
            return (Criteria) this;
        }

        public Criteria andCutmodeIsNotNull() {
            addCriterion("cutmode is not null");
            return (Criteria) this;
        }

        public Criteria andCutmodeEqualTo(String value) {
            addCriterion("cutmode =", value, "cutmode");
            return (Criteria) this;
        }

        public Criteria andCutmodeNotEqualTo(String value) {
            addCriterion("cutmode <>", value, "cutmode");
            return (Criteria) this;
        }

        public Criteria andCutmodeGreaterThan(String value) {
            addCriterion("cutmode >", value, "cutmode");
            return (Criteria) this;
        }

        public Criteria andCutmodeGreaterThanOrEqualTo(String value) {
            addCriterion("cutmode >=", value, "cutmode");
            return (Criteria) this;
        }

        public Criteria andCutmodeLessThan(String value) {
            addCriterion("cutmode <", value, "cutmode");
            return (Criteria) this;
        }

        public Criteria andCutmodeLessThanOrEqualTo(String value) {
            addCriterion("cutmode <=", value, "cutmode");
            return (Criteria) this;
        }

        public Criteria andCutmodeLike(String value) {
            addCriterion("cutmode like", value, "cutmode");
            return (Criteria) this;
        }

        public Criteria andCutmodeNotLike(String value) {
            addCriterion("cutmode not like", value, "cutmode");
            return (Criteria) this;
        }

        public Criteria andCutmodeIn(List<String> values) {
            addCriterion("cutmode in", values, "cutmode");
            return (Criteria) this;
        }

        public Criteria andCutmodeNotIn(List<String> values) {
            addCriterion("cutmode not in", values, "cutmode");
            return (Criteria) this;
        }

        public Criteria andCutmodeBetween(String value1, String value2) {
            addCriterion("cutmode between", value1, value2, "cutmode");
            return (Criteria) this;
        }

        public Criteria andCutmodeNotBetween(String value1, String value2) {
            addCriterion("cutmode not between", value1, value2, "cutmode");
            return (Criteria) this;
        }
    }

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