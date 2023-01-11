package POO;

public class TesteCliente {

	public static void main(String[] args) {
		
		//Instanciando um objeto da classe Cliente
	Cliente clien = new Cliente("Waldemir Matias","Rua das Araras,295","21.05.1976",1195207100, "tiomimi@tio.com");
		clien.imprimirInf();
		
		System.out.println("\nAlteração do Endereço do Cliente");
		clien.setEndereço("Rua João Geraldo, 25");
		clien.imprimirInf();
		
		System.out.println("\nAlateração do Telefone do Cliente");
		clien.setTelefone(1195211040);
		clien.imprimirInf();
		
		System.out.println("\nAlteração do E-mail do Cliente");
		clien.setEmail("wmcftv@tiomimi.com.br");
		clien.imprimirInf();
	}

}
