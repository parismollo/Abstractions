public class Circle extends Ellipse {
	public Circle(double rayon, int x, int y) {
		super(rayon, rayon, x, y);
	}

	public void affiche() {
		System.out.println("\nCIRCLE\nrayon: "+super.grand_rayon+"; (x,y) : ("+getPosX()+","+getPosY()+")");
	}

	// @Override
	// public double surface() {
	// 	return Math.PI * Math.pow(super.grand_rayon, 2);
	// }
}