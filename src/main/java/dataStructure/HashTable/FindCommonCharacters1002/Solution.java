package dataStructure.HashTable.FindCommonCharacters1002;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> commonChars(String[] words) {
        ArrayList<String> result = new ArrayList<String>();
        int[] hash= new int[26];

        for(int i = 0; i < words[0].length(); i++) {
            hash[words[0].charAt(i) - 'a']++;
        }

        for(int i = 1; i < words.length; i++) {
            int[] restHash= new int[26];
            for(int j=0; j < words[i].length(); j++) {
                restHash[words[i].charAt(j) - 'a']++;
            }
            for(int k = 0; k < hash.length; k ++) {
                hash[k] = Math.min(hash[k], restHash[k]);
            }
        }

        for(int i = 0; i < hash.length; i ++) {
            while(hash[i] != 0 ) {
                char c = (char) (i+'a');
                result.add(String.valueOf(c));
                hash[i]--;
            }
        }

        return result;
    }
}
