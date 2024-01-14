package me.araopj;

import me.araopj.errorDetection.ParityCheck;
import me.araopj.errorDetection.Handler;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Handler<ParityCheck> parityCheckHandler = new ParityCheck();
        boolean result = parityCheckHandler.handle(new Scanner(System.in).nextLine());
    }
}