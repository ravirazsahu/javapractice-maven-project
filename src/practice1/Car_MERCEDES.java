package practice1;

public class Car_MERCEDES extends AbstractCar {
	int wheel;
	String name = "Mercedes";
	private boolean autopark;

	public Car_MERCEDES(String string, int i,boolean autopark) {
		// TODO Auto-generated constructor stub
		super.model = string;
		super.wheel = i;
		this.autopark=autopark;
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
		System.out.println("isDisel >> no");
		return false;
	}

	
	
	public boolean isAutoParking() {
		System.out.println("auto parking >> "+this.autopark);
//		this.autopark=true;
		return this.autopark;
	}
	
	public boolean isPetrol() {
		System.out.println("isPetrol >> yes");
		return true;
	}
}
