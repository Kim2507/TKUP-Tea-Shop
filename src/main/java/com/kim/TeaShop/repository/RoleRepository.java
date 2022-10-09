package com.kim.TeaShop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kim.TeaShop.model.Role;


@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
	Role findByName(String name);

}
