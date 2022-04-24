package racingcar;

import racingcar.model.Players;
import racingcar.model.RacingGame;
import racingcar.strategy.RacingCarGameStrategy;
import racingcar.view.InputView;
import racingcar.view.OutputView;

public class Application {
    public static void main(String[] args) {
        // TODO: 프로그램 구현
        Players players = new Players(InputView.askQuestion("1"));
        int gameCount = Integer.parseInt(InputView.askQuestion("2"));
        RacingGame racingGame = new RacingGame(players, gameCount, new RacingCarGameStrategy());
        racingGame.playGames();
        OutputView.resultPrintOut(racingGame.totalScoreBoards(), racingGame.winnerList());
    }
}
