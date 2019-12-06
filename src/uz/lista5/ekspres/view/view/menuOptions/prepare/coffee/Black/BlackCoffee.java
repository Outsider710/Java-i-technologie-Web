package uz.lista5.ekspres.view.view.menuOptions.prepare.coffee.Black;

import uz.lista5.ekspres.core.View;
import uz.lista5.ekspres.resources.StringRes;

public class BlackCoffee implements View {
    @Override
    public void show() throws Exception {
        System.out.println(StringRes.PREPARE_BLACK_COFFEE.getText());
        System.out.println();
    }
}
