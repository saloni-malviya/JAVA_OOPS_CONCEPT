/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Oops_concept;
import java.lang.*;
public class Constructor_Overloading {
    public static void main(String[]args)
    {
        Students s1=new Students();
        Students s2=new Students("saloni");
        Students s3=new Students(123);
        System.out.println(s2.name);
        System.out.println(s3.rollno);
    }
    
}
class Students{
    String name;
    int rollno;
    Students()
    {
        System.out.println("Constructor is called");
    }
    Students(String name)
    {
        this.name=name;
    }
    Students(int roll)
    {
        this.rollno=roll;
    }
}
