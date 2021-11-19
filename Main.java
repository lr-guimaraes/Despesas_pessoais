import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	
	// variavel de classe
	private static ArrayList<Expense> expenses = new ArrayList<Expense>();
	private static Scanner keyboard = new Scanner(System.in);
	
	public static void main(String[] args) {
		int option;
		
		// incluindo 2 Expenses iniciais de teste
		Expense d1 = new Expense(12.5F, "Caf� Latte");
		expenses.add(d1);
		expenses.add(new Expense(27.95F, "Almo�o no Familia Farinha"));
		
		do {
			System.out.println("\n:: Menu");
			System.out.println("   0 - sair");
			System.out.println("   1 - cadastrar despesas");
			System.out.println("   2 - listar despesas" );
			
			System.out.print("\n   Opção? ");
			option = keyboard.nextInt();
			keyboard.nextLine(); // consumir o enter do buffer de teclado
			
			switch (option) {
			case 0:
				System.out.println("\n   Obrigado por usar o sistema!");
				break;
			case 1:
				expensesRegistration();
				break;
			case 2:
				expensesList();	
				break;					
			default:
				System.out.println("\n   Opção inexistente!");
				break;
			}
			
		} while (option != 0);
	}
	
	
	private static void expensesList() {
		float total = 0;
		System.out.println("\n:: Minhas Expenses \n");
		for (Expense Expense : expenses) {
			System.out.println("   " + Expense);
			total = total + Expense.getValue();
		}
		System.out.println("\n   " + "Valor total: " + total);
	}
	
	private static void expensesRegistration() {
		System.out.println("\n:: Nova Expense\n");	
		// ler a descri��o e o valor
		// fazer um new Expense
		// adicionar Expense no Expenses
	}
	
}
