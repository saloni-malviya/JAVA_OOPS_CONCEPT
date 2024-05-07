/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Oops_concept;
import java.lang.*;
public class Constructor {
    public static void main(String[]args)
    {
        Student s=new Student();
        Student s1=new Student("saloni");
        System.out.println(s1.name);
    }
    
}
class Student{
    String name;
    int rollno;
    //Non Parameterized constructor
    Student()
    {
        System.out.println("non-parametized constructor is called");
    }
    //Parameterized Constructor
    Student(String name)
    {
        this.name=name;
    }
}
