package recuperer.donnees.codeBarre.Event;

import org.springframework.context.ApplicationEvent;

public class KeyPressEvent extends ApplicationEvent {

    private final String codeBarre;

    public KeyPressEvent(Object source, String codeBarre) {
        super(source);
        this.codeBarre = codeBarre;
    }

    public String getCodeBarre() {
        return codeBarre;
    }
}

