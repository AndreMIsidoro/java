**Start tomcat in debug mode**

    ./catalina.sh jpda start


**Get Tomcat Version**

    cd tomcat/lib 
    java -cp catalina.jar org.apache.catalina.util.ServerInfo

    Server version: Apache Tomcat/7.0.30 Server built: May 23 2013 02:54:10 Server number: 7.0.30.0 OS Name: Linux OS Version: 3.13.0-36-generic Architecture: amd64 JVM Version: 1.7.0_65-b32 JVM Vendor: Oracle Corporation

**Install Tomcat as A Service in Windows**

    Go to the /bin folder and run ./service.bat install serviceName