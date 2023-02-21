package com.xfjyg.managementservice.entity.gen;

import java.util.ArrayList;
import java.util.List;

public class DictItemExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DictItemExample() {
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

        public Criteria andDictItemIdIsNull() {
            addCriterion("dict_item_id is null");
            return (Criteria) this;
        }

        public Criteria andDictItemIdIsNotNull() {
            addCriterion("dict_item_id is not null");
            return (Criteria) this;
        }

        public Criteria andDictItemIdEqualTo(Long value) {
            addCriterion("dict_item_id =", value, "dictItemId");
            return (Criteria) this;
        }

        public Criteria andDictItemIdNotEqualTo(Long value) {
            addCriterion("dict_item_id <>", value, "dictItemId");
            return (Criteria) this;
        }

        public Criteria andDictItemIdGreaterThan(Long value) {
            addCriterion("dict_item_id >", value, "dictItemId");
            return (Criteria) this;
        }

        public Criteria andDictItemIdGreaterThanOrEqualTo(Long value) {
            addCriterion("dict_item_id >=", value, "dictItemId");
            return (Criteria) this;
        }

        public Criteria andDictItemIdLessThan(Long value) {
            addCriterion("dict_item_id <", value, "dictItemId");
            return (Criteria) this;
        }

        public Criteria andDictItemIdLessThanOrEqualTo(Long value) {
            addCriterion("dict_item_id <=", value, "dictItemId");
            return (Criteria) this;
        }

        public Criteria andDictItemIdIn(List<Long> values) {
            addCriterion("dict_item_id in", values, "dictItemId");
            return (Criteria) this;
        }

        public Criteria andDictItemIdNotIn(List<Long> values) {
            addCriterion("dict_item_id not in", values, "dictItemId");
            return (Criteria) this;
        }

        public Criteria andDictItemIdBetween(Long value1, Long value2) {
            addCriterion("dict_item_id between", value1, value2, "dictItemId");
            return (Criteria) this;
        }

        public Criteria andDictItemIdNotBetween(Long value1, Long value2) {
            addCriterion("dict_item_id not between", value1, value2, "dictItemId");
            return (Criteria) this;
        }

        public Criteria andDictItemLabelIsNull() {
            addCriterion("dict_item_label is null");
            return (Criteria) this;
        }

        public Criteria andDictItemLabelIsNotNull() {
            addCriterion("dict_item_label is not null");
            return (Criteria) this;
        }

        public Criteria andDictItemLabelEqualTo(String value) {
            addCriterion("dict_item_label =", value, "dictItemLabel");
            return (Criteria) this;
        }

        public Criteria andDictItemLabelNotEqualTo(String value) {
            addCriterion("dict_item_label <>", value, "dictItemLabel");
            return (Criteria) this;
        }

        public Criteria andDictItemLabelGreaterThan(String value) {
            addCriterion("dict_item_label >", value, "dictItemLabel");
            return (Criteria) this;
        }

        public Criteria andDictItemLabelGreaterThanOrEqualTo(String value) {
            addCriterion("dict_item_label >=", value, "dictItemLabel");
            return (Criteria) this;
        }

        public Criteria andDictItemLabelLessThan(String value) {
            addCriterion("dict_item_label <", value, "dictItemLabel");
            return (Criteria) this;
        }

        public Criteria andDictItemLabelLessThanOrEqualTo(String value) {
            addCriterion("dict_item_label <=", value, "dictItemLabel");
            return (Criteria) this;
        }

        public Criteria andDictItemLabelLike(String value) {
            addCriterion("dict_item_label like", value, "dictItemLabel");
            return (Criteria) this;
        }

        public Criteria andDictItemLabelNotLike(String value) {
            addCriterion("dict_item_label not like", value, "dictItemLabel");
            return (Criteria) this;
        }

        public Criteria andDictItemLabelIn(List<String> values) {
            addCriterion("dict_item_label in", values, "dictItemLabel");
            return (Criteria) this;
        }

        public Criteria andDictItemLabelNotIn(List<String> values) {
            addCriterion("dict_item_label not in", values, "dictItemLabel");
            return (Criteria) this;
        }

        public Criteria andDictItemLabelBetween(String value1, String value2) {
            addCriterion("dict_item_label between", value1, value2, "dictItemLabel");
            return (Criteria) this;
        }

        public Criteria andDictItemLabelNotBetween(String value1, String value2) {
            addCriterion("dict_item_label not between", value1, value2, "dictItemLabel");
            return (Criteria) this;
        }

        public Criteria andDictItemValueIsNull() {
            addCriterion("dict_item_value is null");
            return (Criteria) this;
        }

        public Criteria andDictItemValueIsNotNull() {
            addCriterion("dict_item_value is not null");
            return (Criteria) this;
        }

        public Criteria andDictItemValueEqualTo(String value) {
            addCriterion("dict_item_value =", value, "dictItemValue");
            return (Criteria) this;
        }

        public Criteria andDictItemValueNotEqualTo(String value) {
            addCriterion("dict_item_value <>", value, "dictItemValue");
            return (Criteria) this;
        }

        public Criteria andDictItemValueGreaterThan(String value) {
            addCriterion("dict_item_value >", value, "dictItemValue");
            return (Criteria) this;
        }

        public Criteria andDictItemValueGreaterThanOrEqualTo(String value) {
            addCriterion("dict_item_value >=", value, "dictItemValue");
            return (Criteria) this;
        }

        public Criteria andDictItemValueLessThan(String value) {
            addCriterion("dict_item_value <", value, "dictItemValue");
            return (Criteria) this;
        }

        public Criteria andDictItemValueLessThanOrEqualTo(String value) {
            addCriterion("dict_item_value <=", value, "dictItemValue");
            return (Criteria) this;
        }

        public Criteria andDictItemValueLike(String value) {
            addCriterion("dict_item_value like", value, "dictItemValue");
            return (Criteria) this;
        }

        public Criteria andDictItemValueNotLike(String value) {
            addCriterion("dict_item_value not like", value, "dictItemValue");
            return (Criteria) this;
        }

        public Criteria andDictItemValueIn(List<String> values) {
            addCriterion("dict_item_value in", values, "dictItemValue");
            return (Criteria) this;
        }

        public Criteria andDictItemValueNotIn(List<String> values) {
            addCriterion("dict_item_value not in", values, "dictItemValue");
            return (Criteria) this;
        }

        public Criteria andDictItemValueBetween(String value1, String value2) {
            addCriterion("dict_item_value between", value1, value2, "dictItemValue");
            return (Criteria) this;
        }

        public Criteria andDictItemValueNotBetween(String value1, String value2) {
            addCriterion("dict_item_value not between", value1, value2, "dictItemValue");
            return (Criteria) this;
        }

        public Criteria andDictTypeIdIsNull() {
            addCriterion("dict_type_id is null");
            return (Criteria) this;
        }

        public Criteria andDictTypeIdIsNotNull() {
            addCriterion("dict_type_id is not null");
            return (Criteria) this;
        }

        public Criteria andDictTypeIdEqualTo(String value) {
            addCriterion("dict_type_id =", value, "dictTypeId");
            return (Criteria) this;
        }

        public Criteria andDictTypeIdNotEqualTo(String value) {
            addCriterion("dict_type_id <>", value, "dictTypeId");
            return (Criteria) this;
        }

        public Criteria andDictTypeIdGreaterThan(String value) {
            addCriterion("dict_type_id >", value, "dictTypeId");
            return (Criteria) this;
        }

        public Criteria andDictTypeIdGreaterThanOrEqualTo(String value) {
            addCriterion("dict_type_id >=", value, "dictTypeId");
            return (Criteria) this;
        }

        public Criteria andDictTypeIdLessThan(String value) {
            addCriterion("dict_type_id <", value, "dictTypeId");
            return (Criteria) this;
        }

        public Criteria andDictTypeIdLessThanOrEqualTo(String value) {
            addCriterion("dict_type_id <=", value, "dictTypeId");
            return (Criteria) this;
        }

        public Criteria andDictTypeIdLike(String value) {
            addCriterion("dict_type_id like", value, "dictTypeId");
            return (Criteria) this;
        }

        public Criteria andDictTypeIdNotLike(String value) {
            addCriterion("dict_type_id not like", value, "dictTypeId");
            return (Criteria) this;
        }

        public Criteria andDictTypeIdIn(List<String> values) {
            addCriterion("dict_type_id in", values, "dictTypeId");
            return (Criteria) this;
        }

        public Criteria andDictTypeIdNotIn(List<String> values) {
            addCriterion("dict_type_id not in", values, "dictTypeId");
            return (Criteria) this;
        }

        public Criteria andDictTypeIdBetween(String value1, String value2) {
            addCriterion("dict_type_id between", value1, value2, "dictTypeId");
            return (Criteria) this;
        }

        public Criteria andDictTypeIdNotBetween(String value1, String value2) {
            addCriterion("dict_type_id not between", value1, value2, "dictTypeId");
            return (Criteria) this;
        }

        public Criteria andParentValueIsNull() {
            addCriterion("parent_value is null");
            return (Criteria) this;
        }

        public Criteria andParentValueIsNotNull() {
            addCriterion("parent_value is not null");
            return (Criteria) this;
        }

        public Criteria andParentValueEqualTo(String value) {
            addCriterion("parent_value =", value, "parentValue");
            return (Criteria) this;
        }

        public Criteria andParentValueNotEqualTo(String value) {
            addCriterion("parent_value <>", value, "parentValue");
            return (Criteria) this;
        }

        public Criteria andParentValueGreaterThan(String value) {
            addCriterion("parent_value >", value, "parentValue");
            return (Criteria) this;
        }

        public Criteria andParentValueGreaterThanOrEqualTo(String value) {
            addCriterion("parent_value >=", value, "parentValue");
            return (Criteria) this;
        }

        public Criteria andParentValueLessThan(String value) {
            addCriterion("parent_value <", value, "parentValue");
            return (Criteria) this;
        }

        public Criteria andParentValueLessThanOrEqualTo(String value) {
            addCriterion("parent_value <=", value, "parentValue");
            return (Criteria) this;
        }

        public Criteria andParentValueLike(String value) {
            addCriterion("parent_value like", value, "parentValue");
            return (Criteria) this;
        }

        public Criteria andParentValueNotLike(String value) {
            addCriterion("parent_value not like", value, "parentValue");
            return (Criteria) this;
        }

        public Criteria andParentValueIn(List<String> values) {
            addCriterion("parent_value in", values, "parentValue");
            return (Criteria) this;
        }

        public Criteria andParentValueNotIn(List<String> values) {
            addCriterion("parent_value not in", values, "parentValue");
            return (Criteria) this;
        }

        public Criteria andParentValueBetween(String value1, String value2) {
            addCriterion("parent_value between", value1, value2, "parentValue");
            return (Criteria) this;
        }

        public Criteria andParentValueNotBetween(String value1, String value2) {
            addCriterion("parent_value not between", value1, value2, "parentValue");
            return (Criteria) this;
        }

        public Criteria andPathIsNull() {
            addCriterion("path is null");
            return (Criteria) this;
        }

        public Criteria andPathIsNotNull() {
            addCriterion("path is not null");
            return (Criteria) this;
        }

        public Criteria andPathEqualTo(String value) {
            addCriterion("path =", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathNotEqualTo(String value) {
            addCriterion("path <>", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathGreaterThan(String value) {
            addCriterion("path >", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathGreaterThanOrEqualTo(String value) {
            addCriterion("path >=", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathLessThan(String value) {
            addCriterion("path <", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathLessThanOrEqualTo(String value) {
            addCriterion("path <=", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathLike(String value) {
            addCriterion("path like", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathNotLike(String value) {
            addCriterion("path not like", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathIn(List<String> values) {
            addCriterion("path in", values, "path");
            return (Criteria) this;
        }

        public Criteria andPathNotIn(List<String> values) {
            addCriterion("path not in", values, "path");
            return (Criteria) this;
        }

        public Criteria andPathBetween(String value1, String value2) {
            addCriterion("path between", value1, value2, "path");
            return (Criteria) this;
        }

        public Criteria andPathNotBetween(String value1, String value2) {
            addCriterion("path not between", value1, value2, "path");
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

        public Criteria andSortIsNull() {
            addCriterion("sort is null");
            return (Criteria) this;
        }

        public Criteria andSortIsNotNull() {
            addCriterion("sort is not null");
            return (Criteria) this;
        }

        public Criteria andSortEqualTo(Integer value) {
            addCriterion("sort =", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotEqualTo(Integer value) {
            addCriterion("sort <>", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortGreaterThan(Integer value) {
            addCriterion("sort >", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortGreaterThanOrEqualTo(Integer value) {
            addCriterion("sort >=", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortLessThan(Integer value) {
            addCriterion("sort <", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortLessThanOrEqualTo(Integer value) {
            addCriterion("sort <=", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortIn(List<Integer> values) {
            addCriterion("sort in", values, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotIn(List<Integer> values) {
            addCriterion("sort not in", values, "sort");
            return (Criteria) this;
        }

        public Criteria andSortBetween(Integer value1, Integer value2) {
            addCriterion("sort between", value1, value2, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotBetween(Integer value1, Integer value2) {
            addCriterion("sort not between", value1, value2, "sort");
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

        public Criteria andStatusEqualTo(Byte value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Byte value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Byte value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Byte value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Byte value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Byte> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Byte> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Byte value1, Byte value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("status not between", value1, value2, "status");
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