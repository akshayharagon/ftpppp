package com.flight_reservation.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.flight_reservation.Entities.User;

public interface UserRespository extends JpaRepository<User, Long> {

	User findByEmail(String email);

}
