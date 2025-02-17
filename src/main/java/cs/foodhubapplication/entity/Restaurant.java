package cs.foodhubapplication.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "restaurants")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Restaurant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long restaurantId;

    private String name;
    private String cuisineType;
    private String location;
    private Double averageRating;
    private Integer totalOrders;
    

    public Long getRestaurantId() {
        return restaurantId;
    }

    public void setRestaurantId(Long restaurantId) {
        this.restaurantId = restaurantId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCuisineType() {
        return cuisineType;
    }

    public void setCuisineType(String cuisineType) {
        this.cuisineType = cuisineType;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Double getAverageRating() {
        return averageRating;
    }

    public void setAverageRating(Double averageRating) {
        this.averageRating = averageRating;
    }

    public Integer getTotalOrders() {
        return totalOrders;
    }

    public void setTotalOrders(Integer totalOrders) {
        this.totalOrders = totalOrders;
    }

    @Override
    public String toString() {
        return "Restaurant{" +
                "restaurantId=" + restaurantId +
                ", name='" + name + '\'' +
                ", cuisineType='" + cuisineType + '\'' +
                ", location='" + location + '\'' +
                ", averageRating=" + averageRating +
                ", totalOrders=" + totalOrders +
                '}';
    }
}
