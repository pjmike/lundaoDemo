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

        public Criteria andTDebateidIsNull() {
            addCriterion("t_debateId is null");
            return (Criteria) this;
        }

        public Criteria andTDebateidIsNotNull() {
            addCriterion("t_debateId is not null");
            return (Criteria) this;
        }

        public Criteria andTDebateidEqualTo(Integer value) {
            addCriterion("t_debateId =", value, "tDebateid");
            return (Criteria) this;
        }

        public Criteria andTDebateidNotEqualTo(Integer value) {
            addCriterion("t_debateId <>", value, "tDebateid");
            return (Criteria) this;
        }

        public Criteria andTDebateidGreaterThan(Integer value) {
            addCriterion("t_debateId >", value, "tDebateid");
            return (Criteria) this;
        }

        public Criteria andTDebateidGreaterThanOrEqualTo(Integer value) {
            addCriterion("t_debateId >=", value, "tDebateid");
            return (Criteria) this;
        }

        public Criteria andTDebateidLessThan(Integer value) {
            addCriterion("t_debateId <", value, "tDebateid");
            return (Criteria) this;
        }

        public Criteria andTDebateidLessThanOrEqualTo(Integer value) {
            addCriterion("t_debateId <=", value, "tDebateid");
            return (Criteria) this;
        }

        public Criteria andTDebateidIn(List<Integer> values) {
            addCriterion("t_debateId in", values, "tDebateid");
            return (Criteria) this;
        }

        public Criteria andTDebateidNotIn(List<Integer> values) {
            addCriterion("t_debateId not in", values, "tDebateid");
            return (Criteria) this;
        }

        public Criteria andTDebateidBetween(Integer value1, Integer value2) {
            addCriterion("t_debateId between", value1, value2, "tDebateid");
            return (Criteria) this;
        }

        public Criteria andTDebateidNotBetween(Integer value1, Integer value2) {
            addCriterion("t_debateId not between", value1, value2, "tDebateid");
            return (Criteria) this;
        }

        public Criteria andTDescriptionIsNull() {
            addCriterion("t_description is null");
            return (Criteria) this;
        }

        public Criteria andTDescriptionIsNotNull() {
            addCriterion("t_description is not null");
            return (Criteria) this;
        }

        public Criteria andTDescriptionEqualTo(String value) {
            addCriterion("t_description =", value, "tDescription");
            return (Criteria) this;
        }

        public Criteria andTDescriptionNotEqualTo(String value) {
            addCriterion("t_description <>", value, "tDescription");
            return (Criteria) this;
        }

        public Criteria andTDescriptionGreaterThan(String value) {
            addCriterion("t_description >", value, "tDescription");
            return (Criteria) this;
        }

        public Criteria andTDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("t_description >=", value, "tDescription");
            return (Criteria) this;
        }

        public Criteria andTDescriptionLessThan(String value) {
            addCriterion("t_description <", value, "tDescription");
            return (Criteria) this;
        }

        public Criteria andTDescriptionLessThanOrEqualTo(String value) {
            addCriterion("t_description <=", value, "tDescription");
            return (Criteria) this;
        }

        public Criteria andTDescriptionLike(String value) {
            addCriterion("t_description like", value, "tDescription");
            return (Criteria) this;
        }

        public Criteria andTDescriptionNotLike(String value) {
            addCriterion("t_description not like", value, "tDescription");
            return (Criteria) this;
        }

        public Criteria andTDescriptionIn(List<String> values) {
            addCriterion("t_description in", values, "tDescription");
            return (Criteria) this;
        }

        public Criteria andTDescriptionNotIn(List<String> values) {
            addCriterion("t_description not in", values, "tDescription");
            return (Criteria) this;
        }

        public Criteria andTDescriptionBetween(String value1, String value2) {
            addCriterion("t_description between", value1, value2, "tDescription");
            return (Criteria) this;
        }

        public Criteria andTDescriptionNotBetween(String value1, String value2) {
            addCriterion("t_description not between", value1, value2, "tDescription");
            return (Criteria) this;
        }

        public Criteria andTViewIsNull() {
            addCriterion("t_view is null");
            return (Criteria) this;
        }

        public Criteria andTViewIsNotNull() {
            addCriterion("t_view is not null");
            return (Criteria) this;
        }

        public Criteria andTViewEqualTo(Integer value) {
            addCriterion("t_view =", value, "tView");
            return (Criteria) this;
        }

        public Criteria andTViewNotEqualTo(Integer value) {
            addCriterion("t_view <>", value, "tView");
            return (Criteria) this;
        }

        public Criteria andTViewGreaterThan(Integer value) {
            addCriterion("t_view >", value, "tView");
            return (Criteria) this;
        }

        public Criteria andTViewGreaterThanOrEqualTo(Integer value) {
            addCriterion("t_view >=", value, "tView");
            return (Criteria) this;
        }

        public Criteria andTViewLessThan(Integer value) {
            addCriterion("t_view <", value, "tView");
            return (Criteria) this;
        }

        public Criteria andTViewLessThanOrEqualTo(Integer value) {
            addCriterion("t_view <=", value, "tView");
            return (Criteria) this;
        }

        public Criteria andTViewIn(List<Integer> values) {
            addCriterion("t_view in", values, "tView");
            return (Criteria) this;
        }

        public Criteria andTViewNotIn(List<Integer> values) {
            addCriterion("t_view not in", values, "tView");
            return (Criteria) this;
        }

        public Criteria andTViewBetween(Integer value1, Integer value2) {
            addCriterion("t_view between", value1, value2, "tView");
            return (Criteria) this;
        }

        public Criteria andTViewNotBetween(Integer value1, Integer value2) {
            addCriterion("t_view not between", value1, value2, "tView");
            return (Criteria) this;
        }

        public Criteria andTLikeIsNull() {
            addCriterion("t_like is null");
            return (Criteria) this;
        }

        public Criteria andTLikeIsNotNull() {
            addCriterion("t_like is not null");
            return (Criteria) this;
        }

        public Criteria andTLikeEqualTo(Integer value) {
            addCriterion("t_like =", value, "tLike");
            return (Criteria) this;
        }

        public Criteria andTLikeNotEqualTo(Integer value) {
            addCriterion("t_like <>", value, "tLike");
            return (Criteria) this;
        }

        public Criteria andTLikeGreaterThan(Integer value) {
            addCriterion("t_like >", value, "tLike");
            return (Criteria) this;
        }

        public Criteria andTLikeGreaterThanOrEqualTo(Integer value) {
            addCriterion("t_like >=", value, "tLike");
            return (Criteria) this;
        }

        public Criteria andTLikeLessThan(Integer value) {
            addCriterion("t_like <", value, "tLike");
            return (Criteria) this;
        }

        public Criteria andTLikeLessThanOrEqualTo(Integer value) {
            addCriterion("t_like <=", value, "tLike");
            return (Criteria) this;
        }

        public Criteria andTLikeIn(List<Integer> values) {
            addCriterion("t_like in", values, "tLike");
            return (Criteria) this;
        }

        public Criteria andTLikeNotIn(List<Integer> values) {
            addCriterion("t_like not in", values, "tLike");
            return (Criteria) this;
        }

        public Criteria andTLikeBetween(Integer value1, Integer value2) {
            addCriterion("t_like between", value1, value2, "tLike");
            return (Criteria) this;
        }

        public Criteria andTLikeNotBetween(Integer value1, Integer value2) {
            addCriterion("t_like not between", value1, value2, "tLike");
            return (Criteria) this;
        }

        public Criteria andTAttentionIsNull() {
            addCriterion("t_attention is null");
            return (Criteria) this;
        }

        public Criteria andTAttentionIsNotNull() {
            addCriterion("t_attention is not null");
            return (Criteria) this;
        }

        public Criteria andTAttentionEqualTo(Integer value) {
            addCriterion("t_attention =", value, "tAttention");
            return (Criteria) this;
        }

        public Criteria andTAttentionNotEqualTo(Integer value) {
            addCriterion("t_attention <>", value, "tAttention");
            return (Criteria) this;
        }

        public Criteria andTAttentionGreaterThan(Integer value) {
            addCriterion("t_attention >", value, "tAttention");
            return (Criteria) this;
        }

        public Criteria andTAttentionGreaterThanOrEqualTo(Integer value) {
            addCriterion("t_attention >=", value, "tAttention");
            return (Criteria) this;
        }

        public Criteria andTAttentionLessThan(Integer value) {
            addCriterion("t_attention <", value, "tAttention");
            return (Criteria) this;
        }

        public Criteria andTAttentionLessThanOrEqualTo(Integer value) {
            addCriterion("t_attention <=", value, "tAttention");
            return (Criteria) this;
        }

        public Criteria andTAttentionIn(List<Integer> values) {
            addCriterion("t_attention in", values, "tAttention");
            return (Criteria) this;
        }

        public Criteria andTAttentionNotIn(List<Integer> values) {
            addCriterion("t_attention not in", values, "tAttention");
            return (Criteria) this;
        }

        public Criteria andTAttentionBetween(Integer value1, Integer value2) {
            addCriterion("t_attention between", value1, value2, "tAttention");
            return (Criteria) this;
        }

        public Criteria andTAttentionNotBetween(Integer value1, Integer value2) {
            addCriterion("t_attention not between", value1, value2, "tAttention");
            return (Criteria) this;
        }

        public Criteria andTDislikeIsNull() {
            addCriterion("t_dislike is null");
            return (Criteria) this;
        }

        public Criteria andTDislikeIsNotNull() {
            addCriterion("t_dislike is not null");
            return (Criteria) this;
        }

        public Criteria andTDislikeEqualTo(Integer value) {
            addCriterion("t_dislike =", value, "tDislike");
            return (Criteria) this;
        }

        public Criteria andTDislikeNotEqualTo(Integer value) {
            addCriterion("t_dislike <>", value, "tDislike");
            return (Criteria) this;
        }

        public Criteria andTDislikeGreaterThan(Integer value) {
            addCriterion("t_dislike >", value, "tDislike");
            return (Criteria) this;
        }

        public Criteria andTDislikeGreaterThanOrEqualTo(Integer value) {
            addCriterion("t_dislike >=", value, "tDislike");
            return (Criteria) this;
        }

        public Criteria andTDislikeLessThan(Integer value) {
            addCriterion("t_dislike <", value, "tDislike");
            return (Criteria) this;
        }

        public Criteria andTDislikeLessThanOrEqualTo(Integer value) {
            addCriterion("t_dislike <=", value, "tDislike");
            return (Criteria) this;
        }

        public Criteria andTDislikeIn(List<Integer> values) {
            addCriterion("t_dislike in", values, "tDislike");
            return (Criteria) this;
        }

        public Criteria andTDislikeNotIn(List<Integer> values) {
            addCriterion("t_dislike not in", values, "tDislike");
            return (Criteria) this;
        }

        public Criteria andTDislikeBetween(Integer value1, Integer value2) {
            addCriterion("t_dislike between", value1, value2, "tDislike");
            return (Criteria) this;
        }

        public Criteria andTDislikeNotBetween(Integer value1, Integer value2) {
            addCriterion("t_dislike not between", value1, value2, "tDislike");
            return (Criteria) this;
        }

        public Criteria andTAskIsNull() {
            addCriterion("t_ask is null");
            return (Criteria) this;
        }

        public Criteria andTAskIsNotNull() {
            addCriterion("t_ask is not null");
            return (Criteria) this;
        }

        public Criteria andTAskEqualTo(Integer value) {
            addCriterion("t_ask =", value, "tAsk");
            return (Criteria) this;
        }

        public Criteria andTAskNotEqualTo(Integer value) {
            addCriterion("t_ask <>", value, "tAsk");
            return (Criteria) this;
        }

        public Criteria andTAskGreaterThan(Integer value) {
            addCriterion("t_ask >", value, "tAsk");
            return (Criteria) this;
        }

        public Criteria andTAskGreaterThanOrEqualTo(Integer value) {
            addCriterion("t_ask >=", value, "tAsk");
            return (Criteria) this;
        }

        public Criteria andTAskLessThan(Integer value) {
            addCriterion("t_ask <", value, "tAsk");
            return (Criteria) this;
        }

        public Criteria andTAskLessThanOrEqualTo(Integer value) {
            addCriterion("t_ask <=", value, "tAsk");
            return (Criteria) this;
        }

        public Criteria andTAskIn(List<Integer> values) {
            addCriterion("t_ask in", values, "tAsk");
            return (Criteria) this;
        }

        public Criteria andTAskNotIn(List<Integer> values) {
            addCriterion("t_ask not in", values, "tAsk");
            return (Criteria) this;
        }

        public Criteria andTAskBetween(Integer value1, Integer value2) {
            addCriterion("t_ask between", value1, value2, "tAsk");
            return (Criteria) this;
        }

        public Criteria andTAskNotBetween(Integer value1, Integer value2) {
            addCriterion("t_ask not between", value1, value2, "tAsk");
            return (Criteria) this;
        }

        public Criteria andTQuestionIsNull() {
            addCriterion("t_question is null");
            return (Criteria) this;
        }

        public Criteria andTQuestionIsNotNull() {
            addCriterion("t_question is not null");
            return (Criteria) this;
        }

        public Criteria andTQuestionEqualTo(Integer value) {
            addCriterion("t_question =", value, "tQuestion");
            return (Criteria) this;
        }

        public Criteria andTQuestionNotEqualTo(Integer value) {
            addCriterion("t_question <>", value, "tQuestion");
            return (Criteria) this;
        }

        public Criteria andTQuestionGreaterThan(Integer value) {
            addCriterion("t_question >", value, "tQuestion");
            return (Criteria) this;
        }

        public Criteria andTQuestionGreaterThanOrEqualTo(Integer value) {
            addCriterion("t_question >=", value, "tQuestion");
            return (Criteria) this;
        }

        public Criteria andTQuestionLessThan(Integer value) {
            addCriterion("t_question <", value, "tQuestion");
            return (Criteria) this;
        }

        public Criteria andTQuestionLessThanOrEqualTo(Integer value) {
            addCriterion("t_question <=", value, "tQuestion");
            return (Criteria) this;
        }

        public Criteria andTQuestionIn(List<Integer> values) {
            addCriterion("t_question in", values, "tQuestion");
            return (Criteria) this;
        }

        public Criteria andTQuestionNotIn(List<Integer> values) {
            addCriterion("t_question not in", values, "tQuestion");
            return (Criteria) this;
        }

        public Criteria andTQuestionBetween(Integer value1, Integer value2) {
            addCriterion("t_question between", value1, value2, "tQuestion");
            return (Criteria) this;
        }

        public Criteria andTQuestionNotBetween(Integer value1, Integer value2) {
            addCriterion("t_question not between", value1, value2, "tQuestion");
            return (Criteria) this;
        }

        public Criteria andTAsklistIsNull() {
            addCriterion("t_asklist is null");
            return (Criteria) this;
        }

        public Criteria andTAsklistIsNotNull() {
            addCriterion("t_asklist is not null");
            return (Criteria) this;
        }

        public Criteria andTAsklistEqualTo(Integer value) {
            addCriterion("t_asklist =", value, "tAsklist");
            return (Criteria) this;
        }

        public Criteria andTAsklistNotEqualTo(Integer value) {
            addCriterion("t_asklist <>", value, "tAsklist");
            return (Criteria) this;
        }

        public Criteria andTAsklistGreaterThan(Integer value) {
            addCriterion("t_asklist >", value, "tAsklist");
            return (Criteria) this;
        }

        public Criteria andTAsklistGreaterThanOrEqualTo(Integer value) {
            addCriterion("t_asklist >=", value, "tAsklist");
            return (Criteria) this;
        }

        public Criteria andTAsklistLessThan(Integer value) {
            addCriterion("t_asklist <", value, "tAsklist");
            return (Criteria) this;
        }

        public Criteria andTAsklistLessThanOrEqualTo(Integer value) {
            addCriterion("t_asklist <=", value, "tAsklist");
            return (Criteria) this;
        }

        public Criteria andTAsklistIn(List<Integer> values) {
            addCriterion("t_asklist in", values, "tAsklist");
            return (Criteria) this;
        }

        public Criteria andTAsklistNotIn(List<Integer> values) {
            addCriterion("t_asklist not in", values, "tAsklist");
            return (Criteria) this;
        }

        public Criteria andTAsklistBetween(Integer value1, Integer value2) {
            addCriterion("t_asklist between", value1, value2, "tAsklist");
            return (Criteria) this;
        }

        public Criteria andTAsklistNotBetween(Integer value1, Integer value2) {
            addCriterion("t_asklist not between", value1, value2, "tAsklist");
            return (Criteria) this;
        }

        public Criteria andTQuestionlistIsNull() {
            addCriterion("t_questionlist is null");
            return (Criteria) this;
        }

        public Criteria andTQuestionlistIsNotNull() {
            addCriterion("t_questionlist is not null");
            return (Criteria) this;
        }

        public Criteria andTQuestionlistEqualTo(Integer value) {
            addCriterion("t_questionlist =", value, "tQuestionlist");
            return (Criteria) this;
        }

        public Criteria andTQuestionlistNotEqualTo(Integer value) {
            addCriterion("t_questionlist <>", value, "tQuestionlist");
            return (Criteria) this;
        }

        public Criteria andTQuestionlistGreaterThan(Integer value) {
            addCriterion("t_questionlist >", value, "tQuestionlist");
            return (Criteria) this;
        }

        public Criteria andTQuestionlistGreaterThanOrEqualTo(Integer value) {
            addCriterion("t_questionlist >=", value, "tQuestionlist");
            return (Criteria) this;
        }

        public Criteria andTQuestionlistLessThan(Integer value) {
            addCriterion("t_questionlist <", value, "tQuestionlist");
            return (Criteria) this;
        }

        public Criteria andTQuestionlistLessThanOrEqualTo(Integer value) {
            addCriterion("t_questionlist <=", value, "tQuestionlist");
            return (Criteria) this;
        }

        public Criteria andTQuestionlistIn(List<Integer> values) {
            addCriterion("t_questionlist in", values, "tQuestionlist");
            return (Criteria) this;
        }

        public Criteria andTQuestionlistNotIn(List<Integer> values) {
            addCriterion("t_questionlist not in", values, "tQuestionlist");
            return (Criteria) this;
        }

        public Criteria andTQuestionlistBetween(Integer value1, Integer value2) {
            addCriterion("t_questionlist between", value1, value2, "tQuestionlist");
            return (Criteria) this;
        }

        public Criteria andTQuestionlistNotBetween(Integer value1, Integer value2) {
            addCriterion("t_questionlist not between", value1, value2, "tQuestionlist");
            return (Criteria) this;
        }

        public Criteria andTPublishtimeIsNull() {
            addCriterion("t_publishTime is null");
            return (Criteria) this;
        }

        public Criteria andTPublishtimeIsNotNull() {
            addCriterion("t_publishTime is not null");
            return (Criteria) this;
        }

        public Criteria andTPublishtimeEqualTo(Date value) {
            addCriterion("t_publishTime =", value, "tPublishtime");
            return (Criteria) this;
        }

        public Criteria andTPublishtimeNotEqualTo(Date value) {
            addCriterion("t_publishTime <>", value, "tPublishtime");
            return (Criteria) this;
        }

        public Criteria andTPublishtimeGreaterThan(Date value) {
            addCriterion("t_publishTime >", value, "tPublishtime");
            return (Criteria) this;
        }

        public Criteria andTPublishtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("t_publishTime >=", value, "tPublishtime");
            return (Criteria) this;
        }

        public Criteria andTPublishtimeLessThan(Date value) {
            addCriterion("t_publishTime <", value, "tPublishtime");
            return (Criteria) this;
        }

        public Criteria andTPublishtimeLessThanOrEqualTo(Date value) {
            addCriterion("t_publishTime <=", value, "tPublishtime");
            return (Criteria) this;
        }

        public Criteria andTPublishtimeIn(List<Date> values) {
            addCriterion("t_publishTime in", values, "tPublishtime");
            return (Criteria) this;
        }

        public Criteria andTPublishtimeNotIn(List<Date> values) {
            addCriterion("t_publishTime not in", values, "tPublishtime");
            return (Criteria) this;
        }

        public Criteria andTPublishtimeBetween(Date value1, Date value2) {
            addCriterion("t_publishTime between", value1, value2, "tPublishtime");
            return (Criteria) this;
        }

        public Criteria andTPublishtimeNotBetween(Date value1, Date value2) {
            addCriterion("t_publishTime not between", value1, value2, "tPublishtime");
            return (Criteria) this;
        }

        public Criteria andTContenttimeIsNull() {
            addCriterion("t_contentTime is null");
            return (Criteria) this;
        }

        public Criteria andTContenttimeIsNotNull() {
            addCriterion("t_contentTime is not null");
            return (Criteria) this;
        }

        public Criteria andTContenttimeEqualTo(Date value) {
            addCriterion("t_contentTime =", value, "tContenttime");
            return (Criteria) this;
        }

        public Criteria andTContenttimeNotEqualTo(Date value) {
            addCriterion("t_contentTime <>", value, "tContenttime");
            return (Criteria) this;
        }

        public Criteria andTContenttimeGreaterThan(Date value) {
            addCriterion("t_contentTime >", value, "tContenttime");
            return (Criteria) this;
        }

        public Criteria andTContenttimeGreaterThanOrEqualTo(Date value) {
            addCriterion("t_contentTime >=", value, "tContenttime");
            return (Criteria) this;
        }

        public Criteria andTContenttimeLessThan(Date value) {
            addCriterion("t_contentTime <", value, "tContenttime");
            return (Criteria) this;
        }

        public Criteria andTContenttimeLessThanOrEqualTo(Date value) {
            addCriterion("t_contentTime <=", value, "tContenttime");
            return (Criteria) this;
        }

        public Criteria andTContenttimeIn(List<Date> values) {
            addCriterion("t_contentTime in", values, "tContenttime");
            return (Criteria) this;
        }

        public Criteria andTContenttimeNotIn(List<Date> values) {
            addCriterion("t_contentTime not in", values, "tContenttime");
            return (Criteria) this;
        }

        public Criteria andTContenttimeBetween(Date value1, Date value2) {
            addCriterion("t_contentTime between", value1, value2, "tContenttime");
            return (Criteria) this;
        }

        public Criteria andTContenttimeNotBetween(Date value1, Date value2) {
            addCriterion("t_contentTime not between", value1, value2, "tContenttime");
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