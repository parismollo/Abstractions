/*
Écrivez une classe TriBinaire qui implémente l’interface Triable et permet à triBulles(Triable t) 
de trier un tableau de chaînes de bits (selon leur ordre naturel, c’est-à-dire 0 = 00 = 000 . . . < 1 = 01 =
001 . . . < 10 < 11 < 100 etc.). N’oubliez pas les constructeurs et la méthode toString() afin de pouvoir
tester le tri.
*/
import java.util.Arrays;
public class TriBinaire implements Triable {
	private String[] bits;

	public TriBinaire(String[] bits) {
		this.bits = bits; // ex: [101, 0110, 0]
	}

	public void echange(int i, int j) {
		String aux = this.bits[i];
		this.bits[i] = this.bits[j];
		this.bits[j] = aux; 
	}

	public int taille() {
		return this.bits.length;
	}

	public boolean plusGrand(int i, int j) {
		int a = Integer.parseInt(this.bits[i], 2);
		int b = Integer.parseInt(this.bits[j], 2);
		return (a > b);
	}

	public String toString() {
		return Arrays.toString(this.bits);
	}

	public void triBulles() {
		Triable.triBulles(this);
	}

}