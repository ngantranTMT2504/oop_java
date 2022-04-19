package phuongTienDiChuyen;

public class Car extends Transport{
	private String fuel;
	public Car(String type, Manufacturer manufacturer, String fuel) {
		super(type, manufacturer);
		this.fuel = fuel;

	}
	public String getFuel() {
		return fuel;
	}

	public void setFuel(String fuel) {
		this.fuel = fuel;
	}

	public double speed() {
		return 220;
	}
}
