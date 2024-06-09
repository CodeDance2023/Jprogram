import java.math.BigInteger;
import java.util.Random;

public class MyBigInterger {
    public static void main(String[] args) {
        //传入num和 Random()对象，获取[0 ~ 2的num次方-1]的随机数
        BigInteger bigInteger = new BigInteger(2,new Random());
        System.out.println(bigInteger);

        //获取指定大整数
        BigInteger bigInteger1 = new BigInteger("100000000000000");

        //获取指定大整数并指定进制
        BigInteger bigInteger2 = new BigInteger("10000000000", 10);
        System.out.println(bigInteger2);

        //静态方法valueOf()获取，-16到16已经创建好了，不用再创建 --------!!!但是不能超过long的范围
        BigInteger bigInteger3 = BigInteger.valueOf(10000000);
        System.out.println(bigInteger3);

        //加减乘除
        BigInteger b1 = new BigInteger("123456789");
        BigInteger b2 = new BigInteger("123456789");

        BigInteger add = b1.add(b2);
        BigInteger subtract = b1.subtract(b2);
        BigInteger multiply = b1.multiply(b2);
        BigInteger divide = b1.divide(b2);
        BigInteger[] bigIntegers = b1.divideAndRemainder(b2);  //获取商和余数

        System.out.println("add = " + add);
        System.out.println("subtract = " + subtract);
        System.out.println("multiply = " + multiply);
        System.out.println("divide = " + divide);
        System.out.println("商和余数是：");
        for (BigInteger integer : bigIntegers) {
            System.out.println(integer);
        }

        //equals()  比较的是对象里面的值
        System.out.println(b2.equals(b1));

        //pow(int exponent)
        BigInteger pow = b1.pow(20);
        System.out.println(pow);

        //intValue()   转为int类型整数，但是不能超过int的范围

        int value = b1.intValue();
        System.out.println(value);


    }
}
