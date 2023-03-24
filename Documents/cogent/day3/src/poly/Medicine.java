package poly;

class Medicine {
	String name;
	String address;
	
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	void displayLabel() {
		System.out.println("Name: "+ name + " Address: "+ address);
	}

}

class Tablet extends Medicine{
	@Override
	void displayLabel() {
		System.out.println("Tablet:store in cool place");
	}
}

class Syrup extends Medicine{
	@Override
	void displayLabel() {
		System.out.println("Syrup:Taste like honey");
	}
}

class Ointment extends Medicine{
	@Override
	void displayLabel() {
		System.out.println("Ointment:for external use");
	}
}



