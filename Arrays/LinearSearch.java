/*  Topic: LinearSearch
    Time Complexity: O(n) 
*/

public class LinearSearch {
    
    public static int linearSearch(int numbers[], int target) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == target) {
                return i; // return the index at which key is found
            }
        }
        return -1; // Key not found
    }

    public static void main(String[] args) {
        int numbers[] = { 2, 4, 6, 8, 10, 12, 14 };
        int target = 12;

        int index = linearSearch(numbers, target);
        if (index == -1) {
            System.out.println("Key not found");
        } else {
            System.out.println("Key is at index: " + index);
        }
    }
}