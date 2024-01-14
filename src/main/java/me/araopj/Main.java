package me.araopj;

import me.araopj.dataErrorDetection.ParityCheck;
import me.araopj.dataErrorDetection.Handler;

public class Main {
    public static void main(String[] args) {
        Handler parityCheckHandler = new ParityCheck();
        parityCheckHandler.handle("Hi, World!");
        parityCheckHandler.handle("AIMHigh");
    }
}