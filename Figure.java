import java.lang.Math;

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
	public abstract double surface();

	public final double estDistantDe(Figure fig) {
		double diff_x = getPosX() - fig.getPosX();
		double diff_y = getPosY() - fig.getPosY();

		double squared_diff_x = Math.pow(diff_x, 2);
		double squared_diff_y = Math.pow(diff_y, 2);

		return Math.sqrt(squared_diff_x + squared_diff_y);
	}
	
	public final void deplacement(int x, int y) {
		this.posX = x;
		this.posY = y;
	}
}