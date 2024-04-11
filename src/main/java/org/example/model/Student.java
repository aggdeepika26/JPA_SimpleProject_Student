package org.example.model;

import javax.persistence.*;

@Entity
@Table(name = "student")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;

    @Column(name = "first_name",nullable = false , length = 150)
    private  String firstName;

    @Column(name = "last_name",nullable = false , length = 250)
    private  String lastName;

    public Student(String firstName,String lastName)
    {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Student(){}

    public Long getId() {
        return Id;
    }

    public void setUserId(Long userId) {
        this.Id = Id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
