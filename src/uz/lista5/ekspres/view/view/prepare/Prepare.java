package uz.lista5.ekspres.view.view.prepare;


import uz.lista5.ekspres.core.View;
import uz.lista5.ekspres.resources.StringRes;
import uz.lista5.ekspres.view.model.enums.DrinkKind;

public class Prepare implements View {

    @Override
    public void show() {
        System.out.println(StringRes.PREPARE_DRINK.getText());
        for (int i = 1; i <= DrinkKind.values().length; i++) {
            System.out.println(i + ". " + "napój");
        }
    }

}
