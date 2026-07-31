import java.util.*;
public class rotate {
    public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n=x.nextInt();
        System.out.println("Enter a rotation value: ");
        int r=x.nextInt();
        int div=(int)Math.pow(10,r);
        int mult=(int)Math.pow(10,r+1);
        int result=0;
        result=n%div;
        n=n/div;
        System.out.println(result);
        System.out.println(n);
        n+=result*mult;
        System.out.println(n);
    }
}
