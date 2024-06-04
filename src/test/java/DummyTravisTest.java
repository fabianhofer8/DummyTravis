import org.example.DummyApp;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DummyTravisTest {
    @Test
    void testMain() {
        // Simulate running the main method
        String expectedOutput = "Hello from Dummy App!";
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
        DummyApp.main(null);
        String actualOutput = outputStream.toString();

        // Verify the output
        assertEquals(expectedOutput, actualOutput);
    }

}
