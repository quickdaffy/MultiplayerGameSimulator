package me.quick.mgs.handler;

import java.util.Random;

public class ClickHandler {

    public void onClick(float mouseX, float mouseY, int state) {
        if(mouseX >= 0 && mouseX <= 100 && mouseY >= 0 && mouseY <= 100) {
            System.out.println("CLICKED " + new Random().nextDouble());
        }
    }

}
