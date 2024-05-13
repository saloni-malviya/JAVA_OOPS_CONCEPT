/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Oops_concept;

public class Hierarchical_Inheritance {
    public static void main(String[]args)
    {
        Bird b=new Bird();
        b.fly();
        b.eat();
       
    }
    
}
class Animalss{
    void eat()
    {
        System.out.println("eating");
    }
    
}
class Fish extends Animalss{
    void swim()
    {
        System.out.println("swimming");
    }
}
class Mammal extends Animalss{
    void walk()
    {
        System.out.println("walking");
    }
}
class Bird extends Animalss{
    void fly()
    {
        System.out.println("flying");
    }
}