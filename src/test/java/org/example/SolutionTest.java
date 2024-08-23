package org.example;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void groupAnagramsTest() {
        Solution solution = new Solution();
        List<List<String>> output = new ArrayList<>();
        output.add(new ArrayList<>(Arrays.asList("bat")));
        output.add(new ArrayList<>(Arrays.asList("tan","nat")));
        output.add(new ArrayList<>(Arrays.asList("eat","tea","ate")));
        assertEquals(output, solution.groupAnagrams(new String[]{"eat","tea","tan","ate","nat","bat"}));
        output = new ArrayList<>();
        output.add(new ArrayList<>(Arrays.asList("")));
        assertEquals(output, solution.groupAnagrams(new String[]{""}));
        output = new ArrayList<>();
        output.add(new ArrayList<>(Arrays.asList("a")));
        assertEquals(output, solution.groupAnagrams(new String[]{"a"}));
    }

}