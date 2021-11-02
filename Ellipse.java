public class Ellipse extends Figure implements Deformable{
	protected final double grand_rayon;
	protected final double petit_rayon;

	public Ellipse(double pr, double gr, int x, int y) {
		super(x, y);
		this.petit_rayon = pr;
		this.grand_rayon = gr;
	}

	public void affiche() {
		System.out.println("\nELLIPSE\ngrand rayon: "+this.grand_rayon+"; petit rayon: "+this.petit_rayon+"; (x,y) : ("+getPosX()+","+getPosY()+")");
	}

	public final Figure deformation(double coeffH, double coeffV) {
		Figure fig = new Ellipse(this.petit_rayon * coeffH, this.grand_rayon * coeffV, getPosX(), getPosY());
		return fig;
	}

	public double surface() {
		return Math.PI * this.grand_rayon * this.petit_rayon;
	}
}