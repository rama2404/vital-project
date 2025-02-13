package com.Teachers.Teacher.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TeacherController
{
    @GetMapping("/Teacher")
    public String index()
    {
        return "Rama";
    }

}
