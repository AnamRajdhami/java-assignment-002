import java.util.Scanner;

public class Nuclear {
    public static void main(String[] args){
        System.out.println("1) What is the total number of employees? ");
        Scanner scannerObj = new Scanner(System.in);
        int a = scannerObj.nextInt();

        System.out.println("2) What is the name of the supervisor?");
        scannerObj.nextLine();
        String b = scannerObj.nextLine();

        System.out.println("3) How many times the Nuclear waste was removed from the core?");
        int c = scannerObj.nextInt();

        System.out.println("4) What is the total weight of the waste produced every 1 week?(tons)");
        Float d = scannerObj.nextFloat();

        System.out.println("5) Is electric motor being replaced every 18 days?(Press 'y' for yes and 'n' for no)");
        char e = scannerObj.next().charAt(0);

        System.out.println("6) What is the core average temperature of the Nuclear Reactor?(Enter celsius temperature)");
        Double celsius = scannerObj.nextDouble();
        Double kelvin = celsius+273.15;

        System.out.println("");
        System.out.println("");
        System.out.println("------------------------------JX00-XC-HB1----------------------------");
        System.out.println("---------------------------------------------------------------------");
        System.out.println("Total number of employees                              :" + a);
        System.out.println("Name of the supervisor                                 :" + b);
        System.out.println("Number of times nuclear waste was removed from core    :" + c);
        System.out.println("Total weight of waste produced every week              :" + d+"tons");
        System.out.println("motor replacement                                      :" + (e == 'y' ? "replaced" : "not replaced"));
        System.out.println("Core average temperature                               :" + celsius+"C" + " "+ "(" +kelvin+"K)");
        System.out.println("!!!!!!!Data updated successfully!!!!!!!");
        System.out.println("");
        System.out.println("");


    }
}