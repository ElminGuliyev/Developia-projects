public class Calculator {
    static int plusMethod(int x, int y){
        return x + y;

    }
    static int plusMethod(int x, int y, int c){
        return x + y + c;


    }
    static int decrementMethod(int a, int b){
        return a - b;

    }
    static int decrementMethod(int a, int b, int c){
        return a - b - c;
    }
    static int multiplyMethod(int f, int n){
        return f * n;
    }
    static int divisionMethod(int s, int h){
        return s / h;
    }


    public static void main(String[]args){
        int increment = plusMethod(7,9,8);
        System.out.println("increment: 7 + 9 + 8 = " +increment);
        int decrement = decrementMethod(50,26);
        System.out.println("decrement: 50 - 26 = " +decrement);
        int multiply = multiplyMethod(6,8);
        System.out.println("multiply: 6 * 8 = " +multiply);
        int division = divisionMethod(40,5);
        System.out.println("division: 40 / 5 = " +division);


    }


}
