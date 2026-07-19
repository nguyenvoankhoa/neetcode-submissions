class Solution {
    public static int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        int[] prefix = new int[nums.length];
        int prefixProduct = 1;
        for (int i = 0; i < nums.length; i++) {
            if (i == 0) {
                prefix[i] = 1;
            } else {
				prefixProduct *= nums[i - 1];
				prefix[i] = prefixProduct;
            }
        }

        int[] suffix = new int[nums.length];
        int suffixProduct = 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            if (i == (nums.length - 1)) {
                suffix[i] = 1;
            } else {
				suffixProduct = suffixProduct * nums[i + 1];
				suffix[i] = suffixProduct;
            }
        }

        for (int i = 0; i < nums.length; i++) {
            result[i] = prefix[i] * suffix[i];
        }
        return result;
    }
}  
