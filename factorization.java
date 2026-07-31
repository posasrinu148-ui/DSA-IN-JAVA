import java.util.*;
public class factorization {
    public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n=x.nextInt();
        for(int i=2;i*i<=n;){
            if(n%i==0){
                System.out.println(i);
                n=n/i;
            }
            else{
                i++;
            }
        }
        if(n>1){
            System.out.println(n);
        }
    }
}