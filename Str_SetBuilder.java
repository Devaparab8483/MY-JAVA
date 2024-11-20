public class Str_SetBuilder {
    public static void main(String[] args) {
       // Declaration
        StringBuilder sb = new StringBuilder("Devang");
        System.out.println(sb);

        //Get A Character from Index
        //Set Char
        System.out.println(sb.charAt(1));

        //Get Char
        sb.setCharAt(0, 'T');
        System.out.println(sb);


    }

}
