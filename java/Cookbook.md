**How to Download an Image From URL**

    URL url = new URL(urlImageToDownload);
    HttpURLConnection httpcon = (HttpURLConnection) url.openConnection(); 
    httpcon.addRequestProperty("User-Agent", "");
    BufferedImage img = null;
    BufferedImage img = ImageIO.read(httpcon.getInputStream());
    File outputfile = new File("saved.png");
    ImageIO.write(img, typeOfImage , outputfile);


**toString()**

    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }


**Get Path to Temp dir**

    System.getProperty( "java.io.tmpdir" ) 


**Get File form Resources Folder**

    ClassLoader classLoader = NameOfClass.class.getClassLoader();
            File file = new File(classLoader.getResource("test.xml").getFile());

**Read lines from File**

    try(Stream<String> stream = Files.lines(Paths.get(PATH_TO_FILE_URI))){
        stream.forEach(System.out::println);
    }

    OR

    BufferedReader b = new BufferedReader(new FileReader(f));
    String readLine = "";
    while ((readLine = b.readLine()) != null) {
        System.out.println(readLine);
    }


**Check if Debug is running**

    jdb -attach debugPort

	    >threads



**Write good DEBUG logging**

    https://garygregory.wordpress.com/2015/09/16/a-gentle-introduction-to-the-log4j-api-and-lambda-basics/

        logger.debug("I am logging that {} happened.", () -> compute());
