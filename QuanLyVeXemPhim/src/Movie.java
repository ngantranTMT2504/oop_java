
public class Movie {
	String name;
	int publishYear;
	Studio filmStudio;
	double price;
	Date showDate;
	public Movie() {
		
	}
	public Movie(String name, int publishYear, Studio filmStudio, double price, Date showDate) {
		this.name = name;
		this.publishYear = publishYear;
		this.filmStudio = filmStudio;
		this.price = price;
		this.showDate = showDate;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPublishYear() {
		return publishYear;
	}
	public void setPublishYear(int publishYear) {
		this.publishYear = publishYear;
	}
	public Studio getFilmStudio() {
		return filmStudio;
	}
	public void setFilmStudio(Studio filmStudio) {
		this.filmStudio = filmStudio;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Date getShowDate() {
		return showDate;
	}
	public void setShowDate(Date showDate) {
		this.showDate = showDate;
	}
	
	public boolean cheaper(Movie orther) {
		return orther.price < this.price;
	}
	public String getNameStudio() {
		return this.filmStudio.getName();
	}
	public double lastPrice(double x) {
		return this.price* (1 - x/100);
	}
}
