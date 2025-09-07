import java.util.ArrayList;

public class prob5 {
    static int[] intersectionArrays(int arr[],int arr1[]){
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr1.length;j++){
                if(arr[i]==arr1[j]){
                    if(!list.contains(arr[i])){
                        list.add(arr[i]);
                    }
                }
            }
        }

        int result [] = new int[list.size()];
        for(int i=0;i<list.size();i++){
            result[i] = list.get(i);
        }
        return result;
    }

    public static void main(String[] args) {
        int arr[]=  {1,2,3,4,5};
        int arr1[] = {4,5,2,7,8};

        int res[] = intersectionArrays(arr, arr1);
        for (int i : res) {
            System.out.print(i+" ");
        }

    }
}
