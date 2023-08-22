public class JavaIfElse {
    public static void main(String [] args){
     System.out.println(add(1.2, 2));
     System.out.println(subtract(3, 1));
     System.out.println(makePositive(-5));

     int firstNumber = 15;
     int secondNumber = 10;
     if (firstNumber >= secondNumber){
         System.out.println(subtract(firstNumber, secondNumber));
     } else {
         System.out.println(add(firstNumber, secondNumber));
     }

     System.out.println(makeEven(4));
     System.out.println(isPalindrome("Abba"));

    }

    public static int add(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;

    }

    public static double add(double firstNumber, double secondNumber){
        return firstNumber + secondNumber;
    }

    public static int subtract(int firstNumber, int secondNumber) {
        return firstNumber - secondNumber;
    }

    public static int makePositive(int someNumber) {
        if (someNumber <= 0) {
            return -someNumber;
        } else {
            return someNumber;
        }
    }

    public static int makeEven(int someNumber) {
        if (someNumber % 2 == 0){
            return someNumber;
        } else {
            return someNumber * 2;
        }
    }

    public static boolean isPalindrome(String word){
        word = word.toLowerCase();
        String reverse = "";
        for (int i = word.length() - 1; i >= 0; i--){
            reverse = reverse + word.charAt(i);
        }
        return reverse.equals(word);
    }
}
