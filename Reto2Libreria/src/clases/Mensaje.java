package clases;

import java.io.Serializable;

/**
 *
 * @author David
 */
public class Mensaje implements Serializable{

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

    public MessageEnum getMessageEnum() {
        return messageEnum;
    }

    public void setMessageEnum(MessageEnum messageEnum) {
        this.messageEnum = messageEnum;
    }

}
