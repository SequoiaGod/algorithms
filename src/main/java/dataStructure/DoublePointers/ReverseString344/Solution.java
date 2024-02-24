package dataStructure.DoublePointers.ReverseString344;

class Solution {
    public void reverseString(char[] s) {
        int slowPointer = 0;
        int fastPointer = s.length - 1;

        while(slowPointer < fastPointer) {
            char temp = s[slowPointer];
            s[slowPointer++] = s[fastPointer];
            s[fastPointer--] = temp;
        }

    }
}
