package Basics.DataTypes;

 class datatypes {
    public static void main(String[] args) {
        // integer types
        byte aSingleByte = 100; // Range: -128 to 127
        short aSmallNumber = 20000; // -32,768 to 32,767
        int anInteger = 2147483647; // -2147483648 to 2147483647
        long aLargeNumber = 9223372036854775807L; // -9223372036854775808 to 9223372036854775807

        // decimal types
        double aDouble = 1.79769313; // 4.9E-324 to 1.7976931348623157308
        float aFloat = 3.4028F; // 1.4E-45 to 3.402823538

        // booleans
        boolean isWeekend = false;
        boolean isWorkday = true;

        // characters
        char copyrightSymbol = '\u00A9';

        System.out.println("This is the question symbol: " + copyrightSymbol);
    }
}
