package uz.pdp.restapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.pdp.restapi.entity.Task;

public interface TaskRepository  extends JpaRepository<Task, Integer> {
}
