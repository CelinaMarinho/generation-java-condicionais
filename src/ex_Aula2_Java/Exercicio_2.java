package ex_Aula2_Java;

import java.util.Scanner;

public class Exercicio_2 {

	public static void main(String[] args) {
		
		//Faça um programa que entre com três números e coloque em ordem crescente.
		
		 int num1,num2,num3;
		 Scanner entrada = new Scanner(System.in);
		 
		 System.out.println("Digite o primeiro número: \n");
		 num1 = entrada.nextInt();
		 
		 System.out.println("Digite o segundo número: \n");
		 num2 = entrada.nextInt();
		 
		 System.out.println("Digite o terceiro número: \n");
		 num3 = entrada.nextInt();
		 
		 if(num1 < num2 && num2 < num3) {			
				 System.out.println(num1+ ", "+num2+", "+num3);
			 }
		 else if(num2 < num3 && num3 < num1) {
			 System.out.println(num2 + ", "+num3+ ", "+ num1);
		 }
		 
		 else {
			 System.out.println(num3+","+num2+","+num1);
		 }
			 
		 System.out.println("Fim do Programa");
		     

	}

}
