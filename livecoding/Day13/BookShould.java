import org.junit.Test;
import static org.junit.Assert.*;

public class BookShould {

    @Test
    public void returnTheNameOfItsAuthorIfShakespeare() {
        String expected = "Shakespeare";
        Book book = new BookImpl(expected, "Hamlet");
        String actual = book.getAuthorName();
        assertEquals(expected, actual);
    }

    @Test
    public void returnTheNameOfItsAuthorIfDickens() {
        String expected = "Dickens";
        Book book = new BookImpl(expected, "Xmas carol");
        String actual = book.getAuthorName();
        assertEquals(expected, actual);
    }

    @Test
    public void returnTheTitleIfHamlet() {
        String expected = "Hamlet";
        Book book = new BookImpl("Shakespeare", expected);
        String actual = book.getTitle();
        assertEquals(expected, actual);
    }


   @Test
    public void returnTheTitleIfMacbeth() {
        String expected = "Macbeth";
        Book book = new BookImpl("Shakespeare", expected);
        String actual = book.getTitle();
        assertEquals(expected, actual);
    }


}