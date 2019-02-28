package shop;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class RealItemTest {

    @BeforeEach
    void setUp() {
        System.out.println("Starting the validation of the RealItem class");
    }

    @AfterEach
    void tearDown() {
        System.out.println("The validation of the RealItem class has been completed");
    }

    @Test
    @DisplayName("Checking the setWeight() method")
    @Disabled
    void setWeight() {
        RealItem iron = new RealItem();
        iron.setWeight(2.5);
        double actual = iron.getWeight();
        double expected = 2.5;
        assertNotNull(actual);
        assertEquals(expected, actual);
    }

}