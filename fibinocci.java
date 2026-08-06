import java.util.*;
public class fibinocci {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=0;
        int b=1;
        int num=3;
        if(n<=2){
            if(n==1){
                System.out.println(a);
            }
            else{
               System.out.println(a);
               System.out.println(b);
            }
        }
        else{
            System.out.println(a);
            System.out.println(b);
            fab(n,a,b,num);            
        }
    }
    static void fab(int n,int a,int b,int num){
        if(num>n){
            return;
        }
        else{
            System.out.println(a+b);
            fab(n,b,a+b,++num);
        }
    }
}
