package edu.cvtc.shapes.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;

import edu.cvtc.shapes.Cuboid;
import junitparams.JUnitParamsRunner;


/**
 * @author Josh Prueher
 *
 */

// JUnit test class for Cuboid class.
@RunWith(JUnitParamsRunner.class)
public class CuboidUnitTests {
	
	@Test
	public void testGetHeight() {
		
		// Arrange
		Cuboid cuboid = new Cuboid(8, 8, 8);
		float expected = 8;
		
		// Act
		float actual = cuboid.getHeight();
		
		// Assert
		assertEquals(expected, actual, 0);
	}
	
	@Test
	public void testGetWidth() {
		
		// Arrange
		Cuboid cuboid = new Cuboid(8, 8, 8);
		float expected = 8;
		
		// Act
		float actual = cuboid.getWidth();
		
		// Assert
		assertEquals(expected, actual, 0);
	}
	
	@Test
	public void testGetDepth() {
		
		// Arrange
		Cuboid cuboid = new Cuboid(8, 8, 8);
		float expected = 8;
		
		// Act
		float actual = cuboid.getDepth();
		
		// Assert
		assertEquals(expected, actual, 0);
	}
	
	@Test
	public void testVolumeOne() {
		
		// Arrange
		Cuboid cuboid = new Cuboid(8, 8, 8);
		float expected = cuboid.getWidth() * cuboid.getHeight() * cuboid.getDepth();
		
		// Act
		float actual = cuboid.volume();
		
		// Assert
		assertEquals(expected, actual, 0);
		
	}
	
	@Test
	public void testVolumeTwo() {
		
		// Arrange
		Cuboid cuboid = new Cuboid(6, 4, 8);
		float expected = 192.0f;
		
		// Act
		float actual = cuboid.volume();
		
		// Assert
		assertEquals(expected, actual, 0);
		
	}
	
	@Test
	public void testVolumeThree() {
		
		// Arrange
		Cuboid cuboid = new Cuboid(12, 12, 12);
		float expected = 12 * 12 * 12;
		
		// Act
		float actual = cuboid.volume();
		
		// Assert
		assertEquals(expected, actual, 0);
		
	}
	
	@Test
	public void testSurfaceAreaOne() {
		
		// Arrange
		Cuboid cuboid = new Cuboid(8, 8, 8);
		float expected = 2 * (cuboid.getWidth() * cuboid.getHeight() + cuboid.getWidth() * cuboid.getDepth() + cuboid.getHeight() * cuboid.getDepth());
		
		// Act
		float actual = cuboid.surfaceArea();
		
		// Assert
		assertEquals(expected, actual, 0);
		
	}
	
	@Test
	public void testSurfaceAreaTwo() {
		
		// Arrange
		Cuboid cuboid = new Cuboid(2, 4, 6);
		float expected = 2 * (2 * 4 + 2 * 6 + 4 * 6);
		
		// Act
		float actual = cuboid.surfaceArea();
		
		// Assert
		assertEquals(expected, actual, 0);
		
	}
	
	@Test
	public void testSurfaceAreaThree() {
		
		// Arrange
		Cuboid cuboid = new Cuboid(7, 5, 3);
		float expected =  142.0f;
		
		// Act
		float actual = cuboid.surfaceArea();
		
		// Assert
		assertEquals(expected, actual, 0);
		
	}
	
	
	// Test Cuboid constructor to show it creates a not null object
	@Test
	public void testCuboidConstructorNotNull() {
		Cuboid cuboid = new Cuboid(8, 8, 8);
		assertNotNull(cuboid);
	}
	
	// Test Cuboid Constructor receives correct properties
	@Test
	public void testCuboidConstructor() {
		
		// Arrange
		Cuboid cuboid = new Cuboid(8, 9, 10);
		float expectedWidth = 8;
		float expectedHeight = 9;
		float expectedDepth = 10;
		
		// Act
		float actualWidth = cuboid.getWidth();
		float actualHeight = cuboid.getHeight();
		float actualDepth = cuboid.getDepth();
		
		// Assert
		assertEquals(expectedWidth, actualWidth, 0);
		assertEquals(expectedHeight, actualHeight, 0);
		assertEquals(expectedDepth, actualDepth, 0);

	}
	
	// Tests that an exception is thrown with a zero for width
	@Test(expected = IllegalArgumentException.class)
	public void testConstructorForNegativeValueWidth() throws IllegalArgumentException {
		
		Cuboid negativeCuboid = new Cuboid(0, 6, 8);
		
		negativeCuboid.volume();
		
	}
	
	// Tests that an exception is thrown with a negative height
	@Test(expected = IllegalArgumentException.class)
	public void testConstructorForNegativeValueHeight() throws IllegalArgumentException {
		
		Cuboid negativeCuboid = new Cuboid(2, -3, 8);
		
		negativeCuboid.surfaceArea();
		
	}
	
	// Tests that an exception is thrown with a negative depth
	// Tests that an exception is thrown with a negative height
	@Test(expected = IllegalArgumentException.class)
	public void testConstructorForNegativeValueDepth() throws IllegalArgumentException {
		
		Cuboid negativeCuboid = new Cuboid(2, 3, -8);
		
		negativeCuboid.surfaceArea();
		
	}
	
}
