import java3_lesson6.J3_L6_mainMethod;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class test_j3_l6_1 {

    J3_L6_mainMethod firstTest;

    @Before
        public void init() {
        firstTest = new J3_L6_mainMethod();
    }

@Test
    public void test1() {
    int [] result = {1, 7};
    int [] TestArray = {1, 2, 4, 4, 2, 3, 4, 1, 7 };
    Assert.assertArrayEquals(result, firstTest.findArrayAfter4(TestArray));
}

    @Test
    public void test2() {
        int [] result = {2, 3, 1, 7 };
        int [] TestArray2 = {1, 2, 4, 4, 2, 3, 1, 7 };
        Assert.assertArrayEquals(result, firstTest.findArrayAfter4(TestArray2));
    }

    @Test
    public void test3() {
        int [] result = {1, 7};
        int [] TestArray3 = {1, 2, 1, 7 };
        Assert.assertArrayEquals(result, firstTest.findArrayAfter4(TestArray3));
    }

    @Test
    public void test4() {
        int [] result = {1, 2, 1, 7 };
        int [] TestArray4 = {4, 1, 2, 1, 7 };
        Assert.assertArrayEquals(result, firstTest.findArrayAfter4(TestArray4));
    }

}
