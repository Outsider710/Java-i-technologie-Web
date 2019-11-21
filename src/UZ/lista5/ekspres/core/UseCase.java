package UZ.lista5.ekspres.core;

public interface UseCase<Type, in> {
     Either<Type> run(in request);
}



