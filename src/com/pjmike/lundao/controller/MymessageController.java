package com.pjmike.lundao.controller;

import com.pjmike.lundao.po.Notify;
import com.pjmike.lundao.po.NotifyExtend;
import com.pjmike.lundao.po.User;
import com.pjmike.lundao.service.Impl.NotifyServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**用户拉取消息队列
 * Created by DELL on 2017/10/15.
 */
@Controller
@RequestMapping("/user")
public class MymessageController {
    @Autowired
    NotifyServiceImpl notifyServiceImpl;
    @RequestMapping("/getUserMessage")
    public List<NotifyExtend> getUserMessage(@RequestBody User user) {
        List<NotifyExtend> notifies = notifyServiceImpl.getUserNotify(user.getId());
        return notifies;
    }
}                            
