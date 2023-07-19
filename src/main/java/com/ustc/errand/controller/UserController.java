package com.ustc.errand.controller;

import com.ustc.errand.common.Result;
import com.ustc.errand.entity.UserInfoVO;
import com.ustc.errand.service.UserInfoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@Slf4j
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserInfoService userInfoService;

    @PostMapping("/getInfo")
    public Result<UserInfoVO> getUserInfo(@RequestParam("gid") String gid) {
        return userInfoService.getUserInfo(gid);
    }

    @PostMapping("/setNickname")
    public Result<UserInfoVO> setNickname(@RequestParam("data") String name) {
        return userInfoService.setNickname(name);
    }

    /**
     * todo:头像上传功能, 评分, 聊天
     *
     */

}
