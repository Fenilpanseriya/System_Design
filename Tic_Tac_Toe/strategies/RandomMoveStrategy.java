package strategies;

import java.util.List;

import entity.*;

public class RandomMoveStrategy implements BotPlayingStrategy{
    
    @Override
    public Moves makeRandomMoves(Board board,Player player){

       for(List<Cell> row:board.getBoard()){
        for(Cell cell:row){
            //System.out.println("status "+cell.getSymbol());
            try {
                if (cell.getSymbol() !=null && cell.getSymbol().isEmpty()) {
                    Moves move = new Moves();
                    Symbol s=new Symbol('@');
                    cell.setSymbol(s);
                    move.setCell(cell);
                    //move.setPlayer(player);
                    System.out.println("move is " + move);
                    return move;

                } else {
                    System.out.print("no" + " ");
                }
            }
            catch (Exception e){
                e.printStackTrace();
            }
        }
        System.out.println();
       }

        return null;
    }
}
