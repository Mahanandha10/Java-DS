public class SecondLargerstElement {
    
        public int maxDifference(int[] arr) {
            if (arr == null || arr.length < 2) {
                return 0; // No valid difference if array has less than 2 elements
            }
    
            int minValue = arr[0];  // Track the minimum value seen so far
            int maxDiff = Integer.MIN_VALUE; // Track the maximum difference
    
            for (int i = 1; i < arr.length; i++) {
                maxDiff = Math.max(maxDiff, arr[i] - minValue);
                minValue = Math.min(minValue, arr[i]); // Update minimum value
            }
    
            return maxDiff > 0 ? maxDiff : 0; // If no valid difference, return 0
        }
    }
    
