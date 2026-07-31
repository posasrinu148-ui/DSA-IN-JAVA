public class Pattern {
    public static void main(String[] args) {
        int n = 5;
        int l=69;
        
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print((char)l);
                l++;
            }
            System.out.println();
            l-=i+1;
        }
    }
}