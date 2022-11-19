import com.sun.jdi.connect.Connector;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        System.out.println(IOHelper.IAcceptIntArray(new int[] {1,2,3,4,5}, 2));
        try{
            Scanner sc = new Scanner(System.in);
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();
            System.out.println((int)IOHelper.DivideNums(num1, num2));
        }
        catch (ArithmeticException ex){
            System.out.println(ex.getMessage());
        }
        catch(InputMismatchException ex){
            System.out.println("Упс. Попробуй еще раз. Введи целое число.)");
        }

        try {
            System.out.println("Enter: ");
            Scanner sc = new Scanner(System.in);
            int age = sc.nextInt();
            System.out.println(IOHelper.CheckAge(20));
            List<Integer> myList = new ArrayList<>();
            for(int i = 0;i<=10;i++){
                myList.add(i);
            }
            IOHelper.InsertByIndex(myList, -1, 19);
        }
        catch (ArithmeticException ex){
            System.out.println(ex.getMessage());
        }
        catch (InputMismatchException ex){
            System.out.println(ex.getMessage());
        }
        catch(NullPointerException ex){
            System.out.println(ex.getMessage());
        }
        catch(IndexOutOfBoundsException ex){
            System.out.println(ex.getMessage());
        }

        try{
            for(int i=0;i<(IOHelper.ISubtractElemMass(new int[]{1,2,3,4,5,6}, null)).length;i++){
            System.out.println(IOHelper.ISubtractElemMass(new int[]{1,2,3,4,5,6}, new int[]{1,2,3,4,5,6})[i]);
            }
        }
        catch (ArithmeticException ex){
            System.out.println(ex.getMessage());
        }
        catch (NullPointerException ex){
            System.out.println(ex.getMessage());
        }
        try{
            IOHelper.IDivideElemMass(null, null);
        }
        catch (RuntimeException ex){
            System.out.println(ex.getMessage());
        }
    }
}
