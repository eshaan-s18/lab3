import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.*;

import java.util.ArrayList;
import java.util.List;

public class ListTests {
    @Test
    public void testFilter() {
        List<String> inputList = Arrays.asList("Apple", "Banana", "Apricot");
        List<String> result = ListExamples.filter(inputList, s -> s.startsWith("A"));

        List<String> expected = Arrays.asList("Apple", "Apricot");
        assertEquals(expected, result);
    }

    @Test
    public void testMerge() {
        // Create two sorted lists of strings for testing
        List<String> list1 = Arrays.asList("apple", "banana", "orange");
        List<String> list2 = Arrays.asList("avocado", "grape", "kiwi");

        // Call the merge method
        List<String> result = ListExamples.merge(list1, list2);

        // Assert the expected result
        List<String> expected = Arrays.asList("apple", "avocado", "banana", "grape", "kiwi", "orange");
        assertEquals(expected, result);
    }
}
