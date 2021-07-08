public class Aritest1 {
    public static void main (String[] args){

        //除号：/ 取整
        int num1 = 12;
        int num2 = 5;
        int result1 = num1 / num2;
        System.out.println(result1);//2

        int result2 = num1 / num2 * num2;
        System.out.println(result2);//10

        double result3 = num1 / num2;
        System.out.println(result3);//2.0

        double result4 = num1 / num2 + 0.0;//2.0
        double result5 = num1 / (num2 + 0.0);//2.4
        double result6 = (double) num1 / num2;//2.4
        double result7 = (double) (num1 / num2);//2.0
        System.out.println(result4);
        System.out.println(result5);
        System.out.println(result6);
        System.out.println(result7);
    }
}
