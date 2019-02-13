package rocketsimulator;

import java.util.Vector;

public class Body implements RocketComponent {
	
	double diameter;
	double mass;
	
	Body(double diameter, Vector<Double> orientation){
		this.diameter = diameter;
	}

	@Override
	public Vector getPosition() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Vector getForce() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean equals() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public double getMass() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Vector centerOfMass() {
		// TODO Auto-generated method stub
		return null;
	}

}
