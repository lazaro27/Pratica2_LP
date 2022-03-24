package Questao2_Matriz;

import java.util.Random;

public class Matriz {

	public static void main(String[] args) {
		
		int mat[][] = new int[50][50];
		int a,b,aux = 0;
		
		for( a =0; a<mat.length; a++) {
			for(b=0; b<mat.length; b++) {
				
				if(a == b ) {
					
					mat[a][b] = geraInt();
					aux = aux + mat[a][b];
				}	
			}			
		}
			
			for(int i = 0; i<mat.length; i++) {
				for(int j = 0; j<mat.length; j++) {
					
					System.out.print(" | " + mat[i][j]);
				}	
				
				System.out.println("\n");
				
			}
			
			System.out.println("Soma da diagonal principal: " + aux);
		}
	
	
	
	protected static int geraInt (){ //Método que retorna os números ímpares aleatoriamente
		Random g = new Random();
		int aux;	
		aux = g.nextInt(99);
		
		if(aux % 2 == 0) {
			aux = aux + 1;
		}
		
		return aux;	
		
	}
	
	
	}


