import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Employee {
    String name;
    String position;
    String attendance;



    public static void main(String[]args){
        System.out.println("Employee's info: ");
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        String position = scan.nextLine();
        String attendance = scan.nextLine();
        System.out.println("Employee's info: " +name + "," + position + "," + attendance);

        Employee obj = new Employee();
        String name = obj.name;










    }

}
