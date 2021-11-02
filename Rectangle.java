public class Rectangle extends Figure implements Deformable{
	protected final double largeur;
	protected final double hauteur;

	public Rectangle(int x, int y, double largeur, double hauteur) {
		super(x, y);
		this.largeur = largeur;
		this.hauteur = hauteur;
	}
	public void affiche() {
		System.out.println("\nRECTANGLE\nlargeur: "+this.largeur+"; hauteur: "+this.hauteur+"; (x,y) : ("+getPosX()+","+getPosY()+")");
	}

	public final Figure deformation(double coeffH, double coeffV) {
		Figure fig = new Rectangle(getPosX(), getPosY(), this.largeur * coeffH, this.hauteur * coeffV);
		return fig;
	}

	public double surface() {
		return this.largeur * this.hauteur;
	}
}