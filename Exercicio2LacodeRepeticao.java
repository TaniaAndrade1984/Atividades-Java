package ExerciciosJava;

import java.util.Scanner;

public class Exercicio2LacodeRepeticao {
	public static void main(String[] args) {

    Scanner leia = new Scanner(System.in);

    int num,somaPar=0,somaImpar=0,x;


    for (x=1;x<=10;x++)
    {
        System.out.println("\nEntre com um número: ");
        num = leia.nextInt();
        if (num % 2 == 0)
        {
            somaPar++; 
        }
        else

            {
                somaImpar++;
            }

        }
        System.out.printf("\nTemos: "+somaPar+" números pares...");
        System.out.printf ("\nTemos: "+somaImpar+" números ímpares...");
    }
}