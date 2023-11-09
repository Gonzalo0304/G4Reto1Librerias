/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepciones;

/**
 * Esta es la excepcion para cuando da error alguno de los campos al iniciar
 * sesion
 *
 * @author David.
 */
public class CredentialsException extends Exception {

    /**
     * Creates a new instance of <code>CredentialsException</code> without
     * detail message.
     */
    public CredentialsException() {
    }

    /**
     * Constructs an instance of <code>CredentialsException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public CredentialsException(String msg) {
        super(msg);
    }
}
