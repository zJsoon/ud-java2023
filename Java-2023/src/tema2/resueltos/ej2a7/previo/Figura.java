package tema2.resueltos.ej2a7.previo;

import java.awt.Point;
import java.util.Random;

import utils.ventanas.ventanaBitmap.VentanaGrafica;

public abstract class Figura {
	protected static final Random random = new Random();
	
	protected double xCentro;
	protected double yCentro;
	protected long tiempoCreacionMs;
	
	public Figura(double xCentro, double yCentro) {
		super();
		this.xCentro = xCentro;
		this.yCentro = yCentro;
		tiempoCreacionMs = System.currentTimeMillis();
	}
	
	public int getxCentro() {
		return (int) Math.round( xCentro );
	}

	public void setxCentro(int xCentro) {
		this.xCentro = xCentro;
	}

	public int getyCentro() {
		return (int) Math.round( yCentro );
	}

	public void setyCentro(int yCentro) {
		this.yCentro = yCentro;
	}
	
	/** Devuelve el tiempo que este rectángulo lleva de vida desde que se creó hasta este momento
	 * @return	Número de milisegundos transcurridos
	 */
	public long getTiempoVida() {
		return System.currentTimeMillis() - tiempoCreacionMs;
	}
	
	/** Dibuja el rectángulo, como un ladrillo
	 * @param v	Ventana en la que dibujar el rectángulo
	 */
	public abstract void dibujar(VentanaGrafica v);
	
	/** Informa si el círculo contiene un punto de la ventana
	 * @param punto	Punto a consultar
	 * @return	true si ese punto está dentro del círculo (incluyendo su borde), false si no lo está
	 */
	public abstract boolean contienePunto( Point punto );
}
