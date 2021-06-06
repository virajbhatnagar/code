package ds;

public class Main {

    public static void main(String[] args) {
        MobileFactory mobileFactory = new MobileFactory();
        MobileDevice device = mobileFactory.getMobileDevice("MI");
        device.printName();
    }
}
