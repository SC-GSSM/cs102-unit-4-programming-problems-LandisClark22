package unit4;

public class Unit4 {

    public static void main(String[] args) {
        Unit4 unit = new Unit4();

        System.out.println("sumNumbers(5) = " + unit.sumNumbers(5));
        System.out.println("repeatString(\"hi\", 3) = " + unit.repeatString("hi", 3));
        System.out.println("findFactorial(5) = " + unit.findFactorial(5));
        System.out.println("countVowels(\"Hello World\") = " + unit.countVowels("Hello World"));
        System.out.println("isPalindrome(\"racecar\") = " + unit.isPalindrome("racecar"));

        unit.printAsteriskPatterns(3);
        unit.multiplicationTable(3);
    }

    public int sumNumbers(int n) {
        if (n <= 0) return 0;

        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    public String repeatString(String str, int n) {
        if (n <= 0 || str.equals("")) return "";

        String result = "";
        for (int i = 0; i < n; i++) {
            result += str;
        }
        return result;
    }

    public int findFactorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public int countVowels(String str) {
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            char c = Character.toLowerCase(str.charAt(i));
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                count++;
            }
        }
        return count;
    }

    public boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public void printAsteriskPatterns(int n) {
        for (int i = 0; i < n; i++) {
            System.out.print("*");
        }
        System.out.print("\n");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }

    public void multiplicationTable(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print((i * j) + "\t");
            }
            System.out.print("\n");
        }
    }
}