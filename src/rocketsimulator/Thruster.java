package rocketsimulator;

import java.util.Vector;

public class Thruster implements RocketComponent, ControlSurface {
	
	double thrust;
	Vector<Double> orientation;
	
	Thruster(Vector<Double> orientation){
		thrust = 0;
		this.orientation = orientation;
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
	public void setControl(double control) {
		this.thrust = control;
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
