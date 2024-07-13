import java.util.*;
public class SecondSmallestLargest {
    public static void  getelement(int arr[],int n){
        Arrays.sort(arr);
        int smallest = arr[0];
        int secsmall = arr[1];
        int seclarge = arr[n-2];
        int largest = arr[n-1];
        System.out.println("The second smallest is : " + secsmall );
        System.out.println("The second largest is : " + seclarge );

    }
    public static void main(String[] args) {
        int numarr []= {1,3,5,6,2,8};
        getelement(numarr,6);
        
    }
}
