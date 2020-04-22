import java3_lesson6.J3_L6_mainMethod2;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class test_j3_l6_2 {

    J3_L6_mainMethod2 secondTest;

    @Before
    public void init() {
        secondTest = new J3_L6_mainMethod2();
    }

    @Test
    public void test1() {
        int [] TestArray = {1, 2, 4, 4, 2, 3, 4, 1, 7 };
        Assert.assertTrue(secondTest.find1or4InArray(TestArray));
    }

    @Test
    public void test2() {
        int [] TestArray2 = {1, 2, 4, 4, 2, 3, 1, 7 };
        Assert.assertTrue(secondTest.find1or4InArray(TestArray2));
    }

    @Test
    public void test3() {
        int [] TestArray3 = {1, 2, 1, 7 };
        Assert.assertTrue(secondTest.find1or4InArray(TestArray3));
    }

    @Test
    public void test4() {
        int [] TestArray4 = {4, 1, 2, 1, 7 };
        Assert.assertTrue(secondTest.find1or4InArray(TestArray4));
    }

}