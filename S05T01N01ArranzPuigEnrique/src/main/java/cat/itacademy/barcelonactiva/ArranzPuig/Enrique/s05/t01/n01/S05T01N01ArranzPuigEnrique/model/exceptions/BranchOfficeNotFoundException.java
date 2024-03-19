package cat.itacademy.barcelonactiva.ArranzPuig.Enrique.s05.t01.n01.S05T01N01ArranzPuigEnrique.model.exceptions;

public class BranchOfficeNotFoundException extends RuntimeException{

    public BranchOfficeNotFoundException(String message, Throwable cause)
    {
        super(message, cause);

    }

    public BranchOfficeNotFoundException(String message)
    {

        super(message);

    }
}
