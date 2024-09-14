package tasks.wall_e;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class WallE3Test {

    WallE3 wallE3 = new WallE3();

    @Test
    public void test_1() {
        // given
        int t = 2;
        int x = 60;
        int y = 30;
        int expectedOutput = 6;

        // when
        int result = wallE3.countTime(t, x, y);

        // then
        assertEquals(expectedOutput, result);
    }

    @Test
    public void test_2() {
        // given
        int t = 5;
        int x = 30;
        int y = 50;
        int expectedOutput = 8;

        // when
        int result = wallE3.countTime(t, x, y);

        // then
        assertEquals(expectedOutput, result);
    }
}
