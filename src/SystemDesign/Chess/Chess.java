package SystemDesign.Chess;

public class Chess {

}

class Pawn
{
    public void enpassant()
    {

    }
    public void promotion()
    {

    }

}
class King
{
    public void castle()
    {

    }

}
class Knight
{

}
class Queen
{

}
class Bishop
{

}
abstract class  Piece
{
    Position currentPosition;
   public void move(Position destination )
   {
       if(isValid(currentPosition,destination))
       {
           currentPosition=destination;
       }
       else
       {

       }

   }
   public boolean isValid(Position start, Position end)
   {
       return true;
   }
   abstract void getAllPossibleMve();



}
class Position{

}
class Board{

}
enum Color
{
    WHITE, BLACK
}