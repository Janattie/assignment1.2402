package models;

import java.util.ArrayList;
import java.util.Random;

public class Student extends Person {
    private int studentID;
    private ArrayList<Integer> grades;

    public Student(String name, String surname, int age, boolean gender) {
        super(name, surname, age, gender);
        this.grades = new ArrayList<>();
        this.studentID = new Random().nextInt(9000) + 1000;
        this.grades = new ArrayList<>();
    }

    public int getStudentID() {
        return studentID;
    }
    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }
    public ArrayList<Integer> getGrade() {
        return grades;
    }
    public void setGrade(ArrayList<Integer> grade) {
        this.grades = grade;
    }
    public void addGrade(int grade) {
        grades.add(grade);
    }
    public double calculateGPA() {
        int totalSum = 0;
        int totalCount = 0;

        for (int grade : grades) {
            totalSum += grade;
            totalCount++;
        }
        return (double) totalSum / totalCount;
    }

    @Override
    public String toString() {
        String genderStr = isGender() ? "Male" : "Female";
        double gpa = calculateGPA();
        return "Hi, I am " + getName() + " " + getSurname() + ", a " + getAge() + "-years old, " + genderStr + "\n" +
                "ID: " + studentID + "\n" +
                "GPA: " + gpa;
    }
}
