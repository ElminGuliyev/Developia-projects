public class ForLoopTests {

    public static void main(String[] args) {

        String str1 = "question";
        String str2 = "answer";
        int lengthstr1 = str1.length();
        int lengthstr2 = str2.length();

        if (lengthstr1 < lengthstr2) {
            System.out.println("The first string is longer");
        } else if (lengthstr2 > lengthstr1) {
            System.out.println("The second string is longer");
        } else if (lengthstr2 == lengthstr1) {
            System.out.println("Both strings are of equal length");
        }

        String newWord = "word";
        String reverseWord = "";

        for (int i = 0; i < newWord.length(); i++) {
            reverseWord = newWord.charAt(i) + reverseWord;

        }
        System.out.println(reverseWord);

        int f = 0;

        System.out.println("f++ " + f++);
        System.out.println("++f " + ++f);

        for (int i = 0; i < 10; i++) {
            System.out.println("i = " + i);
        }

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print("i = " + i + ", ");
                System.out.println("j = " + j);
            }
        }
    }
}