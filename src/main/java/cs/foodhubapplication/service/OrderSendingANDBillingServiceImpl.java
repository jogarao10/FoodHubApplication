package cs.foodhubapplication.service;

import cs.foodhubapplication.entity.OrderSendANDBilling;
import cs.foodhubapplication.entity.Orders;
import cs.foodhubapplication.repository.IOrderSendingANDBillingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class OrderSendingANDBillingServiceImpl implements IOrderSendingANDBillingService{

    @Autowired
    private IOrderSendingANDBillingRepository orderSendingANDBillingRepository;


    public OrderSendANDBilling sendBilling(Orders order) {
        // Calculate billing amount
        Double totalAmount = (double) (order.getQuantity() * order.getItemPrice());

        // Create OrderSendANDBilling entity
        OrderSendANDBilling billing = new OrderSendANDBilling();
        billing.setOrderId(order.getOrderId());
        billing.setAmount(totalAmount);
        billing.setStatus("PAID"); // Default status, can be changed later
        billing.setDate(new Date());

        // Save the billing entity
        return orderSendingANDBillingRepository.save(billing);
    }

}
