package com.ustc.errand.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class OrderVO {
    /**
     * 订单编号
     */
    private String orderNo;

    /**
     * 订单状态
     * 0:已创建, 1:进行中, 2:已结束, 3:已取消
     */
    private int orderStatus;

    /**
     * 乙方gid
     */
    private String orderTaker;

    /**
     * 甲方gid
     */
    private String orderInitializer;

    /**
     * 配送费
     */
    private BigDecimal tip;

    /**
     * 订单详情
     */
    private String orderData;
}
