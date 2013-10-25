package com.mtechcomm.mtechlogogame;


import com.codename1.ui.Display;
import com.codename1.ui.Form;
import userclasses.StateMachine;

public class Logogame {
   
    private Form current;

    public void init(Object context) {
    }

    public void start() {
        if(current != null){
            current.show();
            return;
        }
        new StateMachine("/theme");        
    }

    public void stop() {
        current = Display.getInstance().getCurrent();
        Display.getInstance().isMinimized();
    }
    
    public void destroy() {
    }
}
