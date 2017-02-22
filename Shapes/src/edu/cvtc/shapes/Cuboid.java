package edu.cvtc.shapes;



/**
 * @author Josh Prueher
 *
 */

// This class describes and instance of a Cuboid.
public class Cuboid extends Shape implements Renderer {
	
	// Width of this Cuboid instance.
	private float width = 0.0f;
	
	// Height of this Cuboid instance.
	private float height = 0.0f;
	
	// Depth of this Cuboid instance.
	private float depth = 0.0f;
	
	// Gets the width of this Cuboid instance.
	public float getWidth() {
		return width;
	}

	// Sets the width of this Cuboid instance.
	private void setWidth(float width) {
		this.width = width;
	}

	// Gets the height of this Cuboid instance.
	public float getHeight() {
		return height;
	}

	// Sets the height of this Cuboid instance.
	private void setHeight(float height) {
		this.height = height;
	}

	// Gets the depth of this Cuboid instance.
	public float getDepth() {
		return depth;
	}

	// Sets the depth of this Cuboid instance.
	private void setDepth(float depth) {
		this.depth = depth;
	}
	
	/*// Constructor to initialize a new Cuboid instance.
	public Cuboid(Dialog dialog)  {
		
		super(dialog);
	}*/

	public Cuboid(Dialog dialog, float width, float height, float depth) throws IllegalArgumentException {
		super(dialog);
		// Check to make sure all dimensions of this Cuboid instance are not negative.
		if(width <= 0 || height <= 0 || depth <= 0){
			throw new IllegalArgumentException();
			//JOptionPane.showMessageDialog(null, "Cannot create a cuboid! All dimensions must be positive numbers.");
			//TODO: Have user enter positive values for all dimensions of this Cuboid instance.
		} else {
		
			setWidth(width);
			setHeight(height);
			setDepth(depth);
		}
	} 

	// Calculates and returns the surface area of this Cuboid instance.
	@Override
	public float surfaceArea() {
		// Formula for surface area of a cuboid, using accessors.
		return 2 * (getWidth() * getHeight() + getWidth() * getDepth() + getHeight() * getDepth());
	}

	// Calculates and returns the volume of this Cuboid instance.
	@Override
	public float volume() {
		// Formula for volume of a cuboid using accessors.
		return getWidth() * getHeight() * getDepth();
	}

	// Shows a message box showing the dimensions, volume, and surface area of this Cuboid instance.
	@Override
	public void render() {

		getDialog().show("Cuboid height = " + getHeight() + " Width = " + getWidth()
			+ " Depth = " + getDepth() + " Volume = " + volume() + " Surface Area = " + surfaceArea(), "Cuboid");
		
	}


}
