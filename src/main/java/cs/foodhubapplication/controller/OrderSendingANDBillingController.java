package cs.foodhubapplication.controller;

import cs.foodhubapplication.entity.OrderSendANDBilling;
import cs.foodhubapplication.entity.Orders;
import cs.foodhubapplication.service.IOrderSendingANDBillingService;
import cs.foodhubapplication.service.OrderSendingANDBillingServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/billing")
public class OrderSendingANDBillingController {

    @Autowired
    private OrderSendingANDBillingServiceImpl orderSendingANDBillingService;

    @PostMapping("/process")
    public ResponseEntity<OrderSendANDBilling> processBilling(@RequestBody Orders order) {
        OrderSendANDBilling billing = orderSendingANDBillingService.sendBilling(order);
        return ResponseEntity.ok(billing);
    }




}
