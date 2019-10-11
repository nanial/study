package com.task.sixth.archive.domain;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicInteger;

public class Portfolio implements Serializable {

    private static final AtomicInteger count = new AtomicInteger(0);
    private int idOfStudent;
    private String name;
    private String lastName;
    private int numOfGroup;
    private String department;
    private double averageScore;

    public Portfolio() {
    }

    public Portfolio(String name, String lastName, int numOfGroup, String department, double averageScore) {

        this.idOfStudent = count.incrementAndGet();
        this.name = name;
        this.lastName = lastName;
        this.numOfGroup = numOfGroup;
        this.department = department;
        this.averageScore = averageScore;
    }

    public int getIdOfStudent() {
        return idOfStudent;
    }

    public void setIdOfStudent(int idOfStudent) {
        this.idOfStudent = idOfStudent;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getNumOfGroup() {
        return numOfGroup;
    }

    public void setNumOfGroup(int numOfGroup) {
        this.numOfGroup = numOfGroup;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getAverageScore() {
        return averageScore;
    }

    public void setAverageScore(double averageScore) {
        this.averageScore = averageScore;
    }

    @Override
    public String toString() {
        return "Portfolio{" +
                "idOfStudent=" + idOfStudent +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", numOfGroup=" + numOfGroup +
                ", department='" + department + '\'' +
                ", averageScore=" + averageScore +
                '}';
    }
}
