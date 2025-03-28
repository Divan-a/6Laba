package org.example;

import java.util.Objects;

public class Student extends Human{
    private String facultet;

    public Student(String name, String surname, String patronymic, int age, String facultet) {
        super(name, surname, patronymic, age);
        this.facultet = facultet;
    }

    public String getFacultet() {
        return facultet;
    }

    public void setFacultet(String facultet) {
        this.facultet = facultet;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Student student = (Student) o;
        return Objects.equals(facultet, student.facultet);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), facultet);
    }

    @Override
    public String toString() {
        return "Student{" +
                "facultet='" + facultet + '\'' +
                "} " + super.toString();
    }
}
