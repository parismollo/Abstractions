interface Triable {
	// échange les éléments en positions i et j
	void echange(int i, int j);
	// retourne vrai si l’élément de position i est plus grand que
	// l’élément de position j
	boolean plusGrand(int i, int j);
	// nombre d’éléments à trier
	int taille();

	static void triBulles(Triable t) {
		int n = t.taille()-1;
		for(int i=1; i<=n; i++) {
			for(int j=0; j<n; j++) {
				if(t.plusGrand(j, j+1)) {
					t.echange(j, j+1);
				}
			}
		}
	}
}