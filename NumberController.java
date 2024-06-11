package Controller;

import Model.NumberModel;
import View.NumberView;

import java.util.List;

public class NumberController {
    private NumberModel model;
    private NumberView view;

    public NumberController(NumberModel model, NumberView view) {
        this.model = model;
        this.view = view;
    }

    public void displayNumbers() {
        List<Integer> numbers = model.getNumbers();
        view.displayNumbers(numbers);
    }

    public int binarySearch(int number) {
        List<Integer> numbers = model.getNumbers();
        int left = 0;
        int right = numbers.size() - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (numbers.get(mid) == number) {
                return mid;
            }
            if (numbers.get(mid) < number) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

    public void searchNumber(int number) {
        int index = binarySearch(number);
        view.displayResult(number, index);
    }
}
