public class TestRecursion {
    public static void main(String[] args) {
        // 计算阶乘
        System.out.println(factorial(5));
        System.out.println(fact(5));
    }

    // 1. 循环实现
    public static int factorial(int n) {
        int result = 1;
        for(int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    // 2. 递归实现
    public static int fact(int n) {
        // return n == 1 ? n : n * fact(n - 1);

        // 基准情形
        if(n == 0) return 1;
        return n * fact(n - 1);
    }
}
