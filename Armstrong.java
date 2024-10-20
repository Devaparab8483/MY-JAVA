import java.util.*;
public class Armstrong {
    public static void main(String[] args) {
        Scanner rd= new Scanner(System.in);
        System.out.print("Enter number : ");
        int num = rd.nextInt();

        int temp =num;
        int leng=0;
        while(temp!=0){
            temp=temp/10;
            leng=leng+1;
        }

        int pow = leng;

        temp=num;
        int sum=0;
        while(temp!=0){
            int rem = temp%10;
            sum=sum+(int)Math.pow(rem,pow);
            temp=temp/10;
        }
        if(sum==num){
            System.out.println("Armstrong number");
        }
        else{
            System.out.println("Not Armstrong number");
        }
    

    }

}
