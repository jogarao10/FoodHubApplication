package cs.foodhubapplication.controller;

import cs.foodhubapplication.entity.Orders;
import cs.foodhubapplication.service.IOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/orders")
public class OrdersController {

    @Autowired
    private IOrderService orderService;

    @GetMapping("/orders/all")
    public List<Orders> getAllOrders() {

        return orderService.getAllOrders();
    }


    @GetMapping("/orders/{orderId}")
    public Optional<Orders> getOrderById(@PathVariable Integer orderId) {

        return orderService.getOrderById(orderId);
    }

}
