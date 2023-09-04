package verissimo;

public class fibonacciFor {
	  static long fibo(int var) {
	        if (var < 2) {
	            return var;
	        } else {
	            return fibo(var - 1) + fibo(var - 2);
	        }
	    }

	    public static void main(String[] args) {

		// teste do programa. Imprime os 4 primeiros termos
		for (int n = 0; n < 4; n++) {
	            System.out.print( fibonacciFor.fibo(n) + "\n");
	        }

	    }
}
