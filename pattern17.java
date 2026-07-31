public class pattern17 {
    public static void main(String[] args) {
        int n=5;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(j==n-1){
                    if(i==n/2){
                        System.out.print("*\t");
                    }
                    else {
                        System.out.print("\t");
                    }
                }
                else if(i==n/2 || j==n/2){
                    System.out.print("*\t");
                }
                else if(j>n/2&&i==n/2-1||j>n/2&&i==n/2+1){
                    System.out.print("*\t");
                }                
                else {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }
}