package java3_lesson3;

import java.io.FileInputStream;
import java.io.IOException;

public class j3_l3_main3 {

    public static void main(String[] args) {

        // файл thirdFile.txt состоит из 300.000 строк "It's a string of big book."
        // размер файла 8.2 мб, программа загружается за 3.4 секунды, а выполняется в среднем 2 секунды

        long t = System.currentTimeMillis();
        try {
            FileInputStream ips = new FileInputStream("j3_l3_dir/thirdFile.txt");
            byte[] byteArray = new byte[1800];
            int x;

            while ((x = ips.read(byteArray)) > 0) {
                System.out.println(new String(byteArray, 0, x));
            }
        }
        catch (IOException e)  {
            e.printStackTrace();
        }
        System.out.println("\n" + (System.currentTimeMillis() - t));

    }

}
