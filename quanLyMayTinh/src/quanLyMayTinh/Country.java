package quanLyMayTinh;

public class Country {
	private int countryCode;
	private String name;
	
	public Country(int countryCode, String name) {
		this.countryCode = countryCode;
		this.name = name;
	}

	public int getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(int countryCode) {
		this.countryCode = countryCode;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
