package racingcar.view;

public class OutputView {
    private static void printHeadLine() {
        System.out.println("실행 결과");
    }

    private static void printScores(String scores) {
        System.out.println(scores);
    }

    private static void printWinner(String winners) {
        System.out.println("최종 우승자: " + winners);
    }

    public static void resultPrintOut(String scores, String winners) {
        printHeadLine();
        printScores(scores);
        printWinner(winners);
    }
}
