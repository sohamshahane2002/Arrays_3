public class ReversingArray {

    public static void reverse(int arr[], int left, int right) {
      while (left <= right) {
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
        left++;
        right--;
      }
    }  
      public static void main(String[] args) {
      int[] numbers = {1, 2, 3, 4, 5}; 
  
      System.out.println("Original array: ");
      for (int num : numbers) {
        System.out.print(num + " ");
      }
  
      // Reverse the array using the reverse function
      reverse(numbers, 0, numbers.length - 1); 
  
      System.out.println("\nReversed array: ");
      for (int num : numbers) {
        System.out.print(num + " ");
      }
    }
  }
  