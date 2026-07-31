public class pattern18 {
    public static void main(String[] args) {
        int n=7;
        int star=n;
        int space=0;
        int space2=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<space;j++){
                System.out.print("\t");
            }
            for(int j=0;j<star;j++){
                if(j>0&&j!=star-1&&i!=0&&i<n/2){
                    System.out.print("\t");
                }
                else {
                    System.out.print("*\t");
                }
            }
            for(int k=0;k<space2;k++){
                System.out.print("\t");
            }
            if(i<n/2){
                star-=2;
                space+=1;
                space2+=1;
            }
            else {
                star+=2;
                space-=1;
                space2-=1;
            }
            System.out.println();
        }
    }
}