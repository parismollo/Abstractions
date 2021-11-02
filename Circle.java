public class Circle extends Ellipse {
	public Circle(double rayon, int x, int y) {
		super(rayon, rayon, x, y);
	}

	public void affiche() {
		System.out.println("\nCIRCLE\nrayon: "+this.grand_rayon+"; (x,y) : ("+getPosX()+","+getPosY()+")");
	}
}