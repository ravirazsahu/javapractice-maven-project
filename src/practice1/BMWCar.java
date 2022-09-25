package practice1;

public class BMWCar extends AbstractCar{
	int wheel;
public BMWCar(String string, int i) {
		// TODO Auto-generated constructor stub
	super.model=string;
	super.wheel=i;
	}
@Override
public String getModelname() throws Exception {
//	if(1==1) {
//		throw new Exception("error");
//	}
	System.out.println("super.model >> "+model);
	return model;
}
@Override
	public int getNoofWheels() {
	System.out.println("super.wheel >> "+super.wheel);
	return wheel;
	}
}
