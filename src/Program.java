import Exceptions.PersonException;
import com.sun.jdi.connect.Connector;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws PersonException, IOException {
//        try {
//            Counter c = new Counter();
//            c.Add();
//            c.Add();
//            c.Add();
//            System.out.println(c.GetNumberCreation());
//        } catch(Exception e){
//            System.out.println(e.getMessage());
//        }
//        try {
//            System.out.println(Factorial.getFactorial(6));
//        }catch(FactorialExc e){
//            System.out.println(e.getMessage());
//            e.getNumber();
//
        try{
            IOHelper.parsInPerson("Елисеева Иван Васильевич 31.01.1930 89991122339 m");
        } catch (PersonException e){
            System.out.println(e.getMessage());
        }catch (NumberFormatException e){
            System.out.println("Введите значения правильно  через пробел" + e.getMessage());
        }

    }
}



