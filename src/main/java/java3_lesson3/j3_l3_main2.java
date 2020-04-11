package java3_lesson3;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class j3_l3_main2 {

    public static void main(String[] args) throws IOException {

        ArrayList <InputStream> ArrayListIPS = new ArrayList<InputStream>();
        ArrayListIPS.add(new FileInputStream("j3_l3_dir/secondFile1.txt"));
        ArrayListIPS.add(new FileInputStream("j3_l3_dir/secondFile2.txt"));
        ArrayListIPS.add(new FileInputStream("j3_l3_dir/secondFile3.txt"));
        ArrayListIPS.add(new FileInputStream("j3_l3_dir/secondFile4.txt"));
        ArrayListIPS.add(new FileInputStream("j3_l3_dir/secondFile5.txt"));

        SequenceInputStream sIPS = new SequenceInputStream(Collections.enumeration(ArrayListIPS));

        int a;

        while ((a = sIPS.read()) != -1) {
            System.out.print((char)a);
        }

        sIPS.close();
    }

}
