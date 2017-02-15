package edu.cvtc.shapes;

import javax.swing.JOptionPane;



/**
 * @author Josh Prueher
 *
 */

// This class describes an instance of a sphere.
public class Sphere extends Shape {

	// The radius of this Sphere instance.
	private float radius = 0.0f;
	
	// Gets the radius of this Sphere instance.
	public float getRadius() {
		return radius;
	}

	// Sets the radius of this Sphere instance.
	private void setRadius(float radius) {
		this.radius = radius;
	}
	
	// Constructor that initializes a new Sphere instance.
	public Sphere(float radius) throws IllegalArgumentException {
		// Make sure a positive number was entered, don't let program continue until one is.
		if(radius <= 0){
			throw new IllegalArgumentException();
			//JOptionPane.showMessageDialog(null, "Cannot create a sphere, radius must be a positive number");
			// TODO Ask user to enter a positive number for radius
		} else {
		setRadius(radius);
		}
		
	}

	// Calculates and returns the surface area of this Sphere instance.
	@Override
	public float surfaceArea() {
		// Formula for surface area of a sphere
		return (float)(4.0 * Math.PI * Math.pow(getRadius(), 2));
	}

	// Calculates and returns the surface area of this Sphere instance.
	@Override
	public float volume() {
		// Formula for volume of a sphere.
		return (float)(4.0/3.0 * Math.PI * Math.pow(getRadius(), 3));
	}

	// Shows a message box showing the radius, volume, and surface area of this Sphere instance.
	@Override
	public void render() {
		JOptionPane.showMessageDialog(null, "Radius = " + getRadius()
		+  " Volume = " + volume() + " Surface Area = " + surfaceArea());
	}
	

	

}
