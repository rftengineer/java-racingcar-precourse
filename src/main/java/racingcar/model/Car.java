package racingcar.model;

import racingcar.model.primitive.Distance;
import racingcar.model.primitive.Name;

public class Car {
    private final Name name;
    private final Distance distance;

    public Car(String name, int initialDistance) {
        this.name = new Name(name);
        this.distance = new Distance(initialDistance);
    }

    public void move(int decision) {
        if (decision >= 4) {
            distance.add();
        }
    }

    public String showResult() {
        return name.getName() + ": " + distance.getValue();
    }

}
