public class prob1{
    public static void main(String [] args){
        int arr[] = {45,63,56,7,89,56,330};
        int result[] = min_max(arr);
        System.out.println("Maximum number is:" + result[0]);
        System.out.println("Minimum number is:" + result[1]);

    }

    static int[] min_max(int arr[]){
        int max=arr[0];
        int min = arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]> max){
            max = arr[i];
            }
            if(arr[i]<min){
                min =arr[i];
            }
        }
        return new int[]{max,min};
        
    }
}