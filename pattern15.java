public class pattern15 {
    public static void main(String[] args) {
        int n=5;
        int val=1;
        int star =1;
        int space=n/2;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=space;j++){
                System.out.print(" ");
            }
            int cval=val;
            for(int k=1;k<=star;k++){
                System.out.print(cval);
                if(k<=star/2){
                    cval++;
                }
                else{
                    cval--;
                }
            }
            if(i<=n/2){
                star+=2;
                space--;
                val++;
            }
            else{
                star-=2;
                space++;
                val--;
            }
            System.out.println();
        }
    }
}