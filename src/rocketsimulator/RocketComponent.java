/**
 * RocketSimulator Interface
 * Provides "sample functions" that relate to the rocket functions
 * eg: every rocket part should have a set of coordinates, a virtual "hitbox", position, orientation, etc.
 */
package rocketsimulator;

import java.util.Vector;

/**
 * @author Vlad
 *
 */
public interface RocketComponent {
	Vector<Double> getPosition(); //vector from the base of the rocket to the component
	Vector<Double> getForce(); //get the force which acts on the position (not center of mass) of the object
	double getMass(); //returns the mass of the component in kg
	Vector<Double> centerOfMass(); //vector from position vector, to center of mass
	boolean equals(); //are two components equal?
}
