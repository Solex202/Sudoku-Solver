package org.example;

public class STAccount {

    public String computeArithmetic(String number) {
        int result = 0;
        for (int i = 0; i < number.length(); i++) {
            result +=  (i ==1 || i == 4 || i == 7 || i == 10) ? (Character.getNumericValue(number.charAt(i)) * 7) : (Character.getNumericValue(number.charAt(i)) * 3);
        }
        int modulo = getModuloTenOfResult(result);
        int subtract = subtractModuloFromTen(modulo);
        if (subtract == 10) {
            subtract = 0;
        }
        return number.concat(String.valueOf(subtract));
    }

    private int subtractModuloFromTen(int modulo) {
        return 10 - modulo;
    }

    private int getModuloTenOfResult(int result) {
        return result % 10;
    }

//    Predicate<Integer> isEven = num -> num % 2 == 0;
//    boolean result = isEven.test(41);
//
//    static enum Day {
//        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;
//
//        public boolean isWeekend() {
//            return this == SATURDAY || this == SUNDAY;
//
//        }
//    }
}
