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

        //Insert char
        sb.insert(1, 'S');
        System.out.println(sb);

        //delete char (delete end -1 hoata hai )
        sb.delete(0, 1);
        System.out.println(sb);

        //Append a char 
        //Append means to add something at the end.
        sb.append(" Stark");
        System.out.println(sb); 




    }

}
