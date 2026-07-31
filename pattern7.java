public class pattern7 {
    public static void main(String[] args) {
        int n=5;
        int space=n-1;
        int star=1;
        int space2=0;
        for(int i=0; i<n; i++){
            for(int l=0; l<space2; l++){
                System.out.print(" ");
            }
            for(int j=0; j<star; j++){
                System.out.print("*");
            }
            for(int k=0; k<space; k++){
                System.out.print(" ");
            }
            space--;
            space2++;
            System.out.println();
        }
    }
}
