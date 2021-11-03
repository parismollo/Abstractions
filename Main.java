public class Main {
	public static void main(String[] args) {
		// Rectangle r = new Rectangle(2, 3, 5, 10);
		// r.affiche();

		// Ellipse e = new Ellipse(5, 10, 2, 5);
		// e.affiche();

		// Carre c  = new Carre(5, 10, 5);
		// c.affiche();

		// Circle cir = new Circle(5, 10, 5);
		// cir.affiche();

		// Triangle tri = new Triangle(10, 5, 2, 6);
		// tri.affiche();

		// r.deformation(10, 10).affiche();
		// e.deformation(10, 10).affiche();
		// tri.deformation(10, 10).affiche();

		// cir.deformation(10, 5).affiche(); // should return ellipse? or should not be allowed?.
		// System.out.println("\nDistance between r and e centers: "+r.estDistantDe(e));

		// System.out.println("Surfaces: \n");
		// System.out.println(r.surface());
		// System.out.println(c.surface());
		// System.out.println(e.surface());
		// System.out.println(cir.surface());


		// r.deplacement(80, 100);
		// r.affiche();
		// c.deplacement(100, 20);
		// c.affiche();

		System.out.println("\n      Tri Entiers      ");
		int[] a = {1, 51, 85, 17, 2, 3, 0};
		TabEntiersTriable tab_entiers = new TabEntiersTriable(a);
		System.out.println("Sans trier: "+tab_entiers);
		tab_entiers.triBulles();
		System.out.println("Avec tri: "+tab_entiers);

		System.out.println("\n      Tri Binaire      ");
		String[] b = {"1010", "11", "110", "101"}; // [10, 3, 6, 5]
		TriBinaire tri_binaire = new TriBinaire(b);
		System.out.println("Sans trier: "+tri_binaire);
		tri_binaire.triBulles();
		System.out.println("Avec tri: "+tri_binaire); // [11, 101, 110, 1010]



		System.out.println("\n      Tri Dictionnaire      ");
		String[] c = {"Zack", "Zoe", "Paris", "Ana"};
		Dictionnaire dict = new Dictionnaire(c);
		System.out.println("Sans trier: "+dict);
		dict.triBulles();
		System.out.println("Avec tri: "+dict);
				

	}
}