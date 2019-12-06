package uz.lista5.ekspres.resources;

public enum StringRes {
    MENU("Menu"),
    SELECT_OPTION("Wybierz z podanych opcji"),
    MENU_PREPARE("Przyrządź kawę."),
    MENU_COFFEE("Menu ziaren kawy."),
    MENU_WATER("Menu wody"),
    MENU_CUP("Menu kubków"),
    MENU_MILK("Menu mleka"),
    MENU_SUGAR("Menu cukru"),
    NO_RESOURCE("Błąd ekspresu brak zasobów textowych"),
    PREPARE_DRINK("Przygotuj napój"),
    COFFEE("Kawa"),
    HOT_WATER("Gorąca woda"),
    HOT_MILK("Ciepłe melko"),
    LATTE("Late"),
    ESPRESSO("Espresso"),
    AMERICAN("Amerykańska"),
    WHITE("Biała"),
    BLACK("Czarna"),
    SELECT_COFFEE_TYPE("Wybierz typ Kawy"),
    WARING("Awaria ekspresu do kawy ekspres zsotanie wyłączony!!!"),
    PREPARE_BLACK_COFFEE("Prygotownie czarnej kawy.");


    StringRes(String text) {
        this.text = text;
    }

    private String text;

    public String getText() {
        return text;
    }
}
