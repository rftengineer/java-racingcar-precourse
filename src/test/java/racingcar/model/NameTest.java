package racingcar.model;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class NameTest {

    @ParameterizedTest
    @CsvSource(value = {"value1", "value2", "Jennifer"})
    @DisplayName("5글자 이상 이름은 입력불가")
    void nameLengthExceptionTest(String value) {
        assertThatThrownBy(() -> new Name(value))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("[ERROR]");
    }
}