/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import excepciones.CheckSignInException;
import excepciones.CheckSignUpException;

/**
 *
 * @author Iñigo
 */
public interface InterfaceClienteServidor {

    public Mensaje signIn(Mensaje respuesta);

    public Mensaje signUp(Mensaje respuesta);

    public void closeApli();

    /**
     * Inserta un nuevo usuario en el sistema.
     *
     * @param usuario El objeto Usuario que representa un nuevo usuario.
     * @return Un mensaje de estado (MessageEnum) que indica el resultado de la
     * inserción.
     * @throws CheckSignUpException Si se produce un error de base de datos
     * durante la inserción.
     */
    public MessageEnum insertUser(Usuario usuario) throws CheckSignUpException;

    /**
     * Verifica si un usuario ya está registrado en el sistema.
     *
     * @param usuario El objeto `Usuario` que se desea comprobar para ver si ya
     * está registrado.
     * @return Un valor entero que representa el estado de registro del usuario.
     * 0 si no está registrado, 1 si ya lo está.
     * @throws CheckSignUpException Si se produce un error de base de datos
     * durante la verificación.
     */
    public Integer checkSignUp(Usuario usuario) throws CheckSignUpException;

    /**
     * Verifica si un usuario puede iniciar sesión en el sistema.
     *
     * @param usuario El objeto usuario que intenta iniciar sesión.
     * @return Un mensaje de estado (`MessageEnum`) que indica el resultado de
     * la autenticación.
     * @throws excepciones.CheckSignInException Si se produce un error de base de
     * datos durante la verificación.
     */
    public MessageEnum checkSignIn(Usuario usuario) throws CheckSignInException;
}
