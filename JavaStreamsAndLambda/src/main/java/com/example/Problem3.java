package com.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Student {
    String name;
    String gender;

    public Student(String name, String gender) {
        this.name = name;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }
}

public class Problem3 {
    static void main() {
        List<Student> students = Arrays.asList(
                new Student("John", "Male"),
                new Student("Emma", "Female"),
                new Student("David", "Male"),
                new Student("Sophia", "Female")
        );

        List<String> prefixedNames =
                students.stream()
                        .map(s -> {
                            if(s.getGender().equalsIgnoreCase("Male")) {
                                return "Mr. " + s.getName();
                            } else {
                                return "Ms. " + s.getName();
                            }
                        })
                        .collect(Collectors.toList());

        System.out.println(prefixedNames);
    }
}
