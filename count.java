import java.util.*;
public class count {
    public static void main(String[] args) {
    Scanner x=new Scanner(System.in);
    System.out.println("Enter a number: ");
    int n =x.nextInt();
    int h=0;
    int count =0;
    for(int i=0;i<n;i++){
        h=n%10;
        if(h==0){
            break;
        }
        else{
            count++;
        }
        n=n/10;
    }
    System.out.printf("no.of digits = %d",count);
    }
}