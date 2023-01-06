package ExerciciosJava;

import java.util.Scanner;

public class Exercicio3ArrayMatriz {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int num[][] = {{1,2,3},{4,5,6},{7,8,9}},linha,coluna,SomaPrincipal=0,somaSecundaria=0;
		
		System.out.println("Elementos da Diagonal Principal: ");
		for(linha=0;linha<3;linha++){
			System.out.println(num[linha][linha]);
			SomaPrincipal+=num[linha][3-1-linha];
		}
		System.out.println("Elementos da diagonal secundaria");
		for(linha=0;linha<3;linha++){
			System.out.println(num[linha][3-1-linha]);
			somaSecundaria+=num[linha][3-1-linha];
		}
		System.out.printf("\nSoma dos Elementos da Diagonal Principal: %d",SomaPrincipal);
		System.out.printf("\nSoma dos Elementos da Diagonal Secundaria: %d",somaSecundaria);
		
		
	}
}
				
		
		
			
		

	