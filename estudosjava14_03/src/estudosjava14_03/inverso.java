package estudosjava14_03;
import java.util.Scanner;
public class inverso {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite um numero inteiro até 20:");
		int num = scanner.nextInt();
		
		
		while( num >=0) {
			System.out.print(num +" ");
			
			num--;
		}

		System.out.print("Contagem encerrada!");
		scanner.close();
	}

}
