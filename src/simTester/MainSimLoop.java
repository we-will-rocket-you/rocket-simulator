package simTester;

import org.lwjgl.opengl.Display;
import simEngine.DisplayManager;

public class MainSimLoop {
    public static void main(String[] args){

        DisplayManager.createDisplay();

        while(!Display.isCloseRequested()){
            DisplayManager.updateDisplay();
        }
        DisplayManager.closeDisplay();
    }
}
