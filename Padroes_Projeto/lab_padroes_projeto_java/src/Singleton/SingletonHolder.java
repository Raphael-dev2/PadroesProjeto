package Singleton;


/** Singleton no modo Holder
 * @author Raphael-dev2
 */

public class SingletonHolder {
	
	private static class InstanciaHolder{
	public static SingletonHolder instancia = new SingletonHolder();
}
	private SingletonHolder() {
		super();
	}
	
	public static SingletonHolder getInstancia() {
		return InstanciaHolder.instancia;
	}
}
