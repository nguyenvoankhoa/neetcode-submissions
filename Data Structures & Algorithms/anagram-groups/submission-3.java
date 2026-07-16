class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        List<String> firstElement = new ArrayList<>();
        result.add(firstElement);
        for (String str : strs) {
            boolean isAnagram = false;
            for (List<String> list : result){
                if(list.isEmpty() || isAnagram(list.get(0), str)){
                    list.add(str);
                    isAnagram = true;
                }
            }

            if(!isAnagram){
                List<String> newElement = new ArrayList<>();
                newElement.add(str);
                result.add(newElement);
            }
        }
        return result;
    }

    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }

        int[] anaArray = new int[26];
        for (int i = 0; i < s.length(); i++) {
            int c = s.charAt(i) - 'a';
            anaArray[c]++;
        }

        for (int i = 0; i < t.length(); i++) {
            int c = t.charAt(i) - 'a';
            anaArray[c]--;
            if (anaArray[c] < 0) {
                return false;
            }
        }
        return true;
    }
}
