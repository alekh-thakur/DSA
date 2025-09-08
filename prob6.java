import java.util.ArrayList;

public class prob6 {
    static int[] unionArrays(int arr[],int arr2[]){
        ArrayList<Integer>list = new ArrayList<>();
        for(int i = 0;i<arr.length;i++){
            if(!list.contains(arr[i])){
                    list.add(arr[i]);
            }
        }
        for(int j=0;j<arr2.length;j++){
            if (!list.contains(arr2[j])) {
                list.add(arr2[j]);
            }        
        }

        int result[] = new int[list.size()];
        for(int i=0;i<list.size();i++){
            result[i] = list.get(i);
        }
        return result;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};
        int arr2[] = {4,5,6,7,8,9};
        int newArr[] = unionArrays(arr, arr2);

        for (int i : newArr) {
            System.out.print(i+ " ");
        }
    }
}
