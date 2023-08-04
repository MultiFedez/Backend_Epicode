package com.epicode.spring_securety.security.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.epicode.spring_securety.security.entity.ERole;
import com.epicode.spring_securety.security.entity.Role;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Long> {
    
	Optional<Role> findByRoleName(ERole roleName);

}
