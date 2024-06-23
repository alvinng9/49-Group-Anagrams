package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList();
        HashMap<String, ArrayList<String>> map = new HashMap<>();
        for (String here : strs) {
            int[] alpha = new int[26];
            for (int i = 0; i < here.length(); i++) {
                alpha[here.charAt(i) - 97]++;
            }
            StringBuilder tempBuilder = new StringBuilder();
            for (int i = 0; i < 26; i++) {
                tempBuilder.append(alpha[i] + " ");
            }
            String tempString = tempBuilder.toString();
            if (!map.containsKey(tempString)) {
                map.put(tempString, new ArrayList<String>());
            }
            ArrayList<String> temp = map.get(tempString);
            temp.add(here);
            map.put(tempString, temp);
        }
        for (Map.Entry<String, ArrayList<String>> entry : map.entrySet()) {
            result.add(entry.getValue());
        }
        return result;
    }
}
