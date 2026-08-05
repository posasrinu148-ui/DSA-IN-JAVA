import java.util.*;
public class reversearray {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter a number: ");
         int n=sc.nextInt();
         int o=0;
         int[] a = new int[n];
         for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
         }
         System.out.println("Enter a number: ");
         reverse(a,n,o);
         for(int j=0;j<n;j++){
            System.out.println(a[j]);
         }
    }
    static void reverse(int [] a,int n,int o){
        if(o>=n){
            return;
        }
        else{
            int temp=a[o];
            a[o]=a[n-1];
            a[n-1]=temp;
            reverse(a,n-1,o+1);
        }
    }
}
