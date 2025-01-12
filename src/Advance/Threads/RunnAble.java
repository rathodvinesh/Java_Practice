package Advance.Threads;

class ABC implements Runnable{
    @Override
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println("Hi");
            try{
                Thread.sleep(10);
            }catch(InterruptedException e){
                throw new RuntimeException();
            }
        }
    }
}

class BCD implements Runnable{
    @Override
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println("Hello");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

public class RunnAble {
    public static void main(String[] args){
        ABC obj1 = new ABC();
        BCD obj2 = new BCD();

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        try {
            Thread.sleep(5);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        t2.start();
    }
}
