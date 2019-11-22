package com.nt.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nt.entity.UserMasterEntity;

public interface UserMasterRepo extends JpaRepository<UserMasterEntity, Integer> {

}
