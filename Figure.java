public abstract class Figure {
	private int posX;
	private int posY;

	public Figure(int x, int y) {
		this.posX = x;
		this.posY = y;
	}
	public final int getPosX() {
		return this.posX;
	}
	public final int getPosY() {
		return this.posY;
	}
	public abstract void affiche();
}