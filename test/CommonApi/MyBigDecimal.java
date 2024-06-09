import java.math.BigDecimal;
import java.math.RoundingMode;

public class MyBigDecimal {
    public static void main(String[] args) {

        //构造方法获取
        BigDecimal bigDecimal = new BigDecimal("0.11111112497954654");
        System.out.println(bigDecimal);

        //静态方法vauleOf获取0 ~ 10之间的整数已将提前创建好了,但是不能超long和double的范围
        BigDecimal bigDecimal1 = BigDecimal.valueOf(3.1415926111111111);
        System.out.println(bigDecimal1);

        //加减乘除
        BigDecimal b1 = new BigDecimal("0.33");
        BigDecimal b2 = new BigDecimal("0.4455555");
        System.out.println(b1.add(b2));
        System.out.println(b1.subtract(b2));
        System.out.println(b1.multiply(b2));

        //除法的精度控制和舍入模式
        BigDecimal divideres = b1.divide(b2, 2, RoundingMode.HALF_UP);
        System.out.println(divideres);  //output: 0.74


    }
}
