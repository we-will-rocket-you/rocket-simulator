package rocketsimulator;

import java.util.ArrayList;
import javax.vecmath.*;

public class Rocket {
	
	public static final Double G = 6.673E-11; //gravitational constant
	public static final Double r = 6378000.0; //radius of the earth in meters
	public static final Double m = 5.972E24; //mass of earth in kg
	
	ArrayList<RocketComponent> RocketParts;
	Vector3d position; //vector from starting position to CG of rocket
	Vector3d orientation; //orientation of rocket (see https://www.grc.nasa.gov/www/k-12/rocket/rotations.html)
	Vector3d torque; //newton-meters around CG
	Vector3d force; //newtons through CG

	Rocket() {
		RocketParts = new ArrayList<RocketComponent>();
		position = new Vector3d();
		orientation = new Vector3d();
	}
	
	/*
	 * Returns the force vector on the rocket due to gravity acting through the center of mass
	 */
	public Vector3d calculateForceOfGravity() {
		Double rocket_mass = 0.0;
		//for each component of the 
		for (RocketComponent comp : RocketParts) {
			rocket_mass = rocket_mass + comp.getMass();
		}
		Double force = rocket_mass * getAcceleration();
		Vector3d down = new Vector3d(0.0,0.0,-force);
		return down;
	}
	
	/*
	 * Returns the acceleration due to gravity of the rocket based on the altutute
	 */
	public Double getAcceleration() {
		//formula: a = G * Mearth / r^2
		return G * m / Math.pow((r + position.getZ()), 2);
	}
	
	public void addComponent(RocketComponent comp) {
		RocketParts.add(comp);
	}
	
	public void removeComponent(RocketComponent comp) {
		RocketParts.remove(comp);
	}

}
