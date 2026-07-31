import java.util.*;
public class all {
    public static void main(String[] args) {
        Scanner x= new Scanner(System.in);
        int low = x.nextInt();
        int high = x.nextInt();
        System.out.println("prime numbers between "+low+" and "+high+" are:");
        for(int i=low;i<=high;i++){
            int count=0;
            for(int j=2;j*j<i;j++){
                if(j%2==0){
                    count+=1;
                }
            }
            if(count ==0){
                System.out.println(i);
            }
        }
    }
}