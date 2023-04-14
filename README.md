# GL-et-Preuve

#############################################

Réponse aux questions

#############################################

# Exercice 3.1

1. Cette classe ne respecte pas SRP car elle a deux réponsabilité. En effet, cette classe calcul le salaire et affiche les coordonnees.

2. Si la méthode de calcul du salaire change cela aura un impact sur la méthode afficheCoordonnees qui n'est pas concerné.

3. Même raison que la question 2, cela impactera la methode calculSalaire sans raison.

4. Voir le code.

# Exercice 3.3

1. Cette solution ne respecte pas LSP car quand on appelle la méthode avance sur tous les types de Robots, on ne peut pas substituer un Robot par un RobotStatique car celui-ci renvoie une UnsupportedOperationException.

# Exercice 3.4

1. La méthode SimplePrinter viole ISP car elle dépend inutilement de m'interface Printer, en effet SimplePrinter n'a en réalité que besoin de la méthode print de l'interface. On est donc obligé de renvoyer une expection pour les autres implémentation.

2. On doit aussi changer l'implémentation de la méthode fax dans SimplePrinter.

3. voir code

# Exercice 3.5


1. Ce code ne respecte pas DIP car la classe UneClasseMetier dépend d'une low-level classe Sys.

2. voir code