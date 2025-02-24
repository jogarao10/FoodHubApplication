package cs.foodhubapplication.repository;

import cs.foodhubapplication.entity.OrderSendANDBilling;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IOrderSendingANDBillingRepository extends JpaRepository<OrderSendANDBilling, Integer> {
}
