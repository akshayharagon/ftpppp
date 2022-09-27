package com.hotelbooking.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hotelbooking.entities.Resident;

public interface ResidentRepository extends JpaRepository<Resident, Integer> {

}
