package racingcar.view;

import camp.nextstep.edu.missionutils.Console;

public class InputView {

    public static String askQuestion(String value) {
        if (value.equals("1")) {
            System.out.println("경주할 자동차 이름을 입력하세요.");
        }
        if (value.equals("2")) {
            System.out.println("시도할 횟수는 몇회인가요?");
        }
        return Console.readLine();
    }
}
