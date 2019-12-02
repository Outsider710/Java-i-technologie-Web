package uz.lista5.ekspres.core;

public class UserExceptionInfo {
    private static UserExceptionInfo instance = null;

    public final String WRONG_SELECTION = "Błędny wybór";

    private UserExceptionInfo() {

    }

    public static UserExceptionInfo getInstance() {
        if (instance == null) {
            instance = new UserExceptionInfo();
        }
        return instance;
    }
}
