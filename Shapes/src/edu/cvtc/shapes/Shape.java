package edu.cvtc.shapes;

/**
 * @author Josh Prueher
 *
 */
// Shape superclass which will be used as a template for all 3d shapes.
public abstract class Shape {
	
	private Dialog dialog;
	
	protected Dialog getDialog() {
		return dialog;
	}
	
	public void setDialog(Dialog dialog) {
		setDialog(dialog);
	}
	
	// Abstract method for surface area of a shape.
	public abstract float surfaceArea();
	
	// Abstract method for volume of a shape.
	public abstract float volume();
	
	public Shape(Dialog dialog) {
		this.dialog = dialog;
	}
}
