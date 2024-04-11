package org.example.model;

import org.example.repository.StudentRepository;


public class Main {
    public static void main(String[] args) {


    Student student = new Student("Alan" , "Red");
    StudentRepository studentRepository = new StudentRepository();

    studentRepository.add(student);
    System.out.println("Added student " + student.toString() );

    student = studentRepository.find(student.getId());
    System.out.println("Found student " + student.toString());

        student.setLastName("Demir");
        studentRepository.update(student);
        System.out.println("Updated Student " + student.toString()) ;

       // studentRepository.delete(student);
        //System.out.println("Deleted Student " + student.toString());


}
}
