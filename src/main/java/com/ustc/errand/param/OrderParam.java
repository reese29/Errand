package com.ustc.errand.param;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class OrderParam {
    /**
     * 乙方gid
     */
    private String orderTaker;

    /**
     * 甲方gid
     */
    private String orderInitializer;

    /**
     * tip
     */
    private BigDecimal tip;

    /**
     * 订单内容
     */
    private String orderData;

    /**
     * 订单编号
     */
    private String orderNo;
}
