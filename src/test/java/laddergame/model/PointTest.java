package laddergame.model;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

class PointTest {
    @Nested
    @DisplayName("이동 테스트")
    class Move {
        @Test
        @DisplayName("아래 이동")
        void move1() {
            Point point = new Point(new Direction(false), new Direction(false));

            int position = point.moveDirection(1);

            assertThat(position).isEqualTo(1);
        }

        @Nested
        @DisplayName("오른쪽 이동")
        class Right {
            Point point = new Point(new Direction(true), new Direction(false));

            @Test
            @DisplayName("오른쪽 이동 성공")
            void success() {
                int position = point.moveDirection(1);
                assertThat(position).isEqualTo(2);
            }
        }


        @Nested
        @DisplayName("왼쪽 이동")
        class Left {
            Point point = new Point(new Direction(false), new Direction(true));

            @Test
            @DisplayName("왼쪽 이동 성공")
            void success() {
                int position = point.moveDirection(2);
                assertThat(position).isEqualTo(1);
            }

            @Test
            @DisplayName("포인터가 라인의 첫번째일 때 왼쪽 이동 불가")
            void fail() {
                assertThatThrownBy(() -> point.moveDirection(0));
            }
        }
    }
}
