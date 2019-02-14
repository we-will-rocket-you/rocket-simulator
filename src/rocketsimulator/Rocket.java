package rocketsimulator;

import java.util.Stack;
import java.util.Vector;

public class Rocket {
	
	Stack<RocketComponent> RocketParts;
	Vector<Double> position; //x y z coordinates in meters
	Vector<Double> orientation; //angles of the rocket (to be determined)
	Vector<Double> torque; //x y z coordinates in newton-meters
	Vector<Double> force; //x y z components in newtons

	Rocket() {
		RocketParts = new Stack<RocketComponent>();
		position = new Vector<Double>();
		orientation = new Vector<Double>();
	}
	
	public void calculateForceOfGravity() {
		
	}
	
	public void addComponent(RocketComponent comp) {
		RocketParts.add(comp);
	}
	
	public void removeComponent(RocketComponent comp) {
		RocketParts.remove(comp);
	}

}
