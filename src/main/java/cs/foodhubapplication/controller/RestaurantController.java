package cs.foodhubapplication.controller;


import cs.foodhubapplication.entity.Restaurant;
import cs.foodhubapplication.service.IRestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/restaurants")
public class RestaurantController {

    @Autowired
    private IRestaurantService restaurantService;

    // Get all restaurants
    @GetMapping
    public List<Restaurant> getAllRestaurants() {
        return restaurantService.getAllRestaurants();
    }

    // Get restaurant by ID
    @GetMapping("/{id}")
    public Optional<Restaurant> getRestaurantById(@PathVariable Long id) {
        return restaurantService.getRestaurantById(id);
    }

    // Add a new restaurant
    @PostMapping
    public Restaurant addRestaurant(@RequestBody Restaurant restaurant) {
        return restaurantService.addRestaurant(restaurant);
    }

    // Update restaurant details
    @PutMapping("/{id}")
    public Restaurant updateRestaurant(@PathVariable Long id, @RequestBody Restaurant restaurant) {
        return restaurantService.updateRestaurant(id, restaurant);
    }

    // Delete a restaurant
    @DeleteMapping("/{id}")
    public void deleteRestaurant(@PathVariable Long id) {
        restaurantService.deleteRestaurant(id);
    }

    // Get restaurants by cuisine type
    @GetMapping("/cuisine/{cuisineType}")
    public List<Restaurant> getRestaurantsByCuisine(@PathVariable String cuisineType) {
        return restaurantService.getRestaurantsByCuisine(cuisineType);
    }

    // Get top-rated restaurants
    @GetMapping("/top-rated")
    public List<Restaurant> getTopRatedRestaurants() {
        return restaurantService.getTopRatedRestaurants();
    }
}
