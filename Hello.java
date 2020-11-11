import java.util.Scanner;
public class Hello {
    public static void main(String args[]) {
        String name1 = new String();
        Scanner in = new Scanner(System.in);
        System.out.println("Введите ваше имя: ");
        name1 = in.nextLine();
        System.out.println("Привет "+ name1);
    }
}