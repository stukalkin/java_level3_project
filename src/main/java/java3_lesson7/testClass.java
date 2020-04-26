package java3_lesson7;

public class testClass {
    private String name;
    private int count;
    private int year;

    public testClass(String name, int count, int year) {
        this.name = name;
        this.count = count;
        this.year = year;
    }

    @BeforeSuite
    void beforeSuiteMethod () {
        System.out.println("BeforeSuite");
    }

    @Test
    void infoTestMethod () {
        System.out.println(name + " " + count + " " + year);
    }

    @AfterSuite
    void afterSuiteMethod () {
        System.out.println("AfterSuite");
    }
}
