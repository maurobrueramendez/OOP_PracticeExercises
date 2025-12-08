import java.util.ArrayList;
public class HomeSystem {
    private final ArrayList<Device> devices;
    public HomeSystem() {
        devices = new ArrayList<>();
    }

    public void addDevice(Device d) {
        devices.add(d);
    }

    public void printPowerUsage() {
        Device temp;
        for(int i = 0; i < devices.size(); i++) {
            temp = devices.get(i);
            System.out.println("Device " + (i+1) + " (" + temp.name + ") " + "Power Usage: " + temp.getPowerUsage() + " Watts");
        }
    }
}
