package uz.lista5.ekspres.view.model.enums;

import uz.lista5.ekspres.core.View;
import uz.lista5.ekspres.resources.StringRes;
import uz.lista5.ekspres.view.view.prepare.Prepare;

public enum MenuOptions {

    PREPARE(StringRes.MENUPREPARE, 1, new Prepare()),
    COFFEE(StringRes.MENUCOFFEE, 2),
    WATER(StringRes.MENUWATER, 3),
    CUP(StringRes.MENUCUP, 4),
    MILK(StringRes.MENUMILK, 5),
    SUGAR(StringRes.MENUSUGAR, 6);

    private StringRes resource;
    private int id;
    private View view;

    MenuOptions(StringRes option, int id, View view) {
        this.view = view;
        this.id = id;
        this.resource = option;
    }

    MenuOptions(StringRes option, int id) {
        this.id = id;
        this.resource = option;
    }

    static public MenuOptions getFromId(int id) {
        for (int i = 0; i < MenuOptions.values().length; i++)
            if (MenuOptions.values()[i].id == id)
                return MenuOptions.values()[i];
        return null;
    }

    public String getString() {
        return resource.getText();
    }

    public void getView() {
         view.show();
    }
}
