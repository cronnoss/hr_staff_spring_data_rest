package com.cronnoss.hr_staff_spring_data_rest.dao;

import com.cronnoss.hr_staff_spring_data_rest.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Integer> {
}