import java.util.*;
public class hi {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("Enter no.of elements: ");
        int t = x.nextInt();
        for(int i=0;i<t;i++){
            int n=x.nextInt();
            int count =0;
            for(int j=2;j*j<=n;j++){
                if(n%j==0){
                    count++;
                    break;
                }
            }
            if(count!=0){
                System.out.println("not prime");
                }
            else{
               System.out.println("prime");
                }
        }
    }
}