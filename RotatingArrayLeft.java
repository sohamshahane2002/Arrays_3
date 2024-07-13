 //shifting left by 2 places
public class RotatingArrayLeft {
    public static void reverse(int arr[],int left,int right){
        //reversing function
        while(left<=right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
    }
    }
    public static void leftrotate(int arr[],int  k,int n){
        reverse(arr, 0, k-1);
        reverse(arr, k, n-1);
        reverse(arr, 0,n-1);
    }
    public static void main(String[]args){
        int arr[]= {1,2,3,4,5,6,7};
        int n = 7;
        int k = 2;

        System.out.println("Before rotating the array : ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }System.out.println();
        
        leftrotate(arr, k, n);
    
        System.out.println("After rotating the array : ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }System.out.println();
        
    }
}
