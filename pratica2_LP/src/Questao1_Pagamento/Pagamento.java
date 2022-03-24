package Questao1_Pagamento;

import java.util.Scanner;

public class Pagamento {

	public static void main(String[] args) {
		float gasto = 0, valorTotal, valorParc;
		int op = 0,numParc;
			
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite o total gasto pelo cliente: ");
		gasto = ler.nextFloat();
		
		aux:
		while(gasto != -1) {
	    
		System.out.println("Opções de Pagamento: \n1-À Vista (10% de Desconto)\n2-Parcelado 2 X(Preço da etiqueta)\n3-Parcelado de 3X até 6X"
				+ "(Com juros de 3% ao mês-Somente para compras acima de R$500)");
		op = ler.nextInt();
		
		switch(op){
			case 1:
				valorTotal = gasto - (gasto*0.1f);
				System.out.println("Valor total a vista: " + valorTotal);
				break;			
			case 2:
				valorTotal = gasto/2;
				System.out.println("Valor total da parcela: " + valorTotal);
				break;
			case 3:
				if(gasto>500) {
					System.out.println("Digite o número de parcelas:");
					numParc = ler.nextInt();
					valorTotal = (float) (gasto * Math.pow((1 +0.03), numParc));
					
					valorParc = valorTotal/numParc;
					System.out.printf("Valor da parcela: %.2f \n\n", valorParc);
					break;
				}	else System.out.println("ESCOLHA NOVA FORMA DE PAGAMENTO!"); continue aux;
				
				
		default:
				System.out.println("OPÇÃO INVÁLIDA!");
				break;				
			}
		System.out.print("Digite o total gasto pelo cliente: ");
		gasto = ler.nextFloat();
		}
		
		ler.close();
	}
	
}
