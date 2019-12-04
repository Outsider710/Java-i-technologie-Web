package uz.lista5.ekspres.view.view.menuOptions.prepare;

import uz.lista5.ekspres.core.Controller;
import uz.lista5.ekspres.core.UserException;
import uz.lista5.ekspres.core.UserExceptionInfo;

import java.util.Scanner;

class PrepareMenuController implements Controller {

    private Scanner scanner = new Scanner(System.in);

    void selectOption() throws Exception {
        int selectedOption = scanner.nextInt();
        if (selectedOption > 3 || selectedOption < 1) {
            throw new UserException(UserExceptionInfo.getInstance().WRONG_SELECTION);
        }
        clearScreen();
        onOptionSelect(selectedOption);
    }

    private void onOptionSelect(int selectedOption) {
        //DrinkKind.getFromId(selectedOption).getView();
    }


    @Override
    public void clearScreen() {
        for (int i = 0; i < 10; i++)
            System.out.println("");
    }
}
