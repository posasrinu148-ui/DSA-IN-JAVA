import java.util.*;
public class linearsearch{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int flag=0;
        System.out.println("Enter size of array :");
        int n=s.nextInt();
        int k=5;
        int[] a=new int[n];
        System.out.println("Enter the elements: ");
        for(int i=0;i<n;i++){
            a[i]=s.nextInt();
        }
        for(int i=0;i<n;i++){
            if(a[i]==k){
                System.out.printf("Found at %d",i+1);
                flag=1;
                break;
            }
        }
        if(flag==0){
            System.out.println("Element not found");
        }
    }
}