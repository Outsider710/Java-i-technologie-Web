package UZ.lista5.ekspres.domain.usecase;

import UZ.lista5.ekspres.core.Either;
import UZ.lista5.ekspres.core.UseCase;
import UZ.lista5.ekspres.domain.repository.KubekRepository;
import jdk.internal.org.jline.utils.Log;

public class pobierzKubekUseCase extends Thread implements UseCase<Object, pobierzKubekUseCase.EmptyRequest> {
    private KubekRepository kubekRepository;
    Thread thread = new Thread(this, "pobierzKubekUseCase");

    public pobierzKubekUseCase(KubekRepository kubekRepository) {
        this.kubekRepository = kubekRepository;
        thread.start();
    }

    @Override
    public Either<Object> run(EmptyRequest request) {
        try {
            kubekRepository.pobierzKubek();
            return new Either(new Response());
        } catch (Exception e) {
            Log.error(e);
            return new Either(e);
        }
    }

    class EmptyRequest {
    }

    class Response {
    }
}
