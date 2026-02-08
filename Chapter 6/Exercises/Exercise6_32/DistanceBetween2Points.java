package Exercise6_32;

public class DistanceBetween2Points {
    public static double getDistance(double x1, double x2, double y2, double y1){
        return Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2));
    }
}
