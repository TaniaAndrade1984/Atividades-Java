programa
{
	
	funcao inicio()
	{
		inteiro idade,genero,categoria,qtdBack=0,qtdMFront=0,qtdHMobile40=0,qtdMFullStack30=0
		caracter op='S'

		enquanto(op == 'S')
		{
			escreva("\nEntre com a sua idade: ")
			leia(idade)
			escreva("\nEntre com o seu genero: ")
			escreva("\n1- Masculino\t 2- Feminino\t 3-Outros")
			leia(genero)
			escreva("\nEntre com a sua categoria: ")
			escreva("\n1- Backend\t 2- Frontend\t 3- Mobile\t 4- FullStack")
			leia(categoria)

			se(categoria == 1)
			{
				qtdBack++
			}
			se(genero == 2 e categoria == 2)
			{
				qtdMFront++
			}
			se(genero == 1 e categoria == 3 e idade>40)
			{
				qtdHMobile40++
			}
			se(genero == 2 e categoria == 4 e idade<30)
			{
				qtdMFullStack30++
			}

			escreva("\nDeseja cadastrar um novo colaboradore: (S-Sim e N-Não)? ")
			leia(op)
		}
		escreva("\nTemos: ",qtdBack," pessoas desenvolvedoras Backend")
		escreva("\nTemos: ",qtdMFront," mulheres desenvolvedoras FrontEnd")
		escreva("\nTemos: ",qtdHMobile40," homens desenvolvedores Mobile maiores de 40 anos")
		escreva("\nTemos: ",qtdMFullStack30," mulheres desenvolvedoras FullStack menores de 30 anos")

		
	}
}


/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1147; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */