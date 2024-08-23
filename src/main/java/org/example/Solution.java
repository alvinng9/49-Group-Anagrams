package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList();
        //create a map of string key and string array list value
        HashMap<String, ArrayList<String>> map = new HashMap<>();
        //iterate through the given string array
        for (String str : strs) {
            //create an alphabet array to count letters of each string
            int[] alpha = new int[26];
            for (int i = 0; i < str.length(); i++) {
                alpha[str.charAt(i) - 'a']++;
            }
            //add value of each index into a string to store in the map
            StringBuilder sb = new StringBuilder();
            for (int here : alpha) {
                sb.append(here);
            }
            ArrayList<String> temp;
            //retrieve the value of the key
            if(map.containsKey(sb.toString())) {
                temp = map.get(sb.toString());
            } else {
                temp = new ArrayList<>();
            }
            //add the current string to the value
            temp.add(str);
            //add the updated value to the key
            map.put(sb.toString(), temp);
        }
        //iterate through the map and add each value to the result
        for (Map.Entry<String, ArrayList<String>> entry : map.entrySet()) {
            result.add(entry.getValue());
        }
        return result;
    }
}
