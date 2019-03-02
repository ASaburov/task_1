package shop;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class CartTest {


    @BeforeEach
    void setUp() {
        System.out.println(".");
    }

    @AfterEach
    void tearDown() {
        System.out.println("...");
    }

    // DISABLED TEST
    @Disabled
    @Test
    @DisplayName("Checking the getCartName() method")
    void getCartName() {
        Cart testCart = new Cart("testCart");
        String actualTestCartName = testCart.getCartName();
        String expectedCartName = "testCart";
        assertEquals(expectedCartName, actualTestCartName);
    }

    @Test
    @DisplayName("Checking the addRealItem() method: ensure that Tax is included")
    void addRealItem() {
        Cart testCart = new Cart ("testTaxCart");
        double priceOfRealItem = 10.0;
        RealItem realItem = new RealItem();
        realItem.setPrice(priceOfRealItem);
        testCart.addRealItem(realItem);
        // GROUPED ASSERTION
        assertAll("realItem",
                //assertion checks that totalPrice of the testCart != null
                () -> assertNotNull(testCart.getTotalPrice()),
                //assertion checks that TAX is included into calculation of the total price
                () -> assertEquals(priceOfRealItem + (priceOfRealItem * 0.2), testCart.getTotalPrice())
                );

    }

    @Test
    @DisplayName("Checking the addVirtualItem() method: ensure that Tax is included")
    void addVirtualItem() {
        Cart testCart = new Cart ("testTaxCart");
        double priceOfVirtualItem = 12.2;
        VirtualItem virtualItem = new VirtualItem();
        virtualItem.setPrice(priceOfVirtualItem);
        testCart.addVirtualItem(virtualItem);
        assertAll("virtualItem",
                //assertion checks that totalPrice of the testCart != null
                () -> assertNotNull(testCart.getTotalPrice()),
                //assertion checks that TAX is included into calculation of the total price
                () -> assertEquals(priceOfVirtualItem + (priceOfVirtualItem * 0.2), testCart.getTotalPrice())
        );
    }

}