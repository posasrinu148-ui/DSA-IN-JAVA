import java.util.*;
public class digitfrequency {
    public static int df(int n,int d){
        int count=0;
        while(n>0){
            int temp=n%10;
            if(temp==d){
                count++;
            }
            n=n/10;
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner Scn = new Scanner(System.in);
        int n=Scn.nextInt();
        System.out.println("enter a number: ");
        int d=Scn.nextInt();
        int k=df(n,d);
        System.out.println("digit frequency is: "+k);
    }   
}
