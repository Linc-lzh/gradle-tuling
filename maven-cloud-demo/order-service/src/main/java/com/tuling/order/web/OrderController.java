package com.tuling.order.web;

import com.tuling.order.clients.UserClient;
import com.tuling.order.pojo.Order;
import com.tuling.order.pojo.User;
import com.tuling.order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("order")
public class OrderController {

   @Autowired
   private OrderService orderService;

    @Autowired
    private UserClient userClient;

    @GetMapping("{orderId}")
    public Order queryOrderByUserId(@PathVariable("orderId") Long orderId) {
        //1. 根据id查询订单并返回
        Order order = orderService.queryOrderById(orderId);

        //2.通过Feign调用远程接口
        User user = userClient.findById(order.getUserId());
        order.setUser(user);
        return order;
    }
}
