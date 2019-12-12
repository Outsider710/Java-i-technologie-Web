package uz.lista5.ekspres.view.presentation.menuoptions.prepare.coffee.Black;

import uz.lista5.ekspres.core.View;
import uz.lista5.ekspres.resources.StringRes;
import uz.lista5.ekspres.view.presentation.main.MainMenuController;

public class BlackCoffee implements View {

    BlackCoffeeController controller = new BlackCoffeeController();

    @Override
    public void show() throws Exception {
        System.out.println(StringRes.PREPARE_BLACK_COFFEE.getText());
        System.out.println();
        System.out.println(StringRes.CHOOSE_SUGAR_AMOUNT.getText());
        controller.selectSugarAmount();
        System.out.println(StringRes.SELECT_CUP_SIZE.getText());
        controller.selectCupSize();
    }
}
