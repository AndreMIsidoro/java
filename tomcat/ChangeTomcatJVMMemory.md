Windows

Tomcat is managed by this script file catalina.bat, dive inside the script, you will find out that catalina.bat always find and run the setenv.bat file to set the environment variables.

    //...
    rem Get standard environment variables
    if not exist "%CATALINA_BASE%\bin\setenv.bat" goto checkSetenvHome
    call "%CATALINA_BASE%\bin\setenv.bat"
    goto setenvDone
    :checkSetenvHome
    if exist "%CATALINA_HOME%\bin\setenv.bat" call "%CATALINA_HOME%\bin\setenv.bat"
    :setenvDone
    //...

2.1 To set the environment variable on Windows, create a setenv.bat manually, and put it into the ${tomcat-folder}\bin folder.

    ${tomcat-folder}\bin\setenv.bat
    set JAVA_OPTS=-Dfile.encoding=UTF-8 -Xms128m -Xmx1024m -XX:PermSize=64m -XX:MaxPermSize=256m

2.2 Restart Tomcat, it will call the setenv.bat file to set the environment variable automatically.

    {$tomcat-folder}\bin\catalina.bat restart


