package binario;
import java.util.Scanner;

public class ArvoreBi {
		private No raiz;

		private No inserir(No raiz, Integer num) {
			if (raiz == null) {
				raiz = new No(num);
				
			} else {
				if (num < raiz.number) {
					raiz.num1 = inserir(raiz.num1, num);
				} else if (num > raiz.number) {
					raiz.num2 = inserir(raiz.num2, num);
				}
			}
			return raiz;
		}

		private void mostrar(No raiz) {
			if (raiz != null) {
				mostrar(raiz.num1);
				System.out.print(raiz.number + " ");
				mostrar(raiz.num2);
			}
		}

		public static void main(String[] args) {
			ArvoreBi arvore = new ArvoreBi();
			Scanner scanner = new Scanner(System.in);

			System.out.println("Coloque o valres da arvore (digite 'x' para encerrar):");

			while (true) {
	            String entrada = scanner.nextLine();
	            if (entrada.equalsIgnoreCase("x")) {
	                break;
	            }

	            Integer valor = Integer.parseInt(entrada);
	            arvore.raiz = arvore.inserir(arvore.raiz, valor);
	        }

	        System.out.println("Arvore binária:");
	        arvore.mostrar(arvore.raiz);

	        scanner.close();
	    }
}
