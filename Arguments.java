import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.Scanner;


public class Arguments {
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
        int temp = 0;
        for(int i = 0, j = array.length - 1; i < array.length/2; i++, j--){
            temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
        for(int i = 0;i < array.length;i++){
            System.out.println(array[i]);
        }

    }
}
