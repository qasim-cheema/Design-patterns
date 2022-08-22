package com.example.demo;

public class StudentBuilder {
    private int id;
    private String name;
    private int age;
    private int marks;

    public StudentBuilder setId(int id) {
        this.id = id;
        return this;
    }

    public StudentBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public StudentBuilder setAge(int age) {
        this.age = age;
        return this;
    }

    public StudentBuilder setMarks(int marks) {
        this.marks = marks;
        return this;
    }
    public Student getStudent()
    {
        return new Student(id,name,age,marks);
    }



}
