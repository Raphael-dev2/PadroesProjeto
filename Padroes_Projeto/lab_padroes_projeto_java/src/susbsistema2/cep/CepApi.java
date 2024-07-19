package susbsistema2.cep;
//Sistema externo para o exemplo de Facade
public class CepApi {
	
	private static CepApi instancia = new CepApi();
	private CepApi() {
		super();
	}
	
	public static CepApi getInstancia() {
		return instancia;
	}
	
	public String recuperarCidade(String cep) {
		return "Feira de santana";
	}
	public String recuperarEstado(String cep) {
		return "Bahia";
	}
}
