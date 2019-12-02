package uz.lista5.ekspres.core;

public class UserException extends Exception {
    String message;

    @Override
    public String getMessage() {
        return this.message;
    }
    public UserException(String message ){
        this.message = message;
    }


}
