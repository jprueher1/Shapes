package edu.cvtc.shapes;



/**
 * @author Josh Prueher
 *
 */
public class ShapesTest {
  
	// Test the shape constructors and render method.
	public static void main(String[] args) {
		
		// Create new instance of a Cuboid Shape.
		Shape cuboid = new Cuboid(7, 5, 3);
		
		// Create new instance of a Cylinder Shape.
		Shape cylinder = new Cylinder(2, 5);
		
		// Create new instance of a Sphere Shape.
		Shape sphere = new Sphere(4);
		
		// Call the cuboid's render method to display the dimensions, volume and surface area via a message box.
		cuboid.render();
		
		// Call the cylinder's render method to display the dimensions, volume and surface area via a message box.
		cylinder.render();
		
		// Call the sphere's render method to display the dimensions, volume and surface area via a message box.
		sphere.render();
		
	}
	
}
