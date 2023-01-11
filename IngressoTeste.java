package POO;

public class IngressoTeste {

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
