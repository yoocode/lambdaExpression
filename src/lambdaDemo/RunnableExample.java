package lambdaDemo;

/**
 * Created by byung-chunyoo on 6/25/17.
 */
public class RunnableExample {
    public static void main (String [] args){

        Thread myThread = new Thread(new Runnable() {//annonymous inner class
            @Override
            public void run() {
                System.out.println("Printed inside Runnable");
            }
        });

        myThread.run();

        Thread myLambdaThread = new Thread(() -> System.out.println("Printed inside Lambda"));
        myLambdaThread.run();

    }
}
