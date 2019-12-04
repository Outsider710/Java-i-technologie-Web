package uz.lista5.ekspres.view.model.enums;

import uz.lista5.ekspres.resources.StringRes;

enum CoffeeKind {
    LATTE(StringRes.LATTE), ESPRESSO(StringRes.ESPRESSO), AMERICAN(StringRes.AMERICAN), WHITE(StringRes.WHITE), BLACK(StringRes.BLACK);
    StringRes text;

    CoffeeKind(StringRes text){
        this.text=text;
    }

    public String getText() {
        return text.getText();
    }
}
