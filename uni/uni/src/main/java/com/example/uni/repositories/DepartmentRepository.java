package com.example.uni.repositories;

import com.example.uni.entites.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface DepartmentRepository extends JpaRepository<Department, Long> {
    @Query("""
           SELECT DISTINCT d
           FROM Department d
           LEFT JOIN FETCH d.students s
           LEFT JOIN FETCH s.courses
           """)
    List<Department> findAllWithStudentsAndCourses();
}
