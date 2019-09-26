**Return multiple values in when()**

	when( method-call ).thenReturn( value1, value2, value3 );

**Verify a method was never called**

    verify(mockedObject, never()).someMethod();

**Throw Exception**

	when(testRepositoryMock.findOne(123)).thenThrow(new NullPointerException());


**doNothing + doReturn + doThrow vs when.then**

    when is used for methods that return values

    dos are for void methods


    doNothing():

    Mockito.doNothing().when(pagLogService).updateRequestActionAndApproval( Matchers.any(Object1.class));
    doReturn():

    Mockito.doReturn(cosmosSocket).when(cosmosServiceImpl).getCosmosSocket();
    doThrow():


    thenReturn():

    Mockito.when(cf.createConnection()).thenReturn(c);


**Matches**

	any() - any object
	any(.class) - any object of the given class
	isA(.class) - checks if object is instacanceof of .class
	eq(obj) - checks if object is the same a obj



**Argument Capture - Arguments Validation**

    @Captor
    private ArgumentCaptor<Long> playerIdCapture;

    or

    private ArgumentCaptor<Long> playerIdCapture = =ArgumentCaptor.forClass(Long.class);

    Capturing Multiple Arguments

    @Captor
    private ArgumentCaptor<Long> playerIdCapture;
        
    @Captor
    private ArgumentCaptor<String> playerDbCapture;

    @Captor
    private ArgumentCaptor<List<PlayerMarketingOptInDTO>> optInsCapture;


    remoteIdentityServiceImpl.acceptMarketingOptIns(playerId, playerDb, optIns);
                    
            verify(identityService,times(1)).acceptMarketingOptIns(playerIdCapture.capture() ,  playerDbCapture.capture(), optInsCapture.capture());
            
    assertEquals(playerId, playerIdCapture.getValue());
    assertEquals(playerDbCapture, playerDbCapture.getValue());
    assertEquals(optInsCapture, optInsCapture.getValue());

