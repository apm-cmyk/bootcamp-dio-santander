package desafio_controle_fluxo;

@SuppressWarnings("serial")
public class ParametrosInvalidosException extends Exception {

	public ParametrosInvalidosException() {
        super("Parâmetros inválidos: o contador não pode ser menor que zero.");
    }
    
	
}
