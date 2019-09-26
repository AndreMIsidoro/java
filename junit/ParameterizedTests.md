The custom runner Parameterized implements parameterized tests. 
When running a parameterized test class, instances are created for the cross-product of the test methods and the test data elements.

Limitation all tests of the class with receive the data. In other words only 1 @Parameters for class

Example:

```
@RunWith(Parameterized.class)
public class FibonacciTest {
    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {     
                 { 0, 0 }, { 1, 1 }, { 2, 1 }, { 3, 2 }, { 4, 3 }, { 5, 5 }, { 6, 8 }  
           });
    }

    private int fInput;

    private int fExpected;

    public FibonacciTest(int input, int expected) {
        fInput= input;
        fExpected= expected;
    }

    @Test
    public void test() {
        assertEquals(fExpected, Fibonacci.compute(fInput));
    }
}
```

**JunitParams**

Allows you to use multiple parameterized tests in just one class:
