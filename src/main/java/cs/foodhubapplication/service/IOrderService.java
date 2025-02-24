package cs.foodhubapplication.service;

import cs.foodhubapplication.entity.Orders;

import java.util.List;
import java.util.Optional;

public interface IOrderService {
    public List<Orders> getAllOrders();
    public Optional<Orders> getOrderById(Integer orderId);
}
