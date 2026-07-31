public class patternreverse {
        public static void main(String[] args) {
        int n=9;
        int space=8;
        int star=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=star;j++){
                System.out.print("*");
            }
            for(int k=1;k<=space;k++){
                System.out.print(" ");
            }
            for(int l=1;l<=star;l++){
                System.out.print("*");
            }            
            System.out.println();
            if(i<=n/2){
                star++;
                space-=2;
            }
            else{
                star--;
                space+=2;
            }
        }
    }
}
