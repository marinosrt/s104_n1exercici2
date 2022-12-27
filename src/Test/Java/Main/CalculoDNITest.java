package Main;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;


import static org.junit.jupiter.api.Assertions.*;

public class CalculoDNITest {

    @ParameterizedTest
    @CsvSource({
            "53287342, E",
            "38536723, Q",
            "47443128, Q",
            "89467241, R",
            "13469758, S",
            "69745915, W",
            "65478932, W",
            "74123698, B",
            "36987412, P",
            "65478912, M"
    })

    void test(String input, char expected){
        CalculoDNI dniTest = new CalculoDNI();
        char actual = dniTest.getDNI(input);
        assertEquals(expected, actual);
    }

}