package verissimo;

public class aula {
public static void main (String[] args) {
	
	double numero=5;
	double teste = numero;
	
	while(numero > 1) {
		teste=teste*(numero-1);
		numero--;
	
	}
	System.out.println( "Resultado: " + teste);
}
}
