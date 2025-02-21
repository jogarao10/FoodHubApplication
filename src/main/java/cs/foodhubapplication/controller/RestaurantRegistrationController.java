package cs.foodhubapplication.controller;


import cs.foodhubapplication.entity.RestaurantRegistration;
import cs.foodhubapplication.service.RestaurantRegistrationServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/restaurant")
public class RestaurantRegistrationController {

    @Autowired
    private RestaurantRegistrationServiceImpl restaurantRegistrationService;

    @PostMapping("/register")
    public RestaurantRegistration addRestaurantRegistration(@RequestBody RestaurantRegistration restaurantRegistration) {

       return restaurantRegistrationService.registerRestaurant(restaurantRegistration);

    }

}
