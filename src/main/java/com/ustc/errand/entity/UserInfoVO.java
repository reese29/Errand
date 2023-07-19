package com.ustc.errand.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserInfoVO {
    /**
     * 学号
     */
    String id;

    /**
     * 工资号
     */
    String salaryId;

    /**
     * GID, 全局唯一id
     */
    String gid;

    /**
     * 昵称
     */
    String nickname;

    /**
     * 真实姓名
     */
    String name;

    /**
     * 手机号
     */
    String mobile;

    /**
     * 邮箱
     */
    String email;
}
