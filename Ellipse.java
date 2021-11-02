public class Ellipse extends Figure {
	private final double grand_rayon;
	private final double petit_rayon;

	public Ellipse(double pr, double gr, int x, int y) {
		super(x, y);
		this.petit_rayon = pr;
		this.grand_rayon = gr;
	}

	public void affiche() {
		System.out.println("\nELLIPSE\ngrand rayon: "+this.grand_rayon+"; petit rayon: "+this.petit_rayon+"; (x,y) : ("+getPosX()+","+getPosY()+")");
	}
}