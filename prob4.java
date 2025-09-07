public class prob4 {
    static int missingArray(int arr[]){
        int n = arr[arr.length-1];
        int sum=0;
        int expectedSum = (n*(n+1))/2;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        int missindNum = expectedSum-sum;
        return missindNum;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9,10,11,13};
        int result = missingArray(arr);
        System.out.println("The missing number is: " + result);
       
    }
}
