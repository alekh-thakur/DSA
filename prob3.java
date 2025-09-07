public class prob3 {
    static int[] rotateArray(int arr[],int k){
        int j;
        int arr1[] = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            
            j=(i+k) % arr.length;
            arr1[j] = arr[i];
        }

        return arr1;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int result[] = rotateArray(arr, 6);
       for (int i : result) {
            System.out.print(i+" ");
        }
    }
}
