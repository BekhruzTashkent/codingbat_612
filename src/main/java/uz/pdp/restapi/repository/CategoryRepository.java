package uz.pdp.restapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.pdp.restapi.entity.Category;

public interface CategoryRepository extends JpaRepository<Category, Integer> {
}
