package POO;

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

