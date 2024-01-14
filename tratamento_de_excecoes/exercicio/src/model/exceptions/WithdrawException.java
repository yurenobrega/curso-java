package model.exceptions;

public class WithdrawException extends Exception{
    private static final long serialVesionUID = 1L;
    public WithdrawException(String msg){
        super(msg);
    }
}
