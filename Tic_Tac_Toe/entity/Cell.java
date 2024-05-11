package entity;

public class Cell {
    int row;
    int col;
    Symbol s;
    public int getCol() {
        return col;
    }
    public int getRow() {
        return row;
    }
    public Symbol getSymbol(){
        return s;
    }
    public void clearCell(){
        this.s=new Symbol(' ');
    }
    public void setCol(int col) {
        this.col = col;
    }
    public void setRow(int row) {
        this.row = row;
    }
    public void setSymbol(Symbol s) {
        this.s = s;
    }
}
