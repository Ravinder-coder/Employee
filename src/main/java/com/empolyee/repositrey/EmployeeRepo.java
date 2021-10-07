package com.empolyee.repositrey;

import org.springframework.data.jpa.repository.JpaRepository;

import com.empolyee.entity.Empolyee;

public interface EmployeeRepo extends JpaRepository<Empolyee, Integer>{

}
