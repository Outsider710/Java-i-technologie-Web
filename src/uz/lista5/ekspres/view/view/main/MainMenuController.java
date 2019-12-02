package uz.lista5.ekspres.view.view.main;

import uz.lista5.ekspres.core.Controller;
import uz.lista5.ekspres.core.UserException;
import uz.lista5.ekspres.core.UserExceptionInfo;
import uz.lista5.ekspres.view.model.enums.MenuOptions;
import java.util.Scanner;

public class MainMenuController implements Controller {

    private Scanner scanner = new Scanner(System.in);

    public void selectOption() throws Exception {
        int selectedOption = scanner.nextInt();
        if (selectedOption > 6 || selectedOption < 1) {
            throw new UserException(UserExceptionInfo.getInstance().WRONG_SELECTION);
        }
        clearScreen();
        onOptionSelect(selectedOption);
    }

    private void onOptionSelect(int selectedOption) {
        MenuOptions.getFromId(selectedOption).getView();
    }


    @Override
    public void clearScreen() {
        for (int i = 0; i < 10; i++)
            System.out.println("");
    }
}
