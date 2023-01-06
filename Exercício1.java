package ExerciciosJava;

import java.util.Scanner;

public class Exercício1 {
	public static void main (String[]args)
	{
		System.out.println("Digite um numero: ");
		Scanner leia = new Scanner(System.in);
		int numero = leia.nextInt(); 
		
		if (numero == 0)
		{
			System.out.println("\nO numero:" + numero + " é par"); 
		}
		else if (numero > 0)
		{
			if (numero % 2 == 0) 
			{
			System.out.println("\nO numero:" + numero + " é positivo e par");
			}
			else 
			{
			System.out.println("\nO numero:" + numero + " é positivo e impar");
			}
		}
			else 
			{
				if (numero % 2 != 1)
				{
			System.out.println("\nO numero:" + numero + " é negativo e par");
				}
				else
				{
			System.out.println("\nO número: " + numero + " é negativo e ímpar");
	            }

	        }

	    }
}
				
			
		
		
	


