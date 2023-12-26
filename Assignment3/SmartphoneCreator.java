class SmartphoneCreator extends DeviceCreator {
    @Override
    public Device createDevice() {
        return new Smartphone();
    }
}