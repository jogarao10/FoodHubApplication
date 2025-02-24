package cs.foodhubapplication.service;

import cs.foodhubapplication.entity.Restaurant;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

public interface IRestaurantService {

    List<Restaurant> getAllRestaurants();

    Optional<Restaurant> getRestaurantById(Long id);

    Restaurant addRestaurant(Restaurant restaurant);

    Restaurant updateRestaurant(Long id, Restaurant restaurantDetails);

    void deleteRestaurant(Long id);

    List<Restaurant> getRestaurantsByCuisine(String cuisineType);

    List<Restaurant> getTopRatedRestaurants();
}
