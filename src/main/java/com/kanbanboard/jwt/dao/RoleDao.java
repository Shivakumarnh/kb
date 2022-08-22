package com.kanbanboard.jwt.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kanbanboard.jwt.entity.Role;

@Repository
public interface RoleDao extends JpaRepository<Role, String> {

}
