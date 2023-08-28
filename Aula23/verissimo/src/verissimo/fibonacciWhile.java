package verissimo;
import java.util.*;

public class fibonacciWhile {
	public static void main(String[] args) {
	    Scanner x = new Scanner(System.in);
	    
	    System.out.println("Digite um numero:");
	    int qtd = x.nextInt();
	    int var1 = 1;
	    int var2 = 1;
	    
	  
	    
	    qtd = qtd - 2;
	    while (qtd > 0) {
	        System.out.print((var1+var2) + " ");
	        int var3 = var1+var2;
	        var1= var2;
	        var2 = var3;
	        qtd--;
	    }
	}

}
