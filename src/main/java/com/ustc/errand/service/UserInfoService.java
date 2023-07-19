package com.ustc.errand.service;

import com.ustc.errand.common.Result;
import com.ustc.errand.entity.UserInfoVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class UserInfoService {
    public Result<UserInfoVO> getUserInfo(String gid) {
        UserInfoVO userInfoVO = new UserInfoVO();
        //todo:数据库获取
        userInfoVO.setId("");
        userInfoVO.setSalaryId("");
        userInfoVO.setGid("");
        userInfoVO.setNickname("");
        userInfoVO.setName("");
        userInfoVO.setMobile("");
        userInfoVO.setEmail("");
        return Result.successResult(userInfoVO);
    }

    public Result<UserInfoVO> setNickname(String newNickname) {
        //todo:数据库
        return Result.successResult();
    }



}
