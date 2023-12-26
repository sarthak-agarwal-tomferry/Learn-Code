class LaptopCreator extends DeviceCreator {
    @Override
    public Device createDevice() {
        return new Laptop();
    }
}