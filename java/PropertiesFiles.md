**Load/Read a Properties file**

    import java.util.Properties;

    Properties prop = new Properties();
    InputStream input = new FileInputStream(“config.properties”);

    //load the properties file
    prop.load(input)

    //get a property through key
    prop.getProperty(“key”)
