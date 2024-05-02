package classroom;
import java.util.*;

public class test2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);   //创建input键盘输入对象
        System.out.println("Please enter the length of the arr1: ");
        int n = input.nextInt();    //输入数组arr1的行数
        int[] arr1 = new int[n];    //为数组arr1开辟空间
        System.out.println("Please enter the values of the arr1: ");
        for (int i = 0; i < arr1.length; ++i)  //输入数组arr1的数据
        {
            arr1[i] = input.nextInt();
        }

        System.out.println("Please enter the numbers of rows of the arr2: ");
        int row = input.nextInt(); //输入二维数组arr2的行
        System.out.println("Please enter the numbers of cols of the arr2: ");
        int col = input.nextInt(); //输入二维数组arr2的列
        int[][] arr2 = new int[row][col];    //为二维数组arr2开辟空间
        System.out.println("Please enter the values of the arr2: ");
        //错误的输入方法
//        for (int[] i : arr2)   //输入二维数组的值
//        {                      //i是每一行的地址
//            for (int j : i)   //j是一行的每一个值
//            {
//                j = input.nextInt();   //j都是一个局部的值(是另外一片空间)，而不是地址，因此输入时不能改变arr2原有的值，只能改变j的值
//            }
//        }
        //正确的输入方法
         for (int i = 0; i < row; ++i)
         {
             for (int j = 0; j < col; ++j)
             {
                 arr2[i][j] = input.nextInt();
             }
         }
        //创建ArraysApps对象
        ArraysApps ob = new ArraysApps();
        int Min = ob.selMin(arr1);   //得到arr1数组的最小值
        System.out.println("The minimum valve of the arr1 is: " + Min);
        //修改数组元素的值
        System.out.println("Please enter the index of the element that you want to modify of the arr1: ");
        int index = input.nextInt();
        System.out.println("Please enter the value that you want to modify the element into: ");
        int value = input.nextInt();
        System.out.println("The values of arr1 before modifying are: ");
        for (int i : arr1)   //输出没有修改之前的值
        {
            System.out.print(i + " ");
        }
        System.out.println();  //换行
        ob.modify(index,value,arr1);   //调用modify函数修改数组的值
        System.out.println("The values of arr1 after modifying are：");
        for (int j : arr1)   //输出没有修改之后的值
        {
            System.out.print(j + " ");
        }
        System.out.println(); //换行
        int[] arr2Sum;     //定义arr2Sum数组接收sum数组的数据
        arr2Sum = ob.arrSum(arr2);   //调用arrSum方法
        System.out.println("The sum of every row of arrSum are: ");
        for (int i = 0; i < arr2Sum.length; ++i)
        {
            System.out.println("The sum of the " + (i + 1) +  " row is: " + arr2Sum[i]);
        }
    }
}

//定义ArraysApps类
class ArraysApps
{
    int[] sum;    //定义储存二维数组每一行的和的数组sum
    public int selMin(int[] arr1)
    {
        int min = arr1[0];
        for (int i = 1; i < arr1.length; ++i)
        {
            min = Math.min(min,arr1[i]);    //调用min方法，返回这一次循环的较小值
        }
        return min;
    }
    public void modify(int i, int n, int[] arr)
    {
        arr[i] = n;
    }
    public int[] arrSum(int[][] arr2)
    {
        int row = arr2.length;
        int col = arr2[0].length;
        sum = new int[row];    //为sum数组分配空间
        for (int i = 0; i < row; ++i)
        {
            for (int j = 0; j < col; ++j)
            {
                sum[i] += arr2[i][j];
            }
        }
        return sum;   //返回sum数组
    }
}