package com.pjmike.lundao.po;

import java.util.ArrayList;
import java.util.List;

public class AskconditionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AskconditionExample() {
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

        public Criteria andAskcdidIsNull() {
            addCriterion("askcdId is null");
            return (Criteria) this;
        }

        public Criteria andAskcdidIsNotNull() {
            addCriterion("askcdId is not null");
            return (Criteria) this;
        }

        public Criteria andAskcdidEqualTo(Integer value) {
            addCriterion("askcdId =", value, "askcdid");
            return (Criteria) this;
        }

        public Criteria andAskcdidNotEqualTo(Integer value) {
            addCriterion("askcdId <>", value, "askcdid");
            return (Criteria) this;
        }

        public Criteria andAskcdidGreaterThan(Integer value) {
            addCriterion("askcdId >", value, "askcdid");
            return (Criteria) this;
        }

        public Criteria andAskcdidGreaterThanOrEqualTo(Integer value) {
            addCriterion("askcdId >=", value, "askcdid");
            return (Criteria) this;
        }

        public Criteria andAskcdidLessThan(Integer value) {
            addCriterion("askcdId <", value, "askcdid");
            return (Criteria) this;
        }

        public Criteria andAskcdidLessThanOrEqualTo(Integer value) {
            addCriterion("askcdId <=", value, "askcdid");
            return (Criteria) this;
        }

        public Criteria andAskcdidIn(List<Integer> values) {
            addCriterion("askcdId in", values, "askcdid");
            return (Criteria) this;
        }

        public Criteria andAskcdidNotIn(List<Integer> values) {
            addCriterion("askcdId not in", values, "askcdid");
            return (Criteria) this;
        }

        public Criteria andAskcdidBetween(Integer value1, Integer value2) {
            addCriterion("askcdId between", value1, value2, "askcdid");
            return (Criteria) this;
        }

        public Criteria andAskcdidNotBetween(Integer value1, Integer value2) {
            addCriterion("askcdId not between", value1, value2, "askcdid");
            return (Criteria) this;
        }

        public Criteria andSolveIsNull() {
            addCriterion("solve is null");
            return (Criteria) this;
        }

        public Criteria andSolveIsNotNull() {
            addCriterion("solve is not null");
            return (Criteria) this;
        }

        public Criteria andSolveEqualTo(String value) {
            addCriterion("solve =", value, "solve");
            return (Criteria) this;
        }

        public Criteria andSolveNotEqualTo(String value) {
            addCriterion("solve <>", value, "solve");
            return (Criteria) this;
        }

        public Criteria andSolveGreaterThan(String value) {
            addCriterion("solve >", value, "solve");
            return (Criteria) this;
        }

        public Criteria andSolveGreaterThanOrEqualTo(String value) {
            addCriterion("solve >=", value, "solve");
            return (Criteria) this;
        }

        public Criteria andSolveLessThan(String value) {
            addCriterion("solve <", value, "solve");
            return (Criteria) this;
        }

        public Criteria andSolveLessThanOrEqualTo(String value) {
            addCriterion("solve <=", value, "solve");
            return (Criteria) this;
        }

        public Criteria andSolveLike(String value) {
            addCriterion("solve like", value, "solve");
            return (Criteria) this;
        }

        public Criteria andSolveNotLike(String value) {
            addCriterion("solve not like", value, "solve");
            return (Criteria) this;
        }

        public Criteria andSolveIn(List<String> values) {
            addCriterion("solve in", values, "solve");
            return (Criteria) this;
        }

        public Criteria andSolveNotIn(List<String> values) {
            addCriterion("solve not in", values, "solve");
            return (Criteria) this;
        }

        public Criteria andSolveBetween(String value1, String value2) {
            addCriterion("solve between", value1, value2, "solve");
            return (Criteria) this;
        }

        public Criteria andSolveNotBetween(String value1, String value2) {
            addCriterion("solve not between", value1, value2, "solve");
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