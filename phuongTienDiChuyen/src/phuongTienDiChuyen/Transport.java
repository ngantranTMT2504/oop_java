package phuongTienDiChuyen;

public abstract class Transport {
	private String type;
	private Manufacturer manufacturer;
	
	public Transport(String type, Manufacturer manufacturer) {
		this.type = type;
		this.manufacturer = manufacturer;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Manufacturer getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(Manufacturer manufacturer) {
		this.manufacturer = manufacturer;
	}
	public String getNameHSX( ) {
		return this.manufacturer.getCountry();
	}
	public void begin() {
		System.out.println("Bat dau...");
	}
	public void tangToc() {
		System.out.println("Tang toc...");
	}
	public void stop() {
		System.out.println("Dung lai...");
	}
	public abstract double speed();
}
