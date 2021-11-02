public class Triangle extends Figure implements Deformable{

	private double hauteur;
	private double base;

	public Triangle(double hauteur, double base, int x, int y) {	
		super(x, y);
		this.hauteur = hauteur;
		this.base = base;
	}

	public void affiche() {
		System.out.println("\nTRIANGLE\nhauteur: "+this.hauteur+"; base: "+this.base+"; (x,y) : ("+getPosX()+","+getPosY()+")");
	}

	public final Figure deformation(double coeffH, double coeffV) {
		Figure fig = new Triangle(this.hauteur * coeffV, this.base * coeffH, getPosX(), getPosY());
		return fig;
	}
	public double surface() {
		return this.base * this.hauteur/2;
	}
}