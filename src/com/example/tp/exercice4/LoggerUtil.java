package com.example.tp.exercice4;



import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Classe utilitaire pour écrire les erreurs dans un fichier log.
 */
public class LoggerUtil {

    private static final String LOG_FILE = "error.log";

    /**
     * Écrit un message et le stack trace de l'exception dans le fichier log.
     * @param e exception à journaliser
     */
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
