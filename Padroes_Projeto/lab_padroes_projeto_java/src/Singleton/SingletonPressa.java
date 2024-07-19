package Singleton;


/** Singleton no modo "Apressado"
 * @author Raphael-dev2
 */

public class SingletonPressa {

	private static SingletonPressa instancia = new SingletonPressa();

	private SingletonPressa() {
		super();
	}
	
	public static SingletonPressa getInstancia() {
		return instancia;
	}
}
