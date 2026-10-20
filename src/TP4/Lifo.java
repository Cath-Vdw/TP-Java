package TP4;

/**
 * Simulation d'une pile First-in-last-out
 */

public class Lifo {

    // Déclaration d'un tableau de taille fixe
    private int[] stack = new int[5];

    // Déclaration de la variable représentant la position du dernier élément ajouté
    private int top = -1;

    // Méthode permettant de vérifier si la pile est vide
    public boolean isEmpty() {
        return top == -1; // retourne true si top est à -1
    }

    // Méthode permettant de vérifier si la pile est pleine
    public boolean isFull() {
        return top == stack.length - 1; // retourne true si top est à la taille du tableau -1
    }

    // Méthode permettant d'ajouter un élément au sommet de la pile si elle n'est pas pleine
    // et d'afficher un message d'erreur dans le cas contraire
    public void push(int value) {
        if (isFull()) System.out.println("La pile est pleine. Impossible d'ajouter un élément.");
        else {
            top++;
            stack[top] = value;
            System.out.println("Ajouté : " + value);
        }
    }

    // Méthode permettant de retirer un élément au sommet de la pile et de le retourner
    // ou d'afficher un message si la pile est vide
    public int pop() {
        if (isEmpty()) {
            System.out.println("La pile est vide. Rien à retirer.");
            return -1;
        } else {
            int value = stack[top];
            top--;
            System.out.println("Retiré : " + value);
            return value;
        }
    }

    // Méthode permettant d'afficher toute la pile
    public void display() {
        System.out.println("Affichage de la pile en partant du sommet: ");
        for (int i = top; i >= 0; i--) {
            System.out.println(stack[i]);
        }
    }

    // Simulation d'une pile
    public static void main(String[] args) {

        Lifo pile = new Lifo();

        pile.push(10);
        pile.display();

        pile.push(20);
        pile.display();

        pile.push(30);
        pile.display();

        pile.pop();
        pile.display();

        pile.push(40);
        pile.display();

        pile.push(50);
        pile.display();
    }

}
