import Controller.NumberController;
import Model.NumberModel;
import View.NumberView;

public class Main {
    public static void main(String[] args) {
        NumberModel model = new NumberModel();
        NumberView view = new NumberView();
        NumberController controller = new NumberController(model, view);

        // Exibindo os números armazenados
        controller.displayNumbers();

        // Buscando um número específico (exemplo: 8)
        int numberToFind = 8;
        controller.searchNumber(numberToFind);
    }
}
