import java.io.IOException;
import java.net.URI;
import static org.junit.Assert.*;
import org.junit.*;
import java.net.URISyntaxException;

public class DocSearchTest {
    @Test
    public void testHandler() throws URISyntaxException, IOException {
        Handler h = new Handler();
        URI input = new URI("httb://localhost/");
        assertEquals(h.handleRequest(input), "Don't know how to handle that path!");


    }
}
