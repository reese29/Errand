package com.ustc.errand.service;

import com.ustc.errand.common.Result;
import com.ustc.errand.entity.OrderVO;
import com.ustc.errand.param.OrderParam;
import com.ustc.errand.util.OrderNoGenerator;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Slf4j
public class OrderService {
    /**
     * 发布跑腿任务
     */
    public Result<OrderVO> publishMission(OrderParam param) {
        return createOrder(param);
    }

    /**
     * 接单
     */
    public Result<OrderVO> takeOrder(String orderNo, String orderTaker) {
        OrderVO orderVO = new OrderVO();
        //todo:数据库查询
        orderVO.setOrderStatus(1);
        orderVO.setOrderTaker(orderTaker);
        return Result.successResult(orderVO);
    }

    /**
     * 创建订单
     */
    private Result<OrderVO> createOrder(OrderParam param) {
        OrderVO orderVO = new OrderVO();
        String orderNo = OrderNoGenerator.generateOrderNumber();
        orderVO.setOrderNo(orderNo);
        orderVO.setOrderStatus(0);
        // 先不填
        orderVO.setOrderTaker("");
        orderVO.setOrderInitializer(param.getOrderInitializer());
        orderVO.setTip(param.getTip());
        orderVO.setOrderData(param.getOrderData());

        //todo:存入数据库

        return Result.successResult(orderVO);
    }

    /**
     * 获取订单信息
     */
    public Result<OrderVO> getOrderInfo(String orderNo){
        //todo:查询数据库
        OrderVO orderVO = new OrderVO();
        return Result.successResult(orderVO);
    }

    /**
     * 取消订单
     */
    public Result<OrderVO> cancelOrder(String orderNo) {
        //todo:数据库操作
        return Result.successResult();
    }

    /**
     * 结束订单
     */
    public Result<OrderVO> finishOrder(String orderNo) {
        //todo:数据库操作
        return Result.successResult();
    }

    /**
     * 查询未接单的订单
     */
    public Result<List<OrderVO>> getOrderList() {
        List<OrderVO> orderList = new ArrayList<>();
        //todo:数据库查询
        return Result.successResult(orderList);
    }

}
