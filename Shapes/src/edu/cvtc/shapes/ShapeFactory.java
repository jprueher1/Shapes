package edu.cvtc.shapes;

public class ShapeFactory {

	private Dialog dialog;
	
	public ShapeFactory(Dialog dialog) {

		setDialog(dialog);
	}
	
	private Dialog getDialog() {
		return dialog;
	}

	private void setDialog(Dialog dialog) {
		this.dialog = dialog;
	}
	
	public Cuboid makeCuboid(float width, float height, float depth) {
		
		return new Cuboid(getDialog(), width, height, depth);
		
	}
	
	public Sphere makeSphere(float radius) {
		
		return new Sphere(getDialog(), radius);
		
	}
	
	public Cylinder makeCylinder(float radius, float height) {
		
		return new Cylinder(getDialog(), radius, height);
		
	}

}
