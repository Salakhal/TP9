package com.example.tp.exercice2;

import java.util.*;



public class MainFile {
	public static void main(String[] args) {
		// Appel de la méthode de lecture sur "numbers.txt"
		List<Integer> nums = FileUtil.readNumbers("numbers.txt");

		// Affichage simple du résultat
		System.out.println("Nombres lus : " + nums);
	}
}
