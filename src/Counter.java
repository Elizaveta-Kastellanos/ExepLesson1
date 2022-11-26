public class Counter extends Exception{
    private static int grow;
    private static int numberCreation;

    public void Add() throws Exception{
        this.grow++;
        this.numberCreation = GetGrow(grow);
    }
    private int GetGrow(int number) throws Exception{
        if(number != grow) throw new Exception("Counter doesn't empty himself");
        return grow;
    }
    public int GetNumberCreation(){
        return numberCreation;
    }
}
