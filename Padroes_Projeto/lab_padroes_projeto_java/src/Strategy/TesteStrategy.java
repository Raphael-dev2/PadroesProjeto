package Strategy;

public class TesteStrategy {
	
		// Strategy em teste
	public static void main(String[] args) { 
		Comportamento defensivo = new ComportamentoDefensivo();
		Comportamento normal = new ComportamentoNormal();
		Comportamento ofensivo = new ComportamentoOfensivo();

		Robo robo = new Robo();
		robo.setComportamento(normal);
		robo.mover();
		robo.mover();
		robo.setComportamento(defensivo);
		robo.mover();
		robo.setComportamento(ofensivo);
		robo.mover();
		robo.mover();
		robo.mover();
	}
}
