package testing_tasks;

import tasks.Bigger;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class BiggerTest {

    Bigger bigger = new Bigger();

    @Test
    public void test_1() {
        int x = 8;
        int y = 11;
        int expectedOutput = 11;

        int result = bigger.findBigger(x, y);
        int result2 = bigger.findBigger2(x, y);

        assertEquals(expectedOutput, result);
        assertEquals(expectedOutput, result2);
    }

    @Test
    public void test_2() {
        int x = 200;
        int y = 199;
        int expectedOutput = 200;

        int result = bigger.findBigger(x, y);
        int result2 = bigger.findBigger2(x, y);

        assertEquals(expectedOutput, result);
        assertEquals(expectedOutput, result2);
    }
}
