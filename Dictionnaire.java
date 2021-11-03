/*
Écrivez une classe Dictionnaire qui implémente l’interface Triable et permet à triBulles(Triable
t) de trier des chaînes de caractères (en ordre alphabétique). N’oubliez pas les constructeurs et la méthode
toString() afin de pouvoir tester le tri
*/
import java.util.Arrays;
public class Dictionnaire implements Triable {
	private String[] dict;

	public Dictionnaire(String[] dict) {
		this.dict = dict;
	}
	public int taille() {
		return this.dict.length;
	}
	public void echange(int i, int j) {
		String aux = this.dict[i];
		this.dict[i] = this.dict[j];
		this.dict[j] = aux;
	}
	public String toString() {
		return Arrays.toString(this.dict);
	}
	public boolean plusGrand(int i, int j) {
		String a = this.dict[i];
		String b = this.dict[j];

		int compare = a.compareTo(b); // Comparable interface
		if (compare < 0) {return false;}
		else {
			return true;
		}
	}
	public void triBulles() {
		Triable.triBulles(this);
	}
}