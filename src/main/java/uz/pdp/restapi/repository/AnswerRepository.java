package uz.pdp.restapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.pdp.restapi.entity.Answer;

public interface AnswerRepository extends JpaRepository<Answer, Integer> {
}
