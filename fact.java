import java.util.*;
public class fact{
    public static void main(String[] args){
        int fact=1;
        System.out.println("Enter a number: ");
        Scanner x=new Scanner(System.in);
        int n=x.nextInt();
        if (n==1) {
            System.out.println(1);
        }
        for(int i=2;i<=n;i++){
            fact = fact*i;
        }
        System.out.println(fact);
    }
}