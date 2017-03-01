package edu.cvtc.shapes;



/**
 * @author Josh Prueher
 *
 */
public class ShapesTest {
  
	// Test the shape constructors and render method.
	public static void main(String[] args) {
		
		Dialog dialog = new MessageBox();
		
		ShapeFactory shapeFactory = new ShapeFactory(dialog);
		
		// Create new instance of a Cuboid Shape.
		Cuboid defaultCuboid = shapeFactory.makeCuboid(13,17,16);
		
		// Create new instance of a Cylinder Shape.
		Cylinder defaultCylinder = shapeFactory.makeCylinder(12,12);
		
		// Create new instance of a Sphere Shape.
		Sphere defaultSphere = shapeFactory.makeSphere(122);
		
		// Call the cuboid's render method to display the dimensions, volume and surface area via a message box.
		defaultCuboid.render();
		
		// Call the cylinder's render method to display the dimensions, volume and surface area via a message box.
		defaultCylinder.render();
		
		// Call the sphere's render method to display the dimensions, volume and surface area via a message box.
		defaultSphere.render();
		
		
	}
	
}
