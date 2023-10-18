/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.awt.TrayIcon.MessageType;

/**
 *
 * @author David
 */
public class Mensaje {
    //Variables
    private Usuario user;
    private MessageType messageType;

    //Constructores
    public Mensaje() {
    }

    public Mensaje(Usuario user, MessageType messageType) {
        this.user = user;
        this.messageType = messageType;
    }

    //Getters y setters
    public Usuario getUser() {
        return user;
    }

    public void setUser(Usuario user) {
        this.user = user;
    }

    public MessageType getMessageType() {
        return messageType;
    }

    public void setMessageType(MessageType messageType) {
        this.messageType = messageType;
    }
    
    
}
