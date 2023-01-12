package POO;

public class ExerciciosPolimorfismoeHeranca {

	public static void main(String[] args) {
	
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
		// Pessoa Física
		
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
		
		//Teste Pessoa Física
		
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
		
		//Pessoa Jurídica
		
		public class PessoaJuridica extends Cliente {
			private long cnpj;
				
				public PessoaJuridica(String nomeCompleto, String endereço, String dataNasc, int telefone,String email, long cnpj) {
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
		
		//Teste Pessoa Jurídica
		
		public class TestePessoaJuridica {

			public static void main(String[] args) {
				
				//Instanciando um objeto da classe Cliente
						PessoaJuridica pessju = new PessoaJuridica("Teresa Andrade ME","Rua Gastao Vidigal, 100","12.04.1981",1198151101,"teresaa@teresa.com.br",1500000015L);
							pessju.imprimirInf();
							
							System.out.println("\nAlteração do Endereço da Cliente");
							pessju.setEndereço("Rua Jose Bonifacio,330");
							pessju.imprimirInf();
							
							System.out.println("\nAlateração do Telefone da Cliente");
							pessju.setTelefone(1193501200);
							pessju.imprimirInf();
							
							System.out.println("\nAlteração do E-mail da Cliente");
							pessju.setEmail("teresa@andrade.com.br");
							pessju.imprimirInf();
