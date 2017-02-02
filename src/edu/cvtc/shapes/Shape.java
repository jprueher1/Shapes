package edu.cvtc.shapes;

/**
 * @author Josh Prueher
 *
 */
// Shape superclass which will be used as a template for all 3d shapes.
public abstract class Shape {
	// Abstract method for surface area of a shape.
	public abstract float surfaceArea();
	// Abstract method for volume of a shape.
	public abstract float volume();
	// Abstract method which will be used to display a shapes dimensions, volume, and surface area.
	public abstract void render();
}
