package edu.cvtc.shapes;

import javax.swing.JOptionPane;

/**
 * @author Josh Prueher
 *
 */

// This class describes an instance of a Cylinder.
public class Cylinder extends Shape {

	// Radius of this cylinder instance.
	private float radius = 0.0f;
	
	// Height of this cylinder instance.
	private float height = 0.0f;
	
	// Gets the radius of this Cylinder instance.
	public float getRadius() {
		return radius;
	}

	// Sets the radius of this Cylinder instance.
	private void setRadius(float radius) {
		this.radius = radius;
	}

	// Gets the height of this Cylinder instance.
	public float getHeight() {
		return height;
	}

	// Sets the height of this Cylinder instance.
	private void setHeight(float height) {
		this.height = height;
	}

	// Constructor that initializes a new instance of a Cylinder.
	public Cylinder(float radius, float height) {
		// Make sure positive dimensions were entered by user.
		while(radius < 0 || height < 0) {
			JOptionPane.showMessageDialog(null, "Cannot create a cylinder! All dimensions must be positive numbers.");
			//TODO: Have user enter positive values for all dimensions of cylinder.
		}
		setRadius(radius);
		setHeight(height);
	}
	
	// Calculates and returns the surface area for this Cylinder instance.
	@Override
	public float surfaceArea() {
		// Formula for surface area of a cylinder.
		return (float) ((2 * (float)Math.PI * getRadius() * getHeight()) + (2 * (float)Math.PI * Math.pow(getRadius(), 2)));
	}

	// Calculates and returns the volume for this Cylinder instance.
	@Override
	public float volume() {
		// Formula for volume of a cylinder.
		return (float)Math.PI * (float)Math.pow(getRadius(), 2) * getHeight();
	}

	// Shows a message box showing the dimensions, volume, and surface area of this Cylinder instance.
	@Override
	public void render() {
		JOptionPane.showMessageDialog(null, "Cylinder height = " + getHeight() + " Radius = " + getRadius()
		+  " Volume = " + volume() + " Surface Area = " + surfaceArea());
	}
	
}
