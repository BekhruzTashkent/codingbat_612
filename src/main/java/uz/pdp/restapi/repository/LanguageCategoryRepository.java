package uz.pdp.restapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.pdp.restapi.entity.Language_category;

public interface LanguageCategoryRepository  extends JpaRepository<Language_category, Integer> {
}
