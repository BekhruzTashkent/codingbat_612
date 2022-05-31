package uz.pdp.restapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.pdp.restapi.entity.Example;

public interface ExampleRepository  extends JpaRepository<Example, Integer> {
}
