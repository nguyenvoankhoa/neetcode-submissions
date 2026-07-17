class Solution {
  public int[] topKFrequent(int[] nums, int k) {
    Map<Integer, Integer> frequencyMap = new HashMap<>();
    for (int num : nums) {
      frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
    }

    int[] topKFrequentNumbers = new int[k];

    List<Map.Entry<Integer, Integer>> sortedEntries = frequencyMap.entrySet()
        .stream()
        .sorted((a, b) -> b.getValue().compareTo(a.getValue()))
        .collect(Collectors.toList());
    
    for (int i = 0; i < k; i++) {
      topKFrequentNumbers[i] = sortedEntries.get(i).getKey();
    }

    return topKFrequentNumbers;
  }
}
