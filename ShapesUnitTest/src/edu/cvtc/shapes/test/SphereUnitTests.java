package edu.cvtc.shapes.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;
//import org.junit.runner.RunWith;

import edu.cvtc.shapes.Sphere;
import edu.cvtc.shapes.test.substitutes.MessageBoxSub;
//import junitparams.JUnitParamsRunner;

/**
 * @author Josh Prueher
 *
 */

// JUnit test class for Sphere class
//@RunWith(JUnitParamsRunner.class)
public class SphereUnitTests {

	@Test
	
	// Test the render method
	public void testRenderMethod() {
		// 1. Arrange
		MessageBoxSub dialogSub = new MessageBoxSub();
		Sphere sphere = new Sphere(dialogSub, 2);
		
		// 2. Act/Assert
		sphere.render();
		
		
	}
	
	@Test
	public void testGetRadius() {
		
		// Arrange
		MessageBoxSub dialogSub = new MessageBoxSub();
		Sphere sphere = new Sphere(dialogSub, 8);
		float expected = 8;
		
		// Act
		float actual = sphere.getRadius();
		
		// Assert
		assertEquals(expected, actual, 0);
	}
	
	@Test
	public void testVolumeOne() {
		
		// Arrange
		MessageBoxSub dialogSub = new MessageBoxSub();
		Sphere sphere = new Sphere(dialogSub, 333);
		float expected = (float)(4.0/3.0 * Math.PI * Math.pow(sphere.getRadius(), 3));
		
		// Act
		float actual = sphere.volume();
		
		// Assert
		assertEquals(expected, actual, 0);
		
	}
	
	@Test
	public void testVolumeTwo() {
		
		// Arrange
		MessageBoxSub dialogSub = new MessageBoxSub();
		Sphere sphere = new Sphere(dialogSub, 8);
		float expected = (float)(4.0/3.0 * Math.PI * Math.pow(8, 3));
		
		// Act
		float actual = sphere.volume();
		
		// Assert
		assertEquals(expected, actual, 0);
		
	}
	
	@Test
	public void testVolumeThree() {
		
		// Arrange
		MessageBoxSub dialogSub = new MessageBoxSub();
		Sphere sphere = new Sphere(dialogSub, 4);
		float expected = 268.08258f;
		
		// Act
		float actual = sphere.volume();
		
		// Assert
		assertEquals(expected, actual, 0);
		
	}
	
	@Test
	public void testSurfaceAreaOne() {
		
		// Arrange
		MessageBoxSub dialogSub = new MessageBoxSub();
		Sphere sphere = new Sphere(dialogSub, 8);
		float expected = (float)(4.0 * Math.PI * Math.pow(sphere.getRadius(), 2));
		
		// Act
		float actual = sphere.surfaceArea();
		
		// Assert
		assertEquals(expected, actual, 0);
	}
	
	@Test
	public void testSurfaceAreaTwo() {
		
		// Arrange
		MessageBoxSub dialogSub = new MessageBoxSub();
		Sphere sphere = new Sphere(dialogSub, 8);
		float expected = (float)(4.0 * Math.PI * Math.pow(8, 2));
		
		// Act
		float actual = sphere.surfaceArea();
		
		// Assert
		assertEquals(expected, actual, 0);
	}
	
	@Test
	public void testSurfaceAreaThree() {
		
		// Arrange
		MessageBoxSub dialogSub = new MessageBoxSub();
		Sphere sphere = new Sphere(dialogSub, 9);
		float expected = 1017.87604f;
		
		// Act
		float actual = sphere.surfaceArea();
		
		// Assert
		assertEquals(expected, actual, 0);
	}
	
	// Tests that sphere constructor creates a not null object.
	@Test
	public void testSphereConstructor() {
		MessageBoxSub dialogSub = new MessageBoxSub();
		Sphere sphere = new Sphere(dialogSub, 8);
		assertNotNull(sphere);
	}
	
	// Tests that sphere constructor receives correct radius property.
	@Test
	public void testSphereConstructorProperties() {
		
		// Arrange
		MessageBoxSub dialogSub = new MessageBoxSub();
		Sphere sphere = new Sphere(dialogSub, 8);
		float expectedRadius = 8;
		
		// Act
		float actualRadius = sphere.getRadius();
		
		// Assert
		assertEquals(expectedRadius, actualRadius, 0);

	}
	
	// Tests that an exception is thrown when a negative radius is entered.
	@Test(expected = IllegalArgumentException.class)
	public void testConstructorForNegativeValues() throws IllegalArgumentException {
		MessageBoxSub dialogSub = new MessageBoxSub();
		Sphere negativeSphere = new Sphere(dialogSub, -2);
		
		negativeSphere.volume();
		
	}
	
	// Tests that an exception is thrown when a radius of zero is entered.
	@Test(expected = IllegalArgumentException.class)
	public void testConstructorForZeroValues() throws IllegalArgumentException {
		MessageBoxSub dialogSub = new MessageBoxSub();
		Sphere zeroSphere = new Sphere(dialogSub, 0);
		
		zeroSphere.volume();
		
	}
	
	
}
