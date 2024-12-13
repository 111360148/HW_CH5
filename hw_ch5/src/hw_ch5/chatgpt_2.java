package hw_ch5;

import java.util.Random;

public class chatgpt_2 {
    public static void main(String[] args) {
        // 創建 Random 物件
        Random random = new Random();

        System.out.println("Five random integers:");
        for (int i = 0; i < 5; i++) {
            System.out.println(random.nextInt(100)); // 生成 0-99 的隨機數
        }
    }
}
