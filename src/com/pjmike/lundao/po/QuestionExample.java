package com.pjmike.lundao.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class QuestionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public QuestionExample() {
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

        public Criteria andQQuestionidIsNull() {
            addCriterion("q_questionId is null");
            return (Criteria) this;
        }

        public Criteria andQQuestionidIsNotNull() {
            addCriterion("q_questionId is not null");
            return (Criteria) this;
        }

        public Criteria andQQuestionidEqualTo(Integer value) {
            addCriterion("q_questionId =", value, "qQuestionid");
            return (Criteria) this;
        }

        public Criteria andQQuestionidNotEqualTo(Integer value) {
            addCriterion("q_questionId <>", value, "qQuestionid");
            return (Criteria) this;
        }

        public Criteria andQQuestionidGreaterThan(Integer value) {
            addCriterion("q_questionId >", value, "qQuestionid");
            return (Criteria) this;
        }

        public Criteria andQQuestionidGreaterThanOrEqualTo(Integer value) {
            addCriterion("q_questionId >=", value, "qQuestionid");
            return (Criteria) this;
        }

        public Criteria andQQuestionidLessThan(Integer value) {
            addCriterion("q_questionId <", value, "qQuestionid");
            return (Criteria) this;
        }

        public Criteria andQQuestionidLessThanOrEqualTo(Integer value) {
            addCriterion("q_questionId <=", value, "qQuestionid");
            return (Criteria) this;
        }

        public Criteria andQQuestionidIn(List<Integer> values) {
            addCriterion("q_questionId in", values, "qQuestionid");
            return (Criteria) this;
        }

        public Criteria andQQuestionidNotIn(List<Integer> values) {
            addCriterion("q_questionId not in", values, "qQuestionid");
            return (Criteria) this;
        }

        public Criteria andQQuestionidBetween(Integer value1, Integer value2) {
            addCriterion("q_questionId between", value1, value2, "qQuestionid");
            return (Criteria) this;
        }

        public Criteria andQQuestionidNotBetween(Integer value1, Integer value2) {
            addCriterion("q_questionId not between", value1, value2, "qQuestionid");
            return (Criteria) this;
        }

        public Criteria andQDebateidIsNull() {
            addCriterion("q_debateId is null");
            return (Criteria) this;
        }

        public Criteria andQDebateidIsNotNull() {
            addCriterion("q_debateId is not null");
            return (Criteria) this;
        }

        public Criteria andQDebateidEqualTo(Integer value) {
            addCriterion("q_debateId =", value, "qDebateid");
            return (Criteria) this;
        }

        public Criteria andQDebateidNotEqualTo(Integer value) {
            addCriterion("q_debateId <>", value, "qDebateid");
            return (Criteria) this;
        }

        public Criteria andQDebateidGreaterThan(Integer value) {
            addCriterion("q_debateId >", value, "qDebateid");
            return (Criteria) this;
        }

        public Criteria andQDebateidGreaterThanOrEqualTo(Integer value) {
            addCriterion("q_debateId >=", value, "qDebateid");
            return (Criteria) this;
        }

        public Criteria andQDebateidLessThan(Integer value) {
            addCriterion("q_debateId <", value, "qDebateid");
            return (Criteria) this;
        }

        public Criteria andQDebateidLessThanOrEqualTo(Integer value) {
            addCriterion("q_debateId <=", value, "qDebateid");
            return (Criteria) this;
        }

        public Criteria andQDebateidIn(List<Integer> values) {
            addCriterion("q_debateId in", values, "qDebateid");
            return (Criteria) this;
        }

        public Criteria andQDebateidNotIn(List<Integer> values) {
            addCriterion("q_debateId not in", values, "qDebateid");
            return (Criteria) this;
        }

        public Criteria andQDebateidBetween(Integer value1, Integer value2) {
            addCriterion("q_debateId between", value1, value2, "qDebateid");
            return (Criteria) this;
        }

        public Criteria andQDebateidNotBetween(Integer value1, Integer value2) {
            addCriterion("q_debateId not between", value1, value2, "qDebateid");
            return (Criteria) this;
        }

        public Criteria andQDescribtionIsNull() {
            addCriterion("q_describtion is null");
            return (Criteria) this;
        }

        public Criteria andQDescribtionIsNotNull() {
            addCriterion("q_describtion is not null");
            return (Criteria) this;
        }

        public Criteria andQDescribtionEqualTo(String value) {
            addCriterion("q_describtion =", value, "qDescribtion");
            return (Criteria) this;
        }

        public Criteria andQDescribtionNotEqualTo(String value) {
            addCriterion("q_describtion <>", value, "qDescribtion");
            return (Criteria) this;
        }

        public Criteria andQDescribtionGreaterThan(String value) {
            addCriterion("q_describtion >", value, "qDescribtion");
            return (Criteria) this;
        }

        public Criteria andQDescribtionGreaterThanOrEqualTo(String value) {
            addCriterion("q_describtion >=", value, "qDescribtion");
            return (Criteria) this;
        }

        public Criteria andQDescribtionLessThan(String value) {
            addCriterion("q_describtion <", value, "qDescribtion");
            return (Criteria) this;
        }

        public Criteria andQDescribtionLessThanOrEqualTo(String value) {
            addCriterion("q_describtion <=", value, "qDescribtion");
            return (Criteria) this;
        }

        public Criteria andQDescribtionLike(String value) {
            addCriterion("q_describtion like", value, "qDescribtion");
            return (Criteria) this;
        }

        public Criteria andQDescribtionNotLike(String value) {
            addCriterion("q_describtion not like", value, "qDescribtion");
            return (Criteria) this;
        }

        public Criteria andQDescribtionIn(List<String> values) {
            addCriterion("q_describtion in", values, "qDescribtion");
            return (Criteria) this;
        }

        public Criteria andQDescribtionNotIn(List<String> values) {
            addCriterion("q_describtion not in", values, "qDescribtion");
            return (Criteria) this;
        }

        public Criteria andQDescribtionBetween(String value1, String value2) {
            addCriterion("q_describtion between", value1, value2, "qDescribtion");
            return (Criteria) this;
        }

        public Criteria andQDescribtionNotBetween(String value1, String value2) {
            addCriterion("q_describtion not between", value1, value2, "qDescribtion");
            return (Criteria) this;
        }

        public Criteria andQContentIsNull() {
            addCriterion("q_content is null");
            return (Criteria) this;
        }

        public Criteria andQContentIsNotNull() {
            addCriterion("q_content is not null");
            return (Criteria) this;
        }

        public Criteria andQContentEqualTo(String value) {
            addCriterion("q_content =", value, "qContent");
            return (Criteria) this;
        }

        public Criteria andQContentNotEqualTo(String value) {
            addCriterion("q_content <>", value, "qContent");
            return (Criteria) this;
        }

        public Criteria andQContentGreaterThan(String value) {
            addCriterion("q_content >", value, "qContent");
            return (Criteria) this;
        }

        public Criteria andQContentGreaterThanOrEqualTo(String value) {
            addCriterion("q_content >=", value, "qContent");
            return (Criteria) this;
        }

        public Criteria andQContentLessThan(String value) {
            addCriterion("q_content <", value, "qContent");
            return (Criteria) this;
        }

        public Criteria andQContentLessThanOrEqualTo(String value) {
            addCriterion("q_content <=", value, "qContent");
            return (Criteria) this;
        }

        public Criteria andQContentLike(String value) {
            addCriterion("q_content like", value, "qContent");
            return (Criteria) this;
        }

        public Criteria andQContentNotLike(String value) {
            addCriterion("q_content not like", value, "qContent");
            return (Criteria) this;
        }

        public Criteria andQContentIn(List<String> values) {
            addCriterion("q_content in", values, "qContent");
            return (Criteria) this;
        }

        public Criteria andQContentNotIn(List<String> values) {
            addCriterion("q_content not in", values, "qContent");
            return (Criteria) this;
        }

        public Criteria andQContentBetween(String value1, String value2) {
            addCriterion("q_content between", value1, value2, "qContent");
            return (Criteria) this;
        }

        public Criteria andQContentNotBetween(String value1, String value2) {
            addCriterion("q_content not between", value1, value2, "qContent");
            return (Criteria) this;
        }

        public Criteria andQStatusIsNull() {
            addCriterion("q_status is null");
            return (Criteria) this;
        }

        public Criteria andQStatusIsNotNull() {
            addCriterion("q_status is not null");
            return (Criteria) this;
        }

        public Criteria andQStatusEqualTo(String value) {
            addCriterion("q_status =", value, "qStatus");
            return (Criteria) this;
        }

        public Criteria andQStatusNotEqualTo(String value) {
            addCriterion("q_status <>", value, "qStatus");
            return (Criteria) this;
        }

        public Criteria andQStatusGreaterThan(String value) {
            addCriterion("q_status >", value, "qStatus");
            return (Criteria) this;
        }

        public Criteria andQStatusGreaterThanOrEqualTo(String value) {
            addCriterion("q_status >=", value, "qStatus");
            return (Criteria) this;
        }

        public Criteria andQStatusLessThan(String value) {
            addCriterion("q_status <", value, "qStatus");
            return (Criteria) this;
        }

        public Criteria andQStatusLessThanOrEqualTo(String value) {
            addCriterion("q_status <=", value, "qStatus");
            return (Criteria) this;
        }

        public Criteria andQStatusLike(String value) {
            addCriterion("q_status like", value, "qStatus");
            return (Criteria) this;
        }

        public Criteria andQStatusNotLike(String value) {
            addCriterion("q_status not like", value, "qStatus");
            return (Criteria) this;
        }

        public Criteria andQStatusIn(List<String> values) {
            addCriterion("q_status in", values, "qStatus");
            return (Criteria) this;
        }

        public Criteria andQStatusNotIn(List<String> values) {
            addCriterion("q_status not in", values, "qStatus");
            return (Criteria) this;
        }

        public Criteria andQStatusBetween(String value1, String value2) {
            addCriterion("q_status between", value1, value2, "qStatus");
            return (Criteria) this;
        }

        public Criteria andQStatusNotBetween(String value1, String value2) {
            addCriterion("q_status not between", value1, value2, "qStatus");
            return (Criteria) this;
        }

        public Criteria andQViewIsNull() {
            addCriterion("q_view is null");
            return (Criteria) this;
        }

        public Criteria andQViewIsNotNull() {
            addCriterion("q_view is not null");
            return (Criteria) this;
        }

        public Criteria andQViewEqualTo(Integer value) {
            addCriterion("q_view =", value, "qView");
            return (Criteria) this;
        }

        public Criteria andQViewNotEqualTo(Integer value) {
            addCriterion("q_view <>", value, "qView");
            return (Criteria) this;
        }

        public Criteria andQViewGreaterThan(Integer value) {
            addCriterion("q_view >", value, "qView");
            return (Criteria) this;
        }

        public Criteria andQViewGreaterThanOrEqualTo(Integer value) {
            addCriterion("q_view >=", value, "qView");
            return (Criteria) this;
        }

        public Criteria andQViewLessThan(Integer value) {
            addCriterion("q_view <", value, "qView");
            return (Criteria) this;
        }

        public Criteria andQViewLessThanOrEqualTo(Integer value) {
            addCriterion("q_view <=", value, "qView");
            return (Criteria) this;
        }

        public Criteria andQViewIn(List<Integer> values) {
            addCriterion("q_view in", values, "qView");
            return (Criteria) this;
        }

        public Criteria andQViewNotIn(List<Integer> values) {
            addCriterion("q_view not in", values, "qView");
            return (Criteria) this;
        }

        public Criteria andQViewBetween(Integer value1, Integer value2) {
            addCriterion("q_view between", value1, value2, "qView");
            return (Criteria) this;
        }

        public Criteria andQViewNotBetween(Integer value1, Integer value2) {
            addCriterion("q_view not between", value1, value2, "qView");
            return (Criteria) this;
        }

        public Criteria andQLikeIsNull() {
            addCriterion("q_like is null");
            return (Criteria) this;
        }

        public Criteria andQLikeIsNotNull() {
            addCriterion("q_like is not null");
            return (Criteria) this;
        }

        public Criteria andQLikeEqualTo(Integer value) {
            addCriterion("q_like =", value, "qLike");
            return (Criteria) this;
        }

        public Criteria andQLikeNotEqualTo(Integer value) {
            addCriterion("q_like <>", value, "qLike");
            return (Criteria) this;
        }

        public Criteria andQLikeGreaterThan(Integer value) {
            addCriterion("q_like >", value, "qLike");
            return (Criteria) this;
        }

        public Criteria andQLikeGreaterThanOrEqualTo(Integer value) {
            addCriterion("q_like >=", value, "qLike");
            return (Criteria) this;
        }

        public Criteria andQLikeLessThan(Integer value) {
            addCriterion("q_like <", value, "qLike");
            return (Criteria) this;
        }

        public Criteria andQLikeLessThanOrEqualTo(Integer value) {
            addCriterion("q_like <=", value, "qLike");
            return (Criteria) this;
        }

        public Criteria andQLikeIn(List<Integer> values) {
            addCriterion("q_like in", values, "qLike");
            return (Criteria) this;
        }

        public Criteria andQLikeNotIn(List<Integer> values) {
            addCriterion("q_like not in", values, "qLike");
            return (Criteria) this;
        }

        public Criteria andQLikeBetween(Integer value1, Integer value2) {
            addCriterion("q_like between", value1, value2, "qLike");
            return (Criteria) this;
        }

        public Criteria andQLikeNotBetween(Integer value1, Integer value2) {
            addCriterion("q_like not between", value1, value2, "qLike");
            return (Criteria) this;
        }

        public Criteria andQAttentionIsNull() {
            addCriterion("q_attention is null");
            return (Criteria) this;
        }

        public Criteria andQAttentionIsNotNull() {
            addCriterion("q_attention is not null");
            return (Criteria) this;
        }

        public Criteria andQAttentionEqualTo(Integer value) {
            addCriterion("q_attention =", value, "qAttention");
            return (Criteria) this;
        }

        public Criteria andQAttentionNotEqualTo(Integer value) {
            addCriterion("q_attention <>", value, "qAttention");
            return (Criteria) this;
        }

        public Criteria andQAttentionGreaterThan(Integer value) {
            addCriterion("q_attention >", value, "qAttention");
            return (Criteria) this;
        }

        public Criteria andQAttentionGreaterThanOrEqualTo(Integer value) {
            addCriterion("q_attention >=", value, "qAttention");
            return (Criteria) this;
        }

        public Criteria andQAttentionLessThan(Integer value) {
            addCriterion("q_attention <", value, "qAttention");
            return (Criteria) this;
        }

        public Criteria andQAttentionLessThanOrEqualTo(Integer value) {
            addCriterion("q_attention <=", value, "qAttention");
            return (Criteria) this;
        }

        public Criteria andQAttentionIn(List<Integer> values) {
            addCriterion("q_attention in", values, "qAttention");
            return (Criteria) this;
        }

        public Criteria andQAttentionNotIn(List<Integer> values) {
            addCriterion("q_attention not in", values, "qAttention");
            return (Criteria) this;
        }

        public Criteria andQAttentionBetween(Integer value1, Integer value2) {
            addCriterion("q_attention between", value1, value2, "qAttention");
            return (Criteria) this;
        }

        public Criteria andQAttentionNotBetween(Integer value1, Integer value2) {
            addCriterion("q_attention not between", value1, value2, "qAttention");
            return (Criteria) this;
        }

        public Criteria andQDislikeIsNull() {
            addCriterion("q_dislike is null");
            return (Criteria) this;
        }

        public Criteria andQDislikeIsNotNull() {
            addCriterion("q_dislike is not null");
            return (Criteria) this;
        }

        public Criteria andQDislikeEqualTo(Integer value) {
            addCriterion("q_dislike =", value, "qDislike");
            return (Criteria) this;
        }

        public Criteria andQDislikeNotEqualTo(Integer value) {
            addCriterion("q_dislike <>", value, "qDislike");
            return (Criteria) this;
        }

        public Criteria andQDislikeGreaterThan(Integer value) {
            addCriterion("q_dislike >", value, "qDislike");
            return (Criteria) this;
        }

        public Criteria andQDislikeGreaterThanOrEqualTo(Integer value) {
            addCriterion("q_dislike >=", value, "qDislike");
            return (Criteria) this;
        }

        public Criteria andQDislikeLessThan(Integer value) {
            addCriterion("q_dislike <", value, "qDislike");
            return (Criteria) this;
        }

        public Criteria andQDislikeLessThanOrEqualTo(Integer value) {
            addCriterion("q_dislike <=", value, "qDislike");
            return (Criteria) this;
        }

        public Criteria andQDislikeIn(List<Integer> values) {
            addCriterion("q_dislike in", values, "qDislike");
            return (Criteria) this;
        }

        public Criteria andQDislikeNotIn(List<Integer> values) {
            addCriterion("q_dislike not in", values, "qDislike");
            return (Criteria) this;
        }

        public Criteria andQDislikeBetween(Integer value1, Integer value2) {
            addCriterion("q_dislike between", value1, value2, "qDislike");
            return (Criteria) this;
        }

        public Criteria andQDislikeNotBetween(Integer value1, Integer value2) {
            addCriterion("q_dislike not between", value1, value2, "qDislike");
            return (Criteria) this;
        }

        public Criteria andQReplyIsNull() {
            addCriterion("q_reply is null");
            return (Criteria) this;
        }

        public Criteria andQReplyIsNotNull() {
            addCriterion("q_reply is not null");
            return (Criteria) this;
        }

        public Criteria andQReplyEqualTo(Integer value) {
            addCriterion("q_reply =", value, "qReply");
            return (Criteria) this;
        }

        public Criteria andQReplyNotEqualTo(Integer value) {
            addCriterion("q_reply <>", value, "qReply");
            return (Criteria) this;
        }

        public Criteria andQReplyGreaterThan(Integer value) {
            addCriterion("q_reply >", value, "qReply");
            return (Criteria) this;
        }

        public Criteria andQReplyGreaterThanOrEqualTo(Integer value) {
            addCriterion("q_reply >=", value, "qReply");
            return (Criteria) this;
        }

        public Criteria andQReplyLessThan(Integer value) {
            addCriterion("q_reply <", value, "qReply");
            return (Criteria) this;
        }

        public Criteria andQReplyLessThanOrEqualTo(Integer value) {
            addCriterion("q_reply <=", value, "qReply");
            return (Criteria) this;
        }

        public Criteria andQReplyIn(List<Integer> values) {
            addCriterion("q_reply in", values, "qReply");
            return (Criteria) this;
        }

        public Criteria andQReplyNotIn(List<Integer> values) {
            addCriterion("q_reply not in", values, "qReply");
            return (Criteria) this;
        }

        public Criteria andQReplyBetween(Integer value1, Integer value2) {
            addCriterion("q_reply between", value1, value2, "qReply");
            return (Criteria) this;
        }

        public Criteria andQReplyNotBetween(Integer value1, Integer value2) {
            addCriterion("q_reply not between", value1, value2, "qReply");
            return (Criteria) this;
        }

        public Criteria andQReplylistIsNull() {
            addCriterion("q_replylist is null");
            return (Criteria) this;
        }

        public Criteria andQReplylistIsNotNull() {
            addCriterion("q_replylist is not null");
            return (Criteria) this;
        }

        public Criteria andQReplylistEqualTo(Integer value) {
            addCriterion("q_replylist =", value, "qReplylist");
            return (Criteria) this;
        }

        public Criteria andQReplylistNotEqualTo(Integer value) {
            addCriterion("q_replylist <>", value, "qReplylist");
            return (Criteria) this;
        }

        public Criteria andQReplylistGreaterThan(Integer value) {
            addCriterion("q_replylist >", value, "qReplylist");
            return (Criteria) this;
        }

        public Criteria andQReplylistGreaterThanOrEqualTo(Integer value) {
            addCriterion("q_replylist >=", value, "qReplylist");
            return (Criteria) this;
        }

        public Criteria andQReplylistLessThan(Integer value) {
            addCriterion("q_replylist <", value, "qReplylist");
            return (Criteria) this;
        }

        public Criteria andQReplylistLessThanOrEqualTo(Integer value) {
            addCriterion("q_replylist <=", value, "qReplylist");
            return (Criteria) this;
        }

        public Criteria andQReplylistIn(List<Integer> values) {
            addCriterion("q_replylist in", values, "qReplylist");
            return (Criteria) this;
        }

        public Criteria andQReplylistNotIn(List<Integer> values) {
            addCriterion("q_replylist not in", values, "qReplylist");
            return (Criteria) this;
        }

        public Criteria andQReplylistBetween(Integer value1, Integer value2) {
            addCriterion("q_replylist between", value1, value2, "qReplylist");
            return (Criteria) this;
        }

        public Criteria andQReplylistNotBetween(Integer value1, Integer value2) {
            addCriterion("q_replylist not between", value1, value2, "qReplylist");
            return (Criteria) this;
        }

        public Criteria andQClickcountIsNull() {
            addCriterion("q_clickcount is null");
            return (Criteria) this;
        }

        public Criteria andQClickcountIsNotNull() {
            addCriterion("q_clickcount is not null");
            return (Criteria) this;
        }

        public Criteria andQClickcountEqualTo(Integer value) {
            addCriterion("q_clickcount =", value, "qClickcount");
            return (Criteria) this;
        }

        public Criteria andQClickcountNotEqualTo(Integer value) {
            addCriterion("q_clickcount <>", value, "qClickcount");
            return (Criteria) this;
        }

        public Criteria andQClickcountGreaterThan(Integer value) {
            addCriterion("q_clickcount >", value, "qClickcount");
            return (Criteria) this;
        }

        public Criteria andQClickcountGreaterThanOrEqualTo(Integer value) {
            addCriterion("q_clickcount >=", value, "qClickcount");
            return (Criteria) this;
        }

        public Criteria andQClickcountLessThan(Integer value) {
            addCriterion("q_clickcount <", value, "qClickcount");
            return (Criteria) this;
        }

        public Criteria andQClickcountLessThanOrEqualTo(Integer value) {
            addCriterion("q_clickcount <=", value, "qClickcount");
            return (Criteria) this;
        }

        public Criteria andQClickcountIn(List<Integer> values) {
            addCriterion("q_clickcount in", values, "qClickcount");
            return (Criteria) this;
        }

        public Criteria andQClickcountNotIn(List<Integer> values) {
            addCriterion("q_clickcount not in", values, "qClickcount");
            return (Criteria) this;
        }

        public Criteria andQClickcountBetween(Integer value1, Integer value2) {
            addCriterion("q_clickcount between", value1, value2, "qClickcount");
            return (Criteria) this;
        }

        public Criteria andQClickcountNotBetween(Integer value1, Integer value2) {
            addCriterion("q_clickcount not between", value1, value2, "qClickcount");
            return (Criteria) this;
        }

        public Criteria andQUsernameIsNull() {
            addCriterion("q_username is null");
            return (Criteria) this;
        }

        public Criteria andQUsernameIsNotNull() {
            addCriterion("q_username is not null");
            return (Criteria) this;
        }

        public Criteria andQUsernameEqualTo(String value) {
            addCriterion("q_username =", value, "qUsername");
            return (Criteria) this;
        }

        public Criteria andQUsernameNotEqualTo(String value) {
            addCriterion("q_username <>", value, "qUsername");
            return (Criteria) this;
        }

        public Criteria andQUsernameGreaterThan(String value) {
            addCriterion("q_username >", value, "qUsername");
            return (Criteria) this;
        }

        public Criteria andQUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("q_username >=", value, "qUsername");
            return (Criteria) this;
        }

        public Criteria andQUsernameLessThan(String value) {
            addCriterion("q_username <", value, "qUsername");
            return (Criteria) this;
        }

        public Criteria andQUsernameLessThanOrEqualTo(String value) {
            addCriterion("q_username <=", value, "qUsername");
            return (Criteria) this;
        }

        public Criteria andQUsernameLike(String value) {
            addCriterion("q_username like", value, "qUsername");
            return (Criteria) this;
        }

        public Criteria andQUsernameNotLike(String value) {
            addCriterion("q_username not like", value, "qUsername");
            return (Criteria) this;
        }

        public Criteria andQUsernameIn(List<String> values) {
            addCriterion("q_username in", values, "qUsername");
            return (Criteria) this;
        }

        public Criteria andQUsernameNotIn(List<String> values) {
            addCriterion("q_username not in", values, "qUsername");
            return (Criteria) this;
        }

        public Criteria andQUsernameBetween(String value1, String value2) {
            addCriterion("q_username between", value1, value2, "qUsername");
            return (Criteria) this;
        }

        public Criteria andQUsernameNotBetween(String value1, String value2) {
            addCriterion("q_username not between", value1, value2, "qUsername");
            return (Criteria) this;
        }

        public Criteria andQPublishtimeIsNull() {
            addCriterion("q_publishTime is null");
            return (Criteria) this;
        }

        public Criteria andQPublishtimeIsNotNull() {
            addCriterion("q_publishTime is not null");
            return (Criteria) this;
        }

        public Criteria andQPublishtimeEqualTo(Date value) {
            addCriterion("q_publishTime =", value, "qPublishtime");
            return (Criteria) this;
        }

        public Criteria andQPublishtimeNotEqualTo(Date value) {
            addCriterion("q_publishTime <>", value, "qPublishtime");
            return (Criteria) this;
        }

        public Criteria andQPublishtimeGreaterThan(Date value) {
            addCriterion("q_publishTime >", value, "qPublishtime");
            return (Criteria) this;
        }

        public Criteria andQPublishtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("q_publishTime >=", value, "qPublishtime");
            return (Criteria) this;
        }

        public Criteria andQPublishtimeLessThan(Date value) {
            addCriterion("q_publishTime <", value, "qPublishtime");
            return (Criteria) this;
        }

        public Criteria andQPublishtimeLessThanOrEqualTo(Date value) {
            addCriterion("q_publishTime <=", value, "qPublishtime");
            return (Criteria) this;
        }

        public Criteria andQPublishtimeIn(List<Date> values) {
            addCriterion("q_publishTime in", values, "qPublishtime");
            return (Criteria) this;
        }

        public Criteria andQPublishtimeNotIn(List<Date> values) {
            addCriterion("q_publishTime not in", values, "qPublishtime");
            return (Criteria) this;
        }

        public Criteria andQPublishtimeBetween(Date value1, Date value2) {
            addCriterion("q_publishTime between", value1, value2, "qPublishtime");
            return (Criteria) this;
        }

        public Criteria andQPublishtimeNotBetween(Date value1, Date value2) {
            addCriterion("q_publishTime not between", value1, value2, "qPublishtime");
            return (Criteria) this;
        }

        public Criteria andQContenttimeIsNull() {
            addCriterion("q_contentTime is null");
            return (Criteria) this;
        }

        public Criteria andQContenttimeIsNotNull() {
            addCriterion("q_contentTime is not null");
            return (Criteria) this;
        }

        public Criteria andQContenttimeEqualTo(Date value) {
            addCriterion("q_contentTime =", value, "qContenttime");
            return (Criteria) this;
        }

        public Criteria andQContenttimeNotEqualTo(Date value) {
            addCriterion("q_contentTime <>", value, "qContenttime");
            return (Criteria) this;
        }

        public Criteria andQContenttimeGreaterThan(Date value) {
            addCriterion("q_contentTime >", value, "qContenttime");
            return (Criteria) this;
        }

        public Criteria andQContenttimeGreaterThanOrEqualTo(Date value) {
            addCriterion("q_contentTime >=", value, "qContenttime");
            return (Criteria) this;
        }

        public Criteria andQContenttimeLessThan(Date value) {
            addCriterion("q_contentTime <", value, "qContenttime");
            return (Criteria) this;
        }

        public Criteria andQContenttimeLessThanOrEqualTo(Date value) {
            addCriterion("q_contentTime <=", value, "qContenttime");
            return (Criteria) this;
        }

        public Criteria andQContenttimeIn(List<Date> values) {
            addCriterion("q_contentTime in", values, "qContenttime");
            return (Criteria) this;
        }

        public Criteria andQContenttimeNotIn(List<Date> values) {
            addCriterion("q_contentTime not in", values, "qContenttime");
            return (Criteria) this;
        }

        public Criteria andQContenttimeBetween(Date value1, Date value2) {
            addCriterion("q_contentTime between", value1, value2, "qContenttime");
            return (Criteria) this;
        }

        public Criteria andQContenttimeNotBetween(Date value1, Date value2) {
            addCriterion("q_contentTime not between", value1, value2, "qContenttime");
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