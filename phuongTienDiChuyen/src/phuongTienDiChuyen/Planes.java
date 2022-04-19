package phuongTienDiChuyen;

public class Planes extends Transport{
	private String fuel;

	public Planes(String type, Manufacturer manufacturer, String fuel) {
		super(type, manufacturer);
		this.fuel = fuel;
	}

	public String getFuel() {
		return fuel;
	}

	public void setFuel(String fuel) {
		this.fuel = fuel;
	}
	public void CatCanh() {
		System.out.println("Cat canh...");
	}
	public void HaCanh() {
		System.out.println("Ha Canh...");
	}
	@Override
	public double speed() {
		return 6000;
	}
}
