package POO;

public class ExerciciosPOO1e5 {

	public class Cliente {
		
		//Declaração dos atributos da classe 
		private String nomeCompleto;
		private String endereco;
		private String dataNasc;
		private int telefone;
		private String email;
		
		//Declarar o método construtor	
		public Cliente(String nomeCompleto, String endereco, String dataNasc, int telefone, String email) {
			
			this.nomeCompleto = nomeCompleto;
			this.endereco = endereco;
			this.dataNasc = dataNasc;
			this.telefone = telefone;
			this.email = email;
		}
		
		//declaração dos demais métodos get/set
		public String getNomeCompleto() {
			return nomeCompleto;
		}

		public void setNomeCompleto(String nomeCompleto) {
			this.nomeCompleto = nomeCompleto;
		}

		public String getEndereco() {
			return endereco;
		}

		public void setEndereço(String endereco) {
			this.endereco = endereco;
		}

		public String getDataNasc() {
			return dataNasc;
		}

		public void setDataNasc(String dataNasc) {
			this.dataNasc = dataNasc;
		}

		public int getTelefone() {
			return telefone;
		}

		public void setTelefone(int telefone) {
			this.telefone = telefone;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
	}
		
		// Método sem retorno (void) para imprimir todas as informação do Cliente através do System.out.println
		
				public void imprimirInf(){
					System.out.println("Nome: "+nomeCompleto+"\nEndereco: "+endereco+"\nData Nacimento: "+dataNasc+"\nTelefone: "+telefone+"\nE-mail: "+email);
				}
	}

        // Cliente Teste

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
 
         //Exercício Class Ingresso

public class Ingresso {
	
	//Declaração dos atributos da classe 
	private String nome;
	private String data;
	private String lote1;
	private String compra;
	private int quantidade;
	
	//Declarar o método construtor
	public Ingresso(String nome, String data, String lote1, String compra, int quantidade) {
		this.nome = nome;
		this.data = data;
		this.lote1 = lote1;
		this.compra = compra;
		this.quantidade = quantidade;
	}
	//declaração dos demais métodos get/set

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getLote1() {
		return lote1;
	}

	public void setLote1(String lote1) {
		this.lote1 = lote1;
	}

	public String getCompra() {
		return compra;
	}

	public void setCompra(String compra) {
		this.compra = compra;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	// Método sem retorno (void) para imprimir todas as informação do ingresso através do System.out.println
	
	public void imprimirInf(){
		System.out.println("Nome: "+nome+" \nData: "+data+"\nLote: "+lote1+"\nCompra: "+compra+"\nQuantidade de Ingressos: "+quantidade);
		  }
}

     // Ingresso Teste

	public static void main(String[] args) {
		
		//Instanciando um objeto da classe Ingresso
		
		Ingresso ingre = new Ingresso("Tânia Andrade","19.04.2023","Camarote","Cartão",5);
		ingre.imprimirInf();
		
		System.out.println("\nTranferencia de Ingressos");
		ingre.setNome("Maria Andrade");
		ingre.imprimirInf();
		
		System.out.println("\nAlteçao da data do Evento");
		ingre.setData("21.05.2023");
		ingre.imprimirInf();
		}
}



