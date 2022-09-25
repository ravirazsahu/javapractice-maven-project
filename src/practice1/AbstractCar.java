package practice1;

public abstract class AbstractCar {

	public int wheel;
	public String model;
	public void setWheel(int now) {
		this.wheel=now;
	}
	public void setModel(String now) {
		this.model=now;
	}
	public abstract int getNoofWheels();
	public abstract String getModelname() throws Exception;
}
