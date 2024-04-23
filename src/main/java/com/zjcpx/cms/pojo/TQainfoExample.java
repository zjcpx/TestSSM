package com.zjcpx.cms.pojo;

import java.util.ArrayList;
import java.util.List;

public class TQainfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public TQainfoExample() {
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

        public Criteria andFieldnameIsNull() {
            addCriterion("fieldname is null");
            return (Criteria) this;
        }

        public Criteria andFieldnameIsNotNull() {
            addCriterion("fieldname is not null");
            return (Criteria) this;
        }

        public Criteria andFieldnameEqualTo(String value) {
            addCriterion("fieldname =", value, "fieldname");
            return (Criteria) this;
        }

        public Criteria andFieldnameNotEqualTo(String value) {
            addCriterion("fieldname <>", value, "fieldname");
            return (Criteria) this;
        }

        public Criteria andFieldnameGreaterThan(String value) {
            addCriterion("fieldname >", value, "fieldname");
            return (Criteria) this;
        }

        public Criteria andFieldnameGreaterThanOrEqualTo(String value) {
            addCriterion("fieldname >=", value, "fieldname");
            return (Criteria) this;
        }

        public Criteria andFieldnameLessThan(String value) {
            addCriterion("fieldname <", value, "fieldname");
            return (Criteria) this;
        }

        public Criteria andFieldnameLessThanOrEqualTo(String value) {
            addCriterion("fieldname <=", value, "fieldname");
            return (Criteria) this;
        }

        public Criteria andFieldnameLike(String value) {
            addCriterion("fieldname like", value, "fieldname");
            return (Criteria) this;
        }

        public Criteria andFieldnameNotLike(String value) {
            addCriterion("fieldname not like", value, "fieldname");
            return (Criteria) this;
        }

        public Criteria andFieldnameIn(List<String> values) {
            addCriterion("fieldname in", values, "fieldname");
            return (Criteria) this;
        }

        public Criteria andFieldnameNotIn(List<String> values) {
            addCriterion("fieldname not in", values, "fieldname");
            return (Criteria) this;
        }

        public Criteria andFieldnameBetween(String value1, String value2) {
            addCriterion("fieldname between", value1, value2, "fieldname");
            return (Criteria) this;
        }

        public Criteria andFieldnameNotBetween(String value1, String value2) {
            addCriterion("fieldname not between", value1, value2, "fieldname");
            return (Criteria) this;
        }

        public Criteria andQacontentIsNull() {
            addCriterion("qacontent is null");
            return (Criteria) this;
        }

        public Criteria andQacontentIsNotNull() {
            addCriterion("qacontent is not null");
            return (Criteria) this;
        }

        public Criteria andQacontentEqualTo(String value) {
            addCriterion("qacontent =", value, "qacontent");
            return (Criteria) this;
        }

        public Criteria andQacontentNotEqualTo(String value) {
            addCriterion("qacontent <>", value, "qacontent");
            return (Criteria) this;
        }

        public Criteria andQacontentGreaterThan(String value) {
            addCriterion("qacontent >", value, "qacontent");
            return (Criteria) this;
        }

        public Criteria andQacontentGreaterThanOrEqualTo(String value) {
            addCriterion("qacontent >=", value, "qacontent");
            return (Criteria) this;
        }

        public Criteria andQacontentLessThan(String value) {
            addCriterion("qacontent <", value, "qacontent");
            return (Criteria) this;
        }

        public Criteria andQacontentLessThanOrEqualTo(String value) {
            addCriterion("qacontent <=", value, "qacontent");
            return (Criteria) this;
        }

        public Criteria andQacontentLike(String value) {
            addCriterion("qacontent like", value, "qacontent");
            return (Criteria) this;
        }

        public Criteria andQacontentNotLike(String value) {
            addCriterion("qacontent not like", value, "qacontent");
            return (Criteria) this;
        }

        public Criteria andQacontentIn(List<String> values) {
            addCriterion("qacontent in", values, "qacontent");
            return (Criteria) this;
        }

        public Criteria andQacontentNotIn(List<String> values) {
            addCriterion("qacontent not in", values, "qacontent");
            return (Criteria) this;
        }

        public Criteria andQacontentBetween(String value1, String value2) {
            addCriterion("qacontent between", value1, value2, "qacontent");
            return (Criteria) this;
        }

        public Criteria andQacontentNotBetween(String value1, String value2) {
            addCriterion("qacontent not between", value1, value2, "qacontent");
            return (Criteria) this;
        }

        public Criteria andFieldcnameIsNull() {
            addCriterion("fieldcname is null");
            return (Criteria) this;
        }

        public Criteria andFieldcnameIsNotNull() {
            addCriterion("fieldcname is not null");
            return (Criteria) this;
        }

        public Criteria andFieldcnameEqualTo(String value) {
            addCriterion("fieldcname =", value, "fieldcname");
            return (Criteria) this;
        }

        public Criteria andFieldcnameNotEqualTo(String value) {
            addCriterion("fieldcname <>", value, "fieldcname");
            return (Criteria) this;
        }

        public Criteria andFieldcnameGreaterThan(String value) {
            addCriterion("fieldcname >", value, "fieldcname");
            return (Criteria) this;
        }

        public Criteria andFieldcnameGreaterThanOrEqualTo(String value) {
            addCriterion("fieldcname >=", value, "fieldcname");
            return (Criteria) this;
        }

        public Criteria andFieldcnameLessThan(String value) {
            addCriterion("fieldcname <", value, "fieldcname");
            return (Criteria) this;
        }

        public Criteria andFieldcnameLessThanOrEqualTo(String value) {
            addCriterion("fieldcname <=", value, "fieldcname");
            return (Criteria) this;
        }

        public Criteria andFieldcnameLike(String value) {
            addCriterion("fieldcname like", value, "fieldcname");
            return (Criteria) this;
        }

        public Criteria andFieldcnameNotLike(String value) {
            addCriterion("fieldcname not like", value, "fieldcname");
            return (Criteria) this;
        }

        public Criteria andFieldcnameIn(List<String> values) {
            addCriterion("fieldcname in", values, "fieldcname");
            return (Criteria) this;
        }

        public Criteria andFieldcnameNotIn(List<String> values) {
            addCriterion("fieldcname not in", values, "fieldcname");
            return (Criteria) this;
        }

        public Criteria andFieldcnameBetween(String value1, String value2) {
            addCriterion("fieldcname between", value1, value2, "fieldcname");
            return (Criteria) this;
        }

        public Criteria andFieldcnameNotBetween(String value1, String value2) {
            addCriterion("fieldcname not between", value1, value2, "fieldcname");
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