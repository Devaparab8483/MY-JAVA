public class Set_Bit_manipulation {
    public static void main(String[] args) {

        //Bit mask=1<<position
        //operation =OR

        int n = 5; //0101
        int pos = 1;
        int bitMask = 1<<pos;
  
  
        int newNumber = bitMask | n;
        System.out.println(newNumber);
     }
  
}
