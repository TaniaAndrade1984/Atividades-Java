package POO;

public class TestePessoaFisica {

	public static void main(String[] args) {
		
		//Instanciando um objeto da classe Cliente
		PessoaFisica test = new PessoaFisica("Tânia Andrade","Rua Amoreira, 215","19.04.1984",1193280356,"tania@tania.com.br","30112345699L");
			test.imprimirInf();
			
			System.out.println("\nAlteração do Endereço do Cliente");
			test.setEndereço("Rua da Videira, 35");
			test.imprimirInf();		
			
			System.out.println("\nAlateração do Telefone do Cliente");
			test.setTelefone(1195828040);
			test.imprimirInf();
			
			System.out.println("\nAlteração do E-mail do Cliente");
			test.setEmail("tania@andrade.com.br");
			test.imprimirInf();

	}

}
