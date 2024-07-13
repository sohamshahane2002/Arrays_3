public class RotatingArrayRight {
    public static void reverse(int arr[],int left,int right){
        while(left<=right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
    public static void rotateright(int arr[],int n ,int k){
        reverse(arr, 0, n-k-1);
        reverse(arr, n-k, n-1);
        reverse(arr, 0, n-1);
    }       
    public static void main(String[] args) {
        int numarr[]={1,2,3,4,5,6,7};
        int k =3;
        int n =7;

        System.out.println("Array Before Rotation : ");
        for(int i = 0;i<n;i++){
            System.out.print(numarr[i] + " ");
        }System.out.println();

        rotateright(numarr, n, k);

        System.out.println("Array After Rotation : ");
        for(int i = 0;i<n;i++){
            System.out.print(numarr[i] + " ");
        }System.out.println();
        
    }
}
