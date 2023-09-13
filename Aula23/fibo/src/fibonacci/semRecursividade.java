package fibonacci;

public class semRecursividade {
public static void main (String[] args) {
		
		System.out.println("Programa de Cálculo de Fibonacci sem Recursividade");
		
		int fibo1 = 0;
		int fibo2 = 1;
		
		int vezes = 10;
		
		int cont = 0;
		
		while (cont < vezes) {
			
			System.out.println(fibo1);
			
			int fibo3 = fibo2 + fibo1;
			
            fibo1 = fibo2;
            fibo2 = fibo3;
            cont = cont + 1;
		}

	}
}
