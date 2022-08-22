package com.bezkoder.spring.login.repository;

import org.springframework.stereotype.Repository;

import com.bezkoder.spring.login.models.Exercise;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface ExecriseResponse extends JpaRepository<Exercise, Long> {
}
