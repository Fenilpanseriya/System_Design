package entity;

public class Moves {
    Symbol s;
    Player p;
    Cell c;

    public Cell getCell() {
        return c;
    }
    public Player getPlayer() {
        return p;
    }
    public Symbol getSymbol() {
        return s;
    }
    public void setCell(Cell c) {
        this.c = c;
    }
    public void setPlayer(Player p) {
        this.p = p;
    }
    public void setSymbol(Symbol s) {
        this.s = s;
    }
}
