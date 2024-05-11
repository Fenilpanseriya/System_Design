package entity;

public abstract class Player {
    Symbol symbol;
    PlayesType player;
    String name;

    Player(PlayesType p,Symbol s){
        this.symbol=s;
        this.player=p;
    }
    public PlayesType getPlayerType() {
        return player;
    }
    public Symbol getSymbol() {
        return symbol;
    }
    public abstract Moves makeNextMove(Board board);
}
