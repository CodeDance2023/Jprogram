public class MySystem {
    public static void main(String[] args) {
        //eixt()     终止当前虚拟机的运行
        System.out.println(1);
//        System.exit(0);
        System.out.println(2);


        //currentTimeMillis()    返回当前系统时间距离”计算机时间原点“的毫秒值
        long time = System.currentTimeMillis();
        System.out.println(time);


        //arraycopy
        int[] a = {1,2,3,4,5,6,7,8,9,10};
        int[] b = new int[100];
        System.arraycopy(a,0,b,0,a.length);
        for (int i = 0; i < 10; i++) {
            System.out.print(b[i] + " ");  //output: 1 2 3 4 5 6 7 8 9 10
        }

    }
}
