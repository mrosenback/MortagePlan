import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReadFileTest {

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }

    @org.junit.jupiter.api.Test
    void readInfo() {
        ReadFile file = new ReadFile("prospects.txt");
        Customer person = new Customer();
        file.setInfo(person);
        assertEquals("Juha", person.getName());
        assertEquals(1000, person.getTotalLoan());
        assertEquals(5, person.getInterest());
        assertEquals(2, person.getYears());
    }
}
