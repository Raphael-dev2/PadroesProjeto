package Singleton;

public class TesteSingleton {
	
	public static void main(String[] args) {
		
		// Testando primeiro singleton
		SingletonPreguica Preguica = SingletonPreguica.getInstancia();	
		System.out.println(Preguica);
		Preguica = SingletonPreguica.getInstancia();
		System.out.println(Preguica);
		
		// Segundo singleton
		SingletonPressa Pressa = SingletonPressa.getInstancia();	
		System.out.println(Pressa);
		Pressa = SingletonPressa.getInstancia();
		System.out.println(Pressa);
		
		// Terceiro singleton
		SingletonHolder Holder = SingletonHolder.getInstancia();	
		System.out.println(Holder);
		Holder = SingletonHolder.getInstancia();
		System.out.println(Holder);
		
		
	}
}
