public class Rectangle {

    public static int perimeter(int length, int width) {
        return (length + width) * 2;
    }
    public static int area(int length, int width){
        int result = length * width;
         return result;

    }
    public static void main(String[]args){
        int myResult = perimeter(4,8);
        System.out.println("perimeter is: "+ myResult);
    }

}
