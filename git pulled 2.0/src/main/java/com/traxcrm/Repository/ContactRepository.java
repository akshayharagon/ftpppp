package com.traxcrm.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.traxcrm.Entity.Contact;

public interface ContactRepository extends JpaRepository<Contact, Long> {

}
