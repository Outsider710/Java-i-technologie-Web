package uz.lista5.ekspres.view.model.enums;

import uz.lista5.ekspres.core.View;
import uz.lista5.ekspres.resources.StringRes;
import uz.lista5.ekspres.view.presentation.menuoptions.coffee.CoffeeMenu;
import uz.lista5.ekspres.view.presentation.menuoptions.cups.CupsMenu;
import uz.lista5.ekspres.view.presentation.menuoptions.milk.MilkMenu;
import uz.lista5.ekspres.view.presentation.menuoptions.prepare.PrepareMenu;
import uz.lista5.ekspres.view.presentation.menuoptions.sugar.SugarMenu;
import uz.lista5.ekspres.view.presentation.menuoptions.water.WaterMenu;

public enum MenuOptions {

    PREPARE(StringRes.MENU_PREPARE, 1, new PrepareMenu()),
    COFFEE(StringRes.MENU_COFFEE, 2, new CoffeeMenu()),
    WATER(StringRes.MENU_WATER, 3, new WaterMenu()),
    CUP(StringRes.MENU_CUP, 4, new CupsMenu()),
    MILK(StringRes.MENU_MILK, 5, new MilkMenu()),
    SUGAR(StringRes.MENU_SUGAR, 6,new SugarMenu());

    private StringRes resource;
    private int id;
    private View view;

    MenuOptions(StringRes option, int id, View view) {
        this.view = view;
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

    public void getView() throws Exception {
        view.show();
    }
}
