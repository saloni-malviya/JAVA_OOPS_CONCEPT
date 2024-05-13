/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Oops_concept;

public class Hybrid_Inheritance {
    public static void main(String[]args)
    {
        Shark s=new Shark();
        s.eatt();
        s.print2();
        s.swimm();
        Peacock p=new Peacock();
        p.eatt();
        p.flyy();
        p.dance();
        Human h=new Human();
        h.eatt();
        h.walkk();
        h.leg();
    }
    
}
class Animal{
    void eatt()
    {
        System.out.println("Animalls eattt");
    }
}
class Fishh extends Animal{
    void swimm()
    {
        System.out.println("fishes swimming");
    }
}
class Tuna extends Fishh{
    void print1()
    {
        System.out.println("This is tuna fish");
    }
}
class Shark extends Fishh{
    void print2()
    {
        System.out.println("This is shark fish");
    }
}
class Birdd extends Animal{
    void flyy()
    {
        System.out.println("birds flyyyy");
    }
}
class Peacock extends Birdd{
    void dance()
    {
        System.out.println("peacock is dancing");
    }
}
class Mammall extends Animal{
    void walkk()
    {
        System.out.println("mammal is walking");
    }
}
class Dog extends Mammall{
    void legs()
    {
        System.out.println("dogs are 4 legs for walking");
    }
}
class Cat extends Mammall{
    void printt()
    {
        System.out.println("This is a cat");
    }
}
class Human extends Mammall{
    void leg()
    {
        System.out.println("Humans are 2 legs");
    }
}
