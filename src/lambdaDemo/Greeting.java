package lambdaDemo;

@FunctionalInterface
public interface Greeting {
    public void perform();
    default public void addForFun(){//default is Java 8 concept for backward compatibility
        System.out.println("hello world");
    };
}
