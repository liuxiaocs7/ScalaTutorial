public class TestOperator {
    public static void main(String[] args) {
        // 比较运算符
        String s1 = "hello";
        String s2 = new String("hello");

        Boolean isEqual = s1 == s2;
        System.out.println(isEqual);
        System.out.println(s1.equals(s2));

        System.out.println("===========================");

        // 赋值运算符
        byte b = 10;
        b = 20;
        // 高精度转低精度，需要强转
        // b = b + 1;
        // 解决方法1：
        // b = (byte)(b + 1);
        // 解决方法2：+= 默认会做强转
        b += 1;
        System.out.println(b);

        // 自增自减
        int x = 15;
        int y = x++;
        System.out.println("x = " + x + ", y = " + y);

        x = 15;
        y = ++x;
        System.out.println("x = " + x + ", y = " + y);

        x = 23;
        x = x++;
        // 最后结果还是23
        // ① temp = x++; ② x = temp;
        System.out.println(x);
    }
}
