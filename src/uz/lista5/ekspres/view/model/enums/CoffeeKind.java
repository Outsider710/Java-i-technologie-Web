package uz.lista5.ekspres.view.model.enums;

import uz.lista5.ekspres.core.View;
import uz.lista5.ekspres.resources.StringRes;
import uz.lista5.ekspres.view.presentation.menuoptions.prepare.coffee.Black.BlackCoffee;

public enum CoffeeKind {
    LATTE(StringRes.LATTE), ESPRESSO(StringRes.ESPRESSO), AMERICAN(StringRes.AMERICAN), WHITE(StringRes.WHITE), BLACK(StringRes.BLACK,new BlackCoffee());
    StringRes text;

     CoffeeKind(StringRes text){
        this.text=text;
    }
    CoffeeKind(StringRes text,View view ){
         this.view = view;
        this.text=text;
    }
    View view;
     public void getView() throws Exception {
         view.show();
     }
    public String getText() {
        return text.getText();
    }
}
