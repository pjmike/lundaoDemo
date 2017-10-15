package com.pjmike.lundao.mapper;

import com.pjmike.lundao.po.Notify;
import com.pjmike.lundao.po.NotifyExtend;
import com.pjmike.lundao.po.UserNotify;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author pjmike
 */
public interface UserNotifyMapper {
    /**
     * 创建一个userNotify
     * @param userid
     * @param notifyid
     * @return
     */
    int createUserNotify(@Param("user")int userid,@Param("notify")int notifyid);

    /**
     * 查询出用户的userNotify
     * @param userid
     * @return
     */
    List<NotifyExtend> findUserNotify(int userid);
}
