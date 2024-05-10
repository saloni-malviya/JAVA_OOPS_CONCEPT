/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

//...............SHALLOW AND DEEP COPY CONSTRUCTOR.....................
package Oops_concept;

public class Shallow_and_DeepCopy_Constructor {
    public static void main(String[]args)
    {
        Student1 s1=new Student1();
        s1.name="saloni malviya";
        s1.rollno=1234;
        s1.password="rfrf";
        s1.marks[0]=45;
        s1.marks[1]=67;
        s1.marks[2]=77;
        
        //copy
        Student1 s2=new Student1(s1);
        s2.password="xyz";
        s1.marks[2]=99;
        for(int i=0;i<3;i++)
        {
            System.out.println(s2.marks[i]);
        }
    }
    
}
class Student1
{
    String name;
    int rollno;
    String password;
    int marks[];
    
    //Shallow copy constructor
  /*  Student1(Student1 s1)
    {
        marks=new int[3];
        this.name=s1.name;
        this.rollno=s1.rollno;
        this.marks=s1.marks;
    }
    */
    
    //Deep copy constructor
    Student1(Student1 s1)
    {
        marks=new int[3];
        this.name=s1.name;
        this.rollno=s1.rollno;
        for(int i=0;i<marks.length;i++)
        {
            this.marks[i]=s1.marks[i];
        }
    }
    Student1()
    {
        marks=new int[3];
        System.out.println("Constructor is called");
    }
    Student1(String name)
    {
        marks=new int[3];
        this.name=name;
    }
    Student1(int rollno)
    {
        marks=new int[3];
        this.rollno=rollno;
    }
}
