public class TestBreak {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            if (i == 3) break;
            System.out.println(i);
        }
        System.out.println("这是循环外的代码");

        // 抛出异常退出循环
        try {
            for (int i = 0; i < 5; i++) {
                if (i == 3) {
                    throw new RuntimeException();
                }
                System.out.println(i);
            }
            System.out.println("这是循环外的代码");
        } catch (Exception e) {
            // 什么都不做，只是退出循环
            // e.printStackTrace();
        }
        System.out.println("这是循环外的代码");
    }
}
