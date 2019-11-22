package com.nt.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nt.entity.TagTxTrigger;

public interface TagTxRepo extends JpaRepository<TagTxTrigger, Integer> {

}
