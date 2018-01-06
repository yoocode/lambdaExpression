package unit3;

/**
 * Created by byung-chunyoo on 7/16/17.
 */
public class MethodReferenceExample1 {

    public static void main (String [] args){
        System.out.println("directly execute the method: ");
        printMessage();

        System.out.println("use anonymous inner class ");

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello from inside of anonymous class");
            }
        });

        thread.run();

        System.out.println(" ");
        System.out.println("Using lambda");

        Thread thread1 = new Thread(() -> System.out.println("Hello from inside of lambda"));

        thread1.run();

        System.out.println(" ");
        System.out.println("direct method call from lambda");

        Thread thread2 = new Thread(() -> printMessage());//method execution: taking a method and execute it.

        thread2.start();//method from Thread class
        thread2.run();

        //Method reference when no input argument and calling a method with no argument

        Thread thread3 = new Thread(MethodReferenceExample1::printMessage);//inside () is the same as () -> printMessage()



    }

    public static void printMessage(){
        System.out.println("Hello");
    }
}
