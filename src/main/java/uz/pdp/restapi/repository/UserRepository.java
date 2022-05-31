package uz.pdp.restapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.pdp.restapi.entity.User;

public interface UserRepository  extends JpaRepository<User, Integer> {
}
