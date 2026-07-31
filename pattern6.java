public class pattern6 {
    public static void main(String[] args) {
        int n=5;
        int space =1;
        int star=(n+1)/2;
        for(int i=0;i<n;i++){
            for(int j=0;j<star;j++){
                System.out.print("*");
            }
            for(int k=0;k<space;k++){
                System.out.print(" ");
            }
            for(int l=0;l<star;l++){
                System.out.print("*");
            }
            if(i<(n/2)){
                star--;
                space+=2;
            }
            else{
                star++;
                space-=2;
            }
            System.out.println();
        }
    }
}
