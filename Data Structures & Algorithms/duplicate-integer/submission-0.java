class Solution {
  Set<Integer> duplicate = new HashSet<>();

  public boolean hasDuplicate(int[] nums) {
    for (int num : nums) {
      if (duplicate.contains(num)) {
        return true;
      }
      duplicate.add(num);
    }
    return false;
  }
}