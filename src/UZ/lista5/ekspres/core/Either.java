package UZ.lista5.ekspres.core;

public class Either<Type> {
    public Type response;
    public Exception exception;

    public Either(Type response) {
        this.response = response;
    }

    public Either(Exception exception) {
        this.exception = exception;
    }
}
