import static org.junit.Assert.*; //imports library

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

import org.junit.*; //imports library

public class MarkdownParseTest {
    @Test //tells java this is a test
    public void addition() {
        assertEquals(2, 1 + 1); //asserts that the two paramerters should be equal (error otherwise)
    }

    @Test
    public void getLinksTest() throws IOException {
        assertEquals(List.of("https://something.com","some-thing.html"), 
        MarkdownParse.getLinks(Files.readString(Path.of("test-file.md"))));
    }

    @Test
    public void getLinksTest1() throws IOException {
        assertEquals(List.of("https://something.com","some-thing.html"), 
        MarkdownParse.getLinks(Files.readString(Path.of("new-test.md"))));
    }

    @Test
    public void getLinksTest2() throws IOException {
        assertEquals(List.of("https://something.com","some-thing.html"), 
        MarkdownParse.getLinks(Files.readString(Path.of("test2.md"))));
    }

    @Test
    public void getLinksTest3() throws IOException {
        assertEquals(List.of("link1"), 
        MarkdownParse.getLinks(Files.readString(Path.of("test3.md"))));
    }
}