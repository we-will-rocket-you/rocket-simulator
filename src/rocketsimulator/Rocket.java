package rocketsimulator;

import java.util.Stack;
import java.util.Vector;

public class Rocket {
	
	Stack <RocketComponent> RocketParts;
	Vector<Double> position;
	Vector<Double> orientation;
	double time; //time in seconds

	Rocket() {
		RocketParts = new Stack<RocketComponent>();
		position = new Vector<Double>();
		orientation = new Vector<Double>();
	}
	
	public void addComponent(RocketComponent comp) {
		RocketParts.add(comp);
	}
	
	public void removeComponent(RocketComponent comp) {
		RocketParts.remove(comp);
	}

}
