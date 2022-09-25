package interviewqus.java8.interfaceproblems;

public class Wheels implements Bus,Lorry {


	public static void main(String[] args) {
		Wheels wh=new Wheels();
		wh.noofwheels();
	}

	@Override
	public void noofwheels() {
		// TODO Auto-generated method stub
		//new feature in java8
		Lorry.super.noofwheels();
	}

}
