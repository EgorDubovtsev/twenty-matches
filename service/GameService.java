package service;

import entity.Computer;
import entity.Human;


public class GameService {

    private int counterOfMove = 1;
    private ComputerService computerService = new ComputerService();
    private HumanService humanService = new HumanService();
    private ActivePlayerService activePlayerService = new ActivePlayerService();
    private Computer computer = new Computer();
    private Human human = new Human();
    private PrintService printService = new PrintService();
    private MatchesService matchesService = new MatchesService();


    public void startGame() {
        while (true) {
            computerMove();
            if (matchesService.getMatchesLeft() == 1) {
                break;
            }
            humanMove();
        }
        printService.printTheWinner(activePlayerService.getPassivePlayer());


    }

    private void computerMove() {
        activePlayerService.setActivePlayer(computer);
        printService.printMatchesLeft(matchesService.getMatchesLeft());
        printService.printComputerPull(computerService.pullMatches(counterOfMove, humanService.getLastMove()));
        matchesService.pull(computerService.pullMatches(counterOfMove, humanService.getLastMove()));
        counterOfMove++;
    }

    private void humanMove() {
        activePlayerService.setActivePlayer(human);
        printService.printMatchesLeft(matchesService.getMatchesLeft());
        printService.printHumanPull();
        matchesService.pull(humanService.pullMatches());
        if (humanService.getLastMove() < 1 || humanService.getLastMove() > 3) {
            printService.errorValue();
            humanMove();
        }
    }
}
