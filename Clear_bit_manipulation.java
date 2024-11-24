public class Clear_bit_manipulation {
    public static void main(String args[]) {

        //Bit mask=1<<position
        //operation =AND with NOT

        int n = 5; //0101
        int pos = 2;
        int bitMask = 1<<pos;
        int newBitMask = ~(bitMask);
        int newNumber = newBitMask & n;
        System.out.println(newNumber);
}
}
