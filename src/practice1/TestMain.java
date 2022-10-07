package practice1;

public class TestMain {
public static void main(String[] args) {
	System.out.println("testmain");
Car_BMW bmw=new Car_BMW("BMW",4);
//I was trying to check whether method returns its value even after throw exception
//conclusion: No it doesn't , because throw immediately when exception occurs and it doesnt move to the next line  
try {
	bmw.getModelname();
} catch (Exception e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
bmw.getNoofWheels();
	}

}
