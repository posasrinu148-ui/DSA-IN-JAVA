public class trace {
    public static void main(String[] args) {
        int n=7;
        int star=n;
        int space=0;
        int space2=0;
        for(int i=0;i<n;i++){
            System.out.println("i="+i+" | star="+star+" | space="+space+" | space2="+space2);
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
        }
    }
}
