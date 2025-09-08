public class prob7 {
    static int duplicateElement(int arr[]){
        
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    return arr[i];
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {2,4,5,5,6,7};
        int res = duplicateElement(arr);
        System.out.println("The duplicate element are:" + res);
    }
}
