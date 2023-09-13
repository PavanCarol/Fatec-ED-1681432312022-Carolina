import java.util.Scanner;

public class Iterativo {
    public static void main(String[] args) {
    	
    	
        int x = 0;
        int[] array = new int[32];
        
        Scanner scanner1 = new Scanner(System.in);
        
        System.out.println("Insira o numero decimal desejado:" );
        int numero = scanner1.nextInt();
        
        System.out.println("Insira a base em: \n\n2 - Binario \n8 - Octal \n16 - Hexadecimal" );
        int base = scanner1.nextInt();

        while (numero != 0) {
        	if (base == 2 || base == 8 || base == 16) {
            array[x] = numero % base;
            x++;
            numero = numero / base;
        	} else {
        		System.out.println("Insira uma base");
        		System.exit(0);
        	}
        }
        
        if (base == 2) {
            System.out.print("Binário: ");
            for (int i = x - 1; i >= 0; i--) {
            	System.out.print(array[i]);
            }
        } else if (base == 8) {
            System.out.print("Octal: ");
            for (int i = x - 1; i >= 0; i--) {
            	System.out.print(array[i]);
            }
        } else if (base == 16) {
            System.out.print("Hexadecimal: ");
            for (int i = x - 1; i >= 0; i--) {
            	System.out.print(Integer.toHexString(array[i]));
            }
        }
        
    }
}
