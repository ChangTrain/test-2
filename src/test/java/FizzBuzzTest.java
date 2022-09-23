import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {


    @Test
    public void shouldSay1For1() {
        FizzBuzz underTest = new FizzBuzz();
        String result = underTest.playGame();
        assertEquals("1", result);
    }

}
