package com.careerdevs.Template.Repos;

import com.careerdevs.Template.Models.Auth.ERole;
import com.careerdevs.Template.Models.Auth.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(ERole name);
}
