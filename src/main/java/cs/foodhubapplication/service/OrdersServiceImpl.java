package cs.foodhubapplication.service;

import cs.foodhubapplication.client.OrderClient;
import cs.foodhubapplication.entity.Orders;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class OrdersServiceImpl implements IOrderService{

    @Autowired
    private OrderClient orderClient;


    @Override
    public List<Orders> getAllOrders() {
        return orderClient.getAllOrders();
    }

    @Override
    public Optional<Orders> getOrderById(Integer orderId) {
        return Optional.ofNullable(orderClient.getOrderById(orderId));
    }
}
