package uz.lista5.ekspres.view.presentation.menuoptions.prepare.coffee;

import uz.lista5.ekspres.core.View;
import uz.lista5.ekspres.resources.StringRes;
import uz.lista5.ekspres.view.model.enums.CoffeeKind;

public class PrepareCoffee implements View {
    PrepareCoffeeController controller = new PrepareCoffeeController();
    @Override
    public void show() throws Exception {
        System.out.println(StringRes.SELECT_COFFEE_TYPE.getText());
        for (int i = 1; i <= CoffeeKind.values().length; i++) {
            System.out.println(i + ". " + CoffeeKind.values()[i - 1].getText());
        }
        controller.selectOption();

    }

}
