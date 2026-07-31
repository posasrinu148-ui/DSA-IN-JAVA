public class pattern19{
    public static void main(String[] args) {
        int n=7;
        for (int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==n/2||j==n/2){
                 System.out.print("*\t");
                }
                else if(i==0&&j<n/2){
                    System.out.print("*\t");
                }
                    else if(i==n-1&&j>n/2){
                        System.out.print("*\t");
                    }
                    else if(j==n-1&&i<n/2){
                        System.out.print("*\t");
                    }
                    else if(j==0&&i>n/2){
                        System.out.print("*\t");
                    }
                else{
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }
}