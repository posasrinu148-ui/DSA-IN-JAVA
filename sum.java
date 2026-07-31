import java.util.*;
public class sum{
    public static void main(String[] args){
        Scanner x=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n=x.nextInt();
        int sum = 0;
        for (int i=2;i<=n*2;i++){
            if(i%2==0){
                sum +=i;
                System.out.println(i);
            }
        }
        System.out.println("Sum of even numbers: " + sum);
    }
}