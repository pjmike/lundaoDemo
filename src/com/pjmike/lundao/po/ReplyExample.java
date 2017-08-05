package com.pjmike.lundao.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ReplyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ReplyExample() {
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

        public Criteria andCommentIdIsNull() {
            addCriterion("comment_id is null");
            return (Criteria) this;
        }

        public Criteria andCommentIdIsNotNull() {
            addCriterion("comment_id is not null");
            return (Criteria) this;
        }

        public Criteria andCommentIdEqualTo(Integer value) {
            addCriterion("comment_id =", value, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdNotEqualTo(Integer value) {
            addCriterion("comment_id <>", value, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdGreaterThan(Integer value) {
            addCriterion("comment_id >", value, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("comment_id >=", value, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdLessThan(Integer value) {
            addCriterion("comment_id <", value, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdLessThanOrEqualTo(Integer value) {
            addCriterion("comment_id <=", value, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdIn(List<Integer> values) {
            addCriterion("comment_id in", values, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdNotIn(List<Integer> values) {
            addCriterion("comment_id not in", values, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdBetween(Integer value1, Integer value2) {
            addCriterion("comment_id between", value1, value2, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdNotBetween(Integer value1, Integer value2) {
            addCriterion("comment_id not between", value1, value2, "commentId");
            return (Criteria) this;
        }

        public Criteria andReplyIdIsNull() {
            addCriterion("reply_id is null");
            return (Criteria) this;
        }

        public Criteria andReplyIdIsNotNull() {
            addCriterion("reply_id is not null");
            return (Criteria) this;
        }

        public Criteria andReplyIdEqualTo(Integer value) {
            addCriterion("reply_id =", value, "replyId");
            return (Criteria) this;
        }

        public Criteria andReplyIdNotEqualTo(Integer value) {
            addCriterion("reply_id <>", value, "replyId");
            return (Criteria) this;
        }

        public Criteria andReplyIdGreaterThan(Integer value) {
            addCriterion("reply_id >", value, "replyId");
            return (Criteria) this;
        }

        public Criteria andReplyIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("reply_id >=", value, "replyId");
            return (Criteria) this;
        }

        public Criteria andReplyIdLessThan(Integer value) {
            addCriterion("reply_id <", value, "replyId");
            return (Criteria) this;
        }

        public Criteria andReplyIdLessThanOrEqualTo(Integer value) {
            addCriterion("reply_id <=", value, "replyId");
            return (Criteria) this;
        }

        public Criteria andReplyIdIn(List<Integer> values) {
            addCriterion("reply_id in", values, "replyId");
            return (Criteria) this;
        }

        public Criteria andReplyIdNotIn(List<Integer> values) {
            addCriterion("reply_id not in", values, "replyId");
            return (Criteria) this;
        }

        public Criteria andReplyIdBetween(Integer value1, Integer value2) {
            addCriterion("reply_id between", value1, value2, "replyId");
            return (Criteria) this;
        }

        public Criteria andReplyIdNotBetween(Integer value1, Integer value2) {
            addCriterion("reply_id not between", value1, value2, "replyId");
            return (Criteria) this;
        }

        public Criteria andFromUidIsNull() {
            addCriterion("from_uid is null");
            return (Criteria) this;
        }

        public Criteria andFromUidIsNotNull() {
            addCriterion("from_uid is not null");
            return (Criteria) this;
        }

        public Criteria andFromUidEqualTo(Integer value) {
            addCriterion("from_uid =", value, "fromUid");
            return (Criteria) this;
        }

        public Criteria andFromUidNotEqualTo(Integer value) {
            addCriterion("from_uid <>", value, "fromUid");
            return (Criteria) this;
        }

        public Criteria andFromUidGreaterThan(Integer value) {
            addCriterion("from_uid >", value, "fromUid");
            return (Criteria) this;
        }

        public Criteria andFromUidGreaterThanOrEqualTo(Integer value) {
            addCriterion("from_uid >=", value, "fromUid");
            return (Criteria) this;
        }

        public Criteria andFromUidLessThan(Integer value) {
            addCriterion("from_uid <", value, "fromUid");
            return (Criteria) this;
        }

        public Criteria andFromUidLessThanOrEqualTo(Integer value) {
            addCriterion("from_uid <=", value, "fromUid");
            return (Criteria) this;
        }

        public Criteria andFromUidIn(List<Integer> values) {
            addCriterion("from_uid in", values, "fromUid");
            return (Criteria) this;
        }

        public Criteria andFromUidNotIn(List<Integer> values) {
            addCriterion("from_uid not in", values, "fromUid");
            return (Criteria) this;
        }

        public Criteria andFromUidBetween(Integer value1, Integer value2) {
            addCriterion("from_uid between", value1, value2, "fromUid");
            return (Criteria) this;
        }

        public Criteria andFromUidNotBetween(Integer value1, Integer value2) {
            addCriterion("from_uid not between", value1, value2, "fromUid");
            return (Criteria) this;
        }

        public Criteria andToUidIsNull() {
            addCriterion("to_uid is null");
            return (Criteria) this;
        }

        public Criteria andToUidIsNotNull() {
            addCriterion("to_uid is not null");
            return (Criteria) this;
        }

        public Criteria andToUidEqualTo(Integer value) {
            addCriterion("to_uid =", value, "toUid");
            return (Criteria) this;
        }

        public Criteria andToUidNotEqualTo(Integer value) {
            addCriterion("to_uid <>", value, "toUid");
            return (Criteria) this;
        }

        public Criteria andToUidGreaterThan(Integer value) {
            addCriterion("to_uid >", value, "toUid");
            return (Criteria) this;
        }

        public Criteria andToUidGreaterThanOrEqualTo(Integer value) {
            addCriterion("to_uid >=", value, "toUid");
            return (Criteria) this;
        }

        public Criteria andToUidLessThan(Integer value) {
            addCriterion("to_uid <", value, "toUid");
            return (Criteria) this;
        }

        public Criteria andToUidLessThanOrEqualTo(Integer value) {
            addCriterion("to_uid <=", value, "toUid");
            return (Criteria) this;
        }

        public Criteria andToUidIn(List<Integer> values) {
            addCriterion("to_uid in", values, "toUid");
            return (Criteria) this;
        }

        public Criteria andToUidNotIn(List<Integer> values) {
            addCriterion("to_uid not in", values, "toUid");
            return (Criteria) this;
        }

        public Criteria andToUidBetween(Integer value1, Integer value2) {
            addCriterion("to_uid between", value1, value2, "toUid");
            return (Criteria) this;
        }

        public Criteria andToUidNotBetween(Integer value1, Integer value2) {
            addCriterion("to_uid not between", value1, value2, "toUid");
            return (Criteria) this;
        }

        public Criteria andRTypeIsNull() {
            addCriterion("r_type is null");
            return (Criteria) this;
        }

        public Criteria andRTypeIsNotNull() {
            addCriterion("r_type is not null");
            return (Criteria) this;
        }

        public Criteria andRTypeEqualTo(String value) {
            addCriterion("r_type =", value, "rType");
            return (Criteria) this;
        }

        public Criteria andRTypeNotEqualTo(String value) {
            addCriterion("r_type <>", value, "rType");
            return (Criteria) this;
        }

        public Criteria andRTypeGreaterThan(String value) {
            addCriterion("r_type >", value, "rType");
            return (Criteria) this;
        }

        public Criteria andRTypeGreaterThanOrEqualTo(String value) {
            addCriterion("r_type >=", value, "rType");
            return (Criteria) this;
        }

        public Criteria andRTypeLessThan(String value) {
            addCriterion("r_type <", value, "rType");
            return (Criteria) this;
        }

        public Criteria andRTypeLessThanOrEqualTo(String value) {
            addCriterion("r_type <=", value, "rType");
            return (Criteria) this;
        }

        public Criteria andRTypeLike(String value) {
            addCriterion("r_type like", value, "rType");
            return (Criteria) this;
        }

        public Criteria andRTypeNotLike(String value) {
            addCriterion("r_type not like", value, "rType");
            return (Criteria) this;
        }

        public Criteria andRTypeIn(List<String> values) {
            addCriterion("r_type in", values, "rType");
            return (Criteria) this;
        }

        public Criteria andRTypeNotIn(List<String> values) {
            addCriterion("r_type not in", values, "rType");
            return (Criteria) this;
        }

        public Criteria andRTypeBetween(String value1, String value2) {
            addCriterion("r_type between", value1, value2, "rType");
            return (Criteria) this;
        }

        public Criteria andRTypeNotBetween(String value1, String value2) {
            addCriterion("r_type not between", value1, value2, "rType");
            return (Criteria) this;
        }

        public Criteria andRViewIsNull() {
            addCriterion("r_view is null");
            return (Criteria) this;
        }

        public Criteria andRViewIsNotNull() {
            addCriterion("r_view is not null");
            return (Criteria) this;
        }

        public Criteria andRViewEqualTo(Integer value) {
            addCriterion("r_view =", value, "rView");
            return (Criteria) this;
        }

        public Criteria andRViewNotEqualTo(Integer value) {
            addCriterion("r_view <>", value, "rView");
            return (Criteria) this;
        }

        public Criteria andRViewGreaterThan(Integer value) {
            addCriterion("r_view >", value, "rView");
            return (Criteria) this;
        }

        public Criteria andRViewGreaterThanOrEqualTo(Integer value) {
            addCriterion("r_view >=", value, "rView");
            return (Criteria) this;
        }

        public Criteria andRViewLessThan(Integer value) {
            addCriterion("r_view <", value, "rView");
            return (Criteria) this;
        }

        public Criteria andRViewLessThanOrEqualTo(Integer value) {
            addCriterion("r_view <=", value, "rView");
            return (Criteria) this;
        }

        public Criteria andRViewIn(List<Integer> values) {
            addCriterion("r_view in", values, "rView");
            return (Criteria) this;
        }

        public Criteria andRViewNotIn(List<Integer> values) {
            addCriterion("r_view not in", values, "rView");
            return (Criteria) this;
        }

        public Criteria andRViewBetween(Integer value1, Integer value2) {
            addCriterion("r_view between", value1, value2, "rView");
            return (Criteria) this;
        }

        public Criteria andRViewNotBetween(Integer value1, Integer value2) {
            addCriterion("r_view not between", value1, value2, "rView");
            return (Criteria) this;
        }

        public Criteria andRLikeIsNull() {
            addCriterion("r_like is null");
            return (Criteria) this;
        }

        public Criteria andRLikeIsNotNull() {
            addCriterion("r_like is not null");
            return (Criteria) this;
        }

        public Criteria andRLikeEqualTo(Integer value) {
            addCriterion("r_like =", value, "rLike");
            return (Criteria) this;
        }

        public Criteria andRLikeNotEqualTo(Integer value) {
            addCriterion("r_like <>", value, "rLike");
            return (Criteria) this;
        }

        public Criteria andRLikeGreaterThan(Integer value) {
            addCriterion("r_like >", value, "rLike");
            return (Criteria) this;
        }

        public Criteria andRLikeGreaterThanOrEqualTo(Integer value) {
            addCriterion("r_like >=", value, "rLike");
            return (Criteria) this;
        }

        public Criteria andRLikeLessThan(Integer value) {
            addCriterion("r_like <", value, "rLike");
            return (Criteria) this;
        }

        public Criteria andRLikeLessThanOrEqualTo(Integer value) {
            addCriterion("r_like <=", value, "rLike");
            return (Criteria) this;
        }

        public Criteria andRLikeIn(List<Integer> values) {
            addCriterion("r_like in", values, "rLike");
            return (Criteria) this;
        }

        public Criteria andRLikeNotIn(List<Integer> values) {
            addCriterion("r_like not in", values, "rLike");
            return (Criteria) this;
        }

        public Criteria andRLikeBetween(Integer value1, Integer value2) {
            addCriterion("r_like between", value1, value2, "rLike");
            return (Criteria) this;
        }

        public Criteria andRLikeNotBetween(Integer value1, Integer value2) {
            addCriterion("r_like not between", value1, value2, "rLike");
            return (Criteria) this;
        }

        public Criteria andRAttentionIsNull() {
            addCriterion("r_attention is null");
            return (Criteria) this;
        }

        public Criteria andRAttentionIsNotNull() {
            addCriterion("r_attention is not null");
            return (Criteria) this;
        }

        public Criteria andRAttentionEqualTo(Integer value) {
            addCriterion("r_attention =", value, "rAttention");
            return (Criteria) this;
        }

        public Criteria andRAttentionNotEqualTo(Integer value) {
            addCriterion("r_attention <>", value, "rAttention");
            return (Criteria) this;
        }

        public Criteria andRAttentionGreaterThan(Integer value) {
            addCriterion("r_attention >", value, "rAttention");
            return (Criteria) this;
        }

        public Criteria andRAttentionGreaterThanOrEqualTo(Integer value) {
            addCriterion("r_attention >=", value, "rAttention");
            return (Criteria) this;
        }

        public Criteria andRAttentionLessThan(Integer value) {
            addCriterion("r_attention <", value, "rAttention");
            return (Criteria) this;
        }

        public Criteria andRAttentionLessThanOrEqualTo(Integer value) {
            addCriterion("r_attention <=", value, "rAttention");
            return (Criteria) this;
        }

        public Criteria andRAttentionIn(List<Integer> values) {
            addCriterion("r_attention in", values, "rAttention");
            return (Criteria) this;
        }

        public Criteria andRAttentionNotIn(List<Integer> values) {
            addCriterion("r_attention not in", values, "rAttention");
            return (Criteria) this;
        }

        public Criteria andRAttentionBetween(Integer value1, Integer value2) {
            addCriterion("r_attention between", value1, value2, "rAttention");
            return (Criteria) this;
        }

        public Criteria andRAttentionNotBetween(Integer value1, Integer value2) {
            addCriterion("r_attention not between", value1, value2, "rAttention");
            return (Criteria) this;
        }

        public Criteria andRDislikeIsNull() {
            addCriterion("r_dislike is null");
            return (Criteria) this;
        }

        public Criteria andRDislikeIsNotNull() {
            addCriterion("r_dislike is not null");
            return (Criteria) this;
        }

        public Criteria andRDislikeEqualTo(Integer value) {
            addCriterion("r_dislike =", value, "rDislike");
            return (Criteria) this;
        }

        public Criteria andRDislikeNotEqualTo(Integer value) {
            addCriterion("r_dislike <>", value, "rDislike");
            return (Criteria) this;
        }

        public Criteria andRDislikeGreaterThan(Integer value) {
            addCriterion("r_dislike >", value, "rDislike");
            return (Criteria) this;
        }

        public Criteria andRDislikeGreaterThanOrEqualTo(Integer value) {
            addCriterion("r_dislike >=", value, "rDislike");
            return (Criteria) this;
        }

        public Criteria andRDislikeLessThan(Integer value) {
            addCriterion("r_dislike <", value, "rDislike");
            return (Criteria) this;
        }

        public Criteria andRDislikeLessThanOrEqualTo(Integer value) {
            addCriterion("r_dislike <=", value, "rDislike");
            return (Criteria) this;
        }

        public Criteria andRDislikeIn(List<Integer> values) {
            addCriterion("r_dislike in", values, "rDislike");
            return (Criteria) this;
        }

        public Criteria andRDislikeNotIn(List<Integer> values) {
            addCriterion("r_dislike not in", values, "rDislike");
            return (Criteria) this;
        }

        public Criteria andRDislikeBetween(Integer value1, Integer value2) {
            addCriterion("r_dislike between", value1, value2, "rDislike");
            return (Criteria) this;
        }

        public Criteria andRDislikeNotBetween(Integer value1, Integer value2) {
            addCriterion("r_dislike not between", value1, value2, "rDislike");
            return (Criteria) this;
        }

        public Criteria andRPublishtimeIsNull() {
            addCriterion("r_publishTime is null");
            return (Criteria) this;
        }

        public Criteria andRPublishtimeIsNotNull() {
            addCriterion("r_publishTime is not null");
            return (Criteria) this;
        }

        public Criteria andRPublishtimeEqualTo(Date value) {
            addCriterion("r_publishTime =", value, "rPublishtime");
            return (Criteria) this;
        }

        public Criteria andRPublishtimeNotEqualTo(Date value) {
            addCriterion("r_publishTime <>", value, "rPublishtime");
            return (Criteria) this;
        }

        public Criteria andRPublishtimeGreaterThan(Date value) {
            addCriterion("r_publishTime >", value, "rPublishtime");
            return (Criteria) this;
        }

        public Criteria andRPublishtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("r_publishTime >=", value, "rPublishtime");
            return (Criteria) this;
        }

        public Criteria andRPublishtimeLessThan(Date value) {
            addCriterion("r_publishTime <", value, "rPublishtime");
            return (Criteria) this;
        }

        public Criteria andRPublishtimeLessThanOrEqualTo(Date value) {
            addCriterion("r_publishTime <=", value, "rPublishtime");
            return (Criteria) this;
        }

        public Criteria andRPublishtimeIn(List<Date> values) {
            addCriterion("r_publishTime in", values, "rPublishtime");
            return (Criteria) this;
        }

        public Criteria andRPublishtimeNotIn(List<Date> values) {
            addCriterion("r_publishTime not in", values, "rPublishtime");
            return (Criteria) this;
        }

        public Criteria andRPublishtimeBetween(Date value1, Date value2) {
            addCriterion("r_publishTime between", value1, value2, "rPublishtime");
            return (Criteria) this;
        }

        public Criteria andRPublishtimeNotBetween(Date value1, Date value2) {
            addCriterion("r_publishTime not between", value1, value2, "rPublishtime");
            return (Criteria) this;
        }

        public Criteria andRContenttimeIsNull() {
            addCriterion("r_contentTime is null");
            return (Criteria) this;
        }

        public Criteria andRContenttimeIsNotNull() {
            addCriterion("r_contentTime is not null");
            return (Criteria) this;
        }

        public Criteria andRContenttimeEqualTo(Date value) {
            addCriterion("r_contentTime =", value, "rContenttime");
            return (Criteria) this;
        }

        public Criteria andRContenttimeNotEqualTo(Date value) {
            addCriterion("r_contentTime <>", value, "rContenttime");
            return (Criteria) this;
        }

        public Criteria andRContenttimeGreaterThan(Date value) {
            addCriterion("r_contentTime >", value, "rContenttime");
            return (Criteria) this;
        }

        public Criteria andRContenttimeGreaterThanOrEqualTo(Date value) {
            addCriterion("r_contentTime >=", value, "rContenttime");
            return (Criteria) this;
        }

        public Criteria andRContenttimeLessThan(Date value) {
            addCriterion("r_contentTime <", value, "rContenttime");
            return (Criteria) this;
        }

        public Criteria andRContenttimeLessThanOrEqualTo(Date value) {
            addCriterion("r_contentTime <=", value, "rContenttime");
            return (Criteria) this;
        }

        public Criteria andRContenttimeIn(List<Date> values) {
            addCriterion("r_contentTime in", values, "rContenttime");
            return (Criteria) this;
        }

        public Criteria andRContenttimeNotIn(List<Date> values) {
            addCriterion("r_contentTime not in", values, "rContenttime");
            return (Criteria) this;
        }

        public Criteria andRContenttimeBetween(Date value1, Date value2) {
            addCriterion("r_contentTime between", value1, value2, "rContenttime");
            return (Criteria) this;
        }

        public Criteria andRContenttimeNotBetween(Date value1, Date value2) {
            addCriterion("r_contentTime not between", value1, value2, "rContenttime");
            return (Criteria) this;
        }

        public Criteria andRFloorIsNull() {
            addCriterion("r_floor is null");
            return (Criteria) this;
        }

        public Criteria andRFloorIsNotNull() {
            addCriterion("r_floor is not null");
            return (Criteria) this;
        }

        public Criteria andRFloorEqualTo(Integer value) {
            addCriterion("r_floor =", value, "rFloor");
            return (Criteria) this;
        }

        public Criteria andRFloorNotEqualTo(Integer value) {
            addCriterion("r_floor <>", value, "rFloor");
            return (Criteria) this;
        }

        public Criteria andRFloorGreaterThan(Integer value) {
            addCriterion("r_floor >", value, "rFloor");
            return (Criteria) this;
        }

        public Criteria andRFloorGreaterThanOrEqualTo(Integer value) {
            addCriterion("r_floor >=", value, "rFloor");
            return (Criteria) this;
        }

        public Criteria andRFloorLessThan(Integer value) {
            addCriterion("r_floor <", value, "rFloor");
            return (Criteria) this;
        }

        public Criteria andRFloorLessThanOrEqualTo(Integer value) {
            addCriterion("r_floor <=", value, "rFloor");
            return (Criteria) this;
        }

        public Criteria andRFloorIn(List<Integer> values) {
            addCriterion("r_floor in", values, "rFloor");
            return (Criteria) this;
        }

        public Criteria andRFloorNotIn(List<Integer> values) {
            addCriterion("r_floor not in", values, "rFloor");
            return (Criteria) this;
        }

        public Criteria andRFloorBetween(Integer value1, Integer value2) {
            addCriterion("r_floor between", value1, value2, "rFloor");
            return (Criteria) this;
        }

        public Criteria andRFloorNotBetween(Integer value1, Integer value2) {
            addCriterion("r_floor not between", value1, value2, "rFloor");
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