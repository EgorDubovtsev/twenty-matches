package service;


import entity.Gamer;

public class PrintService {
    public void printMatchesLeft(int matchesLeft) {
        System.out.println("On table left " + matchesLeft + " matchstick");
    }

    public void printComputerPull(int pulledMatches) {
        System.out.println("Count of matchstick that the  computer pulled out:" + pulledMatches);
    }

    public void printHumanPull() {
        System.out.println("Player move. Enter the matchstick value:");
    }

    public void printTheWinner(Gamer gamer) {
        System.out.println("The last matchstick is left for the " + gamer + ". The " + gamer + " lost!");
    }

    public void errorValue() {
        System.out.println("Invalid value, try again");
    }

}
