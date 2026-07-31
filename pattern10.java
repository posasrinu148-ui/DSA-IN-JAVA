public class pattern10 {
    public static void main(String[] args) {
        int n = 5;
        int star = 1;
        int space = n - 1;
        
        for(int i = 0; i < 2*n-1; i++){
            for(int j = 0; j < space; j++){
                System.out.print(" ");
            }
            for(int k = 0; k < star; k++){
                System.out.print("* ");
            }
            if(i < n-1){
                space--;
                star++;
            }
            else{
                space++;
                star--;
            }
            System.out.println();
        }    
    }
}
