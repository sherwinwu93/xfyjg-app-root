package com.xfjyg.managementservice.entity.gen;

import java.util.ArrayList;
import java.util.List;

public class DictTypeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DictTypeExample() {
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

        public Criteria andDictTypeIdIsNull() {
            addCriterion("dict_type_id is null");
            return (Criteria) this;
        }

        public Criteria andDictTypeIdIsNotNull() {
            addCriterion("dict_type_id is not null");
            return (Criteria) this;
        }

        public Criteria andDictTypeIdEqualTo(Long value) {
            addCriterion("dict_type_id =", value, "dictTypeId");
            return (Criteria) this;
        }

        public Criteria andDictTypeIdNotEqualTo(Long value) {
            addCriterion("dict_type_id <>", value, "dictTypeId");
            return (Criteria) this;
        }

        public Criteria andDictTypeIdGreaterThan(Long value) {
            addCriterion("dict_type_id >", value, "dictTypeId");
            return (Criteria) this;
        }

        public Criteria andDictTypeIdGreaterThanOrEqualTo(Long value) {
            addCriterion("dict_type_id >=", value, "dictTypeId");
            return (Criteria) this;
        }

        public Criteria andDictTypeIdLessThan(Long value) {
            addCriterion("dict_type_id <", value, "dictTypeId");
            return (Criteria) this;
        }

        public Criteria andDictTypeIdLessThanOrEqualTo(Long value) {
            addCriterion("dict_type_id <=", value, "dictTypeId");
            return (Criteria) this;
        }

        public Criteria andDictTypeIdIn(List<Long> values) {
            addCriterion("dict_type_id in", values, "dictTypeId");
            return (Criteria) this;
        }

        public Criteria andDictTypeIdNotIn(List<Long> values) {
            addCriterion("dict_type_id not in", values, "dictTypeId");
            return (Criteria) this;
        }

        public Criteria andDictTypeIdBetween(Long value1, Long value2) {
            addCriterion("dict_type_id between", value1, value2, "dictTypeId");
            return (Criteria) this;
        }

        public Criteria andDictTypeIdNotBetween(Long value1, Long value2) {
            addCriterion("dict_type_id not between", value1, value2, "dictTypeId");
            return (Criteria) this;
        }

        public Criteria andDictTypeLabelIsNull() {
            addCriterion("dict_type_label is null");
            return (Criteria) this;
        }

        public Criteria andDictTypeLabelIsNotNull() {
            addCriterion("dict_type_label is not null");
            return (Criteria) this;
        }

        public Criteria andDictTypeLabelEqualTo(String value) {
            addCriterion("dict_type_label =", value, "dictTypeLabel");
            return (Criteria) this;
        }

        public Criteria andDictTypeLabelNotEqualTo(String value) {
            addCriterion("dict_type_label <>", value, "dictTypeLabel");
            return (Criteria) this;
        }

        public Criteria andDictTypeLabelGreaterThan(String value) {
            addCriterion("dict_type_label >", value, "dictTypeLabel");
            return (Criteria) this;
        }

        public Criteria andDictTypeLabelGreaterThanOrEqualTo(String value) {
            addCriterion("dict_type_label >=", value, "dictTypeLabel");
            return (Criteria) this;
        }

        public Criteria andDictTypeLabelLessThan(String value) {
            addCriterion("dict_type_label <", value, "dictTypeLabel");
            return (Criteria) this;
        }

        public Criteria andDictTypeLabelLessThanOrEqualTo(String value) {
            addCriterion("dict_type_label <=", value, "dictTypeLabel");
            return (Criteria) this;
        }

        public Criteria andDictTypeLabelLike(String value) {
            addCriterion("dict_type_label like", value, "dictTypeLabel");
            return (Criteria) this;
        }

        public Criteria andDictTypeLabelNotLike(String value) {
            addCriterion("dict_type_label not like", value, "dictTypeLabel");
            return (Criteria) this;
        }

        public Criteria andDictTypeLabelIn(List<String> values) {
            addCriterion("dict_type_label in", values, "dictTypeLabel");
            return (Criteria) this;
        }

        public Criteria andDictTypeLabelNotIn(List<String> values) {
            addCriterion("dict_type_label not in", values, "dictTypeLabel");
            return (Criteria) this;
        }

        public Criteria andDictTypeLabelBetween(String value1, String value2) {
            addCriterion("dict_type_label between", value1, value2, "dictTypeLabel");
            return (Criteria) this;
        }

        public Criteria andDictTypeLabelNotBetween(String value1, String value2) {
            addCriterion("dict_type_label not between", value1, value2, "dictTypeLabel");
            return (Criteria) this;
        }

        public Criteria andDictTypeValueIsNull() {
            addCriterion("dict_type_value is null");
            return (Criteria) this;
        }

        public Criteria andDictTypeValueIsNotNull() {
            addCriterion("dict_type_value is not null");
            return (Criteria) this;
        }

        public Criteria andDictTypeValueEqualTo(String value) {
            addCriterion("dict_type_value =", value, "dictTypeValue");
            return (Criteria) this;
        }

        public Criteria andDictTypeValueNotEqualTo(String value) {
            addCriterion("dict_type_value <>", value, "dictTypeValue");
            return (Criteria) this;
        }

        public Criteria andDictTypeValueGreaterThan(String value) {
            addCriterion("dict_type_value >", value, "dictTypeValue");
            return (Criteria) this;
        }

        public Criteria andDictTypeValueGreaterThanOrEqualTo(String value) {
            addCriterion("dict_type_value >=", value, "dictTypeValue");
            return (Criteria) this;
        }

        public Criteria andDictTypeValueLessThan(String value) {
            addCriterion("dict_type_value <", value, "dictTypeValue");
            return (Criteria) this;
        }

        public Criteria andDictTypeValueLessThanOrEqualTo(String value) {
            addCriterion("dict_type_value <=", value, "dictTypeValue");
            return (Criteria) this;
        }

        public Criteria andDictTypeValueLike(String value) {
            addCriterion("dict_type_value like", value, "dictTypeValue");
            return (Criteria) this;
        }

        public Criteria andDictTypeValueNotLike(String value) {
            addCriterion("dict_type_value not like", value, "dictTypeValue");
            return (Criteria) this;
        }

        public Criteria andDictTypeValueIn(List<String> values) {
            addCriterion("dict_type_value in", values, "dictTypeValue");
            return (Criteria) this;
        }

        public Criteria andDictTypeValueNotIn(List<String> values) {
            addCriterion("dict_type_value not in", values, "dictTypeValue");
            return (Criteria) this;
        }

        public Criteria andDictTypeValueBetween(String value1, String value2) {
            addCriterion("dict_type_value between", value1, value2, "dictTypeValue");
            return (Criteria) this;
        }

        public Criteria andDictTypeValueNotBetween(String value1, String value2) {
            addCriterion("dict_type_value not between", value1, value2, "dictTypeValue");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("status like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("status not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
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