import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	
	// variavel de classe
	private static ArrayList<Despesa> despesas = new ArrayList<Despesa>();
	private static Scanner teclado = new Scanner(System.in);
	
	public static void main(String[] args) {
		int opcao;
		
		// incluindo 2 despesas iniciais de teste
		Despesa d1 = new Despesa(12.5F, "Café Latte");
		despesas.add(d1);
		despesas.add(new Despesa(27.95F, "Almoço no Familia Farinha"));
		
		do {
			System.out.println("\n:: Menu");
			System.out.println("   0 - sair");
			System.out.println("   1 - cadastrar despesa");
			System.out.println("   2 - listar despesas" );
			
			System.out.print("\n   Opção? ");
			opcao = teclado.nextInt();
			teclado.nextLine(); // consumir o enter do buffer de teclado
			
			switch (opcao) {
			case 0:
				System.out.println("\n   Obrigado por usar o sistema!");
				break;
			case 1:
				cadastraDespesas();
				break;
			case 2:
				listaDespesas();	
				break;					
			default:
				System.out.println("\n   Opção inexistente!");
				break;
			}
			
		} while (opcao != 0);
	}
	
	
	private static void listaDespesas() {
		float total = 0;
		System.out.println("\n:: Minhas despesas \n");
		for (Despesa despesa : despesas) {
			System.out.println("   " + despesa);
			total = total + despesa.getValor();
		}
		System.out.println("\n   " + "Valor total: " + total);
	}
	
	private static void cadastraDespesas() {
		System.out.println("\n:: Nova despesa\n");	
		// ler a descrição e o valor
		// fazer um new Despesa
		// adicionar despesa no despesas
	}
	
}
