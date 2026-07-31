import java.util.*;
public class bargraph {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter size of array :");
        int n=s.nextInt();
        int[] a=new int[n];
        System.out.println("Enter the elements: ");
        for(int i=0;i<n;i++){
            a[i]=s.nextInt();
        }
        for(int i=0;i<a[i];i++){
            for(int j=0;j<1;j++){
                System.out.print("*\t");
            }
            System.out.println();
        }
    }
}
