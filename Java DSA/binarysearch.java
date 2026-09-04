public class binarysearch {
    public static int search(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        // Continue searching while the search space is valid
        while (left <= right) {
            // Safe middle calculation to prevent integer overflow
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return mid;       // Target found, return its index
            } 
            else if (arr[mid] < target) {
                left = mid + 1;   // Target must be in the right half
            } 
            else {
                right = mid - 1;  // Target must be in the left half
            }
        }
        
        return -1; // Target not found
    }

public static void main(string[]args){
    int[]arr={456,67,676,32,3,2,323,23,56,678,123,83,3};
    int target=2;
    int result=bs(arr,target);
    System.out.println(result);
}
}