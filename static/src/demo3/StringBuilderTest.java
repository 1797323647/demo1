package demo3;

/**
 * 使用stringBuilder拼接字符串
 */
public class StringBuilderTest {
    public static void main(String[] args) {

//        int[] arr = new int[]{10, 20, 30, 40, 50, 60};
//        System.out.println(toString(arr));

        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            System.out.println(i);
        }
        long endTime = System.currentTimeMillis();
        System.out.println((endTime - startTime)/1000.0+"s");
    }

    public static String toString(int[] arr) {
        if (arr != null) {
            StringBuilder sb = new StringBuilder("[");
            for (int i = 0; i < arr.length; i++) {
                sb.append(arr[i]).append(i == arr.length - 1 ? "" : ", ");
            }
            sb.append("]");
            return sb.toString();
        } else {
            return null;
        }

    }


}
