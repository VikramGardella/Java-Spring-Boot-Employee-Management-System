package vehicle;

public class Car {
	
	//JdbcTemplate jdbcTemplate;
	
	//@inject
	private Motor motor;
	private Integer maxSpeed;
	
	public Car() {
	}
	
	public Car(Motor motor, Integer maxSpeed) {
		this.motor = motor;
		this.maxSpeed = maxSpeed;
	}

	public void drive() {
		System.out.println("Driving the car...");
	}
	
	public void start() {
		motor.start();
	}

	public Motor getMotor() {
		return motor;
	}

	public void setMotor(Motor motor) {
		this.motor = motor;
	}

	public Integer getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(Integer maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	
	
	
	
}
