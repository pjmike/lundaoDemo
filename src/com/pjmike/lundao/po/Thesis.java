package com.pjmike.lundao.po;

import java.util.Date;

public class Thesis {
    private Integer thesisid;
    
    private String description;
    private Integer debateId;
   

	private Integer view;

    private Integer like;

    private Integer attention;

    private Integer dislike;

    private Integer ask;

    private Integer question;

    private Integer asklist;

    private Integer questionlist;

    private Date publishtime;

    private Date contenttime;

    private Integer complete;

    private Integer uncomplete;

    private String state;

    public Integer getThesisid() {
        return thesisid;
    }

    public void setThesisid(Integer thesisid) {
        this.thesisid = thesisid;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public Integer getView() {
        return view;
    }

    public void setView(Integer view) {
        this.view = view;
    }

    public Integer getLike() {
        return like;
    }

    public void setLike(Integer like) {
        this.like = like;
    }

    public Integer getAttention() {
        return attention;
    }

    public void setAttention(Integer attention) {
        this.attention = attention;
    }

    public Integer getDislike() {
        return dislike;
    }

    public void setDislike(Integer dislike) {
        this.dislike = dislike;
    }

    public Integer getAsk() {
        return ask;
    }

    public void setAsk(Integer ask) {
        this.ask = ask;
    }

    public Integer getQuestion() {
        return question;
    }

    public void setQuestion(Integer question) {
        this.question = question;
    }

    public Integer getAsklist() {
        return asklist;
    }

    public void setAsklist(Integer asklist) {
        this.asklist = asklist;
    }

    public Integer getQuestionlist() {
        return questionlist;
    }

    public void setQuestionlist(Integer questionlist) {
        this.questionlist = questionlist;
    }

    public Date getPublishtime() {
        return publishtime;
    }

    public void setPublishtime(Date publishtime) {
        this.publishtime = publishtime;
    }

    public Date getContenttime() {
        return contenttime;
    }

    public void setContenttime(Date contenttime) {
        this.contenttime = contenttime;
    }

    public Integer getComplete() {
        return complete;
    }

    public void setComplete(Integer complete) {
        this.complete = complete;
    }

    public Integer getUncomplete() {
        return uncomplete;
    }

    public void setUncomplete(Integer uncomplete) {
        this.uncomplete = uncomplete;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }
    public Integer getDebateId() {
		return debateId;
	}

	public void setDebateId(Integer debateId) {
		this.debateId = debateId;
	}
}