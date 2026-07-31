import java.util.*;
public class num {
    public static void main(String[] args) {
        int h=0;
        System.out.println("Enter a number: ");
        Scanner x=new Scanner(System.in);
        int n=x.nextInt();
        int count =0;
        for(int i=0;i<n;i++){
            h=n%10;
            System.out.println(h);
            n=n/10;
            if(n==0){
                break;
            }
    }
}
}