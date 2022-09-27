package com.marketingapp;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.marketingapp.Repositories.LeadRepository;
import com.marketingapp.entities.Lead;

@SpringBootTest
class Marketingapp1ApplicationTests {
	@Autowired
	private LeadRepository leadRepo;

	@Test
	void contextLoads() {
		
	}

	@Test
	void getAllLeads() {
		List<Lead> l = leadRepo.findAll();
		l.stream().map(lead->getInfo(lead)).collect(Collectors.toList());
	}
	
	 Lead getInfo(Lead d) {
		System.out.println(d.getFirstName());
		System.out.println(d.getEmail());
		return d;
	}
}
