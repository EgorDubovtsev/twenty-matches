package service;

import repository.MatchesRepository;

public class MatchesService {

    MatchesRepository matchesRepository = new MatchesRepository();

    public void pull(int valueOfMatches) {
        matchesRepository.setMatchesLeft(matchesRepository.getMatchesLeft() - valueOfMatches);

    }

    public int getMatchesLeft() {
        return matchesRepository.getMatchesLeft();
    }

}
