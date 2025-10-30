package com.example.tp.exercice4;



import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class LoggerUtil {

    private static final String LOG_FILE = "error.log";

    public static void log(Exception e) {
        try (FileWriter fw = new FileWriter(LOG_FILE, true);
             PrintWriter pw = new PrintWriter(fw)) {

            pw.println("=== ERREUR ===");
            pw.println("Message : " + e.getMessage());
            e.printStackTrace(pw);
            pw.println(); // ligne vide pour séparer les entrées

        } catch (IOException ioEx) {
            System.err.println("Impossible d'écrire dans le fichier de log : " + ioEx.getMessage());
        }
    }
}
