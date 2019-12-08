////////////////////////////////////////////////////////////////////
// Alessandro Rizzo 1162429 
////////////////////////////////////////////////////////////////////
package it.unipd.tos.business.exception;

public class TakeAwayBillException extends Throwable{
    private String mess;

    public TakeAwayBillException(String exception) {
        this.mess = exception;
    }

    public String getMessage() {
        return this.mess;
    }
}