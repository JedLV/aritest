public class AfterClassExercises {
    public  static void main (String[] args){

        //练习一
        int i = 1;
        i *= 0.1;
        System.out.println(i);//0
        i++;
        System.out.println(i);//1;


        //练习二
        int m = 2;
        int n = 3;
        n *= m++; //n = n * m++;
        System.out.println("m=" + m);//3
        System.out.println("n=" + n);//6

        //练习三
        int n1 =10;
        n1 += (n1++) + (++n1); //n1 + (n1++) + (++n1);
        System.out.println(n1);//32

    }
}
