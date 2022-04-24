package racingcar.model;

import java.util.ArrayList;
import java.util.List;
import racingcar.model.primitive.Name;
import racingcar.strategy.MovementStrategy;

public class RacingGame {
    private final Players players;
    private final int gameCount;
    private final MovementStrategy movementStrategy;
    private final List<String> scoreBoards;

    public RacingGame(Players players, int gameCount, MovementStrategy movementStrategy) {
        this.players = players;
        this.gameCount = gameCount;
        this.movementStrategy = movementStrategy;
        this.scoreBoards = new ArrayList<>();
    }

    public void playGames() {
        for(int loop = 0; loop < gameCount; loop++) {
            playGame();
        }
    }

    private void playGame() {
        players.moveWithStrategy(movementStrategy);
        scoreBoards.add(players.currentScores());
    }

    public String totalScoreBoards() {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < gameCount; i++) {
            sb.append(showScoreBoard(i)).append("\n");
        }
        return sb.toString();
    }

    private String showScoreBoard(int round) {
        return ScoreBoard.scoreBoardWithTemplate(scoreBoards.get(round));
    }

    public String winnerList() {
        StringBuilder sb = new StringBuilder();
        players.firstPlayerNames().forEach((value) -> sb.append(value.getName()).append("\n"));
        return sb.toString();
    }
}
