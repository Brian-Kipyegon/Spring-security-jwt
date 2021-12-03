package io.github.BrianKipyegon.springsecurityjwt.repositories;

import io.github.BrianKipyegon.springsecurityjwt.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
