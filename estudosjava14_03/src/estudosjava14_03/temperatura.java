package estudosjava14_03;

import java.util.Scanner;

 public class temperatura{
	public static double cparaf(double celsius) {
		return (celsius * 9/5)+ 32;
	}
	
	public static double fparac(double fahr) {
		return( fahr - 32) * 5/9;
	}

	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);


    System.out.print("Digite a temperatura em Celsius: ");
    double celsius = scanner.nextDouble();
    System.out.println("Em Fahrenheit: " + cparaf(celsius));
    
    System.out.print("Digite a temperatura em Fahrenheit: ");
    double fahrenheit = scanner.nextDouble();
    System.out.println("Em Celsius: " + fparac(fahrenheit));
    
    scanner.close();
	}

}
