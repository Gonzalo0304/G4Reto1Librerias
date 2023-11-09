/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepciones;

/**
 * Esta es la excepcion para el Sign In
 *
 * @author Iñigo
 */
public class CheckSignInException extends Exception {

    public CheckSignInException(String message) {
        super(message);
    }

    public CheckSignInException() {
    }

}
