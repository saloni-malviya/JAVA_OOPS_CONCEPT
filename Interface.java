/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Oops_concept;

public class Interface {
    public static void main(String[]args)
    {
        Queen q=new Queen();
        q.moves();
    }
    
}
interface chessplayer{
    void moves();
}
class Queen implements chessplayer{
   public void moves()
    {
        System.out.println("up,right,left,down,diagonal");
    }
}
class Rook implements chessplayer{
    public void moves()
    {
        System.out.println("up,down,left,right");
    }
}
class King implements chessplayer{
    public void moves()
    {
        System.out.println("up,down,left,right,diagonal(only 1-step)");
    }
}
