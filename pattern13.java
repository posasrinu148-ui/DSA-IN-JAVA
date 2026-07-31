public class pattern13 {
    public static void main(String[] args) {
        int n = 6;
        for(int i=0;i<n;i++){
            int val=1;
            for(int j=0;j<=i;j++){
                System.out.print(val+"\t");
                int val1=val*(i-j)/(j+1);
                val=val1;
            }
            System.out.println();
        }
    }
}
