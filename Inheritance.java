/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//...............INHERITANCE OR SINGLE LEVEL INHERITANCE CONCEPT......................
package Oops_concept;

public class Inheritance {
    public static void main(String[]args)
    {
        Fish f = new Fish();
        f.eats();
        f.swim();
        f.breathe();
    }
    
    
}
class Lion{
    String color;
    public void eats()
    {
        System.out.println("Animal are eating");
    }
    public void breathe()
    {
        System.out.println("Animal breathes");
    }
}
class Fish extends Lion{
    int fins;
    public void swim()
    {
        System.out.println("fish is Swiming");
    }
}
