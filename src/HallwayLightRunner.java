public class HallwayLightRunner {
    public static void main(String[] args) {
        HallwayLight first;
        first = new HallwayLight(1,1);
        first.toggleFirstSwitch();
        System.out.println(first.lampState);


    }
}
