public class pattern8 {
        public static void main(String[] args) {
        int n=5;
        int space=n-1;
        int star=1;
        int space2=0;
        for(int i=0;i<n;i++){
            for(int l=1;l<=space;l++){
                System.out.print(" ");
            }
            for(int j=0;j<star;j++){
                System.out.print("  *  ");
            }
            for(int k=0;k<space2;k++){
                System.out.print(" ");
            }
            System.out.println();
            space2++;
            space--;
        }    
    }
}
