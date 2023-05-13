package com.exercise.StudentCRUDOperation.Model;

import javax.persistence.*;

@Entity
@Table(name = "student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "sid")
    private int id;
    @Column(name = "sname")
    private String name;
    @Column(name = "sage")
    private int age;
    @Column(name = "sstream")
    private String stream;

    public Student(int id, String name, int age, String stream) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.stream = stream;
    }

    public Student() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getage() {
        return age;
    }

    public void setCno(int age) {
        this.age = age;
    }

    public String getStream() {
        return stream;
    }

    public void setStream(String stream) {
        this.stream = stream;
    }
}
