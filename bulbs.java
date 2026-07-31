import java.util.*;
public class bulbs {
    public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
        System.out.println("Enter no of bulbs: ");
        int n=x.nextInt();
        System.out.println("Enter no of fluctuations: ");
        int b=x.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=b;j++){
                if(j%2==0){
                    System.out.println("OFF");
                }
                else{
                    System.out.println("ON");
                }
            }
        }
    }
}
