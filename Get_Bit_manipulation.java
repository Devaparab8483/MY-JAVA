
public class Get_Bit_manipulation {
    public static void main(String[] args) {

        //Bit mask=1<<position
        //operation =AND
        
    int n = 5; //0101
    int pos = 3;
    int bitMask = 1<<pos;

    if((bitMask & n) == 0) {
        System.out.println("bit was zero");
    }
    else {
        System.out.println("bit was one");
    }
    }
}
