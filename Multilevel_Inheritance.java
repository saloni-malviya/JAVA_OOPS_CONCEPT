/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

//...............PROGRAM FOR MULTILEVEL INHERITANCE............................
package Oops_concept;

public class Multilevel_Inheritance {
    public static void main(String[]args)
    {
        bear d=new bear();
        d.printtt();
        d.legsss=4;
        System.out.println(d.legsss);
        d.printttt();
    }
    
}

class Tiger{
    String color;
    void printtt()
    {
        System.out.println("eats");
    }
    void printttt()
    {
        System.out.println("breathe");
    }
}
class elephent extends Tiger{
    int legsss;
}
class bear extends elephent{
    String breeed;
}
