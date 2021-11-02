public abstract class Figure {
	private int posX;
	private int posY;

	public Figure(int x, int y) {
		this.posX = x;
		this.posY = y;
	}
	static int getPosX() {
		return this.posX;
	}
	static int getPosY() {
		return this.posY;
	}
	void affiche();
}