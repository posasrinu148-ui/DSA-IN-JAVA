import java.util.*;
public class sumofn {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n=sc.nextInt();
        int sum=sum(n);
        System.out.println(sum);
    }
    static int sum(int n){
        if(n==1){
            return 1;
        }
        else{
            return n+sum(n-1);
        }
    }
}
