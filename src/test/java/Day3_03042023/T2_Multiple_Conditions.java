package Day3_03042023;

public class T2_Multiple_Conditions {
    public static void main(String[] args) {

        //using multiple conditional statements verify when a+b > c, a+b <c & a+b == c
        int a = 2;
        int b = 3;
        int c = 4;

        if (a+b > c) {
            System.out.println("a & b is greater than c");
        }else if (a+b <c) {
            System.out.println("a & b is less than c");
        }else if (a+b == c){
            //when you compare two values it will always be == double equal sign
            System.out.println("a & b is equal to c");
        }//end of multiple conditions


    }//end of main
}//end of class
