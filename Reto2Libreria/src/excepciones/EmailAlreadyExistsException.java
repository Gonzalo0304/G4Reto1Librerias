/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepciones;

/**
 * Esta es la excepcion para cuando al registrarse el coreo introducido ya existe
 * @author David.
 */
public class EmailAlreadyExistsException extends Exception {

    /**
     * Creates a new instance of <code>EmailAlreadyExistsException</code>
     * without detail message.
     */
    public EmailAlreadyExistsException() {
    }

    /**
     * Constructs an instance of <code>EmailAlreadyExistsException</code> with
     * the specified detail message.
     *
     * @param msg the detail message.
     */
    public EmailAlreadyExistsException(String msg) {
        super(msg);
    }
}
