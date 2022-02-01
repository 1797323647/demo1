package demo3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapters;
import java.util.Arrays;
import java.util.Comparator;

/**
 * 升序排序与降序排序
 */
public class ArraysSort {

    public static void main(String[] args) {
        int[] arr = new int[]{45, 78, 21, 12, 1, 65, 32};
        //默认为升序排序
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        //降序排序需要手动设置,且必须为引用类型
        Integer[] arr2 = {12, 45, 78, 32, 65, 11, 23};
        Arrays.sort(arr2, new Comparator<Integer>() {//匿名内部类
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        System.out.println(Arrays.toString(arr2));
    }


}

//选择排序
class Test1 {
    public static void main(String[] args) {
        int[] arr = {5, 1, 3, 2};
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}

class Test2 {
    public static void main(String[] args) {
        int[] arr = {12, 45, 78, 89, 65, 23, 56, 11, 22};
        //必须排序之后才能使用二分查找
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println("============================");
        System.out.println(Test2.Search(arr, 65));
    }

    /**
     * 二分查找
     *
     * @param arr 查找的数组
     * @param num 需要查找的元素
     * @return 返回该元素的索引，-1为没找到
     */
    public static int Search(int[] arr, int num) {
        int left = 0;//开始时的最左边元素
        int right = arr.length - 1;//开始时最右边的索引
        //where 循环
        while (left <= right) {//当左边下标大于右边下标时，结束循环
            int middleIndex = (left + right) / 2;//每次循环找出中间的下标
            if (num > arr[middleIndex]) {//如果查找的数大于中间下标的数，左边下标变为中间下标的下一位
                left = middleIndex + 1;
            } else if (num < arr[middleIndex]) {//如果查找的数小于中间下标的数，右边下标变为中间下标的上一位
                right = middleIndex - 1;
            } else {
                return middleIndex;//要查找的数与中见下标相等，则返回对应的下标
            }
        }
        return -1;//没找到返回-1
    }


}

