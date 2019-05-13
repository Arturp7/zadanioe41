public class Televisor {

    boolean turnedOn;

    void  turnOn(){
        turnedOn = true;
    }

    void turnOff(){
        turnedOn = false;
    }

    void showStatus() {
        System.out.println(turnedOn);
    }
}