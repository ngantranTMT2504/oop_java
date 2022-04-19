package quanLyMayTinh;

public class Computer {
	private Manufacturer manufacturer;
	private Date dayOfManu;
	private double price;
	private int warranty;
	public Computer(Manufacturer manufacturer, Date dayOfManu, double price, int warranty) {
		this.manufacturer = manufacturer;
		this.dayOfManu = dayOfManu;
		this.price = price;
		this.warranty = warranty;
	}
	public Manufacturer getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(Manufacturer manufacturer) {
		this.manufacturer = manufacturer;
	}
	public Date getDayOfManu() {
		return dayOfManu;
	}
	public void setDayOfManu(Date dayOfManu) {
		this.dayOfManu = dayOfManu;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getWarranty() {
		return warranty;
	}
	public void setWarranty(int warranty) {
		this.warranty = warranty;
	}
	public boolean kiemTraGia(Computer other) {
		return this.price < other.price;
	}
	public String tenQuocGiaSX() {
		return this.manufacturer.layTenQuocGia();
	}
}
