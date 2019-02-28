package shop;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VirtualItemTest {

    @BeforeEach
    void setUp() {
        System.out.println("Starting the validation of the VirtualItem class");
    }

    @AfterEach
    void tearDown() {
        System.out.println("The validation of the VirtualItem class has been completed");
    }

    @Test
    @DisplayName("Checking the setSizeOnDisk() method")
    void setSizeOnDisk() {
        VirtualItem disk = new VirtualItem();
        disk.setSizeOnDisk(750.5);
        double actual = disk.getSizeOnDisk();
        double expected = 750.5;
        assertNotNull(actual);
        assertEquals(expected, actual);
    }
}