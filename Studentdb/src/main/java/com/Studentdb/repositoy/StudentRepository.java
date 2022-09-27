package com.Studentdb.repositoy;

import org.springframework.data.repository.CrudRepository;

import com.Studentdb.entity.Student;

public interface StudentRepository extends CrudRepository<Student, Long> {

}
