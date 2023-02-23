import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.Assert.assertEquals;

public class MainTest {
    @Test
    public void testDeliveryRequests() {
        // Redirect System.out to capture output
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        // Create objects
        Shop shop = new Shop("Panda Express");
        Driver driver1 = new Driver("Andy", "Hatchback");
        Driver driver2 = new Driver("Bob", "Station Wagon");
        Driver driver3 = new Driver("Cindy", "Sports Car");
        Driver driver4 = new Driver("David", "Coupe");
        Driver driver5 = new Driver("Eddy", "Sedan");

        // Register observers
        shop.registerObserver(driver1);
        shop.registerObserver(driver4);
        shop.registerObserver(driver5);

        // Create and notify delivery request
        shop.createDeliveryRequest("Frank", "100 Station Landing");

        // Remove observers
        shop.removeObserver(driver2);
        shop.removeObserver(driver3);
        shop.removeObserver(driver5);

        // Create and notify another delivery request
        shop.createDeliveryRequest("Grace", "500 Ocean Ave.");

        // Expected output
        String expectedOutput = "Andy: Notification received for a new delivery request.\n" +
                "David: Notification received for a new delivery request.\n" +
                "Eddy: Notification received for a new delivery request.\n" +
                "David: Notification received for a new delivery request.\n" +
                "Andy: Notification received for a new delivery request.\n";

        // Verify output
        assertEquals(expectedOutput, outContent.toString());
    }
}
