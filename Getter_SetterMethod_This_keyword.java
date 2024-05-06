/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Oops_concept;
import java.lang.*;
public class Getter_SetterMethod_This_keyword {
    public static void main(String[]args)
    {
        Pen p=new Pen();     //create a pen object called p
        p.setColor("Blue");
        System.out.println(p.getColor());
        p.setTip(5);
        System.out.println(p.getTip());
    }
    
}
class Pen{
    private String color;
    private int tip;
    public String getColor()
    {
        return this.color;
    }
    public void setColor(String newcolor)
    {
        this.color=newcolor;
    }
    public int getTip()
    {
        return this.tip;
    }
    public void setTip(int tip)
    {
        this.tip=tip;
    }
}
