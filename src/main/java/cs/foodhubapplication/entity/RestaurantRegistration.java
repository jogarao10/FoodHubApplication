package cs.foodhubapplication.entity;


import jakarta.persistence.*;
import lombok.*;


import java.time.LocalDateTime;

@Entity
@AllArgsConstructor
@Setter
@Getter
@ToString
@NoArgsConstructor
@Table(name = "RestaurantRegistration")
public class RestaurantRegistration {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer restaurantId;

    @NonNull
    @Column(name = "government_approval_id")
    private String governmentApprovalId;

    @NonNull
    @Column(name = "restaurant_name")
    private String restaurantName;

    @NonNull
    @Column(name = "restaurant_address")
    private String restaurantAddress;

    @NonNull
    @Column(name = "restaurant_phone")
    private String restaurantPhone;

    @NonNull
    @Column(name = "restaurant_email")
    private String restaurantEmail;

    @NonNull
    @Column(name = "restaurant_password")
    private String restaurantPassword;

    @NonNull
    @Column(name = "restaurant_password_confirm")
    private String restaurantPasswordConfirm;

    @Column(name = "restaurant_owner_name")
    private String restaurantOwnerName;

    @NonNull
    @Column(name = "restaurant_owner_email")
    private String restaurantOwnerEmail;

    @NonNull
    @Column(name = "restaurant_owner_phone")
    private String restaurantOwnerPhone;

    @Column(name = "restaurant_registration_date")
    private LocalDateTime restaurantRegistrationDate;

    public Integer getRestaurantId() {
        return restaurantId;
    }

    public void setRestaurantId(Integer restaurantId) {
        this.restaurantId = restaurantId;
    }

    public @NonNull String getGovernmentApprovalId() {
        return governmentApprovalId;
    }

    public void setGovernmentApprovalId(@NonNull String governmentApprovalId) {
        this.governmentApprovalId = governmentApprovalId;
    }

    public @NonNull String getRestaurantName() {
        return restaurantName;
    }

    public void setRestaurantName(@NonNull String restaurantName) {
        this.restaurantName = restaurantName;
    }

    public @NonNull String getRestaurantAddress() {
        return restaurantAddress;
    }

    public void setRestaurantAddress(@NonNull String restaurantAddress) {
        this.restaurantAddress = restaurantAddress;
    }

    public @NonNull String getRestaurantPhone() {
        return restaurantPhone;
    }

    public void setRestaurantPhone(@NonNull String restaurantPhone) {
        this.restaurantPhone = restaurantPhone;
    }

    public @NonNull String getRestaurantEmail() {
        return restaurantEmail;
    }

    public void setRestaurantEmail(@NonNull String restaurantEmail) {
        this.restaurantEmail = restaurantEmail;
    }

    public @NonNull String getRestaurantPassword() {
        return restaurantPassword;
    }

    public void setRestaurantPassword(@NonNull String restaurantPassword) {
        this.restaurantPassword = restaurantPassword;
    }

    public @NonNull String getRestaurantPasswordConfirm() {
        return restaurantPasswordConfirm;
    }

    public void setRestaurantPasswordConfirm(@NonNull String restaurantPasswordConfirm) {
        this.restaurantPasswordConfirm = restaurantPasswordConfirm;
    }


    public @NonNull String getRestaurantOwnerName() {
        return restaurantOwnerName;
    }

    public void setRestaurantOwnerName(@NonNull String restaurantOwnerName) {
        this.restaurantOwnerName = restaurantOwnerName;
    }

    public @NonNull String getRestaurantOwnerEmail() {
        return restaurantOwnerEmail;
    }

    public void setRestaurantOwnerEmail(@NonNull String restaurantOwnerEmail) {
        this.restaurantOwnerEmail = restaurantOwnerEmail;
    }

    public @NonNull String getRestaurantOwnerPhone() {
        return restaurantOwnerPhone;
    }

    public void setRestaurantOwnerPhone(@NonNull String restaurantOwnerPhone) {
        this.restaurantOwnerPhone = restaurantOwnerPhone;
    }

    public LocalDateTime getRestaurantRegistrationDate() {
        return restaurantRegistrationDate;
    }

    public void setRestaurantRegistrationDate(LocalDateTime restaurantRegistrationDate) {
        this.restaurantRegistrationDate = restaurantRegistrationDate;
    }
}
