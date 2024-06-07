import java.text.DecimalFormat;

@SuppressWarnings("ALL")
public class MyMath {
    public static void show() {
        System.out.println(1);
    }
    public static void main(String[] args) {
        //abs(): 获取绝对值，但是输入的负数的绝对值大于整个数据作为正数时候的范围，
        //那么就没有绝对值跟这个负数对应
        int a = -2147483647;   //整数的最大范围： 2147483647
        int a_abs = Math.abs(a);
        System.out.println(a_abs);   //output: 2147483647

        int b = -2147483647 + (-1);   //最大的int范围+1，就不能输入其绝对值，因为没有和它对应的
        int b_abs = Math.abs(b);
        System.out.println(b_abs);   //output: -2147483648

        //ceil   //向上取整
        double num = 1.2;
        double numCeil = Math.ceil(num);
        System.out.println(numCeil);   //output: 2.0
        
        
        //floor   向下取整
        double num1 = 1.2;
        double num1_floor = Math.floor(num1);
        System.out.println(num1_floor);   //output: 1.0

        //round   四舍五入
        double num2 = 1.2;
        long num2_round = Math.round(num2);
        System.out.println(num2_round);  //output: 1


        //max
         int num3 = 1;
         int num4 = 2;
         float fnum3 = 1.0f;
         float fnum4 = 2.0f;
         long lnum3 = 100;
         long lnum4 = 200;
         double dnum3 = 1.0;
         double dnum4 = 2.0;;
        System.out.println(Math.max(num3, num4));  // output: 2
        System.out.println(Math.max(fnum3, fnum4)); // output: 2.0
        System.out.println(Math.max(lnum3, lnum4)); // output: 200
        System.out.println(Math.max(dnum3, dnum4)); //output: 2.0



        //min
        System.out.println(Math.min(num3, num4));  // output: 1
        System.out.println(Math.min(fnum3, fnum4)); // output: 1.0
        System.out.println(Math.min(lnum3, lnum4)); // output: 100
        System.out.println(Math.min(dnum3, dnum4)); //output: 1.0

        //pow 次幂  ---------返回值是double类型

        double pow = Math.pow(2, 3);
        System.out.println(pow);  //output: 8.0

        //sqrt   --------平方根
        //cbrt  ---------立方根
        int aa = 2;
        double sqrt = Math.sqrt(aa);
        double cbrt = Math.cbrt(aa);
        //创建DecimalFromat对象控制精度
        DecimalFormat decimalFormat = new DecimalFormat("0.00");
        String aaFormat = decimalFormat.format(sqrt);
        String aaFormat1 = decimalFormat.format(cbrt);

        System.out.println("控制精度前：" + sqrt);  //控制精度前：1.4142135623730951

        System.out.println("控制精度后：" + aaFormat);   //控制精度后： 1.41
        System.out.println("控制精度前：" + cbrt);  //控制精度前：1.2599210498948732
        System.out.println("控制精度后：" + aaFormat1);  //控制精度后：1.26


        //random   -------------[0.0 ~ 1.0)之间的随机数
        double random = Math.random();
        System.out.println((int)Math.floor((random * 10) + 1));   // 1 ~ 10

    }
}
