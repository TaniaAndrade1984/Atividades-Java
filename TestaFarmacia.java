package POO;

public class TestaFarmacia {

	public static void main(String[] args) {
		
		//Instanciando um objeto da classe Farmacia		
				Farmacia farm = new Farmacia("Drogaria SP","Rua Cesar Simoes,295","SP","FarmaPopular",120);
				farm.imprimirInf();
				
				System.out.println("\nMudanca de Nome");
				farm.setNomeFarmacia("Farma do Povo");
				farm.imprimirInf();
				
				System.out.println("\nAlteração do Estado da Farmacia");
				farm.setEstado("RJ");
				farm.imprimirInf();;			
				
				System.out.println("\nMudanca da Unidade");
				farm.setUnidade(200);
				farm.imprimirInf();
	}

}
