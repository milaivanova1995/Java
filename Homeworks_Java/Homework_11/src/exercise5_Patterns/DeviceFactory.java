package exercise5_Patterns;

public class DeviceFactory {

	private static DeviceFactory instance = new DeviceFactory();
	
	private DeviceFactory() {}
	
	public static DeviceFactory getInstance() {
		return instance;
	}
	
	public static Device getDevice(String device) {
		if (device.contains("phone")) {
			return new Phone();
		} else if (device.contains("tablet")) {
			return new Tablet();
		} else if (device.contains("laptop")) {
			return new Laptop();
		} else {
			return null;
		}
	}
}
