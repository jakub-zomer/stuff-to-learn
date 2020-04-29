import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;




public class Main {
    public static void geometric() { //creates a method for geometric sum calc
        Scanner myVar = new Scanner(System.in);
        System.out.println("set value of a");
        int a = (myVar.nextInt()); //req for input of variable a
        Scanner myVar2 = new Scanner(System.in);
        System.out.println("set value of q");
        int q = (myVar2.nextInt()); //req for input of variable q
        Scanner myVar3 = new Scanner(System.in);
        System.out.println("set value of n");
        int n = (myVar3.nextInt()); //req for input of variable n
        int sum = 0;
        while (n > 0) {
            sum = (sum + a);
            a = a * q;
            n--; //the operation for the geometric
        }
        System.out.println(sum);
    }
    public static void arithmetic() {
        Scanner myVar = new Scanner(System.in);
        System.out.println("set value of a");
        int a = (myVar.nextInt()); //req for input of variable a
        Scanner myVar2 = new Scanner(System.in);
        System.out.println("set value of diff");
        int diff = (myVar2.nextInt()); //req for input of variable difference
        Scanner myVar3 = new Scanner(System.in);
        System.out.println("set value of n");
        int n = (myVar3.nextInt()); //req for input of variable n
        int sum = 0;
        while (n > 0) {
            sum = (sum + a);
            a = a + diff;
            n--; //operation for arithmetic
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        Scanner sel = new Scanner(System.in);
        System.out.println("1 for geometric, 2 for arithmetic.");
        System.out.println("All set numbers must be integers");
        int met = (sel.nextInt()); //input for method selection
        if (met == 1) {
            geometric();
        }
        if (met == 2) {
            arithmetic();
        }
    }
}
