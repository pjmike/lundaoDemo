package com.pjmike.lundao.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ThesisExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ThesisExample() {
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

        public Criteria andThesisidIsNull() {
            addCriterion("thesisId is null");
            return (Criteria) this;
        }

        public Criteria andThesisidIsNotNull() {
            addCriterion("thesisId is not null");
            return (Criteria) this;
        }

        public Criteria andThesisidEqualTo(Integer value) {
            addCriterion("thesisId =", value, "thesisid");
            return (Criteria) this;
        }

        public Criteria andThesisidNotEqualTo(Integer value) {
            addCriterion("thesisId <>", value, "thesisid");
            return (Criteria) this;
        }

        public Criteria andThesisidGreaterThan(Integer value) {
            addCriterion("thesisId >", value, "thesisid");
            return (Criteria) this;
        }

        public Criteria andThesisidGreaterThanOrEqualTo(Integer value) {
            addCriterion("thesisId >=", value, "thesisid");
            return (Criteria) this;
        }

        public Criteria andThesisidLessThan(Integer value) {
            addCriterion("thesisId <", value, "thesisid");
            return (Criteria) this;
        }

        public Criteria andThesisidLessThanOrEqualTo(Integer value) {
            addCriterion("thesisId <=", value, "thesisid");
            return (Criteria) this;
        }

        public Criteria andThesisidIn(List<Integer> values) {
            addCriterion("thesisId in", values, "thesisid");
            return (Criteria) this;
        }

        public Criteria andThesisidNotIn(List<Integer> values) {
            addCriterion("thesisId not in", values, "thesisid");
            return (Criteria) this;
        }

        public Criteria andThesisidBetween(Integer value1, Integer value2) {
            addCriterion("thesisId between", value1, value2, "thesisid");
            return (Criteria) this;
        }

        public Criteria andThesisidNotBetween(Integer value1, Integer value2) {
            addCriterion("thesisId not between", value1, value2, "thesisid");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNull() {
            addCriterion("description is null");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNotNull() {
            addCriterion("description is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptionEqualTo(String value) {
            addCriterion("description =", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotEqualTo(String value) {
            addCriterion("description <>", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThan(String value) {
            addCriterion("description >", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("description >=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThan(String value) {
            addCriterion("description <", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThanOrEqualTo(String value) {
            addCriterion("description <=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLike(String value) {
            addCriterion("description like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotLike(String value) {
            addCriterion("description not like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionIn(List<String> values) {
            addCriterion("description in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotIn(List<String> values) {
            addCriterion("description not in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionBetween(String value1, String value2) {
            addCriterion("description between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotBetween(String value1, String value2) {
            addCriterion("description not between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andViewIsNull() {
            addCriterion("view is null");
            return (Criteria) this;
        }

        public Criteria andViewIsNotNull() {
            addCriterion("view is not null");
            return (Criteria) this;
        }

        public Criteria andViewEqualTo(Integer value) {
            addCriterion("view =", value, "view");
            return (Criteria) this;
        }

        public Criteria andViewNotEqualTo(Integer value) {
            addCriterion("view <>", value, "view");
            return (Criteria) this;
        }

        public Criteria andViewGreaterThan(Integer value) {
            addCriterion("view >", value, "view");
            return (Criteria) this;
        }

        public Criteria andViewGreaterThanOrEqualTo(Integer value) {
            addCriterion("view >=", value, "view");
            return (Criteria) this;
        }

        public Criteria andViewLessThan(Integer value) {
            addCriterion("view <", value, "view");
            return (Criteria) this;
        }

        public Criteria andViewLessThanOrEqualTo(Integer value) {
            addCriterion("view <=", value, "view");
            return (Criteria) this;
        }

        public Criteria andViewIn(List<Integer> values) {
            addCriterion("view in", values, "view");
            return (Criteria) this;
        }

        public Criteria andViewNotIn(List<Integer> values) {
            addCriterion("view not in", values, "view");
            return (Criteria) this;
        }

        public Criteria andViewBetween(Integer value1, Integer value2) {
            addCriterion("view between", value1, value2, "view");
            return (Criteria) this;
        }

        public Criteria andViewNotBetween(Integer value1, Integer value2) {
            addCriterion("view not between", value1, value2, "view");
            return (Criteria) this;
        }

        public Criteria andLikeIsNull() {
            addCriterion("like is null");
            return (Criteria) this;
        }

        public Criteria andLikeIsNotNull() {
            addCriterion("like is not null");
            return (Criteria) this;
        }

        public Criteria andLikeEqualTo(Integer value) {
            addCriterion("like =", value, "like");
            return (Criteria) this;
        }

        public Criteria andLikeNotEqualTo(Integer value) {
            addCriterion("like <>", value, "like");
            return (Criteria) this;
        }

        public Criteria andLikeGreaterThan(Integer value) {
            addCriterion("like >", value, "like");
            return (Criteria) this;
        }

        public Criteria andLikeGreaterThanOrEqualTo(Integer value) {
            addCriterion("like >=", value, "like");
            return (Criteria) this;
        }

        public Criteria andLikeLessThan(Integer value) {
            addCriterion("like <", value, "like");
            return (Criteria) this;
        }

        public Criteria andLikeLessThanOrEqualTo(Integer value) {
            addCriterion("like <=", value, "like");
            return (Criteria) this;
        }

        public Criteria andLikeIn(List<Integer> values) {
            addCriterion("like in", values, "like");
            return (Criteria) this;
        }

        public Criteria andLikeNotIn(List<Integer> values) {
            addCriterion("like not in", values, "like");
            return (Criteria) this;
        }

        public Criteria andLikeBetween(Integer value1, Integer value2) {
            addCriterion("like between", value1, value2, "like");
            return (Criteria) this;
        }

        public Criteria andLikeNotBetween(Integer value1, Integer value2) {
            addCriterion("like not between", value1, value2, "like");
            return (Criteria) this;
        }

        public Criteria andAttentionIsNull() {
            addCriterion("attention is null");
            return (Criteria) this;
        }

        public Criteria andAttentionIsNotNull() {
            addCriterion("attention is not null");
            return (Criteria) this;
        }

        public Criteria andAttentionEqualTo(Integer value) {
            addCriterion("attention =", value, "attention");
            return (Criteria) this;
        }

        public Criteria andAttentionNotEqualTo(Integer value) {
            addCriterion("attention <>", value, "attention");
            return (Criteria) this;
        }

        public Criteria andAttentionGreaterThan(Integer value) {
            addCriterion("attention >", value, "attention");
            return (Criteria) this;
        }

        public Criteria andAttentionGreaterThanOrEqualTo(Integer value) {
            addCriterion("attention >=", value, "attention");
            return (Criteria) this;
        }

        public Criteria andAttentionLessThan(Integer value) {
            addCriterion("attention <", value, "attention");
            return (Criteria) this;
        }

        public Criteria andAttentionLessThanOrEqualTo(Integer value) {
            addCriterion("attention <=", value, "attention");
            return (Criteria) this;
        }

        public Criteria andAttentionIn(List<Integer> values) {
            addCriterion("attention in", values, "attention");
            return (Criteria) this;
        }

        public Criteria andAttentionNotIn(List<Integer> values) {
            addCriterion("attention not in", values, "attention");
            return (Criteria) this;
        }

        public Criteria andAttentionBetween(Integer value1, Integer value2) {
            addCriterion("attention between", value1, value2, "attention");
            return (Criteria) this;
        }

        public Criteria andAttentionNotBetween(Integer value1, Integer value2) {
            addCriterion("attention not between", value1, value2, "attention");
            return (Criteria) this;
        }

        public Criteria andDislikeIsNull() {
            addCriterion("dislike is null");
            return (Criteria) this;
        }

        public Criteria andDislikeIsNotNull() {
            addCriterion("dislike is not null");
            return (Criteria) this;
        }

        public Criteria andDislikeEqualTo(Integer value) {
            addCriterion("dislike =", value, "dislike");
            return (Criteria) this;
        }

        public Criteria andDislikeNotEqualTo(Integer value) {
            addCriterion("dislike <>", value, "dislike");
            return (Criteria) this;
        }

        public Criteria andDislikeGreaterThan(Integer value) {
            addCriterion("dislike >", value, "dislike");
            return (Criteria) this;
        }

        public Criteria andDislikeGreaterThanOrEqualTo(Integer value) {
            addCriterion("dislike >=", value, "dislike");
            return (Criteria) this;
        }

        public Criteria andDislikeLessThan(Integer value) {
            addCriterion("dislike <", value, "dislike");
            return (Criteria) this;
        }

        public Criteria andDislikeLessThanOrEqualTo(Integer value) {
            addCriterion("dislike <=", value, "dislike");
            return (Criteria) this;
        }

        public Criteria andDislikeIn(List<Integer> values) {
            addCriterion("dislike in", values, "dislike");
            return (Criteria) this;
        }

        public Criteria andDislikeNotIn(List<Integer> values) {
            addCriterion("dislike not in", values, "dislike");
            return (Criteria) this;
        }

        public Criteria andDislikeBetween(Integer value1, Integer value2) {
            addCriterion("dislike between", value1, value2, "dislike");
            return (Criteria) this;
        }

        public Criteria andDislikeNotBetween(Integer value1, Integer value2) {
            addCriterion("dislike not between", value1, value2, "dislike");
            return (Criteria) this;
        }

        public Criteria andAskIsNull() {
            addCriterion("ask is null");
            return (Criteria) this;
        }

        public Criteria andAskIsNotNull() {
            addCriterion("ask is not null");
            return (Criteria) this;
        }

        public Criteria andAskEqualTo(Integer value) {
            addCriterion("ask =", value, "ask");
            return (Criteria) this;
        }

        public Criteria andAskNotEqualTo(Integer value) {
            addCriterion("ask <>", value, "ask");
            return (Criteria) this;
        }

        public Criteria andAskGreaterThan(Integer value) {
            addCriterion("ask >", value, "ask");
            return (Criteria) this;
        }

        public Criteria andAskGreaterThanOrEqualTo(Integer value) {
            addCriterion("ask >=", value, "ask");
            return (Criteria) this;
        }

        public Criteria andAskLessThan(Integer value) {
            addCriterion("ask <", value, "ask");
            return (Criteria) this;
        }

        public Criteria andAskLessThanOrEqualTo(Integer value) {
            addCriterion("ask <=", value, "ask");
            return (Criteria) this;
        }

        public Criteria andAskIn(List<Integer> values) {
            addCriterion("ask in", values, "ask");
            return (Criteria) this;
        }

        public Criteria andAskNotIn(List<Integer> values) {
            addCriterion("ask not in", values, "ask");
            return (Criteria) this;
        }

        public Criteria andAskBetween(Integer value1, Integer value2) {
            addCriterion("ask between", value1, value2, "ask");
            return (Criteria) this;
        }

        public Criteria andAskNotBetween(Integer value1, Integer value2) {
            addCriterion("ask not between", value1, value2, "ask");
            return (Criteria) this;
        }

        public Criteria andQuestionIsNull() {
            addCriterion("question is null");
            return (Criteria) this;
        }

        public Criteria andQuestionIsNotNull() {
            addCriterion("question is not null");
            return (Criteria) this;
        }

        public Criteria andQuestionEqualTo(Integer value) {
            addCriterion("question =", value, "question");
            return (Criteria) this;
        }

        public Criteria andQuestionNotEqualTo(Integer value) {
            addCriterion("question <>", value, "question");
            return (Criteria) this;
        }

        public Criteria andQuestionGreaterThan(Integer value) {
            addCriterion("question >", value, "question");
            return (Criteria) this;
        }

        public Criteria andQuestionGreaterThanOrEqualTo(Integer value) {
            addCriterion("question >=", value, "question");
            return (Criteria) this;
        }

        public Criteria andQuestionLessThan(Integer value) {
            addCriterion("question <", value, "question");
            return (Criteria) this;
        }

        public Criteria andQuestionLessThanOrEqualTo(Integer value) {
            addCriterion("question <=", value, "question");
            return (Criteria) this;
        }

        public Criteria andQuestionIn(List<Integer> values) {
            addCriterion("question in", values, "question");
            return (Criteria) this;
        }

        public Criteria andQuestionNotIn(List<Integer> values) {
            addCriterion("question not in", values, "question");
            return (Criteria) this;
        }

        public Criteria andQuestionBetween(Integer value1, Integer value2) {
            addCriterion("question between", value1, value2, "question");
            return (Criteria) this;
        }

        public Criteria andQuestionNotBetween(Integer value1, Integer value2) {
            addCriterion("question not between", value1, value2, "question");
            return (Criteria) this;
        }

        public Criteria andAsklistIsNull() {
            addCriterion("asklist is null");
            return (Criteria) this;
        }

        public Criteria andAsklistIsNotNull() {
            addCriterion("asklist is not null");
            return (Criteria) this;
        }

        public Criteria andAsklistEqualTo(Integer value) {
            addCriterion("asklist =", value, "asklist");
            return (Criteria) this;
        }

        public Criteria andAsklistNotEqualTo(Integer value) {
            addCriterion("asklist <>", value, "asklist");
            return (Criteria) this;
        }

        public Criteria andAsklistGreaterThan(Integer value) {
            addCriterion("asklist >", value, "asklist");
            return (Criteria) this;
        }

        public Criteria andAsklistGreaterThanOrEqualTo(Integer value) {
            addCriterion("asklist >=", value, "asklist");
            return (Criteria) this;
        }

        public Criteria andAsklistLessThan(Integer value) {
            addCriterion("asklist <", value, "asklist");
            return (Criteria) this;
        }

        public Criteria andAsklistLessThanOrEqualTo(Integer value) {
            addCriterion("asklist <=", value, "asklist");
            return (Criteria) this;
        }

        public Criteria andAsklistIn(List<Integer> values) {
            addCriterion("asklist in", values, "asklist");
            return (Criteria) this;
        }

        public Criteria andAsklistNotIn(List<Integer> values) {
            addCriterion("asklist not in", values, "asklist");
            return (Criteria) this;
        }

        public Criteria andAsklistBetween(Integer value1, Integer value2) {
            addCriterion("asklist between", value1, value2, "asklist");
            return (Criteria) this;
        }

        public Criteria andAsklistNotBetween(Integer value1, Integer value2) {
            addCriterion("asklist not between", value1, value2, "asklist");
            return (Criteria) this;
        }

        public Criteria andQuestionlistIsNull() {
            addCriterion("questionlist is null");
            return (Criteria) this;
        }

        public Criteria andQuestionlistIsNotNull() {
            addCriterion("questionlist is not null");
            return (Criteria) this;
        }

        public Criteria andQuestionlistEqualTo(Integer value) {
            addCriterion("questionlist =", value, "questionlist");
            return (Criteria) this;
        }

        public Criteria andQuestionlistNotEqualTo(Integer value) {
            addCriterion("questionlist <>", value, "questionlist");
            return (Criteria) this;
        }

        public Criteria andQuestionlistGreaterThan(Integer value) {
            addCriterion("questionlist >", value, "questionlist");
            return (Criteria) this;
        }

        public Criteria andQuestionlistGreaterThanOrEqualTo(Integer value) {
            addCriterion("questionlist >=", value, "questionlist");
            return (Criteria) this;
        }

        public Criteria andQuestionlistLessThan(Integer value) {
            addCriterion("questionlist <", value, "questionlist");
            return (Criteria) this;
        }

        public Criteria andQuestionlistLessThanOrEqualTo(Integer value) {
            addCriterion("questionlist <=", value, "questionlist");
            return (Criteria) this;
        }

        public Criteria andQuestionlistIn(List<Integer> values) {
            addCriterion("questionlist in", values, "questionlist");
            return (Criteria) this;
        }

        public Criteria andQuestionlistNotIn(List<Integer> values) {
            addCriterion("questionlist not in", values, "questionlist");
            return (Criteria) this;
        }

        public Criteria andQuestionlistBetween(Integer value1, Integer value2) {
            addCriterion("questionlist between", value1, value2, "questionlist");
            return (Criteria) this;
        }

        public Criteria andQuestionlistNotBetween(Integer value1, Integer value2) {
            addCriterion("questionlist not between", value1, value2, "questionlist");
            return (Criteria) this;
        }

        public Criteria andPublishtimeIsNull() {
            addCriterion("publishTime is null");
            return (Criteria) this;
        }

        public Criteria andPublishtimeIsNotNull() {
            addCriterion("publishTime is not null");
            return (Criteria) this;
        }

        public Criteria andPublishtimeEqualTo(Date value) {
            addCriterion("publishTime =", value, "publishtime");
            return (Criteria) this;
        }

        public Criteria andPublishtimeNotEqualTo(Date value) {
            addCriterion("publishTime <>", value, "publishtime");
            return (Criteria) this;
        }

        public Criteria andPublishtimeGreaterThan(Date value) {
            addCriterion("publishTime >", value, "publishtime");
            return (Criteria) this;
        }

        public Criteria andPublishtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("publishTime >=", value, "publishtime");
            return (Criteria) this;
        }

        public Criteria andPublishtimeLessThan(Date value) {
            addCriterion("publishTime <", value, "publishtime");
            return (Criteria) this;
        }

        public Criteria andPublishtimeLessThanOrEqualTo(Date value) {
            addCriterion("publishTime <=", value, "publishtime");
            return (Criteria) this;
        }

        public Criteria andPublishtimeIn(List<Date> values) {
            addCriterion("publishTime in", values, "publishtime");
            return (Criteria) this;
        }

        public Criteria andPublishtimeNotIn(List<Date> values) {
            addCriterion("publishTime not in", values, "publishtime");
            return (Criteria) this;
        }

        public Criteria andPublishtimeBetween(Date value1, Date value2) {
            addCriterion("publishTime between", value1, value2, "publishtime");
            return (Criteria) this;
        }

        public Criteria andPublishtimeNotBetween(Date value1, Date value2) {
            addCriterion("publishTime not between", value1, value2, "publishtime");
            return (Criteria) this;
        }

        public Criteria andContenttimeIsNull() {
            addCriterion("contentTime is null");
            return (Criteria) this;
        }

        public Criteria andContenttimeIsNotNull() {
            addCriterion("contentTime is not null");
            return (Criteria) this;
        }

        public Criteria andContenttimeEqualTo(Date value) {
            addCriterion("contentTime =", value, "contenttime");
            return (Criteria) this;
        }

        public Criteria andContenttimeNotEqualTo(Date value) {
            addCriterion("contentTime <>", value, "contenttime");
            return (Criteria) this;
        }

        public Criteria andContenttimeGreaterThan(Date value) {
            addCriterion("contentTime >", value, "contenttime");
            return (Criteria) this;
        }

        public Criteria andContenttimeGreaterThanOrEqualTo(Date value) {
            addCriterion("contentTime >=", value, "contenttime");
            return (Criteria) this;
        }

        public Criteria andContenttimeLessThan(Date value) {
            addCriterion("contentTime <", value, "contenttime");
            return (Criteria) this;
        }

        public Criteria andContenttimeLessThanOrEqualTo(Date value) {
            addCriterion("contentTime <=", value, "contenttime");
            return (Criteria) this;
        }

        public Criteria andContenttimeIn(List<Date> values) {
            addCriterion("contentTime in", values, "contenttime");
            return (Criteria) this;
        }

        public Criteria andContenttimeNotIn(List<Date> values) {
            addCriterion("contentTime not in", values, "contenttime");
            return (Criteria) this;
        }

        public Criteria andContenttimeBetween(Date value1, Date value2) {
            addCriterion("contentTime between", value1, value2, "contenttime");
            return (Criteria) this;
        }

        public Criteria andContenttimeNotBetween(Date value1, Date value2) {
            addCriterion("contentTime not between", value1, value2, "contenttime");
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

        public Criteria andCompleteEqualTo(Integer value) {
            addCriterion("complete =", value, "complete");
            return (Criteria) this;
        }

        public Criteria andCompleteNotEqualTo(Integer value) {
            addCriterion("complete <>", value, "complete");
            return (Criteria) this;
        }

        public Criteria andCompleteGreaterThan(Integer value) {
            addCriterion("complete >", value, "complete");
            return (Criteria) this;
        }

        public Criteria andCompleteGreaterThanOrEqualTo(Integer value) {
            addCriterion("complete >=", value, "complete");
            return (Criteria) this;
        }

        public Criteria andCompleteLessThan(Integer value) {
            addCriterion("complete <", value, "complete");
            return (Criteria) this;
        }

        public Criteria andCompleteLessThanOrEqualTo(Integer value) {
            addCriterion("complete <=", value, "complete");
            return (Criteria) this;
        }

        public Criteria andCompleteIn(List<Integer> values) {
            addCriterion("complete in", values, "complete");
            return (Criteria) this;
        }

        public Criteria andCompleteNotIn(List<Integer> values) {
            addCriterion("complete not in", values, "complete");
            return (Criteria) this;
        }

        public Criteria andCompleteBetween(Integer value1, Integer value2) {
            addCriterion("complete between", value1, value2, "complete");
            return (Criteria) this;
        }

        public Criteria andCompleteNotBetween(Integer value1, Integer value2) {
            addCriterion("complete not between", value1, value2, "complete");
            return (Criteria) this;
        }

        public Criteria andUncompleteIsNull() {
            addCriterion("uncomplete is null");
            return (Criteria) this;
        }

        public Criteria andUncompleteIsNotNull() {
            addCriterion("uncomplete is not null");
            return (Criteria) this;
        }

        public Criteria andUncompleteEqualTo(Integer value) {
            addCriterion("uncomplete =", value, "uncomplete");
            return (Criteria) this;
        }

        public Criteria andUncompleteNotEqualTo(Integer value) {
            addCriterion("uncomplete <>", value, "uncomplete");
            return (Criteria) this;
        }

        public Criteria andUncompleteGreaterThan(Integer value) {
            addCriterion("uncomplete >", value, "uncomplete");
            return (Criteria) this;
        }

        public Criteria andUncompleteGreaterThanOrEqualTo(Integer value) {
            addCriterion("uncomplete >=", value, "uncomplete");
            return (Criteria) this;
        }

        public Criteria andUncompleteLessThan(Integer value) {
            addCriterion("uncomplete <", value, "uncomplete");
            return (Criteria) this;
        }

        public Criteria andUncompleteLessThanOrEqualTo(Integer value) {
            addCriterion("uncomplete <=", value, "uncomplete");
            return (Criteria) this;
        }

        public Criteria andUncompleteIn(List<Integer> values) {
            addCriterion("uncomplete in", values, "uncomplete");
            return (Criteria) this;
        }

        public Criteria andUncompleteNotIn(List<Integer> values) {
            addCriterion("uncomplete not in", values, "uncomplete");
            return (Criteria) this;
        }

        public Criteria andUncompleteBetween(Integer value1, Integer value2) {
            addCriterion("uncomplete between", value1, value2, "uncomplete");
            return (Criteria) this;
        }

        public Criteria andUncompleteNotBetween(Integer value1, Integer value2) {
            addCriterion("uncomplete not between", value1, value2, "uncomplete");
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