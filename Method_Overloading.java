/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Oops_concept;

public class Method_Overloading {
    public static void main(String[]args)
    {
     Calculator c=new Calculator();
     System.out.println(c.sum(1, 2));
     System.out.println(c.sum((float)1.5, (float)2.5));
     System.out.println(c.sum(1, 2, 3));
    }
    
}
class Calculator{
    int sum(int a,int b)
    {
        return a+b;
    }
    float sum(float a,float b)
    {
        return a+b;
    }
    int sum(int a,int b,int c)
    {
        return a+b+c;
       
    }
    
}
