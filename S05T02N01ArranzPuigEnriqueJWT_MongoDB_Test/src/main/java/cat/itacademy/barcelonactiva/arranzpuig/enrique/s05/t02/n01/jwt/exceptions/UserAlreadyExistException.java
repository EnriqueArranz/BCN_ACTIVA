package cat.itacademy.barcelonactiva.arranzpuig.enrique.s05.t02.n01.jwt.exceptions;

public class UserAlreadyExistException extends RuntimeException{

    private static final long serialVersionUID = 1L;

    public UserAlreadyExistException(String msg) {
        super(msg);
    }
}