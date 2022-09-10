package com.calculadora_basica.main;

import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Double numbers[] = new Double[3];
		Scanner in = new Scanner(System.in);
			int operation = 0;
		System.out.println("-- Calculadora Basica --");
		System.out.println("Operacao: \n\n 1: +  |  2: -  |  3: *  |  4: /");
		operation = in.nextInt();
		
		System.out.println("Digite o primeiro numero: ");
		numbers[0] = in.nextDouble();
		
		System.out.println("Digite o segundo numero: ");
		numbers[1] = in.nextDouble();
		
		if(operation == 1)
			numbers[2] = sum(numbers[0], numbers[1]);
		if(operation == 2)
			numbers[2] = subtraction(numbers[0], numbers[1]);
		if(operation == 3)
			numbers[2] = multiplication(numbers[0], numbers[1]);
		if(operation == 4)
			numbers[2] = division(numbers[0], numbers[1]);
		System.out.println(NumberFormat.getInstance().format(numbers[2]));
	}
	
	public static Double sum(Double numberOne, Double numberTwo) {
		return numberOne + numberTwo;
	}
	
	public static Double subtraction(Double numberOne, Double numberTwo) {
		return numberOne - numberTwo;
	}
	
	public static Double multiplication(Double numberOne, Double numberTwo) {
		return numberOne * numberTwo;
	}
	
	public static Double division(Double numberOne, Double numberTwo) {
		return numberOne / numberTwo;
	}
}
