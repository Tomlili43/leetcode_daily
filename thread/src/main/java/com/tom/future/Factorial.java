package future;

import java.util.concurrent.Callable;

public class Factorial implements Callable<Long>{
    private int number;

    public Factorial(int number){
        this.number = number;
    }

    @Override
    public Long call(){
        return calculate();
    }
    
    public Long calculate(){
        long result = 1;
        if(number <0){
            throw new IllegalArgumentException("Number must be greater than 0");
        }
        while(number > 0){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
                // TODO: handle exception
            }
            result *= number;
            number--;
        }
        return result;
    }
    
    
}
