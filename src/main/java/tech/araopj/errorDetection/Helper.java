package tech.araopj.errorDetection;

import java.util.function.Function;

public class Helper {

    public static Function<Number, Boolean> isOdd = num -> num instanceof Integer ? num.intValue() % 2 != 0 : num instanceof Double ? num.doubleValue() % 2 != 0 : num.byteValue() % 2 != 0;
    public static Function<Number, Boolean> isEven = num -> num instanceof Integer ? num.intValue() % 2 == 0 : num instanceof Double ? num.doubleValue() % 2 == 0 : num.byteValue() % 2 == 0;

}
