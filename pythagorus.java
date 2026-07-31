import java.util.*;
public class pythagorus {
    public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
        System.out.println("Enter 3 numbers: ");
        int a=x.nextInt();
        int b=x.nextInt();
        int c=x.nextInt();
        int greater=0;
        if(a>b&&a>c){
            greater=a;
            if(greater*greater==b*b+c*c){
                System.out.println("Ture");
            }
            else{
                System.out.println("false");
            }
        }
        else if(b>c){
            greater=b;
            if(greater*greater==a*a+c*c){
            System.out.println("Ture");
            }
            else{
                 System.out.println("false");
            }

        }
        else{
            greater=c;
                        if(greater*greater==b*b+a*a){
                System.out.println("Ture");
            }
            else{
                System.out.println("false");
            }
        }
    }
}