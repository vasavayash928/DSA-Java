import java.util.*;

public class BinarySearch {

    public static int binarySearch(int numbers[], int target) {
        int start = 0;
        int end = numbers.length-1;

        while(start<=end) {
            int mid = (start + end) / 2;

            if(numbers[mid] == target) {
                return mid;
            }
            if(numbers[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String args[]) {
        int numbers[] = {3, 6, 9, 12, 15};
        int target = 12;
        System.out.println("The target element is at index: " + binarySearch(numbers,target));
    }
}