package edu.cvtc.shapes.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;
//import org.junit.runner.RunWith;

import edu.cvtc.shapes.Cylinder;
import edu.cvtc.shapes.test.substitutes.MessageBoxSub;
//import junitparams.JUnitParamsRunner;

/**
 * @author Josh Prueher
 *
 */


// JUnit test class for Cylinder class.
//@RunWith(JUnitParamsRunner.class)
public class CylinderUnitTests {
	
	@Test
	// Test the render method.
	public void testRenderMethod() {
		// 1. Arrange
		MessageBoxSub dialogSub = new MessageBoxSub();
		Cylinder cylinder = new Cylinder(dialogSub, 44, 55);
		// 2. Act/Assert
		cylinder.render();
		
	}
	
	
	@Test
	public void testGetRadius() {
		
		// Arrange
		MessageBoxSub dialogSub = new MessageBoxSub();
		Cylinder cylinder = new Cylinder(dialogSub, 8, 4);
		float expected = 8;
		
		// Act
		float actual = cylinder.getRadius(); 
		
		// Assert
		assertEquals(expected, actual, 0);
		
	}
	
	@Test
	public void testGetHeight() {
		
		// Arrange
		MessageBoxSub dialogSub = new MessageBoxSub();
		Cylinder cylinder = new Cylinder(dialogSub, 6, 8);
		float expected = 8;
		
		// Act
		float actual = cylinder.getHeight();
		
		// Assert
		assertEquals(expected, actual, 0);
	}
	
	@Test
	public void testVolumeOne() {
		
		// Arrange
		MessageBoxSub dialogSub = new MessageBoxSub();
		Cylinder cylinder = new Cylinder(dialogSub, 8, 8);
		float expected = (float)Math.PI * (float)Math.pow(8, 2) * 8;
		
		// Act
		float actual = cylinder.volume();
		
		// Assert
		assertEquals(expected, actual, 0);
	}
	
	@Test
	public void testVolumeTwo() {
		
		// Arrange
		MessageBoxSub dialogSub = new MessageBoxSub();
		Cylinder cylinder = new Cylinder(dialogSub, 18,588);
		float expected = (float)Math.PI * (float)Math.pow(cylinder.getRadius(), 2) * cylinder.getHeight();

		// Act
		float actual = cylinder.volume();
		
		// Assert
		assertEquals(expected, actual, 0);
	}
	
	@Test
	public void testVolumeThree() {
		
		// Arrange
		MessageBoxSub dialogSub = new MessageBoxSub();
		Cylinder cylinder = new Cylinder(dialogSub, 6, 9);
		float expected = 1017.87604f;
		
		// Act
		float actual = cylinder.volume();
		
		// Assert
		assertEquals(expected, actual, 0);
	}
	
	@Test
	public void testSurfaceAreaOne() {
		
		// Arrange
		MessageBoxSub dialogSub = new MessageBoxSub();
		Cylinder cylinder = new Cylinder(dialogSub, 8, 8);
		float expected = (float) ((2 * (float)Math.PI * cylinder.getRadius() * cylinder.getHeight()) + (2 * (float)Math.PI * Math.pow(cylinder.getRadius(), 2)));
	
		// Act
		float actual = cylinder.surfaceArea();
		
		// Assert
		assertEquals(expected, actual, 0);
	
	}
	
	@Test
	public void testSurfaceAreaTwo() {
		
		// Arrange
		MessageBoxSub dialogSub = new MessageBoxSub();
		Cylinder cylinder = new Cylinder(dialogSub, 3, 6);
		float expected = (float) ((2 * (float)Math.PI * 3 * 6) + (2 * (float)Math.PI * Math.pow(3, 2)));
	
		// Act
		float actual = cylinder.surfaceArea();
		
		// Assert
		assertEquals(expected, actual, 0);
		
	}
	
	@Test
	public void testSurfaceAreaThree() {
		
		// Arrange
		MessageBoxSub dialogSub = new MessageBoxSub();
		Cylinder cylinder = new Cylinder(dialogSub, 2, 5);
		float expected = 87.9646f;
	
		// Act
		float actual = cylinder.surfaceArea();
		
		// Assert
		assertEquals(expected, actual, 0);
		
	}
	
	// Tests that a newly constructed cylinder with valid values is not null
	@Test
	public void testCylinderConstructorNotNull() {
		MessageBoxSub dialogSub = new MessageBoxSub();
		Cylinder cylinder = new Cylinder(dialogSub, 8, 8);
		assertNotNull(cylinder);
	}
	
	// Tests that a newly constructed cylinder receives the correct radius and height.
	@Test
	public void testCylinderConstructorForCorrectProperties() {
		
		// Arrange
		MessageBoxSub dialogSub = new MessageBoxSub();
		Cylinder cylinder = new Cylinder(dialogSub,6,8);
		float expectedRadius = 6;
		float expectedHeight = 8;
		
		// Act 
		float actualRadius = cylinder.getRadius();
		float actualHeight = cylinder.getHeight();
		
		// Assert
		assertEquals(expectedRadius, actualRadius, 0);
		assertEquals(expectedHeight, actualHeight, 0);
	}
	
	
	
	// Tests that an exception is thrown when a radius less than or equal to zero are entered in constructor.
	@Test(expected = IllegalArgumentException.class)
	public void testConstructorForNegativeValuesOne() throws IllegalArgumentException {		
		
		MessageBoxSub dialogSub = new MessageBoxSub();
		Cylinder negativeCylinder = new Cylinder(dialogSub,-2,3);
		
		negativeCylinder.volume();
			
	}
	
	// Tests that an exception is thrown when a height less than or equal to zero are entered in constructor.
	@Test(expected = IllegalArgumentException.class)
	public void testConstructorForNegativeValuesTwo() throws IllegalArgumentException {		
		
		MessageBoxSub dialogSub = new MessageBoxSub();
		Cylinder negativeCylinder = new Cylinder(dialogSub, 2,-3);
		
		negativeCylinder.surfaceArea();
			
	}

}