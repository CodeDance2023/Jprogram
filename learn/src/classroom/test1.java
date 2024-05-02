package classroom;
import java.util.Scanner;
public class test1 {
    public static void main()
    {

    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("输入阶数：");
        int n = input.nextInt();
        long [] a = new long [n];
        for (int i = 0; i < n; i++){
            for (int j = i; j >= 0; j--){  //滚动数组必须从后往前遍历，防止数据先被更改再进行递推
                if (j == 0){
                    a[j] = 1;
                    System.out.print(a[j] + " ");
                }
                else if (j == i && j > 1){
                    a[j] = 1;
                    System.out.print(a[j] + " ");
                }
                else{
                    a[j] = a[j - 1] + a[j];
                    System.out.print(a[j] + " ");
                }
            }
            System.out.println();
        }


    }
}