import com.sun.jdi.connect.Connector;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        //1.
        while (true) {
            try {
                Scanner sc = new Scanner(System.in);
                System.out.println(Homework2.EnterFloat(sc.nextFloat()));
                break;
            }
            catch(InputMismatchException ex){
                System.out.println("Упс.Что-то пошло не так.Попробуй еще раз!");
            }
        }
        //2. исправить код, если необходимо
        try {
            Scanner sc = new Scanner(System.in);
            int[] intArray = new int[]{12,23,14,56,78,90,-12,91,18,3,1,0};
            int d = sc.nextInt();
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        } catch (InputMismatchException ex){
            System.out.println("Упс.Что-то пошло не так.Введи число");
        }

        // 3.  исправить код, если необходимо (тут есть второй вариант, у main указать throws FileNotFoundExeption,
        // далее оставить один catch Throwable - тоже работает. Как лучше честно не знаю.)
        try {
            int a = 90;
            int b = 3;
            System.out.println(a / b);
            Homework2.printSum(1, 2);
            int[] abc = { 1, 2 };
            abc[2] = 9;
        } catch (FileNotFoundException ex) {
                System.out.println("Что-то пошло не так...");
        }catch (NullPointerException ex) {
            System.out.println("Указатель не может указывать на null!");
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Массив выходит за пределы своего размера!");
        }

        // 4.Разработайте программу, которая выбросит Exception,
        // когда пользователь вводит пустую строку.
        // Пользователю должно показаться сообщение, что пустые строки вводить нельзя.
        while(true){
            try{
                Scanner sc = new Scanner(System.in);
                System.out.println(Homework2.CheckEmail(sc.nextLine()));
                break;
            }catch(ArithmeticException ex){
                System.out.println("isEmpty" + ex);
            }
        }

    }
}



