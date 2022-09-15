package ch.juventus.javadoc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MathUtilsTest {

    @Test
    void testSubtraction() {
        // given
        MathUtils mathUtils = new MathUtils();
        // when
        double result = mathUtils.subtraction(4, 2);
        // then
        assertEquals(2, result);
    }

}