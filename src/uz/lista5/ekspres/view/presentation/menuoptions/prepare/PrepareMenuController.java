package uz.lista5.ekspres.view.presentation.menuoptions.prepare;

import uz.lista5.ekspres.core.Controller;
import uz.lista5.ekspres.core.UserException;
import uz.lista5.ekspres.core.UserExceptionInfo;
import uz.lista5.ekspres.view.model.enums.DrinkKind;

import java.util.Scanner;

class PrepareMenuController implements Controller {

    private Scanner scanner = new Scanner(System.in);

    void selectOption() throws Exception {
        int selectedOption = scanner.nextInt();
        if (selectedOption > 3 || selectedOption < 1) {
            throw new UserException(UserExceptionInfo.getInstance().WRONG_SELECTION);
        }
        clearScreen();
        onOptionSelected(selectedOption);
    }

    private void onOptionSelected(int selectedOption) throws Exception {
        DrinkKind.getFromId(selectedOption).getView();
    }


    @Override
    public void clearScreen() {
        for (int i = 0; i < 10; i++)
            System.out.println("");
    }
}
