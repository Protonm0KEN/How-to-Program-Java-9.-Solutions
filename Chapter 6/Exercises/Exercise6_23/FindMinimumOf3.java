package Exercise6_23;

public class FindMinimumOf3 {
    public static double minimum3(double x, double y, double z){
//        if(y < smallest){
//            smallest = y;
//        }
//        if(z < smallest){
//            smallest = z;
//        }
//        return smallest;

        return Math.min(x, Math.min(y,z));
    }
}
