public class pattern16 {
    public static void main(String[] args) {
        int n=4;
        int star=1;
        int space=2*n-3;
        int val=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=star;j++){
            System.out.print( val +"\t");
            val++;
            }
            for(int k=1;k<=space;k++){
                System.out.print("\t");
            }
            if(i==n){
                star--;
                val--;
            }            
            for(int l=1;l<=star;l++){
                val--;
                System.out.print( val+"\t");
            }
            star++;
            space-=2;
            System.out.println();
        }
    }
}
