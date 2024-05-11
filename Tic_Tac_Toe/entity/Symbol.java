package entity;

public class Symbol {
    Character symbol;

    public Symbol(Character ch){
        this.symbol=ch;
    }

    public boolean isEmpty(){
        return symbol==' ';
    }

    public Character getSymbol() {
        return symbol;
    }
}
