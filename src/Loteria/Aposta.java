package Loteria;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


public class Aposta {
	
	static Random ran = new Random();
	
	public static void surpresa(int limite, int quant) {
		
		int[] aposta = new int[quant];
		
		for(int i = 0; i < quant; i++) {
			int numerosGerados = ran.nextInt(limite);
			aposta[i] = numerosGerados;
		}
		
		for ( int i = 0; i <= aposta.length; i++) {
			for (int j = i + 1; j < aposta.length; j++) {
				if (aposta[j] == aposta[i]||aposta[i]==0) { 
					aposta[i] = ran.nextInt(limite); 
				}
			}
		}
		
		System.out.println(Arrays.toString(aposta));
		System.out.println("Boa Sorte!!!");
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int jogo;
		do {
			System.out.println();
			System.out.println("Escolha qual jogo deseja receber uma aposta: ");
			System.out.println("0-> Sair 1-> Mega-Sena	2-> Lotofácil 3-> Quina 4-> Lotomania  5-> Dupla Sena  6-> Dia de Sorte ");
			System.out.println();
			jogo = scan.nextInt();
		
			switch(jogo) {
			case 0:
				System.out.println("Tenha um bom jogo. Boa Sorte!!!");
				break;
				
			case 1:
				System.out.println("Jogo escolhido: Mega-Sena.");
				System.out.println("Escolha de 6 a 20 números para apostar. Para ganhar é necessario acertar os 6 números sorteados, mas também ganha se acertar 5 ou 4 números.");
				System.out.println();
				System.out.println("digite a quantidade de numeros da aposta:");
				int quant = scan.nextInt();
				
				while(quant < 6 || quant > 20) {
					System.out.println("Quantidade não autorizada. Escolha de 6 a 20 números.");
					quant = scan.nextInt();
				}   
				
				surpresa(61,quant);
				
				break;
				
				
			case 2:
				System.out.println("Jogo escolhido: Lotofácil.");
				System.out.println("Escolha de 15 a 20 números para apostar. Você ganha se acertar 11, 12, 13, 14 ou 15 números.");
				System.out.println();
				System.out.println("digite a quantidade de numeros da aposta:");
				quant = scan.nextInt();
				
				while(quant < 15 || quant > 20) {
					System.out.println("Quantidade não autorizada. Escolha de 15 a 20 números.");
					quant = scan.nextInt();
				} 
				
				surpresa(26,quant);
				
				break;
				
			case 3:
				System.out.println("Jogo escolhido: Quina.");
				System.out.println("Escolha de 5 a 15 números. Ganhe com 5, 4, 3 ou 2 acertos. São seis sorteios semanais e seis chances de ganhar.");
				System.out.println();
				System.out.println("digite a quantidade de numeros da aposta:");
				quant = scan.nextInt();
				
				while(quant < 5 || quant > 15) {
					System.out.println("Quantidade não autorizada. Escolha de 5 a 15 números.");
					quant = scan.nextInt();
				}
				
				surpresa(81,quant);
				
				break;
				
			case 4:
				System.out.println("Jogo escolhido: Lotomania.");
				System.out.println("Marque o máximo de 50 números na sua aposta. Você ganha ao acertar 15, 16, 17, 18, 19 ou 20 números. \r\n"
						+ "Ou pode ganhar se não acertar nenhum dos números sorteados.");
				System.out.println();
				System.out.println("digite a quantidade de numeros da aposta:");
				quant = scan.nextInt();
				
				while(quant > 50) {
					System.out.println("Quantidade não autorizada. Escolha  até 50 números.");
					quant = scan.nextInt();
				} 
				
				surpresa(100,quant);
				
				break;
				
			
			case 5:
				System.out.println("Jogo escolhido: Dupla Sena.");
				System.out.println("Marque de 6 a 15 números. Você ganha se acertar 3, 4, 5 ou 6 números em qualquer um dos dois sorteios. ");
				System.out.println();
				System.out.println("digite a quantidade de numeros da aposta:");
				quant = scan.nextInt();
				
				while(quant < 6 || quant > 15) {
					System.out.println("Quantidade não autorizada. Escolha de 6 a 15 números.");
					quant = scan.nextInt();
				} 
				
				surpresa(51,quant);
				
				break;
				
			case 6:
				System.out.println("Jogo escolhido: Dia de Sorte.");
				System.out.println("Escolha de 7 a 15 números dos 31 disponíveis. Ganhe com 4, 5, 6 ou 7 acertos. ");
				System.out.println();
				System.out.println("digite a quantidade de numeros da aposta:");
				quant = scan.nextInt();
				
				while(quant < 7 || quant > 15) {
					System.out.println("Quantidade não autorizada. Escolha de 7 a 15 números.");
					quant = scan.nextInt();
				} 
				
				surpresa(32,quant);
				
				break;
				
			default:
	            System.out.println("Opção inválida.");
				
			}
			
		}while(jogo !=0);
		
	}

}