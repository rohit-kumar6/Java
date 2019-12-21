import java.util.Arrays;

public class PrimitiveDataTypes {
    public static void main(String args[]){

        // int has a width of 32 (4 bytes)
        // can be represented as 2_147_483_647 after java 7
        int myMinValue = -2147483648; // -2^31
        int myMaxValue = 2_147_483_647; // 2^31-1
        int myTotal = myMaxValue/2 ;

        // byte has a width of 8 (1 byte)
        byte minByteValue = -128; // -2^7
        byte maxByteValue = 127; // 2^7-1
        // We have to TypeCast in byte, short but in long it is not necessary it accept int value
        byte byteException = (byte)(minByteValue/2) ;

        // short has a width of 16 (2 bytes)
        short minShortValue = -32768; // -2^15
        short maxShortValue = 32767; // 2^15-1
        short shortException = (short)(minShortValue/2) ;

        // long has a width of 64 (8 bytes)
        // In long datatype after literal L sould be present as suffix
        // Literal : Any constant value which can be assigned to the variable is called as literal/constant.
        long minLongValue = -9223372036854775808L; // -2^63
        long maxLongValue = 9223372036854775807L; // 2^63-1
        // we don't have to typecast in long
        long longException = (maxLongValue/2);

        // float has a width of 32 (4 bytes)
        // if value is not decimal value f after literal is optional
        float myFloatValue  = 5; // output 5.0
        float myFloatValue1  = (float)(5.25);  // Not recommended
        float myFloatValue2  = 5.25f;
        float myFloatValue3  = 5/2; // 2.0
        float myFloatValue4  = 5f/2; // 2.5
        float myFloatValue5  = 5/3f; // 1.6666666
        System.out.println(myFloatValue5);

        // double has a width of 64 (8 bytes)
        // d is Optional in double datatype
        double myDoubleValue = 5; // output 5.0
        double myDoubleValue1 = 5.25 ;
        double myDoubleValue2 = 5.25d;
        double myDoubleValue3  = 5/2; // 2.0
        double myDoubleValue4  = 5d/2; // 2.5
        double myDoubleValue5  = 5/3d; // 1.6666666666666667

        /*
         Using double is recommended over float as double is more precise
         */


        // char has a width of 16 (2 bytes) it should be of length 1 in single quotes
        // It can contain unicode character \u00A9
        char myChar = '#';
        char myUnicode = '\u00A9';

        // boolean has a width of 8 (1 byte)
        boolean myBoolean = true;

        // String
        String myString = "Hello World";

        // Array
        int[] myIntArray = new int[5];
        int[] anotherArray = myIntArray;
        // To print an array
        System.out.println(Arrays.toString(myIntArray));
        // it will return garbage value
        // System.out.println(myIntArray);
        // Update reference variable it will be update original variable
        anotherArray[2] = 4;
        System.out.println(Arrays.toString(myIntArray));

    }
}