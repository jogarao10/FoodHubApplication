package cs.foodhubapplication.repository;

import cs.foodhubapplication.entity.Items;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IItemsRepository extends JpaRepository<Items, Integer> {
}
