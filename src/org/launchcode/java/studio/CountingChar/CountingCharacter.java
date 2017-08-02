import java.util.*;

public class CountingCharacter {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter a string: ");
        String str = input.nextLine();

        System.out.println("Enter a character:");
        char a = input.nextLine().toCharArray()[0];
        int letterCheck = count(str, a);

        System.out.println("The character " + a + "appeared" + letterCheck + "times in" + str);
    }

    public static int count(String str, char a)
    {
        int count = 0;
        for (int i = 0; i < str.length(); i++)
        {
            if (str.charAt(i) == a)
            {
                count++;
            }
        }
        return count;
    }
}
