package com.example.uni.Service;

import com.example.uni.dto.DepartmentDTO;
import com.example.uni.entites.Department;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Service
public class DepartmentService {

    private final DepartmentRepository departmentRepository;

    public DepartmentService(DepartmentRepository departmentRepository) {
        this.departmentRepository = departmentRepository;
    }

    public List<DepartmentDTO> getAllDepartments() {

        List<Department> departments =
                departmentRepository.findAllWithStudentsAndCourses();

        return departments.stream().map(dept ->
                new DepartmentDTO(
                        dept.getName(),
                        dept.getStudents().stream()
                                .map(student ->
                                        new StudentDTO(
                                                student.getName(),
                                                student.getCourses().size()
                                        )
                                ).toList()
                )
        ).toList();
    }
}