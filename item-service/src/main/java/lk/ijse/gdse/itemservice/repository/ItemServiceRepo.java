package lk.ijse.gdse.itemservice.repository;

import lk.ijse.gdse.itemservice.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemServiceRepo extends JpaRepository<Item,String> {
}
