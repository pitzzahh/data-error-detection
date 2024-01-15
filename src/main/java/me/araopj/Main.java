package me.araopj;

import me.araopj.dataErrorDetection.ParityCheck;
import me.araopj.dataErrorDetection.Handler;

public class Main {
    public static void main(String[] args) {
        Handler parityCheckHandler = new ParityCheck();
        ParityCheck.oddValue = 0;
        ParityCheck.evenValue = 1;
        parityCheckHandler.handle("Hello, World!");
        ParityCheck.oddValue = 1;
        ParityCheck.evenValue = 0;
        parityCheckHandler.handle("pitzzahh");
    }
}