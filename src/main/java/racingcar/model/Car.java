package racingcar.model;

import racingcar.model.primitive.Distance;
import racingcar.model.primitive.Name;
import racingcar.strategy.MovementStrategy;

public class Car {
    private Name name;
    private Distance distance;

    public Car(String name, int initialDistance) {
        try {
            this.name = new Name(name);
            this.distance = new Distance(initialDistance);
        } catch (IllegalArgumentException ie) {
            System.out.println("[ERROR]: 입력된 값에 문제가 있습니다.");
        }
    }

    public void move(MovementStrategy movementStrategy) {
        if (movementStrategy.isMovingCar()) {
            distance.add();
        }
    }

    public String showPrimitiveValueWithParam(String data) {
        if(data.equals("Name")) {
            return name.getName();
        }
        if(data.equals("Distance")) {
            return String.valueOf(distance.getValue());
        }
        return "";
    }
    public String showResult() {
        return name.getName() + ":" + distance.getValue();
    }

}
