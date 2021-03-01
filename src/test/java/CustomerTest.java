import static org.junit.jupiter.api.Assertions.*;

public class CustomerTest {

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }

    @org.junit.jupiter.api.Test
    void setName() {
        Customer person = new Customer();
        String name = "Mathias";
        person.setName(name);
        assertEquals(name, person.getName());
    }

    @org.junit.jupiter.api.Test
    void setTotalLoan() {
        Customer person = new Customer();
        double loan = 1000;
        person.setTotalLoan(loan);
        assertEquals(loan, person.getTotalLoan());
    }

    @org.junit.jupiter.api.Test
    void setInterest() {
        Customer person = new Customer();
        double interest = 2.25;
        person.setInterest(interest);
        assertEquals(interest, person.getInterest());
    }

    @org.junit.jupiter.api.Test
    void setYear() {
        Customer person = new Customer();
        int years = 5;
        person.setYears(years);
        assertEquals(years, person.getYears());
    }
}
