public class name {
    public static void main(String[] args) {
        int a=6;
        String name="srinu";
        printname(a,name);
    }
    static void printname(int a, String name){
        if(a==0){
            return;
        }
        else{
            System.out.println(name);
            printname(a-1,name);
        }
    }
}
