/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Oops_concept;

public class Method_Overriding {
    public static void main(String[]args)
    {
        Deer d=new Deer();
        d.eat();
       // d.color="green";
        //System.out.println(d.color);
    }
    
}
class Doggy{
    //String color;
    void eat()
    {
        System.out.println("eat anything");
    }
}
class Deer extends Doggy{
    void eat()
    {
        System.out.println("eat only grass");
    }
}
