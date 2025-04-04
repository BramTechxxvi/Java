package assignments.test;
import assignments.MovieRatingSystem;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
class MovieRatingSystemTest {
    MovieRatingSystem myRatingSystem = new MovieRatingSystem();

    @Test
    public void testHeaderFunction() {
        String actual = "======== MOVIE RATING SYSTEM ========";
        String expected = myRatingSystem.getHeader();
        assertEquals(expected, actual);
    }/*
    @Test
    public void testFeaturesFunction() {
        String actual =
    }
    */
    @Test
    public void testFeaturesFunction() {
        String actual = "\n1. Add a movie \n2. Rate a movie \n3. View ratings \n4. View average ratings \n5. Exit";
        String expected = myRatingSystem.getFeatures();
        assertEquals(expected, actual);
    }/*
    @Test
    public void testDateFunction() {
        String actual =
        String expected =
        assertEquals(actual, expected);
    }*/
}