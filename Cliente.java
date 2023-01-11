package POO;

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
