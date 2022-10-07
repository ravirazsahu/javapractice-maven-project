package practice1;

public class Car_BMW extends AbstractCar {
	int wheel;
	String name = "BMW";
	private boolean autopark;

	public Car_BMW(String string, int i,boolean autopark) {
		super.model = string;
		super.wheel = i;
		this.autopark=autopark;
	}

	public Car_BMW(String string, int i) {
		super.model = string;
		super.wheel = i;
	}
	@Override
	public String getModelname() throws Exception {
//	if(1==1) {
//		throw new Exception("error");
//	}
		System.out.println("super.model >> " + model);
		return model;
	}

	@Override
	public int getNoofWheels() {
		System.out.println("super.wheel >> " + super.wheel);
		return wheel;
	}

	public boolean isDiesel() {
		System.out.println("isDisel >> yes");
		return true;
	}
	public boolean isAutoParking() {
		System.out.println("auto parking >> yes");
//		this.autopark=true;
		return this.autopark;
	}

	public boolean isPetrol() {
		System.out.println("isPetrol >> no");
		return false;
	}
}
