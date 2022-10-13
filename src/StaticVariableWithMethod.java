public class StaticVariableWithMethod {

    static int number=2000;
    int number1=3000;
    void display(){
        System.out.println( number);
        System.out.println( number1);
    }
    static void show(){
        System.out.println( number);
    }

    public static void main(String[] args) {
        show();
        StaticVariableWithMethod staticVariableWithMethod=new StaticVariableWithMethod();
        staticVariableWithMethod.display();
    }
}


