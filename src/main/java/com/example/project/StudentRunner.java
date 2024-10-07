package com.example.project;

public class StudentRunner{
    public static void main(String[] args) {
        //use this StudentRunner class if you need to test your code 
        
        Student person = new Student("Michael", "Jackson", 2024);
        person.addTestScore(100);
        person.addTestScore(80);
        person.addTestScore(90);
        person.printStudentInfo();
    }
}