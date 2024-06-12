import java.util.Arrays;
import java.util.*;
public class MyArrays {
    public static void main(String[] args) {

        //toString(): 返回数组的字符串表示形式
        int[] arr1 = {2, 5, 7, 6, 1, 0, 8, 9};
        String str = Arrays.toString(arr1);
        System.out.println(str);  //[2, 5, 7, 6, 1, 0, 8, 9]

        //binarySearch(): 必须保证数组是有序的，不然会异常
        //在有序的前提下，如果找不到数组中的元素，就返回-插入点-1
        int[] arr2 = {0,1,2,3,4,5,6,7};
        int index = Arrays.binarySearch(arr2, 0);
        System.out.println(index);

        //fill()： 填充数组,类似于C语言的menset()
        Arrays.fill(arr2, 0);
        System.out.println(Arrays.toString(arr2));  //[0, 0, 0, 0, 0, 0, 0, 0]

        //copyof()： 拷贝数组 -------底层还是会调用System.arraycopy()方法
        //1.如果新数组长度小于原数组长度，就会部分拷贝
        //2. 如果新数组的长度等于原数组的长度，就会完全拷贝
        //3. 如果新数组的长度大于原数组的长度，在完全拷贝的同时还会补上默认值
        int[] newarr2 = Arrays.copyOf(arr2, 10);
        String newarr2String = Arrays.toString(newarr2);
        System.out.println(newarr2String);  //[0, 0, 0, 0, 0, 0, 0, 0, 0, 0]

        //copyOfRange():  指定范围的拷贝

        int[] arr3 = {1,2,3,4,5,6,7,8,9,0};
        int[] newArr3 = Arrays.copyOfRange(arr3, 0, 7);
        String newArr3String = Arrays.toString(newArr3);
        System.out.println(newArr3String);  //拷贝7个： [1, 2, 3, 4, 5, 6, 7]



        //sort():    底层是“二分查找”  + "插入排序"
        //           默认是升序排序

        int[] arr4 = {0,2,3,4,5,6,8,9,1,7};
        Arrays.sort(arr4);
        String arr4Sort = Arrays.toString(arr4);
        System.out.println(arr4Sort);   //[0, 1, 2, 3, 4, 5, 6, 7, 8, 9]


        //sort(arr, comparator<E>)
        //可以自定义比较的模式：  传递第二个参数是comparator<E>接口的实现类对象
        //重写里面的compare方法，如果是返回： o1 - o2 ，就是升序
        //重写里面的compare方法，如果是返回： o2 - o1 ，就是降序
        Integer[] arr5 = {0,2,3,4,5,6,8,9,1,7};  //这种方式只能给”包装类“的数组进行排序

        //排序前：
        System.out.println("降序排序前：");
        System.out.println(Arrays.toString(arr5));
        Arrays.sort(arr5, new Comparator<>() {
            @Override
            public int compare(Integer o1, Integer o2) {
//                return o1 - o2;   //升序
                return o2 - o1;   //降序
            }
        });
        System.out.println("降序排序后：");
        System.out.println(Arrays.toString(arr5));

        //output:
        //降序排序前：
        //[0, 2, 3, 4, 5, 6, 8, 9, 1, 7]
        //降序排序后：
        //[9, 8, 7, 6, 5, 4, 3, 2, 1, 0]


    }

}
