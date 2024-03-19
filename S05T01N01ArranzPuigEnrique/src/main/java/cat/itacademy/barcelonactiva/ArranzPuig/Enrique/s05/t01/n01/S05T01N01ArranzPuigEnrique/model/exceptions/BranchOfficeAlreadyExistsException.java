package cat.itacademy.barcelonactiva.ArranzPuig.Enrique.s05.t01.n01.S05T01N01ArranzPuigEnrique.model.exceptions;

public class BranchOfficeAlreadyExistsException extends RuntimeException {

    public BranchOfficeAlreadyExistsException(String message, Throwable cause)
    {
        super(message, cause);

    }

    public BranchOfficeAlreadyExistsException(String message)
    {

        super(message);

    }
}
