public class TestHome {
    public static void main(String[] args) {
        LightBulb light1 = new LightBulb(20);
        LightBulb light2 = new LightBulb(45);
        LightBulb light3 = new LightBulb(65);
        LightBulb light4 = new LightBulb(10);
        LightBulb light5 = new LightBulb(15);

        Heater heat1 = new Heater(22, 45);
        Heater heat2 = new Heater(25, 60);
        Heater heat3 = new Heater(23, 80);
        Heater heat4 = new Heater(20, 35);
        Heater heat5 = new Heater(28, 90);

        HomeSystem home = new HomeSystem();

        home.addDevice(light1);
        home.addDevice(light2);
        home.addDevice(light3);
        home.addDevice(light4);
        home.addDevice(light5);
        home.addDevice(heat1);
        home.addDevice(heat2);
        home.addDevice(heat3);
        home.addDevice(heat4);
        home.addDevice(heat5);

        home.printPowerUsage();
    }
}