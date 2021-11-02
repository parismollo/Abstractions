public class Rectangle extends Figure {
	private final double largeur;
	private final double hauteur;

	public Rectangle(int x, int y, int largeur, int hauteur) {
		super(x, y);
		this.largeur = largeur;
		this.hauteur = hauteur;
	}
	public void affiche() {
		System.out.println("\nRECTANGLE\nlargeur: "+this.largeur+"; hauteur: "+this.hauteur+"; (x,y) : ("+getPosX()+","+getPosY()+")");
	}
}