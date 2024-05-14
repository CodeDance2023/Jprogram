package classroom;

//主类
public class Task {
    public static void main(String[] args) {
        Overload ol = new Overload();
        System.out.println("两个整数中的最大值是：" + ol.max(1, 2));
        System.out.println("两个实数中的最大值是：" + ol.max(1.0, 2.0));
        System.out.println("三个整数中的最大值是：" + ol.max(1,2,3));
        System.out.println("三个实数中的最大值是：" + ol.max(1.0,2.0,3.0));
    }
}


//方法重载类
class Overload{

    //求两个整数中的最大值
    int max(int x, int y){
        return Math.max(x, y);
    }

    //求两个单精度浮点数中的最大值
    float max(float x, float y){
        return Math.max(x, y);
    }

    //求两个双精度浮点数中的最大值
    double max(double x, double y){
        return Math.max(x, y);
    }

    //求三个整数中的最大值
    int max(int x, int y, int z){
        int max = 0;    //开始将max设置成为一个很小的数
        int[] arr = {x, y, z};   //把三个数放进一个数组里面里面去，方便进行索引
        for (int j : arr) {
            max = Math.max(max, j);
        }
        return max;
    }

    //求三个单精度浮点数中的最大值
    float max(float x, float y, float z){
        float max = 0.0f;    //开始将max设置成为一个很小的数
        float[] arr = {x, y, z};   //把三个数放进一个数组里面里面去，方便进行索引
        for (float j : arr) {
            max = Math.max(max, j);
        }
        return max;
    }

    //求三个双精度浮点数中的最大值
    double max(double x, double y, double z){
        double max = 0.0;    //开始将max设置成为一个很小的数
        double[] arr = {x, y, z};   //把三个数放进一个数组里面里面去，方便进行索引
        for (double j : arr) {
            max = Math.max(max, j);
        }
        return max;
    }
}