/**
 * 将数据类型从低精度数据类型提升到距离最近的高精度数据类型
 */
public class TestDataTypeConversion {
    public static void main(String[] args) {
        // byte -> short -> int
        byte b = 10;
        test(b);
        // char -> int
        char c = 'a';
        test(c);
        short c2 = (short)c;
        test(c2);
    }

    // 1
    public static void test(byte b) {
        System.out.println("bbbb");
    }

    // 2
    public static void test(short s) {
        System.out.println("ssss");
    }

    public static void test(char c) {
        System.out.println("cccc");
    }

    // 3
    public static void test(int i) {
        System.out.println("iiii");
    }
}
