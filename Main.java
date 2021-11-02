public class Main {
	public static void main(String[] args) {
		Rectangle r = new Rectangle(2, 3, 5, 10);
		r.affiche();

		Ellipse e = new Ellipse(5, 10, 2, 5);
		e.affiche();

		Carre c  = new Carre(5, 10, 5);
		c.affiche();

		Circle cir = new Circle(5, 10, 5);
		cir.affiche();
	}
}