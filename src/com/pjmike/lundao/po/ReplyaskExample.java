package com.pjmike.lundao.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ReplyaskExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ReplyaskExample() {
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

        public Criteria andReplyakdidIsNull() {
            addCriterion("replyakdId is null");
            return (Criteria) this;
        }

        public Criteria andReplyakdidIsNotNull() {
            addCriterion("replyakdId is not null");
            return (Criteria) this;
        }

        public Criteria andReplyakdidEqualTo(Integer value) {
            addCriterion("replyakdId =", value, "replyakdid");
            return (Criteria) this;
        }

        public Criteria andReplyakdidNotEqualTo(Integer value) {
            addCriterion("replyakdId <>", value, "replyakdid");
            return (Criteria) this;
        }

        public Criteria andReplyakdidGreaterThan(Integer value) {
            addCriterion("replyakdId >", value, "replyakdid");
            return (Criteria) this;
        }

        public Criteria andReplyakdidGreaterThanOrEqualTo(Integer value) {
            addCriterion("replyakdId >=", value, "replyakdid");
            return (Criteria) this;
        }

        public Criteria andReplyakdidLessThan(Integer value) {
            addCriterion("replyakdId <", value, "replyakdid");
            return (Criteria) this;
        }

        public Criteria andReplyakdidLessThanOrEqualTo(Integer value) {
            addCriterion("replyakdId <=", value, "replyakdid");
            return (Criteria) this;
        }

        public Criteria andReplyakdidIn(List<Integer> values) {
            addCriterion("replyakdId in", values, "replyakdid");
            return (Criteria) this;
        }

        public Criteria andReplyakdidNotIn(List<Integer> values) {
            addCriterion("replyakdId not in", values, "replyakdid");
            return (Criteria) this;
        }

        public Criteria andReplyakdidBetween(Integer value1, Integer value2) {
            addCriterion("replyakdId between", value1, value2, "replyakdid");
            return (Criteria) this;
        }

        public Criteria andReplyakdidNotBetween(Integer value1, Integer value2) {
            addCriterion("replyakdId not between", value1, value2, "replyakdid");
            return (Criteria) this;
        }

        public Criteria andRaAskidIsNull() {
            addCriterion("ra_askId is null");
            return (Criteria) this;
        }

        public Criteria andRaAskidIsNotNull() {
            addCriterion("ra_askId is not null");
            return (Criteria) this;
        }

        public Criteria andRaAskidEqualTo(Integer value) {
            addCriterion("ra_askId =", value, "raAskid");
            return (Criteria) this;
        }

        public Criteria andRaAskidNotEqualTo(Integer value) {
            addCriterion("ra_askId <>", value, "raAskid");
            return (Criteria) this;
        }

        public Criteria andRaAskidGreaterThan(Integer value) {
            addCriterion("ra_askId >", value, "raAskid");
            return (Criteria) this;
        }

        public Criteria andRaAskidGreaterThanOrEqualTo(Integer value) {
            addCriterion("ra_askId >=", value, "raAskid");
            return (Criteria) this;
        }

        public Criteria andRaAskidLessThan(Integer value) {
            addCriterion("ra_askId <", value, "raAskid");
            return (Criteria) this;
        }

        public Criteria andRaAskidLessThanOrEqualTo(Integer value) {
            addCriterion("ra_askId <=", value, "raAskid");
            return (Criteria) this;
        }

        public Criteria andRaAskidIn(List<Integer> values) {
            addCriterion("ra_askId in", values, "raAskid");
            return (Criteria) this;
        }

        public Criteria andRaAskidNotIn(List<Integer> values) {
            addCriterion("ra_askId not in", values, "raAskid");
            return (Criteria) this;
        }

        public Criteria andRaAskidBetween(Integer value1, Integer value2) {
            addCriterion("ra_askId between", value1, value2, "raAskid");
            return (Criteria) this;
        }

        public Criteria andRaAskidNotBetween(Integer value1, Integer value2) {
            addCriterion("ra_askId not between", value1, value2, "raAskid");
            return (Criteria) this;
        }

        public Criteria andRaViewIsNull() {
            addCriterion("ra_view is null");
            return (Criteria) this;
        }

        public Criteria andRaViewIsNotNull() {
            addCriterion("ra_view is not null");
            return (Criteria) this;
        }

        public Criteria andRaViewEqualTo(Integer value) {
            addCriterion("ra_view =", value, "raView");
            return (Criteria) this;
        }

        public Criteria andRaViewNotEqualTo(Integer value) {
            addCriterion("ra_view <>", value, "raView");
            return (Criteria) this;
        }

        public Criteria andRaViewGreaterThan(Integer value) {
            addCriterion("ra_view >", value, "raView");
            return (Criteria) this;
        }

        public Criteria andRaViewGreaterThanOrEqualTo(Integer value) {
            addCriterion("ra_view >=", value, "raView");
            return (Criteria) this;
        }

        public Criteria andRaViewLessThan(Integer value) {
            addCriterion("ra_view <", value, "raView");
            return (Criteria) this;
        }

        public Criteria andRaViewLessThanOrEqualTo(Integer value) {
            addCriterion("ra_view <=", value, "raView");
            return (Criteria) this;
        }

        public Criteria andRaViewIn(List<Integer> values) {
            addCriterion("ra_view in", values, "raView");
            return (Criteria) this;
        }

        public Criteria andRaViewNotIn(List<Integer> values) {
            addCriterion("ra_view not in", values, "raView");
            return (Criteria) this;
        }

        public Criteria andRaViewBetween(Integer value1, Integer value2) {
            addCriterion("ra_view between", value1, value2, "raView");
            return (Criteria) this;
        }

        public Criteria andRaViewNotBetween(Integer value1, Integer value2) {
            addCriterion("ra_view not between", value1, value2, "raView");
            return (Criteria) this;
        }

        public Criteria andRaLikeIsNull() {
            addCriterion("ra_like is null");
            return (Criteria) this;
        }

        public Criteria andRaLikeIsNotNull() {
            addCriterion("ra_like is not null");
            return (Criteria) this;
        }

        public Criteria andRaLikeEqualTo(Integer value) {
            addCriterion("ra_like =", value, "raLike");
            return (Criteria) this;
        }

        public Criteria andRaLikeNotEqualTo(Integer value) {
            addCriterion("ra_like <>", value, "raLike");
            return (Criteria) this;
        }

        public Criteria andRaLikeGreaterThan(Integer value) {
            addCriterion("ra_like >", value, "raLike");
            return (Criteria) this;
        }

        public Criteria andRaLikeGreaterThanOrEqualTo(Integer value) {
            addCriterion("ra_like >=", value, "raLike");
            return (Criteria) this;
        }

        public Criteria andRaLikeLessThan(Integer value) {
            addCriterion("ra_like <", value, "raLike");
            return (Criteria) this;
        }

        public Criteria andRaLikeLessThanOrEqualTo(Integer value) {
            addCriterion("ra_like <=", value, "raLike");
            return (Criteria) this;
        }

        public Criteria andRaLikeIn(List<Integer> values) {
            addCriterion("ra_like in", values, "raLike");
            return (Criteria) this;
        }

        public Criteria andRaLikeNotIn(List<Integer> values) {
            addCriterion("ra_like not in", values, "raLike");
            return (Criteria) this;
        }

        public Criteria andRaLikeBetween(Integer value1, Integer value2) {
            addCriterion("ra_like between", value1, value2, "raLike");
            return (Criteria) this;
        }

        public Criteria andRaLikeNotBetween(Integer value1, Integer value2) {
            addCriterion("ra_like not between", value1, value2, "raLike");
            return (Criteria) this;
        }

        public Criteria andRaAttentionIsNull() {
            addCriterion("ra_attention is null");
            return (Criteria) this;
        }

        public Criteria andRaAttentionIsNotNull() {
            addCriterion("ra_attention is not null");
            return (Criteria) this;
        }

        public Criteria andRaAttentionEqualTo(Integer value) {
            addCriterion("ra_attention =", value, "raAttention");
            return (Criteria) this;
        }

        public Criteria andRaAttentionNotEqualTo(Integer value) {
            addCriterion("ra_attention <>", value, "raAttention");
            return (Criteria) this;
        }

        public Criteria andRaAttentionGreaterThan(Integer value) {
            addCriterion("ra_attention >", value, "raAttention");
            return (Criteria) this;
        }

        public Criteria andRaAttentionGreaterThanOrEqualTo(Integer value) {
            addCriterion("ra_attention >=", value, "raAttention");
            return (Criteria) this;
        }

        public Criteria andRaAttentionLessThan(Integer value) {
            addCriterion("ra_attention <", value, "raAttention");
            return (Criteria) this;
        }

        public Criteria andRaAttentionLessThanOrEqualTo(Integer value) {
            addCriterion("ra_attention <=", value, "raAttention");
            return (Criteria) this;
        }

        public Criteria andRaAttentionIn(List<Integer> values) {
            addCriterion("ra_attention in", values, "raAttention");
            return (Criteria) this;
        }

        public Criteria andRaAttentionNotIn(List<Integer> values) {
            addCriterion("ra_attention not in", values, "raAttention");
            return (Criteria) this;
        }

        public Criteria andRaAttentionBetween(Integer value1, Integer value2) {
            addCriterion("ra_attention between", value1, value2, "raAttention");
            return (Criteria) this;
        }

        public Criteria andRaAttentionNotBetween(Integer value1, Integer value2) {
            addCriterion("ra_attention not between", value1, value2, "raAttention");
            return (Criteria) this;
        }

        public Criteria andRaDislikeIsNull() {
            addCriterion("ra_dislike is null");
            return (Criteria) this;
        }

        public Criteria andRaDislikeIsNotNull() {
            addCriterion("ra_dislike is not null");
            return (Criteria) this;
        }

        public Criteria andRaDislikeEqualTo(Integer value) {
            addCriterion("ra_dislike =", value, "raDislike");
            return (Criteria) this;
        }

        public Criteria andRaDislikeNotEqualTo(Integer value) {
            addCriterion("ra_dislike <>", value, "raDislike");
            return (Criteria) this;
        }

        public Criteria andRaDislikeGreaterThan(Integer value) {
            addCriterion("ra_dislike >", value, "raDislike");
            return (Criteria) this;
        }

        public Criteria andRaDislikeGreaterThanOrEqualTo(Integer value) {
            addCriterion("ra_dislike >=", value, "raDislike");
            return (Criteria) this;
        }

        public Criteria andRaDislikeLessThan(Integer value) {
            addCriterion("ra_dislike <", value, "raDislike");
            return (Criteria) this;
        }

        public Criteria andRaDislikeLessThanOrEqualTo(Integer value) {
            addCriterion("ra_dislike <=", value, "raDislike");
            return (Criteria) this;
        }

        public Criteria andRaDislikeIn(List<Integer> values) {
            addCriterion("ra_dislike in", values, "raDislike");
            return (Criteria) this;
        }

        public Criteria andRaDislikeNotIn(List<Integer> values) {
            addCriterion("ra_dislike not in", values, "raDislike");
            return (Criteria) this;
        }

        public Criteria andRaDislikeBetween(Integer value1, Integer value2) {
            addCriterion("ra_dislike between", value1, value2, "raDislike");
            return (Criteria) this;
        }

        public Criteria andRaDislikeNotBetween(Integer value1, Integer value2) {
            addCriterion("ra_dislike not between", value1, value2, "raDislike");
            return (Criteria) this;
        }

        public Criteria andRaReplyidIsNull() {
            addCriterion("ra_replyid is null");
            return (Criteria) this;
        }

        public Criteria andRaReplyidIsNotNull() {
            addCriterion("ra_replyid is not null");
            return (Criteria) this;
        }

        public Criteria andRaReplyidEqualTo(Integer value) {
            addCriterion("ra_replyid =", value, "raReplyid");
            return (Criteria) this;
        }

        public Criteria andRaReplyidNotEqualTo(Integer value) {
            addCriterion("ra_replyid <>", value, "raReplyid");
            return (Criteria) this;
        }

        public Criteria andRaReplyidGreaterThan(Integer value) {
            addCriterion("ra_replyid >", value, "raReplyid");
            return (Criteria) this;
        }

        public Criteria andRaReplyidGreaterThanOrEqualTo(Integer value) {
            addCriterion("ra_replyid >=", value, "raReplyid");
            return (Criteria) this;
        }

        public Criteria andRaReplyidLessThan(Integer value) {
            addCriterion("ra_replyid <", value, "raReplyid");
            return (Criteria) this;
        }

        public Criteria andRaReplyidLessThanOrEqualTo(Integer value) {
            addCriterion("ra_replyid <=", value, "raReplyid");
            return (Criteria) this;
        }

        public Criteria andRaReplyidIn(List<Integer> values) {
            addCriterion("ra_replyid in", values, "raReplyid");
            return (Criteria) this;
        }

        public Criteria andRaReplyidNotIn(List<Integer> values) {
            addCriterion("ra_replyid not in", values, "raReplyid");
            return (Criteria) this;
        }

        public Criteria andRaReplyidBetween(Integer value1, Integer value2) {
            addCriterion("ra_replyid between", value1, value2, "raReplyid");
            return (Criteria) this;
        }

        public Criteria andRaReplyidNotBetween(Integer value1, Integer value2) {
            addCriterion("ra_replyid not between", value1, value2, "raReplyid");
            return (Criteria) this;
        }

        public Criteria andRaUsernameIsNull() {
            addCriterion("ra_username is null");
            return (Criteria) this;
        }

        public Criteria andRaUsernameIsNotNull() {
            addCriterion("ra_username is not null");
            return (Criteria) this;
        }

        public Criteria andRaUsernameEqualTo(String value) {
            addCriterion("ra_username =", value, "raUsername");
            return (Criteria) this;
        }

        public Criteria andRaUsernameNotEqualTo(String value) {
            addCriterion("ra_username <>", value, "raUsername");
            return (Criteria) this;
        }

        public Criteria andRaUsernameGreaterThan(String value) {
            addCriterion("ra_username >", value, "raUsername");
            return (Criteria) this;
        }

        public Criteria andRaUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("ra_username >=", value, "raUsername");
            return (Criteria) this;
        }

        public Criteria andRaUsernameLessThan(String value) {
            addCriterion("ra_username <", value, "raUsername");
            return (Criteria) this;
        }

        public Criteria andRaUsernameLessThanOrEqualTo(String value) {
            addCriterion("ra_username <=", value, "raUsername");
            return (Criteria) this;
        }

        public Criteria andRaUsernameLike(String value) {
            addCriterion("ra_username like", value, "raUsername");
            return (Criteria) this;
        }

        public Criteria andRaUsernameNotLike(String value) {
            addCriterion("ra_username not like", value, "raUsername");
            return (Criteria) this;
        }

        public Criteria andRaUsernameIn(List<String> values) {
            addCriterion("ra_username in", values, "raUsername");
            return (Criteria) this;
        }

        public Criteria andRaUsernameNotIn(List<String> values) {
            addCriterion("ra_username not in", values, "raUsername");
            return (Criteria) this;
        }

        public Criteria andRaUsernameBetween(String value1, String value2) {
            addCriterion("ra_username between", value1, value2, "raUsername");
            return (Criteria) this;
        }

        public Criteria andRaUsernameNotBetween(String value1, String value2) {
            addCriterion("ra_username not between", value1, value2, "raUsername");
            return (Criteria) this;
        }

        public Criteria andRaPublishtimeIsNull() {
            addCriterion("ra_publishTime is null");
            return (Criteria) this;
        }

        public Criteria andRaPublishtimeIsNotNull() {
            addCriterion("ra_publishTime is not null");
            return (Criteria) this;
        }

        public Criteria andRaPublishtimeEqualTo(Date value) {
            addCriterion("ra_publishTime =", value, "raPublishtime");
            return (Criteria) this;
        }

        public Criteria andRaPublishtimeNotEqualTo(Date value) {
            addCriterion("ra_publishTime <>", value, "raPublishtime");
            return (Criteria) this;
        }

        public Criteria andRaPublishtimeGreaterThan(Date value) {
            addCriterion("ra_publishTime >", value, "raPublishtime");
            return (Criteria) this;
        }

        public Criteria andRaPublishtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("ra_publishTime >=", value, "raPublishtime");
            return (Criteria) this;
        }

        public Criteria andRaPublishtimeLessThan(Date value) {
            addCriterion("ra_publishTime <", value, "raPublishtime");
            return (Criteria) this;
        }

        public Criteria andRaPublishtimeLessThanOrEqualTo(Date value) {
            addCriterion("ra_publishTime <=", value, "raPublishtime");
            return (Criteria) this;
        }

        public Criteria andRaPublishtimeIn(List<Date> values) {
            addCriterion("ra_publishTime in", values, "raPublishtime");
            return (Criteria) this;
        }

        public Criteria andRaPublishtimeNotIn(List<Date> values) {
            addCriterion("ra_publishTime not in", values, "raPublishtime");
            return (Criteria) this;
        }

        public Criteria andRaPublishtimeBetween(Date value1, Date value2) {
            addCriterion("ra_publishTime between", value1, value2, "raPublishtime");
            return (Criteria) this;
        }

        public Criteria andRaPublishtimeNotBetween(Date value1, Date value2) {
            addCriterion("ra_publishTime not between", value1, value2, "raPublishtime");
            return (Criteria) this;
        }

        public Criteria andRaContenttimeIsNull() {
            addCriterion("ra_contentTime is null");
            return (Criteria) this;
        }

        public Criteria andRaContenttimeIsNotNull() {
            addCriterion("ra_contentTime is not null");
            return (Criteria) this;
        }

        public Criteria andRaContenttimeEqualTo(Date value) {
            addCriterion("ra_contentTime =", value, "raContenttime");
            return (Criteria) this;
        }

        public Criteria andRaContenttimeNotEqualTo(Date value) {
            addCriterion("ra_contentTime <>", value, "raContenttime");
            return (Criteria) this;
        }

        public Criteria andRaContenttimeGreaterThan(Date value) {
            addCriterion("ra_contentTime >", value, "raContenttime");
            return (Criteria) this;
        }

        public Criteria andRaContenttimeGreaterThanOrEqualTo(Date value) {
            addCriterion("ra_contentTime >=", value, "raContenttime");
            return (Criteria) this;
        }

        public Criteria andRaContenttimeLessThan(Date value) {
            addCriterion("ra_contentTime <", value, "raContenttime");
            return (Criteria) this;
        }

        public Criteria andRaContenttimeLessThanOrEqualTo(Date value) {
            addCriterion("ra_contentTime <=", value, "raContenttime");
            return (Criteria) this;
        }

        public Criteria andRaContenttimeIn(List<Date> values) {
            addCriterion("ra_contentTime in", values, "raContenttime");
            return (Criteria) this;
        }

        public Criteria andRaContenttimeNotIn(List<Date> values) {
            addCriterion("ra_contentTime not in", values, "raContenttime");
            return (Criteria) this;
        }

        public Criteria andRaContenttimeBetween(Date value1, Date value2) {
            addCriterion("ra_contentTime between", value1, value2, "raContenttime");
            return (Criteria) this;
        }

        public Criteria andRaContenttimeNotBetween(Date value1, Date value2) {
            addCriterion("ra_contentTime not between", value1, value2, "raContenttime");
            return (Criteria) this;
        }

        public Criteria andRaFloorIsNull() {
            addCriterion("ra_floor is null");
            return (Criteria) this;
        }

        public Criteria andRaFloorIsNotNull() {
            addCriterion("ra_floor is not null");
            return (Criteria) this;
        }

        public Criteria andRaFloorEqualTo(Integer value) {
            addCriterion("ra_floor =", value, "raFloor");
            return (Criteria) this;
        }

        public Criteria andRaFloorNotEqualTo(Integer value) {
            addCriterion("ra_floor <>", value, "raFloor");
            return (Criteria) this;
        }

        public Criteria andRaFloorGreaterThan(Integer value) {
            addCriterion("ra_floor >", value, "raFloor");
            return (Criteria) this;
        }

        public Criteria andRaFloorGreaterThanOrEqualTo(Integer value) {
            addCriterion("ra_floor >=", value, "raFloor");
            return (Criteria) this;
        }

        public Criteria andRaFloorLessThan(Integer value) {
            addCriterion("ra_floor <", value, "raFloor");
            return (Criteria) this;
        }

        public Criteria andRaFloorLessThanOrEqualTo(Integer value) {
            addCriterion("ra_floor <=", value, "raFloor");
            return (Criteria) this;
        }

        public Criteria andRaFloorIn(List<Integer> values) {
            addCriterion("ra_floor in", values, "raFloor");
            return (Criteria) this;
        }

        public Criteria andRaFloorNotIn(List<Integer> values) {
            addCriterion("ra_floor not in", values, "raFloor");
            return (Criteria) this;
        }

        public Criteria andRaFloorBetween(Integer value1, Integer value2) {
            addCriterion("ra_floor between", value1, value2, "raFloor");
            return (Criteria) this;
        }

        public Criteria andRaFloorNotBetween(Integer value1, Integer value2) {
            addCriterion("ra_floor not between", value1, value2, "raFloor");
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