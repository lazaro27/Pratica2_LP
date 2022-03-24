package Questao4;

import java.util.Random;
import java.util.Scanner;

public class Questao4 {
	public static void main(String[] args) {
		int op;
		String nome, cpf, data, hora;
		int nVoo, nPoltrona, fim = 0;
		int poltrona[] = new int[101];
		Random gerador = new Random();
		
		Scanner ler = new Scanner(System.in);
		
		do {
		System.out.println("OPERADORA AÉREA");
		System.out.println("Digite uma das opções abaixo: ");
		System.out.println("1-Cadastrar Passageiro;\n2-Check in; \n3-Cancelar Voo; \n4-Sair;\n");
		System.out.print(">>>_");
		
		op = ler.nextInt();
		
		switch(op) {
			case 1:
				System.out.println("Digite o Nome do passageiro: ");
				nome = ler.next();
				System.out.println("Digite o CPF do passageiro: ");
				cpf = ler.next();
				System.out.println("Digite a Data do Voo: ");
				data = ler.next();
				System.out.println("Digite a hora do Voo: ");
				hora = ler.next();
				System.out.println("CADSTRO REALIZADO COM SUCESSO!!");
				
				break;
			
			case 2:
				System.out.println("Digite o CPF do passageiro: ");
				cpf = ler.next();
				System.out.println("Digite o N° da poltrona: ");
				nPoltrona = ler.nextInt();
				
				while (poltrona[nPoltrona +1] == nPoltrona) {
					
						System.out.println("Poltrona já ocupada");
						System.out.println("Digite o numero de outra Poltrona: ");
						nPoltrona = ler.nextInt();	
					
				}
				
				poltrona[nPoltrona +1] = nPoltrona;
				System.out.println("CHECK IN REALIZADO COM SUCESSO! ");
				break;
				
			case 3:
				System.out.println("Digite o CPF do passageiro: ");
				cpf = ler.next();
				System.out.println("Digite o N° do voo: ");
				nVoo = ler.nextInt();
				
				System.out.println("VOO CANCELADO COM SUCESSO! ");
								
				break;
			case 4:
				fim = 1;
				break;
				
			default:
				System.out.println("OPÇÃO INVÁLIDA!");		
						 
		}
				
		
		
		}while(fim !=4 );
		
		ler.close();
	}
}
