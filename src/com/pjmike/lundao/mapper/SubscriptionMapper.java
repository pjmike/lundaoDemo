package com.pjmike.lundao.mapper;

import com.pjmike.lundao.po.Subscription;

import java.util.List;

public interface SubscriptionMapper {
    /**
     * 创建一个subscription
     * @param subscription
     * @return
     */
    int createSubcription(Subscription subscription);

    /**
     * 查询用户的一系列订阅
     * @param userid
     * @return
     */
    List<Subscription> findUserSubscription(int userid);
}
