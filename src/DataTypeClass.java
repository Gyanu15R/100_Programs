public class DataTypeClass {

    public static void main(String[] args) {
        byte byteNumber=12;
        //8 bits
        System.out.println(byteNumber);
        short shortNumber=130;
        //16 bits==>32767 to -32768
        System.out.println(shortNumber);
        int intNumber=32768;
        //16 bits==>-2,147,483,648 to 2,147,483,647
        System.out.println(intNumber);
        int IntNumberRange=2147483647;
        //32 bits==>-2,147,483,648 to 2,147,483,647
        System.out.println(IntNumberRange);
        long longNumber=2147483648l;
        //64 bits
        System.out.println(longNumber);
        float floatNumber=12.999F;
        //8 bits
        System.out.println("Float value" +floatNumber);
        float floatNumberRange=2147483647.654686541f;
        System.out.println("Float Number Range" +floatNumberRange);
        double doubleNumber=2147483647.654686541;
        System.out.println(doubleNumber);

    }

}
