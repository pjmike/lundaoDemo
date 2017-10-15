package com.pjmike.lundao.mapper;

import com.pjmike.lundao.po.Notify;
import com.pjmike.lundao.po.Subscription;

import java.util.List;

/**
 * @author pjmike
 */
public interface NotifyMapper {
    /**
     * 插入一个具体的消息表
     * @param notify
     * @return
     */
    int insertNotify(Notify notify);

    /**
     * 向notify中插入一条提醒
     * @param notify
     * @return
     */
    int createRemind(Notify notify);
    /**
     * 向notify中插入一个消息（包含发送者和接受者）
     * @param notify
     * @return
     */
    int createInformation(Notify notify);

    /**
     * 查寻用户的notify
     * @param userid
     * @return
     */
    List<Notify> findNotify(int userid);

    /**
     * 根据具体信息查询Notify
     * @param notify
     * @return
     */
    List<Integer> findNotifyRecord(Subscription subscription);
}
