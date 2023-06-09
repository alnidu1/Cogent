package poly;

class Car {
	int noOfGear;
	int initial_speed;
	
	void drive(int speed, int gear) {
		this.initial_speed=speed;
		this.noOfGear=gear;
	}
	
	void display() {
		System.out.println("Car starting speed is " + initial_speed + " and gear is " + noOfGear+".");
	};
}

class SportCar extends Car{
	
	String AirBalloonType;
	
	public String getAirBallonType() {
		return AirBalloonType;
	}

	public void setAirBallonType(String airBalloonType) {
		AirBalloonType = airBalloonType;
	}

	@Override
	void display() {
		System.out.println("SportCar starting speed: " + initial_speed + "\n Gear: " + noOfGear+" AirballonType " +AirBalloonType);
	}
}


