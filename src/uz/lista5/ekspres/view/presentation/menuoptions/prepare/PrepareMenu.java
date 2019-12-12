package uz.lista5.ekspres.view.presentation.menuoptions.prepare;


import uz.lista5.ekspres.core.View;
import uz.lista5.ekspres.resources.StringRes;
import uz.lista5.ekspres.view.model.enums.DrinkKind;

public class PrepareMenu implements View {
    PrepareMenuController controller = new PrepareMenuController();

    @Override
    public void show() throws Exception {
        System.out.println(StringRes.PREPARE_DRINK.getText());
        for (int i = 1; i <= DrinkKind.values().length; i++) {
            System.out.println(i + ". " + DrinkKind.values()[i - 1].getText());
        }
        controller.selectOption();
    }

}
