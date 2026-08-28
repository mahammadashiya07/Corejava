interface BasicDevice {

    void powerOn();
}

interface AdvancedDevice extends BasicDevice {

    void connectInternet();
}

class SmartTV implements AdvancedDevice {

    public void powerOn() {
        System.out.println("Smart TV: Power ON");
    }

    public void connectInternet() {
        System.out.println("Smart TV: Connected to Internet");
    }

    void displayChannel() {
        System.out.println("Channel: News Channel");
    }
}

public class SmartTVDemo {

    public static void main(String[] args) {

        SmartTV tv = new SmartTV();

        tv.powerOn();
        tv.connectInternet();
        tv.displayChannel();
    }
}
