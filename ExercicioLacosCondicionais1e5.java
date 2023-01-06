package ExerciciosJava;

import java.util.Scanner;

public class ExercicioLacosCondicionais1e5 {

	public static void main(String[] args) {
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
	            
		//Início do exercício 5
			
	
		String palavra1,palavra2,palavra3;
				
		System.out.println("\nEntre com a primeira palavra: ");
			
		palavra1 = leia.next();
		System.out.println("\nEntre com a segunda palavra: ");
		palavra2 = leia.next();
		System.out.println("\nEntre com a terceira palavra: ");
		palavra3 = leia.next();
				
		if (palavra1.equalsIgnoreCase("vertebrado")) {
			if (palavra2.equalsIgnoreCase("ave")) {
				if (palavra3.equalsIgnoreCase("carnivoro")) {
					System.out.println("\nÉ uma aguia");
				} else {
					System.out.println("\nÉ uma pomba");
				}
			} 
			else 
			{
				if (palavra3.equalsIgnoreCase("onivoro")) {
					System.out.println("\nÉ um ser humano");
				} else {
					System.out.println("\nÉ uma vaca");
				}
			}
		} 
		else 
		{
			if (palavra2.equalsIgnoreCase("inseto")) {
				if (palavra3.equalsIgnoreCase("hematofago")) {
					System.out.println("\nÉ uma pulga");
				} else {
					System.out.println("\nÉ uma lagarta");
				}
			} else {
				if (palavra3.equalsIgnoreCase("hematofago")) {
					System.out.println("É uma sanguessuga");
				} else {
					System.out.println("É uma minhoca");
				}
			}
		}
	}

}
