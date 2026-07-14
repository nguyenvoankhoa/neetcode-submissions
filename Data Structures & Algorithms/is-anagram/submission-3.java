class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        int[] alphabetNums = new int[26];
        for (int i = 0; i < s.length(); i++) {
        int c = s.charAt(i) - 'a';
        alphabetNums[c] = alphabetNums[c] + 1;
        }
        for (int j = 0; j < t.length(); j++) {
        int c = t.charAt(j) - 'a';
        alphabetNums[c] = alphabetNums[c] - 1;
        if (alphabetNums[c] < 0) {
            return false;
        }
        }
        return true;
    }
}
