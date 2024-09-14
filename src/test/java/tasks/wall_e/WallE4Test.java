package tasks.wall_e;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class WallE4Test {

    WallE4 wallE4 = new WallE4();

    @Test
    public void test_1() {
        // given
        int x = 3;
        int t = 500;
        int k = 30;
        int n = 2;
        int expectedOutput = 195;

        // when
        int result = wallE4.takeResult(x, t, k, n);

        // then
        assertEquals(expectedOutput, result);
    }

    @Test
    public void test_2() {
        // given
        int x = 5;
        int t = 400;
        int k = 20;
        int n = 7;
        int expectedOutput = 720;

        // when
        int result = wallE4.takeResult(x, t, k, n);

        // then
        assertEquals(expectedOutput, result);
    }

}
