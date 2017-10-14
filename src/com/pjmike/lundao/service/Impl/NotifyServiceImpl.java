package com.pjmike.lundao.service.Impl;

import com.pjmike.lundao.mapper.NotifyMapper;
import com.pjmike.lundao.po.Notify;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by DELL on 2017/10/14.
 * @author pjmike
 */
public class NotifyServiceImpl implements NotifyService{
    @Autowired
    NotifyMapper notifyMapper;
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
}
