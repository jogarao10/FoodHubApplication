package cs.foodhubapplication.service;

import cs.foodhubapplication.entity.Restaurant;
import cs.foodhubapplication.repository.RestaurantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RestaurantServiceImpl implements IRestaurantService{

    @Autowired
    private RestaurantRepository restaurantRepository;

    // Get all restaurants
    public List<Restaurant> getAllRestaurants() {
        return restaurantRepository.findAll();
    }

    // Get restaurant by ID
    public Optional<Restaurant> getRestaurantById(Long id) {
        return restaurantRepository.findById(id);
    }

    // Add a new restaurant
    public Restaurant addRestaurant(Restaurant restaurant) {
        return restaurantRepository.save(restaurant);
    }

    // Update restaurant details
    public Restaurant updateRestaurant(Long id, Restaurant restaurantDetails) {
        Optional<Restaurant> restaurantOpt = restaurantRepository.findById(id);
        if (restaurantOpt.isPresent()) {
            Restaurant restaurant = restaurantOpt.get();
            restaurant.setName(restaurantDetails.getName());
            restaurant.setCuisineType(restaurantDetails.getCuisineType());
            restaurant.setLocation(restaurantDetails.getLocation());
            restaurant.setAverageRating(restaurantDetails.getAverageRating());
            restaurant.setTotalOrders(restaurantDetails.getTotalOrders());
            return restaurantRepository.save(restaurant);
        } else {
            return null; // Handle not found case properly in real-world applications
        }
    }

    // Delete a restaurant
    public void deleteRestaurant(Long id) {
        restaurantRepository.deleteById(id);
    }

    // Get restaurants by cuisine type
    public List<Restaurant> getRestaurantsByCuisine(String cuisineType) {
        return restaurantRepository.findByCuisineType(cuisineType);
    }

    // Get top-rated restaurants
    public List<Restaurant> getTopRatedRestaurants() {
        return restaurantRepository.findTop5ByOrderByAverageRatingDesc();
    }
}
