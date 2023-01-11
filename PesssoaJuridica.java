package POO;

public class PesssoaJuridica {
private long cnpj;
	
	public PessoaJuridica(String nomeCompleto, String endereço, String dataNasc, int telefone,String email,int cnpj) {
		super(nomeCompleto, endereço, dataNasc, telefone, email);
		this.cnpj = cnpj;
	}
	
	public long getCnpj() {
		return cnpj;
	}

	public void setCnpj(long cnpj) {
		this.cnpj = cnpj;
	}

	public void informacoes() {
		 System.out.println("\nNome Completo: "+getNomeCompleto()+"\nEndereço do Cliente: "+getEndereco()+"\nData de Nacimento do Cliente: "+getDataNasc()+
				 "\nTelefone do Cliente: "+getTelefone()+"\nE-mail do Cliente: "+getEmail()+cnpj);
	}
}
	
	


