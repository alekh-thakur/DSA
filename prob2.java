

public class prob2 {
    public static void main(String[] args) {
        int arr[] = {2,4,5,6,7,8};
        int result[] = reverseArray(arr);
        
        for (int i : result) {
            System.out.print(i+" ");
        }
    }

    static int[] reverseArray(int arr[]){
        int arr1[] = new int[arr.length];
        int j=0;
        for(int i=arr.length-1;i>=0;i--){
            arr1[j] = arr[i];
            j++;
        }
        return arr1;
    }

}
