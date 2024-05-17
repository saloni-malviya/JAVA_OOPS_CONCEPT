/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Oops_concept;

public class Abstract_cls_Constructor {
    public static void main(String[]args)
    {
        earth e=new earth();
        
    }
    
}
abstract class star{
    star()
    {
        System.out.println("star constructor called");
    }
    void starPrint()
    {
        System.out.println("print star");
    }
    abstract void moon();
}
class sun extends star{
    sun()
    {
        System.out.println("sun constructor is called");
    }
    void moon()
    {
        System.out.println("moon is called");
    }
}
class earth extends sun{
    earth()
    {
        System.out.println("earth constructor is called");
    }
    void moon()
    {
        System.out.println("moons is called");
    }
}
