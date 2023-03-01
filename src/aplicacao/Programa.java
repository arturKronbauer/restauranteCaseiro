package aplicacao;

import java.util.Scanner;

import entidades.Restaurante;

public class Programa {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int cerveja;
		int refrigerante;
		float kg;
		int sobremesa;
		double total;
		int op;
		int qtdPessoas;
		System.out.println("*** Abertura da Mesa ***");
		Restaurante objMesa = new Restaurante();
		System.out.println("Informe o número da mesa: ");
		int mesa = sc.nextInt();
		System.out.println("Informe o número de pessoas inicialmente: ");
		qtdPessoas = sc.nextInt();
		objMesa.setQtdPessoas(qtdPessoas);
        do
        {  System.out.println("*** MENU ***");
           System.out.println("1 - Cerveja");
           System.out.println("2 - Refrigerante");
           System.out.println("3 - Comida");
           System.out.println("4 - Sobremesa");
           System.out.println("5 - Fim");
           op = sc.nextInt();
           switch (op) {
           		case 1: System.out.println("Informe o número de cervejas: ");
                   cerveja = sc.nextInt();
        	   	   objMesa.addCerveja(cerveja);
        	   	break;
           		case 2: System.out.println("Informe o número de refrigerantes: ");
           			refrigerante = sc.nextInt();
           			objMesa.addRefrigerante(refrigerante);
           		break;
           		case 3: System.out.println("Informe a quantidade de comida: ");
       				kg = sc.nextFloat();
       				objMesa.addKg(kg);
       			break;
           		case 4: System.out.println("Informe a quantidade de sobremesa: ");
   					sobremesa = sc.nextInt();
   					objMesa.addKg(sobremesa);
   				break;
           } 
        } while (op != 5);
        double totalPessoa = objMesa.calculaConta();
        System.out.println("Valor Total ="+objMesa.getTotal());
        System.out.println("Valor por pessoa ="+totalPessoa);
        sc.close();	
	}
}
