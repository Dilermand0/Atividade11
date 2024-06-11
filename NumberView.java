package View;

import java.util.List;

public class NumberView {
    public void displayNumbers(List<Integer> numbers) {
        System.out.println("Lista de números:");
        for (Integer number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();
    }

    public void displayResult(int number, int index) {
        if (index != -1) {
            System.out.println("O número " + number + " está na posição " + index + " da lista.");
        } else {
            System.out.println("O número " + number + " não foi encontrado na lista.");
        }
    }
}
