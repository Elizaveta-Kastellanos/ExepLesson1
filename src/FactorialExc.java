public class FactorialExc extends Exception{
    private int number;

    public int getNumber() {return number;}
    public FactorialExc(String msg, int num){
        super(msg);
        number = num;
    }
}

class Factorial{
    public  static int getFactorial(int num) throws FactorialExc{
        int result = 1;
        if(num < 1) throw new FactorialExc("Number < 1", num);
        for(int i = 1;i<=num;i++){
            result*=i;
        }
        return result;
    }
}
