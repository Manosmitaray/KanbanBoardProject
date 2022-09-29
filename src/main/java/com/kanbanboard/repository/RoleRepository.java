package com.kanbanboard.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kanbanboard.entity.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, String> {

}
