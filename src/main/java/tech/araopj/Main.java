package tech.araopj;

import tech.araopj.errorDetection.Handler;
import tech.araopj.errorDetection.ParityCheck;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Handler<ParityCheck> parityCheckHandler = new ParityCheck();
        parityCheckHandler.handle(new Scanner(System.in).nextLine());
    }
}