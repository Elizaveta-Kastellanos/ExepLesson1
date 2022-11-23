import java.util.InputMismatchException;
import java.util.List;

public class IOHelper {
    public static int IAcceptIntArray(int[] mas, int value) {
        int lenMas = 3;
        for (int i = 0; i < mas.length; i++) {
            if (mas[i] == value) {
                return i;
            }
        }
        if (lenMas > mas.length) {
            throw new ArrayIndexOutOfBoundsException("-1");
        } else if (mas == null) {
            throw new NullPointerException("-3");
        } else if (value == -1) {
            throw new ArithmeticException("-5");
        } else {
            throw new ArithmeticException("-2");
        }
    }
    // 1.) Реализуйте 3 метода, чтобы в каждом из них получить разные исключения
    //     Посмотрите на код, и подумайте сколько разных типов исключений вы тут сможете получить?
    // 2.) Реализуйте метод, принимающий в качестве аргументов два целочисленных массива,
    //     и возвращающий новый массив, каждый элемент которого равен разности элементов двух входящих массивов в той же ячейке.
    //     Если длины массивов не равны, необходимо как-то оповестить пользователя.
    //* Реализуйте метод, принимающий в качестве аргументов два целочисленных массива,
    // и возвращающий новый массив, каждый элемент которого равен частному элементов двух входящих массивов в той же ячейке.
    // Если длины массивов не равны, необходимо как-то оповестить пользователя.
    // Важно: При выполнении метода единственное исключение, которое пользователь может увидеть - RuntimeException, т.е. ваше.
    public static float DivideNums(int num, int denominator){
        if(denominator == 0){
            throw new ArithmeticException("На 0 делить нельзя");
        }
        return num/denominator;
    }

    public static boolean CheckAge(int age){
        if(age <= 0){
            throw new ArithmeticException("Вы ввели отрицательное число или 0!");
        }
        final int MIN_AGE = 18;
        final int MAX_AGE = 55;
        if(age >= MIN_AGE && age <= MAX_AGE){
            return true;
        } else if(age<MIN_AGE){
            throw new ArithmeticException("Извините. Вы несовершеннолетний.");
        } else if(age>MAX_AGE){
            throw new ArithmeticException("Извините. Максимальный возраст 55");
        } else {
            throw new InputMismatchException("Ты ввел слишком большое число. Столько не живут");
        }
    }

    public static void InsertByIndex(List<Integer> myList, int index, int value){
        if(index < 0 && index > myList.size()){
            throw new ArrayIndexOutOfBoundsException("Такого индекса нет в данном массиве!");
        }
        if (myList == null){
            throw new NullPointerException("Массив не создан");
        }
        myList.add(index,value);
    }
    public static int[] ISubtractElemMass(int[] mas1, int[] mas2){
        if(mas1.length != mas2.length){
            throw  new ArithmeticException("Длины массивов не равны. Передайте равные массивы по длине!");
        }
        if(mas1 == null && mas2 == null){
            throw new NullPointerException("Вы передали пустой массив");
        }
        int [] result = new int[mas1.length];
        for(int i = 0; i < mas2.length; i++){
            result[i] = mas1[i] - mas2[i];
        }
        return result;
    }
    public static int[] IDivideElemMass(int[] mas1, int[] mas2){
        if(mas1.length != mas2.length){
            throw new RuntimeException("Длины массивов не равны!");
        }
        if(mas1 == null && mas2 == null){
            throw new RuntimeException("Какой то из массивов забыли создать!:(");
        }
        int[] result = new int[mas1.length];
        for(int i = 0;i<mas2.length;i++){
            if(mas2[i] == 0){
                throw new RuntimeException("На 0 делить неельзя!:(");
            }
            result[i] = mas1[i]/mas2[i];
        }
        return result;
    }

    public static int sum2d(String[][]arr){
        if (arr == null){
            throw  new NullPointerException("Массив не создан");
        }
        if (arr.length != 5){
            throw new ArrayIndexOutOfBoundsException("Длина массива не равна 5");
        }
        int sum = 0;
        for(int i =0; i<arr.length;i++){
            for(int j =0;j<5;j++){
                int val = Integer.parseInt(arr[i][j]);
                sum+=val;
            }
        }
        return sum;
    }

}