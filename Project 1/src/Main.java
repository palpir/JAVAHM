import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        try {
            System.out.println("\t\t\t *** Калькулятор ***\t\t\t");
            System.out.println("Введите 1-ое число");
            double inputFirst = new Scanner(System.in).nextDouble();

            System.out.println("Введите 2-ое число");
            double inputSecond = new Scanner(System.in).nextDouble();

            System.out.println("Вы ввели :"+inputFirst+" и "+inputSecond);

            System.out.println("Сумма : "+(inputFirst+inputSecond));
            System.out.println("Разность :"+(inputFirst-inputSecond));
            System.out.println("Умножение :"+(inputFirst*inputSecond));
            System.out.println("Деление :"+(inputFirst/inputSecond));

        } catch (Exception e) {
            System.out.println("Вы ввели некорректное значение");
            System.out.println("Остановка программы");
        }


    }
}
