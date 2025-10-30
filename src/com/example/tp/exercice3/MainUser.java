package com.example.tp.exercice3;

import com.example.tp.exercice4.LoggerUtil;


public class MainUser {
	public static void main(String[] args) {
		// Tableau de test avec différents cas
		User[] users = { new User("Alice", 30), // valide
				new User("", 25), // nom vide → invalide
				new User("Bob", 16) // âge < 18 → invalide
		};

		// Parcourir chaque utilisateur et tenter la validation
		for (User u : users) {
			try {
				u.validate(); // peut lancer InvalidUserException
				System.out.println("Utilisateur validé : " + u);
			} catch (InvalidUserException e) {
				// Gestion de l'erreur de validation
				System.err.println("Validation échouée : " + e.getMessage());
				
				LoggerUtil.log(e);
			}
		}
	}
}

