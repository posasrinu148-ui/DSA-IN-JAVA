public class array{
    public static void main(String args[]){
        int[] arr;
        arr =new int[5];
        int n=5;
        arr[0]=1;
        arr[2]=3;
        arr[1]=5;
        arr[3]=6;
        arr[4]=6;
        int[] p=arr;
        p[3]=200;
        System.out.println(arr[3]);
    }
}