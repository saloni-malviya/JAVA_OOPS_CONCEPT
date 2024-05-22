/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Oops_concept;

public class Super_keyword {
    public static void main(String[]args)
    {
        car c=new car();
        System.out.println(c.color);
    }
    
}
class vehicle
{
    String color;
    vehicle()
    {
        System.out.println("vehicle constructor are called");
    }
    
}
class car extends vehicle{
    car()
    {
        super.color="black";
       // super();
        System.out.println("car construcotr are called");
    }
}
