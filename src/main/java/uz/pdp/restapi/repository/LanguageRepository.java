package uz.pdp.restapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.pdp.restapi.entity.Language;

public interface LanguageRepository  extends JpaRepository<Language, Integer> {

    boolean existsByName(String name);

}
