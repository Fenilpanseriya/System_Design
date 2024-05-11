package entity;

import java.util.Scanner;

public class HumanPlayer extends Player {
    public HumanPlayer(Symbol s){
        super(PlayesType.HUMAN,s);
    }

    public Moves makeNextMove(Board board){
        

        Scanner sc=new Scanner(System.in);
        System.out.println("enter row number, row number start with index 1");
        Integer row=sc.nextInt();
        System.out.println("enter col number, col number start with index 1");
        Integer col=sc.nextInt();


        Moves moves=new Moves();
        moves.setCell(board.getCell(row-1, col-1));
        moves.setPlayer(this);

        moves.setSymbol(this.getSymbol());
        System.out.println(moves.getSymbol() +" "+ moves.getCell());
        return moves;

    }
}
