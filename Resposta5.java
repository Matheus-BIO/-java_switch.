import java.util.Scanner;

public class Resposta5 {

	public static void main(String[] args) {
	
	Scanner leitor= new Scanner(System.in);
	
	int cod;
	float preco=0;
	float a_vista,total;
	
	System.out.println("Ol� Cliente");
	System.out.println("Digite a forma de pagamento:");
	System.out.println("------------------------FORMAS DE PAGAMENTO-----------------------");
	System.out.println("1- � vista em dinheiro ou cheque, com 10% de desconto ");
	System.out.println("2- � vista com cart�o de cr�dito, com 5% de desconto ");
	System.out.println("3- Em 2 vezes, pre�o normal de etiqueta sem juros");
	System.out.println("4- Em 3 vezes, pre�o de etiqueta com acr�scimo de 10% ");
	System.out.println();
	cod= leitor.nextInt();
	
	System.out.println("Digite o valor da compra:");
	preco= leitor.nextInt();
	
	
	
	
	switch(cod){
	
	case 1:
		
		a_vista= preco*10/100;
		total= preco-a_vista;
		System.out.println("O valor com desconto � de: "+total);
		System.out.println("Parabens pela compra!!!");
		break;
		
	case 2:
		
		a_vista=preco*5/100;
		total= preco-a_vista;
		System.out.println("O valor com desconto � de: "+total);
		System.out.println("Parabens pela compra!!!");
		break;
		
	case 3:
		total= preco/2;
		System.out.println("O valor �: "+total);
		System.out.println("Parabens pela compra!!!");
		break;
	
	
	case 4:
		total= (preco/3)+10/100;
		System.out.println("O valor �: "+total);
		System.out.println("Parabens pela compra!!!");
		break;
	
	
	
	
	
	
	
	
	
	
	
	}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
