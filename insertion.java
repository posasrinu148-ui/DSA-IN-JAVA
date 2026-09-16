import java.util.Arrays;

public class insertion {
    public static void main(String[] args) {
        int [] arr={1,4,5,8,9,7};
        int n=arr.length;
        for(int i=1;i<n;i++){
            for(int j=i;j>0;j--){
                if(arr[j]<arr[j-1]){
                    swap(arr,j,j-1);
                } else {
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void swap(int[] arr,int first,int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
