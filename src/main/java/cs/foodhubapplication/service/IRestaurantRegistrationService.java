package cs.foodhubapplication.service;


import cs.foodhubapplication.entity.RestaurantRegistration;
import org.springframework.stereotype.Service;

@Service
public interface IRestaurantRegistrationService {
    RestaurantRegistration registerRestaurant(RestaurantRegistration restaurantRegistration);
}
