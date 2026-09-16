public class bubble {
    public static void main(String[] args) {
        int[] arr={1,2,7,9,15,3,4};
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-1-i;j++){
                if(arr[j]>arr[j+1]){
                    swap(arr, j, j+1);
                }
            }
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
    }
        public static void swap(int[] arr,int first,int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
