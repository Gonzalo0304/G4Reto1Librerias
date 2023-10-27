/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;


/**
 *
 * @author David
 */
public class Mensaje {
    //Variables
    private Usuario user;
    private MessageEnum messageEnum;

    //Constructores
    public Mensaje() {
    }

    public Mensaje(Usuario user, MessageEnum messageEnum) {
        this.user = user;
        this.messageEnum = messageEnum;
    }

    //Getters y setters
    public Usuario getUser() {
        return user;
    }

    public void setUser(Usuario user) {
        this.user = user;
    }

    public MessageEnum getMessageType() {
        return messageEnum;
    }

    public void setMessageType(MessageEnum messageEnum) {
        this.messageEnum = messageEnum;
    }
    
    
}
