/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

//...............BASIC PROGRAM FOR CLASS AND OBJECTS.......................
package Oops_concept;

public class OOPS {                 //this is main class
    public static void main(String[]args)         //this is main cls function
    {
        Pen p1=new Pen();
        p1.setColor("Blue");
        System.out.println(p1.color);
        p1.setTip(5);                   //declare value
        System.out.println(p1.tip);         //access value
         p1.setColor("yellow");
        System.out.println(p1.color);
        student s=new student();
        s.calpercentage(76,98,89);
        System.out.println(s.percentage);
    }
}
    class Pen{                 //this is class
        String color;
        int tip;
        public void setColor(String newColor)    //this is pen cls function
        {
            color=newColor;
        }
        public void setTip(int newtip){    //this is also pen cls function
            tip=newtip;
        }
    }
    class student{
        String name;
        int age;
        float percentage;
        void calpercentage(int phy,int chem,int math)
        {
            percentage=(phy+chem+math)/3;
        }
    }
    

