package uz.lista5.ekspres.view.presentation.main;

import uz.lista5.ekspres.core.UserException;
import uz.lista5.ekspres.core.View;
import uz.lista5.ekspres.resources.StringRes;
import uz.lista5.ekspres.view.model.enums.MenuOptions;

import java.util.Arrays;

public class MainMenu implements View {
    private MainMenuController controller = new MainMenuController();

    public MainMenu() {
        show();
        System.out.println(StringRes.SELECT_OPTION.getText());
        try {
            controller.selectOption();
        } catch (UserException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(Arrays.toString(e.getStackTrace()).replace(',','\n'));
            System.out.println(StringRes.WARNING.getText());

        }
    }

    public void show() {
        System.out.println(StringRes.MENU.getText());
        System.out.println(StringRes.SELECT_OPTION.getText());
        for (int i = 0; i < MenuOptions.values().length; i++) {
            showOptions(MenuOptions.values()[i], i + 1);
        }
    }

    private void showOptions(MenuOptions option, int optionNumber) {
        System.out.print(optionNumber + ". ");
        System.out.println(option.getString());
    }
}
