package com.Studentdb;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.Studentdb.entity.Student;
import com.Studentdb.repositoy.StudentRepository;

@SpringBootTest
class StudentdbApplicationTests {

	@Autowired
	private StudentRepository stdrepo; 
	@Test
	void saveOneStudent() {
		Student s1 = new Student();
		s1.setName("smith");
		s1.setCourse("test");
		s1.setFee(15000);
		
		stdrepo.save(s1);
	}
	@Test
	void deleteOneStudent() {
		stdrepo.deleteById(2L);
	}

	@Test
	void getOneStudent() {
		Optional<Student> findById = stdrepo.findById(1L);
		Student s = findById.get();
		System.out.println(s.getId());
		System.out.println(s.getName());
		System.out.println(s.getCourse());
		System.out.println(s.getFee());
	}

	@Test
	void updateOneStudent() {
		Optional<Student> findById = stdrepo.findById(1L);
		Student s = findById.get();
		
		s.setCourse("testing");
		s.setFee(20000);
		stdrepo.save(s);
	}
}
