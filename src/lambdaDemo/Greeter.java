package lambdaDemo;

/**
 * Created by byung-chunyoo on 6/25/17.
 */
public class Greeter {
    public void greet(Greeting greeting){
        greeting.perform();
    }

    public static void main (String [] args){
        Greeter greeter = new Greeter();
        Greeting helloWorldGreeting= new HelloWorldGreeting();
//      greeter.greet(helloWorldGreeting);//output==Hello World
//        helloWorldGreeting.perform();//output == Hello World


       Greeting lambdaGreeting = () -> System.out.println("Hello Lambda World");//MyLambda can
        //replace Greeting. All it needs is the same signature and interface.

//        lambdaGreeting.perform();
        lambdaGreeting.perform();

        MyAddLambda addFunction = (int a, int b) -> System.out.println(a + b);
        addFunction.add(3, 4);

        Greeting innerClassGreeting = new Greeting(){//annonymous inner class
            public void perform (){
                System.out.println("Hello World from inner class");
            }
        };
        innerClassGreeting.perform();
    }

}

interface MyLambda {
    public void greet();
}

interface MyAddLambda{
    void add(int x, int y);
}
