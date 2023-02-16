import java.util.Scanner;

public class Nuclear {
    public static void main(String[] args){
        System.out.println("1) What is the total number of employees? ");
        Scanner question1 = new Scanner(System.in);
        int a = question1.nextInt();

        System.out.println("2) What is the name of the supervisor?");
        Scanner question2 = new Scanner(System.in);
        String b = question2.nextLine();

        System.out.println("3) How many times the Nuclear waste was removed from the core?");
        Scanner question3 = new Scanner(System.in);
        int c = question3.nextInt();

        System.out.println("4) What is the total weight of the waste produced every 1 week?(tons)");
        Scanner question4 = new Scanner(System.in);
        Float d = question4.nextFloat();

        System.out.println("5) Is electric motor being replaced every 18 days?(Press 'y' for yes and 'n' for no)");
        Scanner question5 = new Scanner(System.in);
        char e = question5.next().charAt(0);

        System.out.println("6) What is the core average temperature of the Nuclear Reactor?(Enter celsius temperature)");
        Scanner question6 = new Scanner(System.in);
        Double celsius = question6.nextDouble();
        System.out.println("temperature in kelvin is "+ kelvin(celsius));

        System.out.println("");
        System.out.println("");
        System.out.println("------------------------------JX00-XC-HB1----------------------------");
        System.out.println("---------------------------------------------------------------------");
        System.out.println("Total number of employees                              :" + a);
        System.out.println("Name of the supervisor                                 :" + b);
        System.out.println("Number of times nuclear waste was removed from core    :" + c);
        System.out.println("Total weight of waste produced every week              :" + d+"tons");
        System.out.println("Core average temperature                               :" + celsius+"C" + " "+ "(" +kelvin(celsius)+"K)");
        System.out.println("Data updated successfully!!!!!!!");
        System.out.println("");
        System.out.println("");


    }
    static double kelvin(double celsius){
        return (double)(celsius + 273.15);
    }

    
}