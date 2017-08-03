package com.pjmike.lundao.po;

import java.util.ArrayList;
import java.util.List;

public class QuesconditionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public QuesconditionExample() {
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

        public Criteria andQuesidIsNull() {
            addCriterion("quesId is null");
            return (Criteria) this;
        }

        public Criteria andQuesidIsNotNull() {
            addCriterion("quesId is not null");
            return (Criteria) this;
        }

        public Criteria andQuesidEqualTo(Integer value) {
            addCriterion("quesId =", value, "quesid");
            return (Criteria) this;
        }

        public Criteria andQuesidNotEqualTo(Integer value) {
            addCriterion("quesId <>", value, "quesid");
            return (Criteria) this;
        }

        public Criteria andQuesidGreaterThan(Integer value) {
            addCriterion("quesId >", value, "quesid");
            return (Criteria) this;
        }

        public Criteria andQuesidGreaterThanOrEqualTo(Integer value) {
            addCriterion("quesId >=", value, "quesid");
            return (Criteria) this;
        }

        public Criteria andQuesidLessThan(Integer value) {
            addCriterion("quesId <", value, "quesid");
            return (Criteria) this;
        }

        public Criteria andQuesidLessThanOrEqualTo(Integer value) {
            addCriterion("quesId <=", value, "quesid");
            return (Criteria) this;
        }

        public Criteria andQuesidIn(List<Integer> values) {
            addCriterion("quesId in", values, "quesid");
            return (Criteria) this;
        }

        public Criteria andQuesidNotIn(List<Integer> values) {
            addCriterion("quesId not in", values, "quesid");
            return (Criteria) this;
        }

        public Criteria andQuesidBetween(Integer value1, Integer value2) {
            addCriterion("quesId between", value1, value2, "quesid");
            return (Criteria) this;
        }

        public Criteria andQuesidNotBetween(Integer value1, Integer value2) {
            addCriterion("quesId not between", value1, value2, "quesid");
            return (Criteria) this;
        }

        public Criteria andAcceptIsNull() {
            addCriterion("accept is null");
            return (Criteria) this;
        }

        public Criteria andAcceptIsNotNull() {
            addCriterion("accept is not null");
            return (Criteria) this;
        }

        public Criteria andAcceptEqualTo(String value) {
            addCriterion("accept =", value, "accept");
            return (Criteria) this;
        }

        public Criteria andAcceptNotEqualTo(String value) {
            addCriterion("accept <>", value, "accept");
            return (Criteria) this;
        }

        public Criteria andAcceptGreaterThan(String value) {
            addCriterion("accept >", value, "accept");
            return (Criteria) this;
        }

        public Criteria andAcceptGreaterThanOrEqualTo(String value) {
            addCriterion("accept >=", value, "accept");
            return (Criteria) this;
        }

        public Criteria andAcceptLessThan(String value) {
            addCriterion("accept <", value, "accept");
            return (Criteria) this;
        }

        public Criteria andAcceptLessThanOrEqualTo(String value) {
            addCriterion("accept <=", value, "accept");
            return (Criteria) this;
        }

        public Criteria andAcceptLike(String value) {
            addCriterion("accept like", value, "accept");
            return (Criteria) this;
        }

        public Criteria andAcceptNotLike(String value) {
            addCriterion("accept not like", value, "accept");
            return (Criteria) this;
        }

        public Criteria andAcceptIn(List<String> values) {
            addCriterion("accept in", values, "accept");
            return (Criteria) this;
        }

        public Criteria andAcceptNotIn(List<String> values) {
            addCriterion("accept not in", values, "accept");
            return (Criteria) this;
        }

        public Criteria andAcceptBetween(String value1, String value2) {
            addCriterion("accept between", value1, value2, "accept");
            return (Criteria) this;
        }

        public Criteria andAcceptNotBetween(String value1, String value2) {
            addCriterion("accept not between", value1, value2, "accept");
            return (Criteria) this;
        }

        public Criteria andCompleteIsNull() {
            addCriterion("complete is null");
            return (Criteria) this;
        }

        public Criteria andCompleteIsNotNull() {
            addCriterion("complete is not null");
            return (Criteria) this;
        }

        public Criteria andCompleteEqualTo(String value) {
            addCriterion("complete =", value, "complete");
            return (Criteria) this;
        }

        public Criteria andCompleteNotEqualTo(String value) {
            addCriterion("complete <>", value, "complete");
            return (Criteria) this;
        }

        public Criteria andCompleteGreaterThan(String value) {
            addCriterion("complete >", value, "complete");
            return (Criteria) this;
        }

        public Criteria andCompleteGreaterThanOrEqualTo(String value) {
            addCriterion("complete >=", value, "complete");
            return (Criteria) this;
        }

        public Criteria andCompleteLessThan(String value) {
            addCriterion("complete <", value, "complete");
            return (Criteria) this;
        }

        public Criteria andCompleteLessThanOrEqualTo(String value) {
            addCriterion("complete <=", value, "complete");
            return (Criteria) this;
        }

        public Criteria andCompleteLike(String value) {
            addCriterion("complete like", value, "complete");
            return (Criteria) this;
        }

        public Criteria andCompleteNotLike(String value) {
            addCriterion("complete not like", value, "complete");
            return (Criteria) this;
        }

        public Criteria andCompleteIn(List<String> values) {
            addCriterion("complete in", values, "complete");
            return (Criteria) this;
        }

        public Criteria andCompleteNotIn(List<String> values) {
            addCriterion("complete not in", values, "complete");
            return (Criteria) this;
        }

        public Criteria andCompleteBetween(String value1, String value2) {
            addCriterion("complete between", value1, value2, "complete");
            return (Criteria) this;
        }

        public Criteria andCompleteNotBetween(String value1, String value2) {
            addCriterion("complete not between", value1, value2, "complete");
            return (Criteria) this;
        }

        public Criteria andDiscussIsNull() {
            addCriterion("discuss is null");
            return (Criteria) this;
        }

        public Criteria andDiscussIsNotNull() {
            addCriterion("discuss is not null");
            return (Criteria) this;
        }

        public Criteria andDiscussEqualTo(String value) {
            addCriterion("discuss =", value, "discuss");
            return (Criteria) this;
        }

        public Criteria andDiscussNotEqualTo(String value) {
            addCriterion("discuss <>", value, "discuss");
            return (Criteria) this;
        }

        public Criteria andDiscussGreaterThan(String value) {
            addCriterion("discuss >", value, "discuss");
            return (Criteria) this;
        }

        public Criteria andDiscussGreaterThanOrEqualTo(String value) {
            addCriterion("discuss >=", value, "discuss");
            return (Criteria) this;
        }

        public Criteria andDiscussLessThan(String value) {
            addCriterion("discuss <", value, "discuss");
            return (Criteria) this;
        }

        public Criteria andDiscussLessThanOrEqualTo(String value) {
            addCriterion("discuss <=", value, "discuss");
            return (Criteria) this;
        }

        public Criteria andDiscussLike(String value) {
            addCriterion("discuss like", value, "discuss");
            return (Criteria) this;
        }

        public Criteria andDiscussNotLike(String value) {
            addCriterion("discuss not like", value, "discuss");
            return (Criteria) this;
        }

        public Criteria andDiscussIn(List<String> values) {
            addCriterion("discuss in", values, "discuss");
            return (Criteria) this;
        }

        public Criteria andDiscussNotIn(List<String> values) {
            addCriterion("discuss not in", values, "discuss");
            return (Criteria) this;
        }

        public Criteria andDiscussBetween(String value1, String value2) {
            addCriterion("discuss between", value1, value2, "discuss");
            return (Criteria) this;
        }

        public Criteria andDiscussNotBetween(String value1, String value2) {
            addCriterion("discuss not between", value1, value2, "discuss");
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