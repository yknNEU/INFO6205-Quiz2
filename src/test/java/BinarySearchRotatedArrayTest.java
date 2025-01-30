import org.junit.Test;
import static org.junit.Assert.*;

public class BinarySearchRotatedArrayTest {
    private BinarySearchRotatedArray searcher = new BinarySearchRotatedArray();

    @Test
    public void testRotatedArrayTargetExists() {
        int[] arr = {4, 5, 6, 7, 0, 1, 2};
        assertEquals(4, searcher.search(arr, 0, 4));
    }

    @Test
    public void testRotatedArrayTargetAtBeginning() {
        int[] arr = {4, 5, 6, 7, 0, 1, 2};
        assertEquals(0, searcher.search(arr, 4, 4));
    }

    @Test
    public void testRotatedArrayTargetAtEnd() {
        int[] arr = {4, 5, 6, 7, 0, 1, 2};
        assertEquals(6, searcher.search(arr, 2, 4));
    }

    @Test
    public void testNonRotatedArrayTargetExists() {
        int[] arr = {0, 1, 2, 4, 5, 6, 7};
        assertEquals(3, searcher.search(arr, 4, 0));
    }

    @Test
    public void testNonRotatedArrayTargetAtBeginning() {
        int[] arr = {0, 1, 2, 4, 5, 6, 7};
        assertEquals(0, searcher.search(arr, 0, 0));
    }

    @Test
    public void testNonRotatedArrayTargetAtEnd() {
        int[] arr = {0, 1, 2, 4, 5, 6, 7};
        assertEquals(6, searcher.search(arr, 7, 0));
    }

    @Test
    public void testTargetNotInArray() {
        int[] arr = {4, 5, 6, 7, 0, 1, 2};
        assertEquals(-1, searcher.search(arr, 3, 4));
    }

    @Test
    public void testSingleElementArrayTargetExists() {
        int[] arr = {5};
        assertEquals(0, searcher.search(arr, 5, 0));
    }

    @Test
    public void testSingleElementArrayTargetNotExists() {
        int[] arr = {5};
        assertEquals(-1, searcher.search(arr, 3, 0));
    }

    @Test
    public void testEmptyArray() {
        int[] arr = {};
        assertEquals(-1, searcher.search(arr, 5, 0));
    }
}

