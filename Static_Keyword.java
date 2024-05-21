/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Oops_concept;

public class Static_Keyword { 
    public static void main(String[]args)
    {
        College c=new College();
        c.sname="saloni";
        c.clg_name="iips";
        College c1=new College();
        //Static keyword use
        System.out.println(c1.clg_name);
        
     
    }
    
}
class College{
     int rollno;
    String sname;
    //Declare static keyword
    static String clg_name;
    public void setname(String name)
    {
        this.sname=name;
    }
    public String getname()
    {
        return sname;
    }
}
