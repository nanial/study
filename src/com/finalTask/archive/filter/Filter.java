package com.finalTask.archive.filter;

public class Filter {

    private int idOfStudent;
    private String name;
    private String lastName;
    private int numOfGroup;
    private String department;
    private double averageScore;

    public Filter(int idOfStudent) {
        this.idOfStudent = idOfStudent;
    }

    public Filter(String lastName) {
        this.lastName = lastName;
    }

    public Filter(int numOfGroup, String department) {
        this.numOfGroup = numOfGroup;
        this.department = department;
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
}
