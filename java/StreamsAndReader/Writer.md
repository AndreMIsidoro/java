Java has two kinds of classes for input and output (I/O): streams and readers/writers.

Streams (InputStream, OutputStream and everything that extends these) are for reading and writing binary data from files, the network, or whatever other device.

Readers and writers are for reading and writing text (characters). They are a layer on top of streams, that converts binary data (bytes) to characters and back, using a character encoding.

Reading data from disk byte-by-byte is very inefficient. One way to speed it up is to use a buffer: instead of reading one byte at a time, you read a few thousand bytes at once, and put them in a buffer, in memory. Then you can look at the bytes in the buffer one by one.
