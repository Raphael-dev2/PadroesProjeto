package Singleton;


/** Singleton no modo "preguiça"
 * @author Raphael-dev2
 */

public class SingletonPreguica {

	private static SingletonPreguica instancia;

	private SingletonPreguica() {
		super();
	}
	
	public static SingletonPreguica getInstancia() {
		if(instancia == null) {
			instancia = new SingletonPreguica();
		}
		return instancia;
	}
}
