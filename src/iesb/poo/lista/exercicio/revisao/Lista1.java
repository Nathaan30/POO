package iesb.poo.lista.exercicio.revisao;

import java.util.Scanner;

public class Lista1 {
	public static void main(String[] args) {
	
		Scanner scanf = new Scanner(System.in);
		int count = 0;
		int loopcount = 0;
		int num = 0;
		
		while(count < 3) {
			System.out.println("Informe um numero inteiro: ");
			num = scanf.nextInt();
			
			if(num % 2 == 0) {
				count++;
			}
			loopcount++;
		}
		System.out.println("O laço foi repetido: "+loopcount);
		

}
}