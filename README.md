#  TP9  : Exceptions

##  Objectifs
Ce TP a pour but d’apprendre à :
- Définir et utiliser des **exceptions personnalisées**.
- Gérer les erreurs avec des **blocs `try-catch-finally`**.
- Implémenter la **journalisation (logging)** des erreurs dans un fichier `error.log`.

---

# Structure du projet
 ```
TP9_Exceptions/
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
  
