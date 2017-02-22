package edu.cvtc.shapes;



/**
 * @author Josh Prueher
 *
 */
public class ShapesTest {
  
	// Test the shape constructors and render method.
	public static void main(String[] args) {
		
		Dialog dialog = new MessageBox();
		
		// Create new instance of a Cuboid Shape.
		Cuboid cuboid = new Cuboid(dialog, 4, 4, 4);
		
		// Create new instance of a Cylinder Shape.
		Cylinder cylinder = new Cylinder(dialog, 4, 4);
		
		// Create new instance of a Sphere Shape.
		Sphere sphere = new Sphere(dialog, 4);
		
		// Call the cuboid's render method to display the dimensions, volume and surface area via a message box.
		cuboid.render();
		
		// Call the cylinder's render method to display the dimensions, volume and surface area via a message box.
		cylinder.render();
		
		// Call the sphere's render method to display the dimensions, volume and surface area via a message box.
		sphere.render();
		
	}
	
}
