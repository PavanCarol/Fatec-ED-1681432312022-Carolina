package fibonacci;

public class comRecursividade {
	public static int fibonacci(int x) {
		if (x <= 1) {
			return x;
		}
		return fibonacci(x-1) + fibonacci(x-2);
		
	}
	
	public static void main (String[] args) {
		
		System.out.println("Programa de Cálculo de Fibonacci com Recursividade");
		
		int vezes = 10;
		int i = 0;
		
		while (i < vezes) {
			System.out.println(fibonacci(i));
			i++;
		}
	}
}
