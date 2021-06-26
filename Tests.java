import interfaces.AfterSuite;
import interfaces.BeforeSuite;
import interfaces.Test;

public class Tests {

    @BeforeSuite
    public void beforeSuite() {
        System.out.println("Before Suite");
    }

    @Test(priority = 3)
    public void test3() {
        System.out.println("Test 3");
    }

    @Test(priority = 1)
    public void test1() {
        System.out.println("Test 1");
    }

    @Test(priority = 2)
    public void test2A() {
        System.out.println("Test 2");
    }

    @Test(priority = 4)
    public void test2B() {
        System.out.println("Test 4");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("After Suite");
    }
}
