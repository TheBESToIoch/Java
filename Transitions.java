import java.util.Scanner;

public class Transitions {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("Количетсво аргументов: ");
        int size = input.nextInt();
        int array[] = new int[size];
        //  String name1 = new String();
        System.out.println("Введите аргументы: ");
        for (int i = 0;i < array.length;i++){
            array[i]  = input.nextInt();
        }
        System.out.println("Вывод с переходом на новую строку");
        for (int i = 0;i < array.length;i++){
            System.out.println(array[i]);
        }
        System.out.print("Вывод без переходов на новую строку ");
        for (int i = 0;i < array.length;i++) {
            System.out.print(array[i]);
        }
    }
}
