package nl.marktplaats;

import java.io.Serializable;

public class MessageData implements Serializable {
    private static final long serialVersionUID = 1L;
    private final int x;

    public MessageData(int x) {
        this.x = x;
    }
    
    public int getX() {
        return x;
    }
    
    @Override
    public String toString() {
        return "Message number " + x;
    }
}
