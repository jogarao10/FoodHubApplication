package cs.foodhubapplication.service;

import cs.foodhubapplication.entity.OrderSendANDBilling;
import cs.foodhubapplication.entity.Orders;

public interface IOrderSendingANDBillingService {

    public OrderSendANDBilling sendBilling(Orders order);

    //public OrderSendANDBilling sendBilling(OrderSendANDBilling orderSendANDBilling);
}
