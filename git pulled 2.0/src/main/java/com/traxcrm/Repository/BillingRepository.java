package com.traxcrm.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.traxcrm.Entity.Billing;

@Repository
public interface BillingRepository extends JpaRepository<Billing, Long> {

}
