package entity;
import java.util.*;

public class Board {
    List<List<Cell>>board;
    int dimension;

    public Board(int dimension){
        this.dimension=dimension;
        board=new ArrayList<>();
        System.out.println(this.dimension);
        for(int i=0;i<dimension;i++){
            board.add(new ArrayList<>());
            for(int j=0;j<dimension;j++){
                Cell c=new Cell();
                c.setSymbol(new Symbol(' '));
                board.get(i).add(c);
                System.out.println("p"+board.get(i).get(j)+" ");
            }
            System.out.println();
        }
//        for(int i=0;i<dimension;i++){
//            for(int j=0;j<dimension;j++){
//                System.out.print(board.get(i).get(j)+ " ");
//
//            }
//            System.out.print("\n");
//        }
    }

    public void displayBoard(){
        for(List<Cell>row:board){
            for(Cell cell:row){
                if(cell.getSymbol()==null){
                    System.out.println("|    |");
                }
                else{
                    System.out.println("| " + cell.getSymbol() + " |");
                }
            }
            System.out.print("\n");
        }
    }

    public List<List<Cell>> getBoard() {
        return this.board;
    }
    public Cell getCell(int row,int col){
        return board.get(row).get(col);
    }
    public int getDimension() {
        return this.dimension;
    }
}
