package java3_lesson3;

import java.io.FileInputStream;
import java.io.IOException;


public class j3_l3_main1 {

    public static void main(String[] args) {

        try {
            FileInputStream ips = new FileInputStream("j3_l3_dir/firstFile.txt");
            byte[] byteArray = new byte[50];
            int x;

            while ((x = ips.read(byteArray)) > 0) {
                System.out.println(new String(byteArray, 0, x));
            }
        }
        catch (IOException e)  {
            e.printStackTrace();
        }

    }

}
