package io.github.BrianKipyegon.springsecurityjwt.repositories;

import io.github.BrianKipyegon.springsecurityjwt.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Role findByName(String name);
}
