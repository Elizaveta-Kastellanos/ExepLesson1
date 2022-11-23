import java.io.FileNotFoundException;

public class Homework2 {
    // Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float),
    // и возвращает введенное значение. Ввод текста вместо числа не должно приводить к падению приложения,
    // вместо этого, необходимо повторно запросить у пользователя ввод данных.
    public static float EnterFloat(float num){
        return num;
    }

    public static void printSum(int a, int b) throws FileNotFoundException {
        System.out.println(a + b);
    }

    public static String CheckEmail(String email){
        if(email.isEmpty()){
            throw new ArithmeticException("Вы ввели пустую строку");
        }
        return email;
    }
}
