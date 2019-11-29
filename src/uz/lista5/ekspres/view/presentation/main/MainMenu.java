package uz.lista5.ekspres.view.presentation.main;

import uz.lista5.ekspres.resources.StringRes;
import uz.lista5.ekspres.view.model.enums.MenuOptions;

import java.util.Scanner;

public class MainMenu {
    private Scanner scaner = new Scanner(System.in);

    public void show() {
        System.out.println(StringRes.MENU.getText());
        System.out.println(StringRes.SELECTOPTION.getText());
        for (int i = 0; i < MenuOptions.values().length; i++) {
            showOptions(MenuOptions.values()[i],i+1);
        }

    }

    private void showOptions(MenuOptions option, int optionNumber) {
        System.out.print(optionNumber + ". ");

        switch (option) {
            case PREPARE:
                System.out.println(StringRes.MENUPREPARE.getText());
                break;
            case COFFEE:
                System.out.println(StringRes.MENUCOFFEE.getText());
                break;
            case WATER:
                System.out.println(StringRes.MENUWATER.getText());
                break;
            case CUP:
                System.out.println(StringRes.MENUCUP.getText());
                break;
            case MILK:
                System.out.println(StringRes.MENUMILK.getText());
                break;
            case SUGAR:
                System.out.println(StringRes.MENUSUGAR.getText());
                break;
            default:
                System.out.println(StringRes.NO_RSOURCE.getText());
                break;
        }
    }

}
