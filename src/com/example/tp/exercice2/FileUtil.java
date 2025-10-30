package com.example.tp.exercice2;

import java.io.*;
import java.util.*;

import com.example.tp.exercice4.LoggerUtil;


public class FileUtil {


	public static List<Integer> readNumbers(String path) {
		List<Integer> list = new ArrayList<>();


		try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
			String line;
			// Parcours ligne par ligne jusqu’à la fin du fichier
			while ((line = reader.readLine()) != null) {
				line = line.trim(); // suppression des espaces en début/fin
				if (line.isEmpty())
					continue;

				
				list.add(Integer.parseInt(line));
			}

		} catch (IOException e) {
			
			System.err.println("I/O error: " + e.getMessage());

		} catch (NumberFormatException e) {
			
			// Gestion des lignes non convertibles en entier
			
			System.err.println("Format invalide dans le fichier: " + e.getMessage());
			LoggerUtil.log(e);
		}

		// Retourne la liste (peut être partiellement remplie)
		return list;
	}
}
