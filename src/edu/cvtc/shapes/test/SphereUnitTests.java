package edu.cvtc.shapes.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;

import edu.cvtc.shapes.Sphere;
import junitparams.JUnitParamsRunner;

/**
 * @author Josh Prueher
 *
 */

// JUnit test class for Sphere class
@RunWith(JUnitParamsRunner.class)
public class SphereUnitTests {

	@Test
	public void testGetRadius() {
		
		// Arrange
		Sphere sphere = new Sphere(8);
		float expected = 8;
		
		// Act
		float actual = sphere.getRadius();
		
		// Assert
		assertEquals(expected, actual, 0);
	}
	
	@Test
	public void testVolumeOne() {
		
		// Arrange
		Sphere sphere = new Sphere(333);
		float expected = (float)(4.0/3.0 * Math.PI * Math.pow(sphere.getRadius(), 3));
		
		// Act
		float actual = sphere.volume();
		
		// Assert
		assertEquals(expected, actual, 0);
		
	}
	
	@Test
	public void testVolumeTwo() {
		
		// Arrange
		Sphere sphere = new Sphere(8);
		float expected = (float)(4.0/3.0 * Math.PI * Math.pow(8, 3));
		
		// Act
		float actual = sphere.volume();
		
		// Assert
		assertEquals(expected, actual, 0);
		
	}
	
	@Test
	public void testVolumeThree() {
		
		// Arrange
		Sphere sphere = new Sphere(4);
		float expected = 268.08258f;
		
		// Act
		float actual = sphere.volume();
		
		// Assert
		assertEquals(expected, actual, 0);
		
	}
	
	@Test
	public void testSurfaceAreaOne() {
		
		// Arrange
		Sphere sphere = new Sphere(8);
		float expected = (float)(4.0 * Math.PI * Math.pow(sphere.getRadius(), 2));
		
		// Act
		float actual = sphere.surfaceArea();
		
		// Assert
		assertEquals(expected, actual, 0);
	}
	
	@Test
	public void testSurfaceAreaTwo() {
		
		// Arrange
		Sphere sphere = new Sphere(8);
		float expected = (float)(4.0 * Math.PI * Math.pow(8, 2));
		
		// Act
		float actual = sphere.surfaceArea();
		
		// Assert
		assertEquals(expected, actual, 0);
	}
	
	@Test
	public void testSurfaceAreaThree() {
		
		// Arrange
		Sphere sphere = new Sphere(9);
		float expected = 1017.87604f;
		
		// Act
		float actual = sphere.surfaceArea();
		
		// Assert
		assertEquals(expected, actual, 0);
	}
	
	// Tests that sphere constructor creates a not null object.
	@Test
	public void testSphereConstructor() {
		Sphere sphere = new Sphere(8);
		assertNotNull(sphere);
	}
	
	// Tests that sphere constructor receives correct radius property.
	@Test
	public void testSphereConstructorProperties() {
		
		// Arrange
		Sphere sphere = new Sphere(8);
		float expectedRadius = 8;
		
		// Act
		float actualRadius = sphere.getRadius();
		
		// Assert
		assertEquals(expectedRadius, actualRadius, 0);

	}
	
	// Tests that an exception is thrown when a negative radius is entered.
	@Test(expected = IllegalArgumentException.class)
	public void testConstructorForNegativeValues() throws IllegalArgumentException {
		
		Sphere negativeSphere = new Sphere(-2);
		
		negativeSphere.volume();
		
	}
	
	// Tests that an exception is thrown when a radius of zero is entered.
	@Test(expected = IllegalArgumentException.class)
	public void testConstructorForZeroValues() throws IllegalArgumentException {
		
		Sphere zeroSphere = new Sphere(0);
		
		zeroSphere.volume();
		
	}
	
	
}
