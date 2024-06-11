package Model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NumberModel {
    private List<Integer> numbers;

    public NumberModel() {
        numbers = new ArrayList<>();
        // Adicionando 10 números à lista
        for (int i = 1; i <= 10; i++) {
            numbers.add(i * 2);
        }
        // Ordenando a lista para a busca binária
        Collections.sort(numbers);
    }

    public List<Integer> getNumbers() {
        return numbers;
    }
}