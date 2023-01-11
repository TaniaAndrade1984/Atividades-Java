package POO;

public class PessoaFisica extends Cliente {
	private String cpf;
	
	public PessoaFisica(String nomeCompleto, String endereço, String dataNasc, int telefone,String email, String cpf) {
		super(nomeCompleto, endereço, dataNasc, telefone, email);
		this.cpf = cpf;
	}
	
	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public void informacoes() {
		 System.out.println("\nNome Completo: "+getNomeCompleto()+"\nEndereço do Cliente: "+getEndereco()+"\nData de Nacimento do Cliente: "+getDataNasc()+
				 "\nTelefone do Cliente: "+getTelefone()+"\nE-mail do Cliente: "+getEmail()+cpf);
	}
}
		