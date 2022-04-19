
public class Author {
	private String name;
	private Year dob;
	
	public Author() {
		super();
	}

	public Author(String name, Year dob) {
		this.name = name;
		this.dob = dob;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Year getDob() {
		return dob;
	}

	public void setDob(Year dob) {
		this.dob = dob;
	}

}
