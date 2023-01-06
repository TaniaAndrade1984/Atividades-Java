package ExerciciosJava;

import java.util.Scanner;

public class Exercicicos2e3ArrayVetoreMatriz {

	public static void main(String[] args) {
Scanner leia = new Scanner(System.in);
		
		int numero[] = new int[10];
		int x,somaNum=0;
		float mediaNum;
		
		for(x=0;x<10;x++) {
			System.out.println("\nEntre com um numero: ");
			numero[x] = leia.nextInt();
			somaNum += numero[x];
		}
		mediaNum = somaNum / 10;
		System.out.println("\nElemento de indice impar");
		for(x=0;x<10;x++) {
			if(x % 2 == 1) {
				System.out.println("\n"+numero[x]);		
			}		
		}
		System.out.println("\nElemento do vetor que são numeros pares");
		for(x=0;x<10;x++) {
			if(numero[x] % 2 == 0) {
				System.out.println("\n"+numero[x]);			
			}	
		}
		System.out.println("\nsoma de todos os elementos do meu Array: "+somaNum);
		System.out.println("\nMedia dos elementos Array: "+mediaNum);
	}


      //Exercicio 3 Array Matriz

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
       
       
  


	
