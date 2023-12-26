public class ClientWithSwitch {
    public static void main(String[] args) {
        DeviceCreator smartphoneCreator  = new SmartphoneCreator();
        DeviceCreator laptopCreator  = new LaptopCreator();

        Device smartphone = smartphoneCreator.createDevice();
        Device laptop = laptopCreator.createDevice();

        smartphone.displayDetails();
        laptop.displayDetails();
    }
}

