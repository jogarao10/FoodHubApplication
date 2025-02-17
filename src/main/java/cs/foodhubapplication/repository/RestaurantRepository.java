package cs.foodhubapplication.repository;



import cs.foodhubapplication.entity.Restaurant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface RestaurantRepository extends JpaRepository<Restaurant, Long> {

    // Find restaurants by cuisine type
    List<Restaurant> findByCuisineType(String cuisineType);

    // Find top-rated restaurants
    List<Restaurant> findTop5ByOrderByAverageRatingDesc();
}
