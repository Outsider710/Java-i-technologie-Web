package uz.lista5.ekspres.view.presentation.menuoptions.prepare.coffee.Black;

import uz.lista5.ekspres.core.Controller;
import uz.lista5.ekspres.core.UserException;
import uz.lista5.ekspres.core.UserExceptionInfo;

import java.util.Scanner;

public class BlackCoffeeController implements Controller {

    private Scanner scanner = new Scanner(System.in);

    private int sugarAmount;
    private int cupSize;

     public void selectSugarAmount() throws Exception {
        sugarAmount = scanner.nextInt();
        if (sugarAmount > 5 || sugarAmount < 0) {
            throw new UserException(UserExceptionInfo.getInstance().WRONG_SELECTION);
        }
    }

    @Override
    public void clearScreen() {

    }

    public void selectCupSize() throws Exception {
        cupSize = scanner.nextInt();
        if (cupSize > 5 || cupSize < 1) {
            throw new UserException(UserExceptionInfo.getInstance().WRONG_SELECTION);
        }
    }
}
