package laddergame.model;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

class PersonTest {
    @Nested
    @DisplayName("이름에 한글이 들어갈 수 없다.")
    class TestNameLength {
        @Test
        @DisplayName("생성 테스트")
        void Should_Success_When_NameInput() {
            assertDoesNotThrow(() -> new Person("name"));
        }

        @Test
        @DisplayName("한글이 들어가는 경우 예외 발생")
        void Should_ThrowException_When_KoreanInput() {
            assertThatThrownBy(() -> new Person("이름"));
        }
    }

    @Test
    @DisplayName("앞 뒤의 공백이 있는 문자열이 입력되면 공백이 제거된다.")
    void Should_Trim_When_FrontAndBackBlank() {
        assertThat(new Person(" name ").getName()).isEqualTo(" name ".trim());
    }
}
