import java.util.*;
public class gcd {
    public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int n1=x.nextInt();
        int n2=x.nextInt();
        int on1=n1;
        int on2=n2;
        while(n1% n2 !=0){
            int rem=n1%n2;
            n1=n2;
            n2=rem;
        }
        System.out.println("GCD is: " + n2);
        int lcm=(on1*on2)/n2;
        System.out.println("LCM is: " + lcm);
    }
}
