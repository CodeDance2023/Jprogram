package test1;
import java.util.Scanner;
public class test_1 {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
//        if (in.hasNextInt()){
//            int age = in.nextInt();
//            int year = in.nextInt();
          int[][] a = new int[3][];     //不规则二维数组
          a[0] = new int[2];              //第一行
          a[1] = new int[3];              //第二行
          a[2] = new int[2];              //第三行
          for (int i = 0; i < 3; ++i)
          {
                
              for (int j = 0; j < a[i].length; ++j)
              {
                  a[i][j] = in.nextInt();
                  System.out.print(a[i][j] + " ");
              }
              System.out.println();
          }
        }
    }

//
////class stu {
////    int age;
////    String name;
////
////    public stu(int age, String name) {
////
////        System.out.println(age + " " + name);
////    }
////}
