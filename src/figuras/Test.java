package figuras;
/**
 * <h2>Clase Test</h2>
 * Clase que contiene el m�todo main
 * 
 * @author Echedey Henr�quez Hern�ndez
 * @version 04-2024
 */
public class Test {
	public static void main (String[] args)
    {
             Circunferencia c1 = new Circunferencia(5.5);
             Circunferencia c2 = new Circunferencia(10.1);
             Circunferencia c3 = new Circunferencia(10.9);

             if (c2.esIgual(false, c3))
            {
                     System.out.println("c2 y c3: iguales sin considerar decimales");
            }

             if (c2.esIgual(true, c3))
            {
                     System.out.println("c2 y c3: iguales considerando decimales");
            }
   }
}
