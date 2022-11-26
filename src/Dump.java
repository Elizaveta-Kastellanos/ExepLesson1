import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Dump {
    //        System.out.println(IOHelper.IAcceptIntArray(new int[] {1,2,3,4,5}, 2));
//        try{
//            Scanner sc = new Scanner(System.in);
//            int num1 = sc.nextInt();
//            int num2 = sc.nextInt();
//            System.out.println((int)IOHelper.DivideNums(num1, num2));
//        }
//        catch (ArithmeticException ex){
//            System.out.println(ex.getMessage());
//        }
//        catch(InputMismatchException ex){
//            System.out.println("Упс. Попробуй еще раз. Введи целое число.)");
//        }
//
//        try {
//            System.out.println("Enter: ");
//            Scanner sc = new Scanner(System.in);
//            int age = sc.nextInt();
//            System.out.println(IOHelper.CheckAge(20));
//            List<Integer> myList = new ArrayList<>();
//            for(int i = 0;i<=10;i++){
//                myList.add(i);
//            }
//            IOHelper.InsertByIndex(myList, -1, 19);
//        }
//        catch (ArithmeticException ex){
//            System.out.println(ex.getMessage());
//        }
//        catch (InputMismatchException ex){
//            System.out.println(ex.getMessage());
//        }
//        catch(NullPointerException ex){
//            System.out.println(ex.getMessage());
//        }
//        catch(IndexOutOfBoundsException ex){
//            System.out.println(ex.getMessage());
//        }
//
//        try{
//            for(int i=0;i<(IOHelper.ISubtractElemMass(new int[]{1,2,3,4,5,6}, null)).length;i++){
//            System.out.println(IOHelper.ISubtractElemMass(new int[]{1,2,3,4,5,6}, new int[]{1,2,3,4,5,6})[i]);
//            }
//        }
//        catch (ArithmeticException ex){
//            System.out.println(ex.getMessage());
//        }
//        catch (NullPointerException ex){
//            System.out.println(ex.getMessage());
//        }
//        try{
//            IOHelper.IDivideElemMass(null, null);
//        }
//        catch (RuntimeException ex){
//            System.out.println(ex.getMessage());
//        }
//        try{
//        int a = IOHelper.sum2d(new String[][]{{"wcwc","dsc","dscs","dsv","ve"}, {"7","0","1","12","13"}});
//        System.out.println(a);
//    }
//        catch(IndexOutOfBoundsException ex){
//        System.out.println(ex.getMessage());
//    }
//        catch(NullPointerException ex){
//        System.out.println(ex.getMessage());
//    }
//    String[] str = {"dfcwfc", "dffcvv"};
    //1.
//        while (true) {
//        try {
//            Scanner sc = new Scanner(System.in);
//            System.out.println(Homework2.EnterFloat(sc.nextFloat()));
//            break;
//        }
//        catch(InputMismatchException ex){
//            System.out.println("Упс.Что-то пошло не так.Попробуй еще раз!");
//        }
//    }
//    //2. исправить код, если необходимо
//        try {
//        Scanner sc = new Scanner(System.in);
//        int[] intArray = new int[]{12,23,14,56,78,90,-12,91,18,3,1,0};
//        int d = sc.nextInt();
//        double catchedRes1 = intArray[8] / d;
//        System.out.println("catchedRes1 = " + catchedRes1);
//    } catch (ArithmeticException e) {
//        System.out.println("Catching exception: " + e);
//    } catch (InputMismatchException ex){
//        System.out.println("Упс.Что-то пошло не так.Введи число");
//    }
//
//    // 3.  исправить код, если необходимо (тут есть второй вариант, у main указать throws FileNotFoundExeption,
//    // далее оставить один catch Throwable - тоже работает. Как лучше честно не знаю.)
//        try {
//        int a = 90;
//        int b = 3;
//        System.out.println(a / b);
//        Homework2.printSum(1, 2);
//        int[] abc = { 1, 2 };
//        abc[2] = 9;
//    } catch (
//    FileNotFoundException ex) {
//        System.out.println("Что-то пошло не так...");
//    }catch (NullPointerException ex) {
//        System.out.println("Указатель не может указывать на null!");
//    } catch (IndexOutOfBoundsException ex) {
//        System.out.println("Массив выходит за пределы своего размера!");
//    }
//
//    // 4.Разработайте программу, которая выбросит Exception,
//    // когда пользователь вводит пустую строку.
//    // Пользователю должно показаться сообщение, что пустые строки вводить нельзя.
//        while(true){
//        try{
//            Scanner sc = new Scanner(System.in);
//            System.out.println(Homework2.CheckEmail(sc.nextLine()));
//            break;
//        }catch(ArithmeticException ex){
//            System.out.println("isEmpty" + ex);
//        }
//    }
}
