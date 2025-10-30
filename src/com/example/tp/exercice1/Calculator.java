package com.example.tp.exercice1;


public class Calculator {


	public double add(double a, double b) {
		// Aucun cas d'erreur ici ; simplement retourner la somme
		return a + b;
	}

	
	public double sub(double a, double b) {
		return a - b;
	}

	
	public double mul(double a, double b) {
		return a * b;
	
	 
	public double div(double a, double b) {
		// Vérification de la condition d'erreur : division par zéro
		if (b == 0) {
			
			throw new ArithmeticException("Division par zéro impossible");
		}
	
		return a / b;
	}
}
