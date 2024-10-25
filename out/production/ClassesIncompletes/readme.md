```markdown
# Module: Programmation orientée objet (JAVA)

## Application: Gestion des exceptions

### Objectifs
- Définir ce qu'est une exception et pourquoi elle se produit.
- Expliquer les avantages de l'utilisation de la gestion des exceptions en Java.
- Différencier les exceptions capturées et non-capturées.
- Écrire une routine simple de gestion des exceptions en utilisant les blocs `try-catch` et `try-finally`.
- Écrire des méthodes qui utilisent les déclarations `throws` pour la gestion des exceptions.

---

## Activité 1: La génération des exceptions

### Exemples de cas d'exception

**1er cas:**

```java
public class SuperHotel {
    static int x[];

    public void reserver() {
        x[0] = 1;
    }

    public static void main(String args[]) {
        SuperHotel s = new SuperHotel();
        s.reserver();
    }
}
```

**2ème cas:**
> NB: Testez le cas si l’utilisateur saisit `0`.

```java
import java.util.Scanner;

public class DivisionException {
    static int x = 20;
    static int y;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter un entier:");
        y = scanner.nextInt();
        System.out.println(x / y);
    }
}
```

**3ème cas:**

```java
public class AppelMethod {
    public void method1() {
        this.method2();
    }

    public void method2() {
        this.method1();
    }

    public static void main(String[] args) {
        AppelMethod appel = new AppelMethod();
        appel.method1();
    }
}
```

**4ème cas:**

```java
public class AddTable {
    public static void main(String[] args) {
        int[] array = new int[3];
        for (int i = 0; i < 4; ++i) {
            array[i] = i;
        }
        System.out.println(array);
    }
}
```

2) Proposez une solution pour résoudre ces problèmes (voir le cours).

---

## Activité 2: La gestion des exceptions en utilisant le bloc `try-catch`

**Classe : `TestExceptions.java`**
1. Essayez de compiler le fichier `TestExceptions.java`. Que remarquez-vous ?
2. Modifiez `TestExceptions.java` pour gérer l’exception `IOException` avec un bloc `try-catch` au lieu de propager l'exception. Lorsqu'une exception est déclenchée, affichez le message suivant : “The file you have requested cannot be found.”
3. Pourquoi le programme compile-t-il maintenant lorsque l'on gère une des exceptions listées ?
4. Exécutez le programme et observez les différences par rapport aux exceptions traitées dans l’**Activité 1**.

**Classe : `MultiCatch.java`**
5. Corrigez la classe `MultiCatch.java`.

---

## Activité 3: La Propagation des exceptions en utilisant `throws`

6. Modifiez la déclaration de la méthode `main()` dans `TestExceptions.java` pour propager l’exception `IOException` en utilisant `throws`.
7. Compilez et exécutez le programme.

---

## Activité 4: Le bloc `finally`

**Classe : `TestFinally.java`**
1. Compilez et exécutez le fichier `TestFinally.java`.
2. Modifiez `TestFinally.java` pour gérer l'exception en utilisant un bloc `try-catch` dans la méthode `main()`, suivant les instructions mentionnées en commentaire.

---
```