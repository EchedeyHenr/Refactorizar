package figuras;
/**
 * <h2>Clase Circunferencia</h2>
 * Clase que modela objetos de la clase Circunferencia.
 * 
 * @author Echedey Henríquez Hernández
 * @version 04-2024
 */
public class Circunferencia {
	/**
	 * Atributo radio que guarda el radio de la circunferencia
	 */
	private double radio;
	/**
	 * Atributo Color que guarda el color de la circunferencia
	 */
	private String color;
	/**
	 * Atributo "d" que guarda el area de la circunferencia
	 */
	private double d;

	/**
	 * Constructor con un parámetro.
	 * Crea los objetos de la clase circunferencia con el radio.
	 * @param radio	Radio de la circunferencia
	 */
	public Circunferencia(double radio) {
		this.radio = radio;
	}

	/**
	 * Método público que imprime en pantalla los datos de un objeto
	 * de la clase circunferencia.
	 */
	public void imprimir() {
		color = "rojo";
		System.out.println("Diámetro: " + 2 * radio);
		System.out.println("Color: " + color);
		double d = 2 * 3.1416 * radio * radio;
		System.out.println(d);
	}

	/**
	 * Método accesor que devuelve el valor del radio de la circunferencia.
	 * @return	radio	Radio de la circunferencia
	 */
	public double getRad() {
		return radio;
	}

	/**
	 * Método mutador que permite modificar el valor del radio
	 * de la circunferencia.
	 * @param rad	Nuevo radio de la circunferencia
	 */
	public void setRad(double rad) {
		this.radio = rad;
	}

	/**
	 * Método que comprueba si la circunferencia que se le pasa es igual
	 * a la circunferencia actual, teniendo o no en cuenta los decimales. 
	 * @param considerarDecimales	Boolean que indica si se deben tener en cuenta
	 * los decimales o no
	 * @param otro	Objeto de la clase Circunferencia que se desea comparar con el actual
	 * @return	<ul>
	 * 				<li>true: el radio de ambas circunferencias son iguales</li>
	 * 				<li>false: el radio de las circunferencias no son iguales</li>
	 * 			</ul>
	 */
	public boolean esIgual(boolean considerarDecimales, Circunferencia otro) {
		double radio1 = this.radio;
		double radio2 = otro.getRad();
		if (considerarDecimales) {
			if (radio1 == radio2)
				return true;
			else
				return false;
		} else {
			if (Math.abs(radio1 - radio2) < 1)
				return true;
			else
				return false;
		}
	}
}
