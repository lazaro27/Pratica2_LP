package Questao3_Vetor;

import java.util.Arrays;
import java.util.Scanner;

public class Vetor {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int n;
		int vet[] = new int[10];
		
		for(int i =0; i<10; i++) {
			System.out.println("Digite um numero: ");
			n = ler.nextInt();
			vet[i] = n;
		}
		
		Arrays.sort(vet);
		
		for(int j = 0; j<10; j++) {
			System.out.print(" | " + vet[j]);
		}
		
		ler.close();

	}

}