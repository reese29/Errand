package com.ustc.errand.common;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ResultType {
    SUCCESS("0000", "成功"),
    COMMON_FAIL("0001", "失败"),
    USERINFO_NOT_FOUND("0002", "用户信息未找到");

    private String code;
    private String desc;
}
