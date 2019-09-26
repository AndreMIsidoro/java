ClassLoader = Thread.currentThread().getContextClassLoader();

InputStream is = classloader.getResouceAsStream(“Name of the file”);

OR

File = classloader.getResource(“Name of file”).getFile();


