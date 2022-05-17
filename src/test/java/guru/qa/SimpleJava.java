package guru.qa;

public class SimpleJava {

    public static void main(String[] args) {
        String name = "Hello, QA.GURU!";
        int a = 20;
        int b = 30;
        int c = 35;
        boolean isTrue = true;
        boolean isFalse = false;
        byte aByte = 127;
        short aShort = 30000;
        int aInt = 2000000000;
        long aLong = 9223372036854775807L;
        float aFloat = 8.5F;
        double aDouble = 8.5;

        System.out.println(name);
        System.out.println();
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println();

        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("b / a = " + (b / a));
        System.out.println("b % a = " + (b % a));
        System.out.println("c % a = " + (c % a));
        System.out.println("a == b = " + (a == b));
        System.out.println("a != b = " + (a != b));
        System.out.println("a > b = " + (a > b));
        System.out.println("a < b = " + (a < b));
        System.out.println("b >= a = " + (b >= a));
        System.out.println("b <= a = " + (b <= a));
        if (c > a) {
            System.out.println("c больше a");
        } else {
            System.out.println("a больше c");
        }
        System.out.println();

        System.out.println("aByte = " + aByte);
        System.out.println("aInt = " + aInt);
        System.out.println("aShort = " + aShort);
        System.out.println("aLong = " + aLong);
        System.out.println("aFloat = " + aFloat);
        System.out.println("aDouble = " + aDouble);
        System.out.println();

        System.out.println("isTrue && isFalse = " + (isTrue && isFalse));
        System.out.println("isTrue || isFalse = " + (isTrue || isFalse));
        System.out.println("!(isTrue && isFalse) = " + !(isTrue && isFalse));
        System.out.println();

        System.out.println("aByte + aInt = " + (aByte + aInt));
        System.out.println("aInt - aLong = " + (aInt - aLong));
        System.out.println("aLong * aByte = " + (aLong * aByte));
        System.out.println("aInt / aShort = " + (aInt / aShort));
        System.out.println("aInt % aShort = " + (aInt % aShort));
        System.out.println("aFloat + aDouble = " + (aFloat + aDouble));
        System.out.println();

        System.out.println("aByte++ = " + aByte++);
        System.out.println("aByte-- = " + aByte--);
        System.out.println("++aByte = " + ++aByte);
        System.out.println("--aByte = " + --aByte);
        System.out.println("++aByte + 10 = " + (++aByte + 10));
        System.out.println("--aByte + 10 = " + (--aByte + 10));
        System.out.println();

        System.out.println("Переполнение Int в max сторону: " + (Integer.MAX_VALUE + 1));
        System.out.println("Переполнение Int в min сторону: " + (Integer.MIN_VALUE - 1));
        System.out.println("Переполнение Long в max сторону: " + (Long.MAX_VALUE + 1));
        System.out.println("Переполнение Long в min сторону: " + (Long.MIN_VALUE - 1));
    }
}

