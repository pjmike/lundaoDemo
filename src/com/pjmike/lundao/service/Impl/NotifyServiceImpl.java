package com.pjmike.lundao.service.Impl;

import com.pjmike.lundao.mapper.NotifyMapper;
import com.pjmike.lundao.mapper.SubscriptionMapper;
import com.pjmike.lundao.mapper.UserNotifyMapper;
import com.pjmike.lundao.po.Notify;
import com.pjmike.lundao.po.NotifyExtend;
import com.pjmike.lundao.po.Subscription;
import com.pjmike.lundao.po.User;
import com.pjmike.lundao.po.UserNotify;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by DELL on 2017/10/14.
 * @author pjmike
 */
public class NotifyServiceImpl implements NotifyService{
    @Autowired
    NotifyMapper notifyMapper;
    @Autowired
    SubscriptionMapper subscriptionMapper;
    @Autowired
    UserNotifyMapper userNotifyMapper;
    /**
     * 插入一个消息表
     *
     * @param notify
     * @return
     */
    @Override
    public int insertNotify(Notify notify) {
        return notifyMapper.insertNotify(notify);
    }

    /**
     * 往Notify表中插入一条公告记录
     *
     * @param content
     * @param sender
     * @return
     */
    @Override
    public int createAnnounce(String content, int sender) {
        return 0;
    }

    /**
     * 往Notify表中插入一条提醒记录
     *
     * @param target
     * @param targetType
     * @param action
     * @param sender
     * @param content
     * @return
     */
    @Override
    public int createRemind(int target, String targetType, String action, int sender, String content) {
        Notify notify = new Notify();
        notify.setTargetType(targetType);
        notify.setTarget(target);
        notify.setAction(action);
        notify.setSender(sender);
        return notifyMapper.createRemind(notify);
    }

    /**
     * 查询用户的订阅表，得到用户的一系列订阅记录
     * 通过每一条的订阅记录的target、targetType、action、createdAt去查询Notify表，获取订阅的Notify记录。
     * 使用订阅配置，过滤查询出来的Notify
     * 使用过滤好的Notify作为关联新建UserNotify
     *
     * @param user
     * @return
     */
    @Override
    public int pullRemind(User user) {
        List<Subscription> subscriptions = subscriptionMapper.findUserSubscription(user.getId());
        for (Subscription sub:subscriptions
             ) {
            List<Integer> notifyIds = notifyMapper.findNotifyRecord(sub);
            for (Integer t : notifyIds) {
            	userNotifyMapper.createUserNotify(user.getId(), t);
            }
        }
        return 0;
    }


    /**
     * 往Notify表中插入一条信息记录
     * 
     * 往UserNotify表中插入一条记录，并关联新建的Notify
     *
     * @param content
     * @param sender
     * @param recevier
     * @return
     */
    @Override
    public int createMessage(String content, int sender, int recevier) {
        return 0;
    }

    /**
     * 通过reason，查询NotifyConfig，获取对应的动作组:actions
     * 遍历动作组，每一个动作新建一则Subscription记录
     *
     * @param user
     * @param target
     * @param targetType
     * @param reason
     * @return
     */
    @Override
    public int subscribe(int userid, int target, String targetType, String action) {
        Subscription subscription = new Subscription();
        subscription.setAction(action);
        subscription.setTarget(target);
        subscription.setTargetType(targetType);
        subscription.setUser(userid);
        return subscriptionMapper.createSubcription(subscription);
    }

    /**
     * 查询SubscriptionConfig表，获取用户的订阅配置
     *
     * @param userid
     * @return
     */
    @Override
    public UserNotify getSubscriptionConfig(int userid) {
        return null;
    }

    /**
     * 获取用户的消息队列
     *
     * @param userid
     * @return
     */
    @Override
    public List<NotifyExtend> getUserNotify(int userid) {
        List<NotifyExtend> userNotifies = userNotifyMapper.findUserNotify(userid);
        return userNotifies;
    }
    /**
     * 往Notify表中插入一条信息记录包含（发送者和接受者）
     * 往UserNotify表中插入一条记录，并关联新建的Notify
     * @param target
     * @param targetType
     * @param action
     * @param sender
     * @param recevier
     * @return
     */
	@Override
	public int createInformation(int target, String targetType, String action, int sender) {
		Notify notify = new Notify();
		notify.setAction(action);
		notify.setSender(sender);
		notify.setTarget(target);
		notify.setTargetType(targetType);
		notifyMapper.createInformation(notify);
		userNotifyMapper.createUserNotify(sender, notify.getId());
		return 0;
		
	}
}
