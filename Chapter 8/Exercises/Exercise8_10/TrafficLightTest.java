package Exercise8_10;

public class TrafficLightTest {
    public static void main(String[] args){
        for(TrafficLight trafficLight : TrafficLight.values()){
            System.out.printf("\nTraffic light name: %s, duration: %d\n", trafficLight, trafficLight.getDurationSeconds());
        }
    }
}
