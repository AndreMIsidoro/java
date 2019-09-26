**Use a method to return input data**


``` 
@RunWith(JUnitParamsRunner.class)
public class JavaIfElseTest {


    public static Object[] oddNumbersData(){ 
        return new Object[] {1,-1,3,7,11,15,19,21};
    }
    
    
    @Test
    @Parameters(method = "oddNumbersData")
    public void testGetWeird_Odd_Number(int input){
        JavaIfElse javaIfElse = new JavaIfElse();
        assertEquals(JavaIfElse.WEIRD,javaIfElse.getWeird(input));
    }
}
```


The methods can be static



**Use annotation to return input data**

```
@Test
@Parameters({"2","4"})
public void testGetWeird_Even_Number_Two_To_Four(int input){
    assertEquals(JavaIfElse.NOT_WEIRD,javaIfElse.getWeird(input));
}
```



**Multiple Params**

```
public static Object[] testDataSingleLine_Two_Columns(){
    return new Object[]{
            new Object[] { "java” ,100},
            new Object[] {"cpp”,2000},
            new Object[] {"python”,1}
    };
}
```


**$ sign**

JUnitParams provides a useful $() (dollar sign) method which allows to write data-providing methods in a less verbose way:

```
public static Object[] testDataSingleLine_Two_Columns(){
    return new Object[]{
        new Object[] { "java” ,100},
        new Object[] {"cpp”,2000},
        new Object[] {"python”,1}
    };
}
```

becomes

```
public static Object[] testDataSingleLine_Two_Columns(){
    return $(
        $(“java”, 100),
        $(“cpp”,2000),
        $(“python”,1)
    );
}
```
