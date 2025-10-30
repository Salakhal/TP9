#  TP9  : Exceptions

##  Objectifs
Ce TP a pour but d’apprendre à :
- Définir et utiliser des **exceptions personnalisées**.
- Gérer les erreurs avec des **blocs `try-catch-finally`**.
- Implémenter la **journalisation (logging)** des erreurs dans un fichier `error.log`.

---

# Structure du projet
 ```
TP9/
│
├── src/com/example/tp/
│   ├── exercice1/
│   │   ├── Calculator.java
│   │   └── MainCalc.java
│   │
│   ├── exercice2/
│   │   ├── FileUtil.java
│   │   └── MainFile.java
│   │
│   ├── exercice3/
│   │   ├── InvalidUserException.java
│   │   ├── User.java
│   │   └── MainUser.java
│   │
│   └── exercice4/
│       └── LoggerUtil.java
│
├── error.log
└── numbers.txt

```

##  Contenu du TP

###  Exercice 1 – Division sécurisée
**Fichiers :**
- `Calculator.java`
- `MainCalc.java`

**Objectif :**  
Créer un programme qui effectue une division tout en gérant la division par zéro.

**Concepts utilisés :**
- `try / catch`
- `ArithmeticException`

---

## Sortie attendue :
```
10 / 2 = 5.0
Erreur de calcul : Division par zéro impossible
Fin du calcul.
```

## Exemple d’exécution (image)

Voici un exemple de l'exécution du programme (screenshot) :

<img width="645" height="191" alt="image" src="https://github.com/user-attachments/assets/154a0e82-7783-4f89-83be-4f45fa0104ec" />


###  Exercice 2 – Lecture de fichier
**Fichiers :**
- `FileUtil.java`
- `MainFile.java`
- `numbers.txt`

**Objectif :**  
Lire un fichier texte (`numbers.txt`) et afficher son contenu.  
Gérer le cas où le fichier est introuvable à l’aide d’exceptions.

**Concepts utilisés :**
- `FileReader`
- `BufferedReader`
- `IOException`
- `FileNotFoundException`


## Sortie attendue :

```
Nombres lus : [42, 17, 99]
```
## Exemple d’exécution (image)

Voici un exemple de l'exécution du programme (screenshot) :

<img width="497" height="109" alt="image" src="https://github.com/user-attachments/assets/fc59f2b5-effa-4177-b3cf-ab3d1e31131a" />

---

###  Exercice 3 – Validation d’utilisateur
**Fichiers :**
- `User.java`
- `InvalidUserException.java`
- `MainUser.java`

**Objectif :**  
Créer une exception personnalisée pour valider les données d’un utilisateur.

**Règles de validation :**
- Le nom ne doit pas être vide.  
- L’âge doit être supérieur à 0.

**Concepts utilisés :**
- Création d’une classe d’exception :

  ```java
  public class InvalidUserException extends Exception {
      public InvalidUserException(String message) {
          super(message);
      }
  }
  ```

  
## Sortie attendue :

```
Utilisateur validé : User[nom=Alice, age=30]
Validation échouée : Nom d'utilisateur invalide
Validation échouée : Utilisateur mineur (âge=16)

```
## Exemple d’exécution (image)

Voici un exemple de l'exécution du programme (screenshot) :

<img width="636" height="133" alt="image" src="https://github.com/user-attachments/assets/7994b53f-8034-449e-acd8-819671267ed3" />



##  Exercice 4 – Journalisation des erreurs

### Objectif
Créer une classe utilitaire qui enregistre les erreurs dans un fichier **`error.log`** au lieu de simplement les afficher dans la console.

---

###  Fichier concerné
- `LoggerUtil.java`

---

###  Description

Dans cet exercice, on remplace les affichages d’erreurs via `System.err.println()` par une **écriture dans un fichier log**.  
Chaque erreur détectée est sauvegardée dans **`error.log`**, accompagnée de la date et l’heure de l’occurrence.

---

### Exemple de contenu du fichier **`error.log`** .

```
=== ERREUR ===
Message : Nom d'utilisateur invalide
com.example.tp.exercice3.InvalidUserException: Nom d'utilisateur invalide
	at com.example.tp.exercice3.User.validate(User.java:29)
	at com.example.tp.exercice3.MainUser.main(MainUser.java:19)

=== ERREUR ===
Message : Utilisateur mineur (âge=16)
com.example.tp.exercice3.InvalidUserException: Utilisateur mineur (âge=16)
	at com.example.tp.exercice3.User.validate(User.java:33)
	at com.example.tp.exercice3.MainUser.main(MainUser.java:19)

```
## Exemple d’exécution (image)

Voici un exemple de l'exécution du programme (screenshot) :

<img width="1044" height="309" alt="image" src="https://github.com/user-attachments/assets/5cd266e1-99d0-4dd9-9afc-6944d998f74b" />


  
   # Conclusion
  
Ce TP a permis de comprendre :

  - La gestion des erreurs en Java.

  - La création d’exceptions personnalisées.

  - L’écriture sécurisée des erreurs dans un fichier de log.
