package CountCharacter.common;

import java.util.Scanner;

public class Library {
    static Scanner sc = new Scanner(System.in);

    public int getIntData(String msg, int minValue, int maxValue) {
        int data = 0;

        if (minValue > maxValue) {
            int temp = minValue;
            minValue = maxValue;
            maxValue = temp;
        }

        while (true) {
            try {
                System.out.print(msg);
                data = sc.nextInt();
                if (data >= minValue && data <= maxValue) {
                    break;
                } else {
                    System.out.println("An error happens because the value < " + minValue + " or > " + maxValue + "\n");
                }
            } catch (Exception e) {
                System.out.println("An error happens because  the integer number format is invalid\n");
                sc.nextLine();
            }
        }
        sc.nextLine();
        return data;
    }
      public static String getString(String msg) {
        String str = "";

        while (true) {
            try {
                System.out.println(msg);
                str = sc.nextLine();

                if (str.trim().length() == 0) {
                    System.out.println("The length is 0");
                } else {
                    break;
                }
            } catch (Exception e) {
                System.out.println("The string is invalid");
            }
        }

        return str;
    }

    
}
