package repository;

import entity.Gamer;


public class ActivePlayerRepository {
    private Gamer activePlayer;
    private Gamer passivePlayer;

    public Gamer getActivePlayer() {
        return activePlayer;
    }
    public Gamer getPassivePlayer(){
        return passivePlayer;
    }

    public void setActivePlayer(Gamer gamer) {
        this.passivePlayer= this.activePlayer;
        this.activePlayer = gamer;
    }

}
