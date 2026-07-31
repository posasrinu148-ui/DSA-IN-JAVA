import java.util.*;
public class spanofarray {
    public static void main(String[] args) {
        System.out.println("Enter size of array: ");
        Scanner x=new Scanner(System.in);
        int n=x.nextInt();
        int[] a=new int[n];
        int b=0,s=0;
        System.out.println("Enter the elements: ");
        for(int i=0;i<n;i++){
            a[i]=x.nextInt();
        }    
        int small=a[0],big=a[0];
        for(int i=0;i<n;i++){
            if(a[i]<small){
                s=a[i];
            }
            else{
                s=a[0];
            }
            if(a[i]>big){
                b=a[i];
            }
            else{
                b=a[0];
            }
        }
        System.out.println(s);
        System.out.printf("spam of this array is= %d",b-s);
    }
}
