package service;

import entity.Gamer;
import repository.ActivePlayerRepository;

public class ActivePlayerService {
    private ActivePlayerRepository activePlayerRepository = new ActivePlayerRepository();
    public Gamer getActivePlayer(){
        return activePlayerRepository.getActivePlayer();
    }
    public void setActivePlayer(Gamer gamer) {
        activePlayerRepository.setActivePlayer(gamer);
    }
    public Gamer getPassivePlayer(){
        return  activePlayerRepository.getPassivePlayer();
    }
}
