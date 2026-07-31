import java.util.*;
public class table{
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner x=new Scanner(System.in);
        int n=x.nextInt();
        for(int i=10;i>=1;i--){
            System.out.println(n+"*"+i+"="+n*i);
        }
    }
}