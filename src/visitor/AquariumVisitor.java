package visitor;

import aquarium.jellies.*;

public class AquariumVisitor {

	public void admire(Jelly jelly) {
		System.out.println("Test jelly pack");
	}
	
	public static void main(String[] args) {
		AquariumVisitor vis=new AquariumVisitor();
		vis.admire(new Jelly());
	}
}
