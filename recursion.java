public class recursion{
    public void main(String[] args) {
        int n=5;
        print(5);
    }
    static void print(int n){
        if(n==0){
            return;
        }
        else{
            System.out.println(n);
            print(n-1);
        }
    }
}