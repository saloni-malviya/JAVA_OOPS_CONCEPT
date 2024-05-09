/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Oops_concept;

/**
 *
 * @author Onsite Solution
 */
public class Copy_Constructor {
    public static void main(String[]args)
    {
        Studentss s1=new Studentss();
        s1.name="simmi";
        s1.rollno=54;
        s1.password="abcs";
        s1.marks[0]=100;
        s1.marks[1]=80;
        s1.marks[2]=88;
        
        //copy constructor
        Studentss s2=new Studentss(s1);
        s2.password="edf";
        //Shallow copy:- i.e. changes reflect
        s1.marks[2]=67;
        for(int i=0;i<3;i++)
        {
            System.out.println(s2.marks[i]);
        }
    }
}
class Studentss {
    String name;
    String password;
    int rollno;
    int marks[]=new int[3];
    Studentss()
    {
        marks=new int[3];
        System.out.println("Constructor is call");
    }
    Studentss(String name)
    {
        marks=new int[3];
        this.name=name;
        
    }
    Studentss(int roll)
    {
        marks=new int[3];
        this.rollno=roll;
    }
    //copy constructor
    Studentss(Studentss s1)
    {
        marks=new int[3];
        this.rollno=s1.rollno;
        this.name=s1.name;
        this.marks=s1.marks;
    }
}
