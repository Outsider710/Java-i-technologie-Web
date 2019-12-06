package uz.lista5.ekspres.view.view.menuOptions.prepare.coffee;

import uz.lista5.ekspres.core.Controller;
import uz.lista5.ekspres.core.UserException;
import uz.lista5.ekspres.core.UserExceptionInfo;
import uz.lista5.ekspres.view.model.enums.CoffeeKind;

import java.util.Scanner;

public class PrepareCoffeeController implements Controller {

    private Scanner scanner = new Scanner(System.in);

    public void selectOption() throws Exception {
        int selectedOption = scanner.nextInt();
        if (selectedOption < 1 || selectedOption > 5)
            throw new UserException(UserExceptionInfo.getInstance().WRONG_SELECTION);
        initOption(selectedOption);
    }

    private void initOption(int selectedOption) throws Exception {
        CoffeeKind.values()[selectedOption - 1].getView();
    }

    @Override
    public void clearScreen() {

    }
}
