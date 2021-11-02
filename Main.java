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

		Triangle tri = new Triangle(10, 5, 2, 6);
		tri.affiche();

		r.deformation(10, 10).affiche();
		e.deformation(10, 10).affiche();
		tri.deformation(10, 10).affiche();

		cir.deformation(10, 5).affiche(); // should return ellipse? or should not be allowed?.
		System.out.println("\nDistance between r and e centers: "+r.estDistantDe(e));

		System.out.println("Surfaces: \n");
		System.out.println(r.surface());
		System.out.println(c.surface());
		System.out.println(e.surface());
		System.out.println(cir.surface());


		r.deplacement(80, 100);
		r.affiche();
		c.deplacement(100, 20);
		c.affiche();


	}
}