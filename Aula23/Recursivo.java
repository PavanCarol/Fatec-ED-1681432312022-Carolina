import java.util.Scanner;

public class Recursivo {
	
	public static void main(String[] args) {
		
		
		Scanner entrada = new Scanner(System.in);

		  
		int x = 1;
		while(x == 1) {
			System.out.println("Selecione a base: \n1- Bin�ria \n2- Octal \n3- Hexadecimal \n4- Sair do sistema");

			int escolha = entrada.nextInt();
			
			switch(escolha) {
			case 1:
				System.out.println("Insira o número para converter:");
				int numeroBinario = entrada.nextInt();
				
				System.out.println("\nResultado em binário: ");
				binario(numeroBinario, "");
				
				
				break;
			case 2:
				System.out.println("Insira o número que deseja converter:");
				int numeroOctal = entrada.nextInt();
				
				System.out.println("\nResultado em octal: ");
				break;
			case 3:
				System.out.println("Insira o número que deseja converter:");
				int numeroHexa = entrada.nextInt();
				
				System.out.println("\nResultado em hexadecimal: ");
				hexadecimal(numeroHexa);
				break;
			
			case 4:
				System.exit(0);
			}
		}
	}
	public static int binario(int n, String result) {
	if (n == 0)
	{
		System.out.println(result);
		return 0;
	}
	else {
		result = (n%2) + result;
		
		n = (n / 2);
		return binario(n, result);
	}

	}
	
	public static int octal(int n, String result) {
	if (n == 0)
	{
		System.out.println(result);
		return 0;
	}
	else {
		result = (n%8) + result;
		
		n = (n / 8);
		return octal(n, result);
	}

	}
	
    public static void hexadecimal(int n) {
        int[] array = new int[32];
        int posicao = 0;
        	if(n != 0) {
            array[posicao] = n % 16;
            posicao++;
            n = n / 16;
            
            hexadecimal(n);
        	}
        
        for (int i = posicao - 1; i >= 0; i--) {
            System.out.print(Integer.toHexString(array[i]));
        }
    }
}
