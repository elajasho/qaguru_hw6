package guru.qa;


public class Main {
    public static void main(String[] args) {

        System.out.println("// Integer numbers overflow examples");

        System.out.println(Byte.MAX_VALUE + " + 1 = " + (Byte.MAX_VALUE + 1));
        byte xByte = Byte.MAX_VALUE;
        xByte++;
        System.out.println("127 + 1 = " + xByte);

        System.out.println(Short.MIN_VALUE + " - 1 = " + (Short.MIN_VALUE - 1));
        short xShort = Short.MIN_VALUE;
        xShort -= 1;
        System.out.println(Short.MIN_VALUE + " -1 = " + xShort);

        System.out.println(Integer.MAX_VALUE + " + 1 = " + (Integer.MAX_VALUE + 1));
        int yInt = Integer.MAX_VALUE;
        yInt = yInt + 1;
        System.out.println("2147483647 + 1 = " + yInt);

        System.out.println(Long.MAX_VALUE + " + 1 = " + (Long.MAX_VALUE + 1));
        long zLong = Long.MAX_VALUE;
        zLong += 1;
        System.out.println("9223372036854775807 + 1 = " + zLong);

        System.out.println("//float numbers overflow examples");

        float xFloat = Float.MAX_VALUE;
        float xFloatOverflow = xFloat * 2;
        System.out.println(xFloatOverflow);

        double yDouble = Double.MAX_VALUE;
        double yDoubleOverflow = yDouble * 1.000000001;
        System.out.println(yDoubleOverflow);

        System.out.println("//логические");

        boolean xBoolean = true;
        boolean yBoolean = false;
        System.out.println("If xBoolean is true and yBoolean is false, then:");
        System.out.println("xBoolean && yBoolean = " + (xBoolean && yBoolean));
        System.out.println("xBoolean || yBoolean = " + (xBoolean || yBoolean));
        System.out.println("!(xBoolean && yBoolean) = " + !(xBoolean && yBoolean));

        System.out.println("//Комбинации типов данных");

        System.out.println("Byte + Short + Ineger = " + (xByte + xShort + yInt));
        System.out.println("Float / Double = " + xFloat / yDouble);
        System.out.println("Double % Float = " + yDouble % xFloat);
        System.out.println("Float * Int = " + (xFloat*yInt));

    }
}