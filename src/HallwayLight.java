public class HallwayLight {

    public int firstSwitchState, secondSwitchState, lampState;

    public HallwayLight() {
        firstSwitchState = 0;
        secondSwitchState = 0;
        lampState = 0;
    }

    public HallwayLight(int secondSwitchSate, int firstSwitchState) {

        this.secondSwitchState = secondSwitchSate;
        this.firstSwitchState = firstSwitchState;
        updateLightState();
    }

    private void updateLightState(){
        lampState = firstSwitchState ^ secondSwitchState;
    }


    public void toggleFirstSwitch() {
        firstSwitchState = 1 ^ firstSwitchState;
        updateLightState();
    }

    public void toggleSecondSwitch() {
        secondSwitchState = 1 ^ secondSwitchState;
        updateLightState();
    }

    public int getLampState() {
        return lampState;
    }
}
