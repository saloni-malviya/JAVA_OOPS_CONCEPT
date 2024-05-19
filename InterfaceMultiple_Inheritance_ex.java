/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Oops_concept;

public class InterfaceMultiple_Inheritance_ex {
    public static void main(String[]args)
    {
        Pig p=new Pig();
        p.eatting();
        p.fooding();
    }
    
}
interface Herbivore{
    void eatting();
}
interface carnivore{
    void fooding();
}
class Pig implements Herbivore,carnivore{
    public void eatting()
    {
        System.out.println("it is eating only grass");
    }
    public void fooding()
    {
        System.out.println("It only eatting meat");
    }
}
