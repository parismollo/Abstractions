public class Carre extends Rectangle {
	public Carre(int x, int y, int l) {
		super(x, y, l, l);
	}

	@Override
	public void affiche() {
		System.out.println("\nCARRE\nlargeur: "+this.largeur+"; hauteur: "+this.hauteur+"; (x,y) : ("+getPosX()+","+getPosY()+")");
	}
}