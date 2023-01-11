package POO;

public class Farmacia {

	//Declaração dos atributos da classe 
		private String nomeFarmacia1;
		private String endereco;
		private String estado;
		private String tipo;
		private int unidade;
		
		//Declarar o método construtor	
		
		public Farmacia(String nomeFarmacia1, String endereco, String estado, String tipo, int unidade) {
			super();
			this.nomeFarmacia1 = nomeFarmacia1;
			this.endereco = endereco;
			this.estado = estado;
			this.tipo = tipo;
			this.unidade = unidade;
		}

		//declaração dos demais métodos get/set
		public String getNomeFarmacia() {
			return nomeFarmacia1;
		}

		public void setNomeFarmacia(String nomeFarmacia) {
			this.nomeFarmacia1 = nomeFarmacia;
		}

		public String getEndereco() {
			return endereco;
		}

		public void setEndereco(String endereco) {
			this.endereco = endereco;
		}

		public String getEstado() {
			return estado;
		}

		public void setEstado(String estado) {
			this.estado = estado;
		}

		public String getTipo() {
			return tipo;
		}

		public void setTipo(String tipo) {
			this.tipo = tipo;
		}

		public int getUnidade() {
			return unidade;
		}

		public void setUnidade(int unidade) {
			this.unidade = unidade;
		}
		
		// Método sem retorno (void) para imprimir todas as informação da Farmacia através do System.out.println
		
		public void imprimirInf(){
			System.out.println("Nome: "+nomeFarmacia1+"\nEndereco: "+endereco+"\nEstado: "+estado+"\nTipo: "+tipo+"\nUnidade: "+unidade);
		}
}
		

