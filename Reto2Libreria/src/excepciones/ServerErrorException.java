/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepciones;

/**
 * Esta es la excepcion para cuando el servidor no esta funcionando o esta dando algun error a la hora de conectarse
 * @author David.
 */
public class ServerErrorException extends Exception {

    /**
     * Creates a new instance of <code>ServerErrorException</code> without
     * detail message.
     */
    public ServerErrorException() {
    }

    /**
     * Constructs an instance of <code>ServerErrorException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public ServerErrorException(String msg) {
        super(msg);
    }
}
