package cs.foodhubapplication.service;

import cs.foodhubapplication.entity.RestaurantRegistration;
import cs.foodhubapplication.repository.IRestaurantRegistration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Optional;

@Service
public class RestaurantRegistrationServiceImpl implements IRestaurantRegistrationService {

    @Autowired
    private IRestaurantRegistration registrationRepository;

    @Override
    public RestaurantRegistration registerRestaurant(RestaurantRegistration restaurantRegistration) {

       /* // Check if restaurantId already exists
        Optional<RestaurantRegistration> existingRestaurantById =
                registrationRepository.findById(restaurantRegistration.getRestaurantId());

        // Check if governmentApprovalId already exists
        Optional<RestaurantRegistration> existingRestaurantByApprovalId =
                registrationRepository.findByGovernmentApprovalId(restaurantRegistration.getGovernmentApprovalId());

        // If either already exists, reject registration
        if (existingRestaurantById.isPresent() || existingRestaurantByApprovalId.isPresent()) {
            throw new RuntimeException("Restaurant with this ID or Government Approval ID already exists!");
        }

        // Save new restaurant registration
        return registrationRepository.save(restaurantRegistration);

        */
        System.out.println("Received Restaurant Registration Data: " + restaurantRegistration); // Debugging Log

        // Set registration date before saving
        restaurantRegistration.setRestaurantRegistrationDate(LocalDateTime.now());

        // Save to the database
        return registrationRepository.save(restaurantRegistration);
    }
}
