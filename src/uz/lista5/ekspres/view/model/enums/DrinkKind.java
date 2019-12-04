package uz.lista5.ekspres.view.model.enums;

import uz.lista5.ekspres.resources.StringRes;

public enum DrinkKind {
    COFFEE(StringRes.COFFEE), HOT_WATER(StringRes.HOT_WATER), HOT_MILK(StringRes.HOT_MILK);
    StringRes text;
    DrinkKind(StringRes text){
        this.text = text;
    }
    public String getText(){
        return this.text.getText();
    }
}
