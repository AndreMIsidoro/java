You can replace System.in with you own stream by calling System.setIn(InputStream in). 

Example:

```
public static Object[] testDataSingleLineInteger(){
		return new Object[] {"1\n","1000\n","-10\n","0\n"};
	}
	
	@Test
	@Parameters(method = "testDataSingleLineInteger")
	public void testReadingInput_Single_Line_Integer(String singleLine){
		stdinAndStdout2 = setUpStinAndStout2(singleLine);
		assertNotNull(stdinAndStdout2.scanInt());
		
	}

private static final StdinAndStdout2 setUpStinAndStout2(String input){
		ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
		System.setIn(in);
		return new StdinAndStdout2(new Scanner(System.in));	
	}
```

