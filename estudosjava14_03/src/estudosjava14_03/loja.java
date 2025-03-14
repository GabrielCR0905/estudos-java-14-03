package estudosjava14_03;

import java.util.Scanner;

public class loja {

	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	int opcao;
	double total = 0.0;
	

	do {
		System.out.print("Escolha uma opção:");
		System.out.print(" 1 - Camiseta -- 50 reais");
		System.out.print(" 2 - Calça -- 100 reais");
		System.out.print(" 3 - Tenis -- 150 reais");
		System.out.print(" 4 - Encerrar");
		opcao = scanner.nextInt();
		
	switch (opcao) {
	
	
	case 1:
		total += 50.00;
		System.out.print("Camiseta adicionada ao carrinho");
		break;
		
	case 2:
		total += 100.00;
		System.out.print("Calça adicionada ou carrinho");
		break;
		
	case 3:
		total += 150.00;
		System.out.print("Tenis adicionado ao carrinho");
		break;
		
		
	case 4:
		System.out.print("total da compra: R$"+ total);
		break;
		
	default:
		System.out.print("opção Invalida");
	}
		
		
	
	} while (opcao != 4);

	System.out.print("obrigado pela compra");
	scanner.close();
	}

}
