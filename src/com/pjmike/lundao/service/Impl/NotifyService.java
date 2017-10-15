package com.pjmike.lundao.service.Impl;

import com.pjmike.lundao.po.Notify;
import com.pjmike.lundao.po.NotifyExtend;
import com.pjmike.lundao.po.User;
import com.pjmike.lundao.po.UserNotify;

import java.util.List;

/**
 * Created by DELL on 2017/10/14.
 * @author pjmike
 */
public interface NotifyService {
    /**
     * 插入一个消息表
     * @param notify
     * @return
     */
    int insertNotify(Notify notify);

    /**
     * 往Notify表中插入一条公告记录
     * @param content
     * @param sender
     * @return
     */
    int createAnnounce(String content,int sender);

    /**
     * 往Notify表中插入一条提醒记录
     * @param target
     * @param targetType
     * @param action
     * @param sender
     * @param content
     * @return
     */
    int createRemind(int target,String targetType,String action,int sender,String content);

    /**
     * 查询用户的订阅表，得到用户的一系列订阅记录
     * 通过每一条的订阅记录的target、targetType、action、createdAt去查询Notify表，获取订阅的Notify记录。
     * 使用订阅配置，过滤查询出来的Notify
     * 使用过滤好的Notify作为关联新建UserNotify
     * @param user
     * @return
     */
    int pullRemind(User user);
    /**
     * 往Notify表中插入一条信息记录
     * 往UserNotify表中插入一条记录，并关联新建的Notify
     * @param content
     * @param sender
     * @param receiver
     * @return
     */
    int createMessage(String content,int sender,int recevier);
    
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
    int createInformation(int target,String targetType,String action,int sender);

    /**
     * 通过reason，查询NotifyConfig，获取对应的动作组:actions
     * 遍历动作组，每一个动作新建一则Subscription记录
     * @param user
     * @param target
     * @param targetType
     * @param reason
     * @return
     */
    int subscribe(int userid, int target, String targetType, String action);

    /**
     * 查询SubscriptionConfig表，获取用户的订阅配置
     * @param userid
     * @return
     */
    UserNotify getSubscriptionConfig(int userid);

    /**
     * 获取用户的消息队列
     * @param userid
     * @return
     */
    List<NotifyExtend> getUserNotify(int userid);

}
