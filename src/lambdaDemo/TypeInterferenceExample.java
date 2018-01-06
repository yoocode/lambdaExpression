package lambdaDemo;

/**
 * Created by byung-chunyoo on 6/25/17.
 */
public class TypeInterferenceExample {

    public static void main (String[] args){

        printLambda(s -> s.length());

//        StringLengthLambda myLambda = s -> s.length();//s is the same as (String s), compiler infers the type from interface.

 //       System.out.println(myLambda.getLength("Hello Lambda without type"));



    }

    public static void printLambda(StringLengthLambda l){
        System.out.println(l.getLength("Hello Lambda"));
    }

}

interface StringLengthLambda {
    public int getLength(String s);
}