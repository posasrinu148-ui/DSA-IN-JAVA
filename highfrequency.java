import java.util.*;
public class highfrequency {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,5,5,5,4,3,2};
        HashMap<Integer,Integer> map =new HashMap<>();
        int high =0;
        int low = Integer.MAX_VALUE;
        for(int x:arr){
            map.put(x,map.getOrDefault(x, 0)+1);
            if(map.get(x)>high){
                high=map.get(x);
            }
            if(map.get(x)<low){
                low=map.get(x);
            }
        }
        System.out.println(high);
        System.out.println(low);
    }
}
