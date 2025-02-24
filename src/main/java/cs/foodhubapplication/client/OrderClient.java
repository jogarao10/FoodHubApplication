package cs.foodhubapplication.client;

import cs.foodhubapplication.entity.Orders;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "FoodHub-UserService",url = "http://localhost:7072")
public interface OrderClient {

    @GetMapping("/orders/all")
    List<Orders> getAllOrders();

    @GetMapping("/orders/{orderId}")
    Orders getOrderById(@PathVariable Integer orderId);

}