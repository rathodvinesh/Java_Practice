package Advance.Threads;

//class A{
//    void play(){
//        for(int i=0;i<10;i++){
//
//        System.out.println("Hi");
//        }
//    }
//}
//
//class B{
//    void play(){
//        for(int i=0;i<10;i++){
//
//            System.out.println("Hello");
//        }
//    }
//}

//public class thread {
//    public static void main(String[] args) {
//        System.out.println("Task: Playing a video."); // Single thread performs this task
//    }
//}

class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Thread: " + i);
        }
    }
}

public class thread {
    public static void main(String[] args) {
        MyThread thread = new MyThread(); // Create a Thread object
        thread.start(); // Start the thread
    }
}
