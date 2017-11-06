package com.pjmike.lundao.controller;

import com.pjmike.lundao.po.Notify;
import com.pjmike.lundao.po.NotifyExtend;
import com.pjmike.lundao.po.User;
import com.pjmike.lundao.service.Impl.AskquesServiceImpl;
import com.pjmike.lundao.service.Impl.NotifyServiceImpl;
import com.pjmike.lundao.service.Impl.ReplyServiceImpl;
import com.pjmike.lundao.util.TargetType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;


/**
 * 用户拉取消息队列
 * Created by DELL on 2017/10/15.
 */
@Controller
@RequestMapping("/user")
public class MymessageController {
    @Autowired
    NotifyServiceImpl notifyServiceImpl;
    @Autowired
    ReplyServiceImpl replyServiceImpl;
    @Autowired
    AskquesServiceImpl askquesServiceImpl;
    @RequestMapping("/getUserMessage")
    public List<NotifyExtend> getUserMessage(@RequestBody User user) {
        List<NotifyExtend> notifies = notifyServiceImpl.getUserNotify(user.getId());
        return notifies;
    }
    @RequestMapping("/getMessage")
    public List<NotifyExtend> getMessage(@RequestBody User user) {
        List<NotifyExtend> notifies = notifyServiceImpl.getUserNotify(user.getId());
        for (NotifyExtend notify : notifies) {
        	if (TargetType.REPLY.equals(notify.getTargetType())) {
        		String originalContent = replyServiceImpl.selectContent(notify.getTarget());
        		notify.setOriginalContent(originalContent);
        	}
        	if (TargetType.AKSQUESTION.equals(notify.getTargetType())) {
        		String originalContent = askquesServiceImpl.selectContent(notify.getTarget());
        		notify.setOriginalContent(originalContent);
        	}
        }
        return notifies;
    }
}                            
