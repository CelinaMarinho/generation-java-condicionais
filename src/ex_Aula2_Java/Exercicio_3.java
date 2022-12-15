package ex_Aula2_Java;

import java.util.Scanner;

public class Exercicio_3 {

	public static void main(String[] args) {
		//Faça um programa que receba a idade de uma pessoa
		//e mostre na saída em qual categoria ela se encontra:
		//10-14 infantil
		//15-17 juvenil
		//18-25 adulto
		
		int idade;		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite a idade da pessoa competidora: ");		
		idade = entrada.nextInt();
		
		if(idade>= 10 && idade <=14) {
			System.out.println("A categoria é infantil.");			
		}
		
		else if(idade>=15 && idade <=17) {
			System.out.println("A categoria é juvenil.");
		}
		
		else if (idade>=18 && idade<=25) {
			System.out.println("A categoria é adulto");
		}
		
		else {
			System.out.println("A pessoa competidora não pertence à nenhuma categoria");
		}
		
		System.out.println("Fim do programa");

	}

}
