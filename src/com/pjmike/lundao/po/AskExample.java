package com.pjmike.lundao.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AskExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AskExample() {
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

        public Criteria andAskidIsNull() {
            addCriterion("askId is null");
            return (Criteria) this;
        }

        public Criteria andAskidIsNotNull() {
            addCriterion("askId is not null");
            return (Criteria) this;
        }

        public Criteria andAskidEqualTo(Integer value) {
            addCriterion("askId =", value, "askid");
            return (Criteria) this;
        }

        public Criteria andAskidNotEqualTo(Integer value) {
            addCriterion("askId <>", value, "askid");
            return (Criteria) this;
        }

        public Criteria andAskidGreaterThan(Integer value) {
            addCriterion("askId >", value, "askid");
            return (Criteria) this;
        }

        public Criteria andAskidGreaterThanOrEqualTo(Integer value) {
            addCriterion("askId >=", value, "askid");
            return (Criteria) this;
        }

        public Criteria andAskidLessThan(Integer value) {
            addCriterion("askId <", value, "askid");
            return (Criteria) this;
        }

        public Criteria andAskidLessThanOrEqualTo(Integer value) {
            addCriterion("askId <=", value, "askid");
            return (Criteria) this;
        }

        public Criteria andAskidIn(List<Integer> values) {
            addCriterion("askId in", values, "askid");
            return (Criteria) this;
        }

        public Criteria andAskidNotIn(List<Integer> values) {
            addCriterion("askId not in", values, "askid");
            return (Criteria) this;
        }

        public Criteria andAskidBetween(Integer value1, Integer value2) {
            addCriterion("askId between", value1, value2, "askid");
            return (Criteria) this;
        }

        public Criteria andAskidNotBetween(Integer value1, Integer value2) {
            addCriterion("askId not between", value1, value2, "askid");
            return (Criteria) this;
        }

        public Criteria andDebateidIsNull() {
            addCriterion("debateId is null");
            return (Criteria) this;
        }

        public Criteria andDebateidIsNotNull() {
            addCriterion("debateId is not null");
            return (Criteria) this;
        }

        public Criteria andDebateidEqualTo(Integer value) {
            addCriterion("debateId =", value, "debateid");
            return (Criteria) this;
        }

        public Criteria andDebateidNotEqualTo(Integer value) {
            addCriterion("debateId <>", value, "debateid");
            return (Criteria) this;
        }

        public Criteria andDebateidGreaterThan(Integer value) {
            addCriterion("debateId >", value, "debateid");
            return (Criteria) this;
        }

        public Criteria andDebateidGreaterThanOrEqualTo(Integer value) {
            addCriterion("debateId >=", value, "debateid");
            return (Criteria) this;
        }

        public Criteria andDebateidLessThan(Integer value) {
            addCriterion("debateId <", value, "debateid");
            return (Criteria) this;
        }

        public Criteria andDebateidLessThanOrEqualTo(Integer value) {
            addCriterion("debateId <=", value, "debateid");
            return (Criteria) this;
        }

        public Criteria andDebateidIn(List<Integer> values) {
            addCriterion("debateId in", values, "debateid");
            return (Criteria) this;
        }

        public Criteria andDebateidNotIn(List<Integer> values) {
            addCriterion("debateId not in", values, "debateid");
            return (Criteria) this;
        }

        public Criteria andDebateidBetween(Integer value1, Integer value2) {
            addCriterion("debateId between", value1, value2, "debateid");
            return (Criteria) this;
        }

        public Criteria andDebateidNotBetween(Integer value1, Integer value2) {
            addCriterion("debateId not between", value1, value2, "debateid");
            return (Criteria) this;
        }

        public Criteria andDescribtionIsNull() {
            addCriterion("describtion is null");
            return (Criteria) this;
        }

        public Criteria andDescribtionIsNotNull() {
            addCriterion("describtion is not null");
            return (Criteria) this;
        }

        public Criteria andDescribtionEqualTo(String value) {
            addCriterion("describtion =", value, "describtion");
            return (Criteria) this;
        }

        public Criteria andDescribtionNotEqualTo(String value) {
            addCriterion("describtion <>", value, "describtion");
            return (Criteria) this;
        }

        public Criteria andDescribtionGreaterThan(String value) {
            addCriterion("describtion >", value, "describtion");
            return (Criteria) this;
        }

        public Criteria andDescribtionGreaterThanOrEqualTo(String value) {
            addCriterion("describtion >=", value, "describtion");
            return (Criteria) this;
        }

        public Criteria andDescribtionLessThan(String value) {
            addCriterion("describtion <", value, "describtion");
            return (Criteria) this;
        }

        public Criteria andDescribtionLessThanOrEqualTo(String value) {
            addCriterion("describtion <=", value, "describtion");
            return (Criteria) this;
        }

        public Criteria andDescribtionLike(String value) {
            addCriterion("describtion like", value, "describtion");
            return (Criteria) this;
        }

        public Criteria andDescribtionNotLike(String value) {
            addCriterion("describtion not like", value, "describtion");
            return (Criteria) this;
        }

        public Criteria andDescribtionIn(List<String> values) {
            addCriterion("describtion in", values, "describtion");
            return (Criteria) this;
        }

        public Criteria andDescribtionNotIn(List<String> values) {
            addCriterion("describtion not in", values, "describtion");
            return (Criteria) this;
        }

        public Criteria andDescribtionBetween(String value1, String value2) {
            addCriterion("describtion between", value1, value2, "describtion");
            return (Criteria) this;
        }

        public Criteria andDescribtionNotBetween(String value1, String value2) {
            addCriterion("describtion not between", value1, value2, "describtion");
            return (Criteria) this;
        }

        public Criteria andContentIsNull() {
            addCriterion("content is null");
            return (Criteria) this;
        }

        public Criteria andContentIsNotNull() {
            addCriterion("content is not null");
            return (Criteria) this;
        }

        public Criteria andContentEqualTo(String value) {
            addCriterion("content =", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotEqualTo(String value) {
            addCriterion("content <>", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThan(String value) {
            addCriterion("content >", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThanOrEqualTo(String value) {
            addCriterion("content >=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThan(String value) {
            addCriterion("content <", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThanOrEqualTo(String value) {
            addCriterion("content <=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLike(String value) {
            addCriterion("content like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotLike(String value) {
            addCriterion("content not like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentIn(List<String> values) {
            addCriterion("content in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotIn(List<String> values) {
            addCriterion("content not in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentBetween(String value1, String value2) {
            addCriterion("content between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotBetween(String value1, String value2) {
            addCriterion("content not between", value1, value2, "content");
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

        public Criteria andReplyIsNull() {
            addCriterion("reply is null");
            return (Criteria) this;
        }

        public Criteria andReplyIsNotNull() {
            addCriterion("reply is not null");
            return (Criteria) this;
        }

        public Criteria andReplyEqualTo(Integer value) {
            addCriterion("reply =", value, "reply");
            return (Criteria) this;
        }

        public Criteria andReplyNotEqualTo(Integer value) {
            addCriterion("reply <>", value, "reply");
            return (Criteria) this;
        }

        public Criteria andReplyGreaterThan(Integer value) {
            addCriterion("reply >", value, "reply");
            return (Criteria) this;
        }

        public Criteria andReplyGreaterThanOrEqualTo(Integer value) {
            addCriterion("reply >=", value, "reply");
            return (Criteria) this;
        }

        public Criteria andReplyLessThan(Integer value) {
            addCriterion("reply <", value, "reply");
            return (Criteria) this;
        }

        public Criteria andReplyLessThanOrEqualTo(Integer value) {
            addCriterion("reply <=", value, "reply");
            return (Criteria) this;
        }

        public Criteria andReplyIn(List<Integer> values) {
            addCriterion("reply in", values, "reply");
            return (Criteria) this;
        }

        public Criteria andReplyNotIn(List<Integer> values) {
            addCriterion("reply not in", values, "reply");
            return (Criteria) this;
        }

        public Criteria andReplyBetween(Integer value1, Integer value2) {
            addCriterion("reply between", value1, value2, "reply");
            return (Criteria) this;
        }

        public Criteria andReplyNotBetween(Integer value1, Integer value2) {
            addCriterion("reply not between", value1, value2, "reply");
            return (Criteria) this;
        }

        public Criteria andReplylistIsNull() {
            addCriterion("replylist is null");
            return (Criteria) this;
        }

        public Criteria andReplylistIsNotNull() {
            addCriterion("replylist is not null");
            return (Criteria) this;
        }

        public Criteria andReplylistEqualTo(Integer value) {
            addCriterion("replylist =", value, "replylist");
            return (Criteria) this;
        }

        public Criteria andReplylistNotEqualTo(Integer value) {
            addCriterion("replylist <>", value, "replylist");
            return (Criteria) this;
        }

        public Criteria andReplylistGreaterThan(Integer value) {
            addCriterion("replylist >", value, "replylist");
            return (Criteria) this;
        }

        public Criteria andReplylistGreaterThanOrEqualTo(Integer value) {
            addCriterion("replylist >=", value, "replylist");
            return (Criteria) this;
        }

        public Criteria andReplylistLessThan(Integer value) {
            addCriterion("replylist <", value, "replylist");
            return (Criteria) this;
        }

        public Criteria andReplylistLessThanOrEqualTo(Integer value) {
            addCriterion("replylist <=", value, "replylist");
            return (Criteria) this;
        }

        public Criteria andReplylistIn(List<Integer> values) {
            addCriterion("replylist in", values, "replylist");
            return (Criteria) this;
        }

        public Criteria andReplylistNotIn(List<Integer> values) {
            addCriterion("replylist not in", values, "replylist");
            return (Criteria) this;
        }

        public Criteria andReplylistBetween(Integer value1, Integer value2) {
            addCriterion("replylist between", value1, value2, "replylist");
            return (Criteria) this;
        }

        public Criteria andReplylistNotBetween(Integer value1, Integer value2) {
            addCriterion("replylist not between", value1, value2, "replylist");
            return (Criteria) this;
        }

        public Criteria andClickcountIsNull() {
            addCriterion("clickcount is null");
            return (Criteria) this;
        }

        public Criteria andClickcountIsNotNull() {
            addCriterion("clickcount is not null");
            return (Criteria) this;
        }

        public Criteria andClickcountEqualTo(Integer value) {
            addCriterion("clickcount =", value, "clickcount");
            return (Criteria) this;
        }

        public Criteria andClickcountNotEqualTo(Integer value) {
            addCriterion("clickcount <>", value, "clickcount");
            return (Criteria) this;
        }

        public Criteria andClickcountGreaterThan(Integer value) {
            addCriterion("clickcount >", value, "clickcount");
            return (Criteria) this;
        }

        public Criteria andClickcountGreaterThanOrEqualTo(Integer value) {
            addCriterion("clickcount >=", value, "clickcount");
            return (Criteria) this;
        }

        public Criteria andClickcountLessThan(Integer value) {
            addCriterion("clickcount <", value, "clickcount");
            return (Criteria) this;
        }

        public Criteria andClickcountLessThanOrEqualTo(Integer value) {
            addCriterion("clickcount <=", value, "clickcount");
            return (Criteria) this;
        }

        public Criteria andClickcountIn(List<Integer> values) {
            addCriterion("clickcount in", values, "clickcount");
            return (Criteria) this;
        }

        public Criteria andClickcountNotIn(List<Integer> values) {
            addCriterion("clickcount not in", values, "clickcount");
            return (Criteria) this;
        }

        public Criteria andClickcountBetween(Integer value1, Integer value2) {
            addCriterion("clickcount between", value1, value2, "clickcount");
            return (Criteria) this;
        }

        public Criteria andClickcountNotBetween(Integer value1, Integer value2) {
            addCriterion("clickcount not between", value1, value2, "clickcount");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNull() {
            addCriterion("username is null");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNotNull() {
            addCriterion("username is not null");
            return (Criteria) this;
        }

        public Criteria andUsernameEqualTo(String value) {
            addCriterion("username =", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotEqualTo(String value) {
            addCriterion("username <>", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThan(String value) {
            addCriterion("username >", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("username >=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThan(String value) {
            addCriterion("username <", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThanOrEqualTo(String value) {
            addCriterion("username <=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLike(String value) {
            addCriterion("username like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotLike(String value) {
            addCriterion("username not like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameIn(List<String> values) {
            addCriterion("username in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotIn(List<String> values) {
            addCriterion("username not in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameBetween(String value1, String value2) {
            addCriterion("username between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotBetween(String value1, String value2) {
            addCriterion("username not between", value1, value2, "username");
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

        public Criteria andAskconditionIsNull() {
            addCriterion("askcondition is null");
            return (Criteria) this;
        }

        public Criteria andAskconditionIsNotNull() {
            addCriterion("askcondition is not null");
            return (Criteria) this;
        }

        public Criteria andAskconditionEqualTo(String value) {
            addCriterion("askcondition =", value, "askcondition");
            return (Criteria) this;
        }

        public Criteria andAskconditionNotEqualTo(String value) {
            addCriterion("askcondition <>", value, "askcondition");
            return (Criteria) this;
        }

        public Criteria andAskconditionGreaterThan(String value) {
            addCriterion("askcondition >", value, "askcondition");
            return (Criteria) this;
        }

        public Criteria andAskconditionGreaterThanOrEqualTo(String value) {
            addCriterion("askcondition >=", value, "askcondition");
            return (Criteria) this;
        }

        public Criteria andAskconditionLessThan(String value) {
            addCriterion("askcondition <", value, "askcondition");
            return (Criteria) this;
        }

        public Criteria andAskconditionLessThanOrEqualTo(String value) {
            addCriterion("askcondition <=", value, "askcondition");
            return (Criteria) this;
        }

        public Criteria andAskconditionLike(String value) {
            addCriterion("askcondition like", value, "askcondition");
            return (Criteria) this;
        }

        public Criteria andAskconditionNotLike(String value) {
            addCriterion("askcondition not like", value, "askcondition");
            return (Criteria) this;
        }

        public Criteria andAskconditionIn(List<String> values) {
            addCriterion("askcondition in", values, "askcondition");
            return (Criteria) this;
        }

        public Criteria andAskconditionNotIn(List<String> values) {
            addCriterion("askcondition not in", values, "askcondition");
            return (Criteria) this;
        }

        public Criteria andAskconditionBetween(String value1, String value2) {
            addCriterion("askcondition between", value1, value2, "askcondition");
            return (Criteria) this;
        }

        public Criteria andAskconditionNotBetween(String value1, String value2) {
            addCriterion("askcondition not between", value1, value2, "askcondition");
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