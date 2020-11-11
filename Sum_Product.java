import java.util.Scanner;

public class Sum_Product {
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
        int sum = 0;
        for (int i = 0;i < array.length;i++){
            sum=sum+array[i];
        }
        int pr = 1;
            System.out.println("Сумма аргументов: "+sum);
        for (int i = 0;i < array.length;i++) {
            pr = pr * array[i];
        }
            System.out.println("Произведение аргументов: "+pr);

    }

}
