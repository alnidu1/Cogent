package hotel;

import java.util.Date;

public class Reservation {

	private int id;
	private String date;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	@Override
	public String toString() {
		return "Reservation [id=" + id + ", date=" + date + "]";
	}
	
	
}
