package cs.foodhubapplication.repository;

import cs.foodhubapplication.entity.RestaurantRegistration;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IRestaurantRegistration extends JpaRepository<RestaurantRegistration, Integer> {

}
