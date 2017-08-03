package com.pjmike.lundao.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ReplyquestionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ReplyquestionExample() {
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

        public Criteria andReplyquesidIsNull() {
            addCriterion("replyquesId is null");
            return (Criteria) this;
        }

        public Criteria andReplyquesidIsNotNull() {
            addCriterion("replyquesId is not null");
            return (Criteria) this;
        }

        public Criteria andReplyquesidEqualTo(Integer value) {
            addCriterion("replyquesId =", value, "replyquesid");
            return (Criteria) this;
        }

        public Criteria andReplyquesidNotEqualTo(Integer value) {
            addCriterion("replyquesId <>", value, "replyquesid");
            return (Criteria) this;
        }

        public Criteria andReplyquesidGreaterThan(Integer value) {
            addCriterion("replyquesId >", value, "replyquesid");
            return (Criteria) this;
        }

        public Criteria andReplyquesidGreaterThanOrEqualTo(Integer value) {
            addCriterion("replyquesId >=", value, "replyquesid");
            return (Criteria) this;
        }

        public Criteria andReplyquesidLessThan(Integer value) {
            addCriterion("replyquesId <", value, "replyquesid");
            return (Criteria) this;
        }

        public Criteria andReplyquesidLessThanOrEqualTo(Integer value) {
            addCriterion("replyquesId <=", value, "replyquesid");
            return (Criteria) this;
        }

        public Criteria andReplyquesidIn(List<Integer> values) {
            addCriterion("replyquesId in", values, "replyquesid");
            return (Criteria) this;
        }

        public Criteria andReplyquesidNotIn(List<Integer> values) {
            addCriterion("replyquesId not in", values, "replyquesid");
            return (Criteria) this;
        }

        public Criteria andReplyquesidBetween(Integer value1, Integer value2) {
            addCriterion("replyquesId between", value1, value2, "replyquesid");
            return (Criteria) this;
        }

        public Criteria andReplyquesidNotBetween(Integer value1, Integer value2) {
            addCriterion("replyquesId not between", value1, value2, "replyquesid");
            return (Criteria) this;
        }

        public Criteria andRqQuestionidIsNull() {
            addCriterion("rq_questionId is null");
            return (Criteria) this;
        }

        public Criteria andRqQuestionidIsNotNull() {
            addCriterion("rq_questionId is not null");
            return (Criteria) this;
        }

        public Criteria andRqQuestionidEqualTo(Integer value) {
            addCriterion("rq_questionId =", value, "rqQuestionid");
            return (Criteria) this;
        }

        public Criteria andRqQuestionidNotEqualTo(Integer value) {
            addCriterion("rq_questionId <>", value, "rqQuestionid");
            return (Criteria) this;
        }

        public Criteria andRqQuestionidGreaterThan(Integer value) {
            addCriterion("rq_questionId >", value, "rqQuestionid");
            return (Criteria) this;
        }

        public Criteria andRqQuestionidGreaterThanOrEqualTo(Integer value) {
            addCriterion("rq_questionId >=", value, "rqQuestionid");
            return (Criteria) this;
        }

        public Criteria andRqQuestionidLessThan(Integer value) {
            addCriterion("rq_questionId <", value, "rqQuestionid");
            return (Criteria) this;
        }

        public Criteria andRqQuestionidLessThanOrEqualTo(Integer value) {
            addCriterion("rq_questionId <=", value, "rqQuestionid");
            return (Criteria) this;
        }

        public Criteria andRqQuestionidIn(List<Integer> values) {
            addCriterion("rq_questionId in", values, "rqQuestionid");
            return (Criteria) this;
        }

        public Criteria andRqQuestionidNotIn(List<Integer> values) {
            addCriterion("rq_questionId not in", values, "rqQuestionid");
            return (Criteria) this;
        }

        public Criteria andRqQuestionidBetween(Integer value1, Integer value2) {
            addCriterion("rq_questionId between", value1, value2, "rqQuestionid");
            return (Criteria) this;
        }

        public Criteria andRqQuestionidNotBetween(Integer value1, Integer value2) {
            addCriterion("rq_questionId not between", value1, value2, "rqQuestionid");
            return (Criteria) this;
        }

        public Criteria andRqViewIsNull() {
            addCriterion("rq_view is null");
            return (Criteria) this;
        }

        public Criteria andRqViewIsNotNull() {
            addCriterion("rq_view is not null");
            return (Criteria) this;
        }

        public Criteria andRqViewEqualTo(Integer value) {
            addCriterion("rq_view =", value, "rqView");
            return (Criteria) this;
        }

        public Criteria andRqViewNotEqualTo(Integer value) {
            addCriterion("rq_view <>", value, "rqView");
            return (Criteria) this;
        }

        public Criteria andRqViewGreaterThan(Integer value) {
            addCriterion("rq_view >", value, "rqView");
            return (Criteria) this;
        }

        public Criteria andRqViewGreaterThanOrEqualTo(Integer value) {
            addCriterion("rq_view >=", value, "rqView");
            return (Criteria) this;
        }

        public Criteria andRqViewLessThan(Integer value) {
            addCriterion("rq_view <", value, "rqView");
            return (Criteria) this;
        }

        public Criteria andRqViewLessThanOrEqualTo(Integer value) {
            addCriterion("rq_view <=", value, "rqView");
            return (Criteria) this;
        }

        public Criteria andRqViewIn(List<Integer> values) {
            addCriterion("rq_view in", values, "rqView");
            return (Criteria) this;
        }

        public Criteria andRqViewNotIn(List<Integer> values) {
            addCriterion("rq_view not in", values, "rqView");
            return (Criteria) this;
        }

        public Criteria andRqViewBetween(Integer value1, Integer value2) {
            addCriterion("rq_view between", value1, value2, "rqView");
            return (Criteria) this;
        }

        public Criteria andRqViewNotBetween(Integer value1, Integer value2) {
            addCriterion("rq_view not between", value1, value2, "rqView");
            return (Criteria) this;
        }

        public Criteria andRqLikeIsNull() {
            addCriterion("rq_like is null");
            return (Criteria) this;
        }

        public Criteria andRqLikeIsNotNull() {
            addCriterion("rq_like is not null");
            return (Criteria) this;
        }

        public Criteria andRqLikeEqualTo(Integer value) {
            addCriterion("rq_like =", value, "rqLike");
            return (Criteria) this;
        }

        public Criteria andRqLikeNotEqualTo(Integer value) {
            addCriterion("rq_like <>", value, "rqLike");
            return (Criteria) this;
        }

        public Criteria andRqLikeGreaterThan(Integer value) {
            addCriterion("rq_like >", value, "rqLike");
            return (Criteria) this;
        }

        public Criteria andRqLikeGreaterThanOrEqualTo(Integer value) {
            addCriterion("rq_like >=", value, "rqLike");
            return (Criteria) this;
        }

        public Criteria andRqLikeLessThan(Integer value) {
            addCriterion("rq_like <", value, "rqLike");
            return (Criteria) this;
        }

        public Criteria andRqLikeLessThanOrEqualTo(Integer value) {
            addCriterion("rq_like <=", value, "rqLike");
            return (Criteria) this;
        }

        public Criteria andRqLikeIn(List<Integer> values) {
            addCriterion("rq_like in", values, "rqLike");
            return (Criteria) this;
        }

        public Criteria andRqLikeNotIn(List<Integer> values) {
            addCriterion("rq_like not in", values, "rqLike");
            return (Criteria) this;
        }

        public Criteria andRqLikeBetween(Integer value1, Integer value2) {
            addCriterion("rq_like between", value1, value2, "rqLike");
            return (Criteria) this;
        }

        public Criteria andRqLikeNotBetween(Integer value1, Integer value2) {
            addCriterion("rq_like not between", value1, value2, "rqLike");
            return (Criteria) this;
        }

        public Criteria andRqAttentionIsNull() {
            addCriterion("rq_attention is null");
            return (Criteria) this;
        }

        public Criteria andRqAttentionIsNotNull() {
            addCriterion("rq_attention is not null");
            return (Criteria) this;
        }

        public Criteria andRqAttentionEqualTo(Integer value) {
            addCriterion("rq_attention =", value, "rqAttention");
            return (Criteria) this;
        }

        public Criteria andRqAttentionNotEqualTo(Integer value) {
            addCriterion("rq_attention <>", value, "rqAttention");
            return (Criteria) this;
        }

        public Criteria andRqAttentionGreaterThan(Integer value) {
            addCriterion("rq_attention >", value, "rqAttention");
            return (Criteria) this;
        }

        public Criteria andRqAttentionGreaterThanOrEqualTo(Integer value) {
            addCriterion("rq_attention >=", value, "rqAttention");
            return (Criteria) this;
        }

        public Criteria andRqAttentionLessThan(Integer value) {
            addCriterion("rq_attention <", value, "rqAttention");
            return (Criteria) this;
        }

        public Criteria andRqAttentionLessThanOrEqualTo(Integer value) {
            addCriterion("rq_attention <=", value, "rqAttention");
            return (Criteria) this;
        }

        public Criteria andRqAttentionIn(List<Integer> values) {
            addCriterion("rq_attention in", values, "rqAttention");
            return (Criteria) this;
        }

        public Criteria andRqAttentionNotIn(List<Integer> values) {
            addCriterion("rq_attention not in", values, "rqAttention");
            return (Criteria) this;
        }

        public Criteria andRqAttentionBetween(Integer value1, Integer value2) {
            addCriterion("rq_attention between", value1, value2, "rqAttention");
            return (Criteria) this;
        }

        public Criteria andRqAttentionNotBetween(Integer value1, Integer value2) {
            addCriterion("rq_attention not between", value1, value2, "rqAttention");
            return (Criteria) this;
        }

        public Criteria andRqDislikeIsNull() {
            addCriterion("rq_dislike is null");
            return (Criteria) this;
        }

        public Criteria andRqDislikeIsNotNull() {
            addCriterion("rq_dislike is not null");
            return (Criteria) this;
        }

        public Criteria andRqDislikeEqualTo(Integer value) {
            addCriterion("rq_dislike =", value, "rqDislike");
            return (Criteria) this;
        }

        public Criteria andRqDislikeNotEqualTo(Integer value) {
            addCriterion("rq_dislike <>", value, "rqDislike");
            return (Criteria) this;
        }

        public Criteria andRqDislikeGreaterThan(Integer value) {
            addCriterion("rq_dislike >", value, "rqDislike");
            return (Criteria) this;
        }

        public Criteria andRqDislikeGreaterThanOrEqualTo(Integer value) {
            addCriterion("rq_dislike >=", value, "rqDislike");
            return (Criteria) this;
        }

        public Criteria andRqDislikeLessThan(Integer value) {
            addCriterion("rq_dislike <", value, "rqDislike");
            return (Criteria) this;
        }

        public Criteria andRqDislikeLessThanOrEqualTo(Integer value) {
            addCriterion("rq_dislike <=", value, "rqDislike");
            return (Criteria) this;
        }

        public Criteria andRqDislikeIn(List<Integer> values) {
            addCriterion("rq_dislike in", values, "rqDislike");
            return (Criteria) this;
        }

        public Criteria andRqDislikeNotIn(List<Integer> values) {
            addCriterion("rq_dislike not in", values, "rqDislike");
            return (Criteria) this;
        }

        public Criteria andRqDislikeBetween(Integer value1, Integer value2) {
            addCriterion("rq_dislike between", value1, value2, "rqDislike");
            return (Criteria) this;
        }

        public Criteria andRqDislikeNotBetween(Integer value1, Integer value2) {
            addCriterion("rq_dislike not between", value1, value2, "rqDislike");
            return (Criteria) this;
        }

        public Criteria andRqReplyidIsNull() {
            addCriterion("rq_replyid is null");
            return (Criteria) this;
        }

        public Criteria andRqReplyidIsNotNull() {
            addCriterion("rq_replyid is not null");
            return (Criteria) this;
        }

        public Criteria andRqReplyidEqualTo(Integer value) {
            addCriterion("rq_replyid =", value, "rqReplyid");
            return (Criteria) this;
        }

        public Criteria andRqReplyidNotEqualTo(Integer value) {
            addCriterion("rq_replyid <>", value, "rqReplyid");
            return (Criteria) this;
        }

        public Criteria andRqReplyidGreaterThan(Integer value) {
            addCriterion("rq_replyid >", value, "rqReplyid");
            return (Criteria) this;
        }

        public Criteria andRqReplyidGreaterThanOrEqualTo(Integer value) {
            addCriterion("rq_replyid >=", value, "rqReplyid");
            return (Criteria) this;
        }

        public Criteria andRqReplyidLessThan(Integer value) {
            addCriterion("rq_replyid <", value, "rqReplyid");
            return (Criteria) this;
        }

        public Criteria andRqReplyidLessThanOrEqualTo(Integer value) {
            addCriterion("rq_replyid <=", value, "rqReplyid");
            return (Criteria) this;
        }

        public Criteria andRqReplyidIn(List<Integer> values) {
            addCriterion("rq_replyid in", values, "rqReplyid");
            return (Criteria) this;
        }

        public Criteria andRqReplyidNotIn(List<Integer> values) {
            addCriterion("rq_replyid not in", values, "rqReplyid");
            return (Criteria) this;
        }

        public Criteria andRqReplyidBetween(Integer value1, Integer value2) {
            addCriterion("rq_replyid between", value1, value2, "rqReplyid");
            return (Criteria) this;
        }

        public Criteria andRqReplyidNotBetween(Integer value1, Integer value2) {
            addCriterion("rq_replyid not between", value1, value2, "rqReplyid");
            return (Criteria) this;
        }

        public Criteria andRqUsernameIsNull() {
            addCriterion("rq_username is null");
            return (Criteria) this;
        }

        public Criteria andRqUsernameIsNotNull() {
            addCriterion("rq_username is not null");
            return (Criteria) this;
        }

        public Criteria andRqUsernameEqualTo(String value) {
            addCriterion("rq_username =", value, "rqUsername");
            return (Criteria) this;
        }

        public Criteria andRqUsernameNotEqualTo(String value) {
            addCriterion("rq_username <>", value, "rqUsername");
            return (Criteria) this;
        }

        public Criteria andRqUsernameGreaterThan(String value) {
            addCriterion("rq_username >", value, "rqUsername");
            return (Criteria) this;
        }

        public Criteria andRqUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("rq_username >=", value, "rqUsername");
            return (Criteria) this;
        }

        public Criteria andRqUsernameLessThan(String value) {
            addCriterion("rq_username <", value, "rqUsername");
            return (Criteria) this;
        }

        public Criteria andRqUsernameLessThanOrEqualTo(String value) {
            addCriterion("rq_username <=", value, "rqUsername");
            return (Criteria) this;
        }

        public Criteria andRqUsernameLike(String value) {
            addCriterion("rq_username like", value, "rqUsername");
            return (Criteria) this;
        }

        public Criteria andRqUsernameNotLike(String value) {
            addCriterion("rq_username not like", value, "rqUsername");
            return (Criteria) this;
        }

        public Criteria andRqUsernameIn(List<String> values) {
            addCriterion("rq_username in", values, "rqUsername");
            return (Criteria) this;
        }

        public Criteria andRqUsernameNotIn(List<String> values) {
            addCriterion("rq_username not in", values, "rqUsername");
            return (Criteria) this;
        }

        public Criteria andRqUsernameBetween(String value1, String value2) {
            addCriterion("rq_username between", value1, value2, "rqUsername");
            return (Criteria) this;
        }

        public Criteria andRqUsernameNotBetween(String value1, String value2) {
            addCriterion("rq_username not between", value1, value2, "rqUsername");
            return (Criteria) this;
        }

        public Criteria andRqPublishtimeIsNull() {
            addCriterion("rq_publishTime is null");
            return (Criteria) this;
        }

        public Criteria andRqPublishtimeIsNotNull() {
            addCriterion("rq_publishTime is not null");
            return (Criteria) this;
        }

        public Criteria andRqPublishtimeEqualTo(Date value) {
            addCriterion("rq_publishTime =", value, "rqPublishtime");
            return (Criteria) this;
        }

        public Criteria andRqPublishtimeNotEqualTo(Date value) {
            addCriterion("rq_publishTime <>", value, "rqPublishtime");
            return (Criteria) this;
        }

        public Criteria andRqPublishtimeGreaterThan(Date value) {
            addCriterion("rq_publishTime >", value, "rqPublishtime");
            return (Criteria) this;
        }

        public Criteria andRqPublishtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("rq_publishTime >=", value, "rqPublishtime");
            return (Criteria) this;
        }

        public Criteria andRqPublishtimeLessThan(Date value) {
            addCriterion("rq_publishTime <", value, "rqPublishtime");
            return (Criteria) this;
        }

        public Criteria andRqPublishtimeLessThanOrEqualTo(Date value) {
            addCriterion("rq_publishTime <=", value, "rqPublishtime");
            return (Criteria) this;
        }

        public Criteria andRqPublishtimeIn(List<Date> values) {
            addCriterion("rq_publishTime in", values, "rqPublishtime");
            return (Criteria) this;
        }

        public Criteria andRqPublishtimeNotIn(List<Date> values) {
            addCriterion("rq_publishTime not in", values, "rqPublishtime");
            return (Criteria) this;
        }

        public Criteria andRqPublishtimeBetween(Date value1, Date value2) {
            addCriterion("rq_publishTime between", value1, value2, "rqPublishtime");
            return (Criteria) this;
        }

        public Criteria andRqPublishtimeNotBetween(Date value1, Date value2) {
            addCriterion("rq_publishTime not between", value1, value2, "rqPublishtime");
            return (Criteria) this;
        }

        public Criteria andRqContenttimeIsNull() {
            addCriterion("rq_contentTime is null");
            return (Criteria) this;
        }

        public Criteria andRqContenttimeIsNotNull() {
            addCriterion("rq_contentTime is not null");
            return (Criteria) this;
        }

        public Criteria andRqContenttimeEqualTo(Date value) {
            addCriterion("rq_contentTime =", value, "rqContenttime");
            return (Criteria) this;
        }

        public Criteria andRqContenttimeNotEqualTo(Date value) {
            addCriterion("rq_contentTime <>", value, "rqContenttime");
            return (Criteria) this;
        }

        public Criteria andRqContenttimeGreaterThan(Date value) {
            addCriterion("rq_contentTime >", value, "rqContenttime");
            return (Criteria) this;
        }

        public Criteria andRqContenttimeGreaterThanOrEqualTo(Date value) {
            addCriterion("rq_contentTime >=", value, "rqContenttime");
            return (Criteria) this;
        }

        public Criteria andRqContenttimeLessThan(Date value) {
            addCriterion("rq_contentTime <", value, "rqContenttime");
            return (Criteria) this;
        }

        public Criteria andRqContenttimeLessThanOrEqualTo(Date value) {
            addCriterion("rq_contentTime <=", value, "rqContenttime");
            return (Criteria) this;
        }

        public Criteria andRqContenttimeIn(List<Date> values) {
            addCriterion("rq_contentTime in", values, "rqContenttime");
            return (Criteria) this;
        }

        public Criteria andRqContenttimeNotIn(List<Date> values) {
            addCriterion("rq_contentTime not in", values, "rqContenttime");
            return (Criteria) this;
        }

        public Criteria andRqContenttimeBetween(Date value1, Date value2) {
            addCriterion("rq_contentTime between", value1, value2, "rqContenttime");
            return (Criteria) this;
        }

        public Criteria andRqContenttimeNotBetween(Date value1, Date value2) {
            addCriterion("rq_contentTime not between", value1, value2, "rqContenttime");
            return (Criteria) this;
        }

        public Criteria andRqFloorIsNull() {
            addCriterion("rq_floor is null");
            return (Criteria) this;
        }

        public Criteria andRqFloorIsNotNull() {
            addCriterion("rq_floor is not null");
            return (Criteria) this;
        }

        public Criteria andRqFloorEqualTo(Integer value) {
            addCriterion("rq_floor =", value, "rqFloor");
            return (Criteria) this;
        }

        public Criteria andRqFloorNotEqualTo(Integer value) {
            addCriterion("rq_floor <>", value, "rqFloor");
            return (Criteria) this;
        }

        public Criteria andRqFloorGreaterThan(Integer value) {
            addCriterion("rq_floor >", value, "rqFloor");
            return (Criteria) this;
        }

        public Criteria andRqFloorGreaterThanOrEqualTo(Integer value) {
            addCriterion("rq_floor >=", value, "rqFloor");
            return (Criteria) this;
        }

        public Criteria andRqFloorLessThan(Integer value) {
            addCriterion("rq_floor <", value, "rqFloor");
            return (Criteria) this;
        }

        public Criteria andRqFloorLessThanOrEqualTo(Integer value) {
            addCriterion("rq_floor <=", value, "rqFloor");
            return (Criteria) this;
        }

        public Criteria andRqFloorIn(List<Integer> values) {
            addCriterion("rq_floor in", values, "rqFloor");
            return (Criteria) this;
        }

        public Criteria andRqFloorNotIn(List<Integer> values) {
            addCriterion("rq_floor not in", values, "rqFloor");
            return (Criteria) this;
        }

        public Criteria andRqFloorBetween(Integer value1, Integer value2) {
            addCriterion("rq_floor between", value1, value2, "rqFloor");
            return (Criteria) this;
        }

        public Criteria andRqFloorNotBetween(Integer value1, Integer value2) {
            addCriterion("rq_floor not between", value1, value2, "rqFloor");
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