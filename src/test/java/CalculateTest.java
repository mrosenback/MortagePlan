import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

import static org.junit.jupiter.api.Assertions.*;

public class CalculateTest {

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }

    @org.junit.jupiter.api.Test
    void Calculate() {
        double expected = 59.21856882868132;
        Customer person = new Customer();
        person.setTotalLoan(1300.55);
        person.setInterest(8.67);
        person.setYears(2);
        Calculate result = new Calculate(person);
        assertEquals(expected, result.getResult());
    }
}
