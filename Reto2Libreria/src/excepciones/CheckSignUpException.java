/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepciones;

/**
 * Esta es la excepcion para el Sign Up
 *
 * @author Iñigo
 */
public class CheckSignUpException extends Exception {

    public CheckSignUpException(String message) {
        super(message);
    }

    public CheckSignUpException() {
    }

}
