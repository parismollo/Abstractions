import java.util.Arrays;

public class TabEntiersTriable implements Triable {
	private int[] tab;

	public TabEntiersTriable(int[] tab) {
		this.tab = tab;
	}

	public int taille() {
		return this.tab.length;
	}

	public void echange(int i, int j) {
		int aux = this.tab[i];
		this.tab[i] = this.tab[j];
		this.tab[j] = aux; 
	}

	public boolean plusGrand(int i, int j) {
		return (this.tab[i] > this.tab[j]);
	}

	public String toString() {
		return Arrays.toString(this.tab);
	}

	public void triBulles() {
		Triable.triBulles(this);
	}

}