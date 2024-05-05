/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Oops_concept;

public class Access_Specifier {
     public static void main(String[]args)
     {
         BankAccount myAcc=new BankAccount();
         myAcc.username="saloni";            //declare value
         System.out.println(myAcc.username);       //access value or print value
         myAcc.setPassword("abcdef");            //declare password, but it cannot access because it is private declare
     }
}
 class BankAccount{
     public String username;          //public access specifier
     private String password;         //private access specifier
     public void setPassword(String pwd)
     {
         password=pwd;
     }
    
}
