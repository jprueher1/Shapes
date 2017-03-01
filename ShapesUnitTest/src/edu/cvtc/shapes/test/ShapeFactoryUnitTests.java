package edu.cvtc.shapes.test;



import static org.junit.Assert.*;

import org.junit.Test;

import edu.cvtc.shapes.Cuboid;
import edu.cvtc.shapes.Cylinder;
import edu.cvtc.shapes.ShapeFactory;
import edu.cvtc.shapes.Sphere;
import edu.cvtc.shapes.test.substitutes.MessageBoxSub;


public class ShapeFactoryUnitTests {

	MessageBoxSub dialogSub = new MessageBoxSub();
	ShapeFactory shapeFactory = new ShapeFactory(dialogSub);
	
	
	@Test
	public void testShapeFactoryMakeCuboid() {
		// Arrange
		Cuboid testCuboid = shapeFactory.makeCuboid(12, 12, 12);
		
		// Act/Assert
		testCuboid.render();
	}
	
	@Test
	public void testShapeFactoryMakeSphere() {
		// Arrange
		Sphere testSphere = shapeFactory.makeSphere(84);
		
		// Act Assert
		testSphere.render();
	}
	
	@Test
	public void testShapeFactoryMakeCylinder() {
		// Arrange
		Cylinder testCylinder = shapeFactory.makeCylinder(4, 8);
		
		// Act/ Assert
		testCylinder.render();
	}
	
	@Test
	public void testShapeFactoryCuboidNotNull() {
		// Arrange
		Cuboid testCuboid = shapeFactory.makeCuboid(12, 12, 12);
		
		// Act/Assert
		assertNotNull(testCuboid);
	}
	
	@Test
	public void testShapeFactoryCylinderNotNull() {
		// Arrange
		Cylinder testCylinder = shapeFactory.makeCylinder(4, 5);
		
		// Act/Assert
		assertNotNull(testCylinder);
		
	}
	
	@Test
	public void testShapeFactorySphereNotNull() {
		// Arrange
		Sphere testSphere = shapeFactory.makeSphere(3);
		
		// Act/Assert
		assertNotNull(testSphere);
	}
	
}
