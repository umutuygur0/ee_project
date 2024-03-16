import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        Oper oper = new Oper();


        int stbase = 0;
        int ndbase = 0;
        System.out.println("ne yapmak istersin \n 1 = translation \n 2 = operation");
        int inputop = keyboard.nextInt();
        switch (inputop) {
            case 1:
                System.out.println("Which base will you convert from to which base?\n enter respectively:");
                stbase = keyboard.nextInt();
                ndbase = keyboard.nextInt();
                System.out.println("enter the value you want to translate");
                String val1 = keyboard.next();


                Trans trans = new Trans();
                trans.setVal1(val1);
                trans.setStbase(stbase);
                trans.setNdbase(ndbase);

                System.out.println("result"+trans.convertion());


                break;
            case 2:
                System.out.println("enter the value you want to translate(just base 2 for now)");
                int val2 = keyboard.nextInt();
                int val3 = keyboard.nextInt();
                String op = keyboard.next();
                break;
            default:
                System.out.println("for now you can select just 1 or 2");
                System.exit(1);
                break;
        }

        System.out.println("----------");
    }


}