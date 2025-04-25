public class calculator {
    public static int division(int a,int b)
    {
        int r=0;
        try {
            r=a+b; 
        } catch (ArithmeticException e) {
            System.out.println("you can not devied by 0");
        }
        return r;
    }
    public static int add(int a,int b)
    {
        return a+b;
    }
    public static int subtraction(int a,int b)
    {
        return a-b;
    }
    public static int multiplication(int a,int b)
    {
        return a*b;
    }
}