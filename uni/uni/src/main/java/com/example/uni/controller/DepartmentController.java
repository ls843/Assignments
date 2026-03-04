package com.example.uni.controller;

import com.example.uni.dto.DepartmentDTO;
import com.example.uni.dto.StudentDTO;
import com.example.uni.entites.Department;
import com.example.uni.entites.Student;
import com.example.uni.repositories.DepartmentRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/departments")
public class DepartmentController {

    private final DepartmentService departmentService;

    public DepartmentController(DepartmentService departmentService) {
        this.departmentService = departmentService;
    }

    @GetMapping
    public List<DepartmentDTO> getDepartments() {
        return departmentService.getAllDepartments();
    }
}