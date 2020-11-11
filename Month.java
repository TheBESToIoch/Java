import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Month {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        int a ;
        System.out.println("Введите число соотвествующего месяца (от 1 до 12): ");
        a = input.nextInt();
        switch (a){
            case 0 :
                System.out.println("Введите число от 1 до 12");
                break;
            case 1 :
                System.out.println("Январь");
                break;
            case 2 :
                System.out.println("Февраль");
                break;
            case 3 :
                System.out.println("Март");
                break;
            case 4 :
                System.out.println("Апрель");
                break;
            case 5 :
                System.out.println("Май");
                break;
            case 6 :
                System.out.println("Июнь");
                break;
            case 7 :
                System.out.println("Июль");
                break;
            case 8 :
                System.out.println("Август");
                break;
            case 9 :
                System.out.println("Сентябрь");
                break;
            case 10 :
                System.out.println("Октябрь");
                break;
            case 11 :
                System.out.println("Ноябрь");
                break;
            case 12 :
                System.out.println("Декабрь");
                break;
            default:
                System.out.println("Вы дурачек! Сказано же, введите число соответсвующего месяца");
        }

    }
}
