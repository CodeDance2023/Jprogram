package Textbook;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.function.Consumer;

public class For {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);
        arrayList.add(6);
        Iterator<Integer> iterator1 = arrayList.iterator();   //获取迭代器时，会将当前修改次数modcount传给expectedcount
//       while (iterator1.hasNext()) {
//           Integer next = iterator1.next();
//            if (next.equals(1)) {
//                iterator1.remove();    //删除next后面的元素： 即：1 3 4 5 6
//           }
//
//       }
//       Iterator<Integer> iterator2 = arrayList.iterator();
//       while (iterator2.hasNext()) {
//           System.out.println(iterator2.next());
//       }
//
//        ListIterator<Integer> listIterator = arrayList.listIterator();
//        while (listIterator.hasNext()) {
//            Integer next = listIterator.next();
//            if (next == 2) {
//                listIterator.add(0);  //添加到next后面 即：1 2 0 3 4 5 6
//            }
//        }
//
//        ListIterator<Integer> listIterator2 = arrayList.listIterator();
//
//        while (listIterator2.hasNext()) {
//            System.out.println(listIterator2.next());
//        }


//        arrayList.forEach(new Consumer<Integer>() {
//            @Override
//            public void accept(Integer integer) {
//                System.out.println(integer);
//            }
//        });

//        for (Integer i : arrayList) {
//            System.out.println(i);
//        }

        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }
    }

}