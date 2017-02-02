package edu.cvtc.shapes;



/**
 * @author Josh Prueher
 *
 */
public class ShapesTest {
  
	// Test the shape constructors and render method.
	public static void main(String[] args) {
		
		// Create new instance of a Cuboid Shape.
		Shape cuboid = new Cuboid(8, 8, 8);
		
		// Create new instance of a Cylinder Shape.
		Shape cylinder = new Cylinder(0, 0);
		
		// Create new instance of a Sphere Shape.
		Shape sphere = new Sphere(0);
		
		// Call the cuboid's render method to display the dimensions, volume and surface area via a message box.
		cuboid.render();
		
		// Call the cylinder's render method to display the dimensions, volume and surface area via a message box.
		cylinder.render();
		
		// Call the sphere's render method to display the dimensions, volume and surface area via a message box.
		sphere.render();
		
	}
	
}
