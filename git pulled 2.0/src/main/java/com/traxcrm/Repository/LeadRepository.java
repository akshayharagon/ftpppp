package com.traxcrm.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.traxcrm.Entity.Lead;

public interface LeadRepository extends JpaRepository<Lead, Long> {

}
