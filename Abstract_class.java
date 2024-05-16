/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Oops_concept;

public class Abstract_class {
    public static void main(String[]args)
    {
        Horse h=new Horse();
        h.food();
        h.run();
        chicken c=new chicken();
        c.food();
        c.run();
    }
    
}
abstract class Aniimal{
    void food()
    {
        System.out.println("eatss");
    }
    abstract void run();
}

class Horse extends Aniimal{
    void run()
    {
        System.out.println("walk in 4 legs");
    }
}
class chicken extends Aniimal{
    void run()
    {
        System.out.println("walk n 2 legs");
    }
}
