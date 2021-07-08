public class Aritest3 {
    public static void main (String[] args){

        //(前)++:先自增1，后运算
        //(后)++:先运算，后自增1
        int a1 = 10;
        int b1 = ++a1;
        System.out.println("a1 = " + a1 + ",b1 = " +b1);

        int a2 = 10;
        int b2 = a2++;
        System.out.println("a2 = " + a2 + ",b2 = " +b2);

        int a3 = 10;
        //++a3;
        a3++;
        int b3 = a3;
        System.out.println("a3 = " + a3 + ",b3 = " +b3);

        //注意点：
        short s1 = 10;
        //s1 = s1 +1 //编译失败
        s1 = (short) (s1 + 1);//正确的
        s1++;//自增1不会改变本身变量的数据类型
        System.out.println(s1);

        //问题：
        byte bb1 = 127;
        bb1++;
        System.out.println("bb1 = " + bb1);

        //(前)--:先自减1，后运算
        //(后)--:先运算，后自减1
        int a4 = 10;
        int b4 =a4--;//int b4 = --a4;
        System.out.println("a4 = " + a4 + ",b4 = " +b4);





    }
}
