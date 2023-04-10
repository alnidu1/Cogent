package qualifer;

public class Address {

	private int num;
	private String street;
	private String city;
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	@Override
	public String toString() {
		return "Address [num=" + num + ", street=" + street + ", city=" + city + "]";
	}
	
}
