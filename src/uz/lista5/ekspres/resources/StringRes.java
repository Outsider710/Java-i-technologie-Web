package uz.lista5.ekspres.resources;

public enum StringRes {
    MENU("Menu"),
    SELECTOPTION("Wybierz z podanych opcji"),
    MENUPREPARE("Przyrządź kawę."),
    MENUCOFFEE("Menu ziaren kawy."),
    MENUWATER("Menu wody"),
    MENUCUP("Menu kubków"),
    MENUMILK("Menu mleka"),
    MENUSUGAR("Menu cukru"),
    NO_RSOURCE("Błąd ekspresu brak zasobów textowych");

    StringRes(String text) {
        this.text = text;
    }

    private String text;

    public String getText() {
        return text;
    }
}
