package p_MediatorPattern;

import java.awt.*;
import java.awt.event.*;

public class ColleagueTextField extends TextField implements Colleague {
    private Mediator mediator;
    public ColleagueTextField(String caption, int arg) {
        super(caption, arg);
    }
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }
    public void setColleagueEnabled(boolean enabled) {
        setEnabled(enabled);
    }
    public void addTextListener(ColleagueTextField textField) {
        this.addTextListener(new TextListener() {

            @Override
            public void textValueChanged(TextEvent e) {
                mediator.colleagueChanged(textField);
            }
            
        });
    }
}
