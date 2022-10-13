public class MethodWithPrameter {
    void sep(int a,int b){
        System.out.println(a-b);
    }
    void message(String message){
        System.out.println(message);
    }
    int add(int a,int b){
        return a+b;
    }
    public static void main(String[] args) {

        MethodWithPrameter obj=new MethodWithPrameter();
        obj.sep(100,200);
        obj.message("java is plate idep");
        int sum= obj.add(100,200);
        System.out.println(sum);
    }
}