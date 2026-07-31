import java.util.*;
public class inverse {
    public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n=x.nextInt();
        int op=1;
        int k=n;
        int result =0;
        for(int i=1;i<=k;i++){
            int ov=n%10;
            int ip=ov;
            int iv=op;  // Get last digit
            int pow=(int)Math.pow(10,ip-1);  // Reverse position
            result+=iv*pow;
            n=n/10;
            op++;  // Remove last digit
        }
        System.out.println("Reversed: " + result);
    }
}
