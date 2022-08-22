package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {
    @GetMapping("/student")
    public List<Student> getStudent()
    {
        // add new student in a file
        // adding new commint in file
        List<Student> l1= new ArrayList<>();
       Student student = new StudentBuilder().setId(1).setAge(20).setName("QRC").getStudent();
       l1.add(student);
        return l1;

    }

    @GetMapping("/teacher")
    public String getTeacher()
    {
        Teacher instanceOne = Teacher.getInstance();
        Teacher instanceTwo = null;
        try {
            Constructor[] constructors = Teacher.class.getDeclaredConstructors();
            for (Constructor constructor : constructors) {
                //Below code will destroy the singleton pattern
                constructor.setAccessible(true);
                instanceTwo = (Teacher) constructor.newInstance();
               // instanceTwo=Teacher.getInstance(2,"Awais");
                break;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }


        return instanceOne.getTeacher() +" "+ instanceTwo.getTeacher();
        //return "wwwww";

    }

}
