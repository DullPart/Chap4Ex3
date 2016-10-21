/**
 * Created by opilane on 21.10.2016.
 */
public class PrintAmerican {

    public static void year() {
        int year = 2016;
        System.out.print(year);
        System.out.print(" ");
    }
    public static void month(){
        System.out.print("October ");
    }
    public static void date(){
        int date = 21;
        System.out.print(date);
        System.out.print(" ");
    }
    public static void day(){
        System.out.print("Friday");
    }


    public static void printAmerican(){
        day();
        System.out.print(", ");
        month();
        date();
        year();
    }

    public static void printEuropean(){
        day();
        System.out.print(", ");
        date();
        month();
        year();
    }

    public static void newLine(){
        System.out.println();
    }

    public static void main(String[] args){
        printAmerican();
        newLine();
        printEuropean();

    }
}
