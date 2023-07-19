package com.ustc.errand.controller;

import com.alibaba.fastjson.JSONObject;
import com.ustc.errand.entity.OrderVO;
import com.ustc.errand.common.Result;
import com.ustc.errand.param.OrderParam;
import com.ustc.errand.service.OrderService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Slf4j
@RequestMapping("/order")
public class OrderController {
    @Autowired
    private OrderService orderService;

    @PostMapping("/publishOrder")
    public Result<OrderVO> publishOrder(@RequestParam("data") String bizParam) {
        OrderParam param = JSONObject.parseObject(bizParam, OrderParam.class);
        return orderService.publishMission(param);
    }

    @PostMapping("/takeOrder")
    public Result<OrderVO> takeOrder(@RequestParam("data") String bizParam) {
        OrderParam param = JSONObject.parseObject(bizParam, OrderParam.class);
        String orderNo = param.getOrderNo();
        String orderTaker = param.getOrderTaker();
        return orderService.takeOrder(orderNo, orderTaker);
    }

    @PostMapping("/getOrderInfo")
    public Result<OrderVO> getOrderInfo(@RequestParam("data") String orderNo) {
        return orderService.getOrderInfo(orderNo);
    }

    @PostMapping("/cancelOrder")
    public Result<OrderVO> cancelOrder(@RequestParam("data") String orderNo) {
        return orderService.cancelOrder(orderNo);
    }

    @PostMapping("/finishOrder")
    public Result<OrderVO> finishOrder(@RequestParam("data") String orderNo) {
        return orderService.finishOrder(orderNo);
    }

    @PostMapping("/getOrderList")
    public Result<List<OrderVO>> getOrderList() {
        return orderService.getOrderList();
    }
}
