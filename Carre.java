public class Carre extends Rectangle {
	public Carre(int x, int y, int l) {
		super(x, y, l, l);
	}

	@Override
	public void affiche() {
		System.out.println("\nCARRE\nlargeur: "+super.largeur+"; hauteur: "+super.hauteur+"; (x,y) : ("+getPosX()+","+getPosY()+")");
	}

	// @Override
	// public double surface() {
	// 	return Math.pow(super.largeur, 2);
	// }
}