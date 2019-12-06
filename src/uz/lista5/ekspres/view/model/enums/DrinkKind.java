package uz.lista5.ekspres.view.model.enums;

import uz.lista5.ekspres.core.View;
import uz.lista5.ekspres.resources.StringRes;
import uz.lista5.ekspres.view.view.menuOptions.prepare.coffee.PrepareCoffee;

public enum DrinkKind {
    COFFEE(StringRes.COFFEE, 1, new PrepareCoffee()), HOT_WATER(StringRes.HOT_WATER, 2), HOT_MILK(StringRes.HOT_MILK, 3);
    StringRes text;

    DrinkKind(StringRes text, int id) {
        this.text = text;
        this.id = id;
    }

    DrinkKind(StringRes text, int id, View view) {
        this.text = text;
        this.id = id;
        this.view = view;
    }

    public static DrinkKind getFromId(int id) {
        for (int i = 0; i < DrinkKind.values().length; i++) {
            if (DrinkKind.values()[0].id == id) {
                return DrinkKind.values()[i];
            }
        }
        return null;
    }

    View view;
    int id;

    public void getView() throws Exception {
         view.show();
    }

    public String getText() {
        return this.text.getText();
    }
}
