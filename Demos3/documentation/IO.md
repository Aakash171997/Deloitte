# Input Output

I/O can be operated using ```java.io.*``` objects.

### File operations

A File class instance can be created using:-

```Java
File file = new File("path\to\file\filename");
```

Various functions are made available to operate with files. These however, do not provide file streams, used for IO.

- **getName()** Returns the name of the file
- **mkdirs()** Creates new directories in the file path and returns true
- **createNewFile()** Creates a new file and returns true
- **listFiles()** Returns an array of File objects
- **isFile()** Returns true if the path specified is a file
- **isDirectory()** Returns true if the path specified is a directory

### File I/O operations

FileWriter and FileReader class instances can be used to write to and read from a file.

```Java
FileWriter fw = new FileWriter("path\to\file\filename");
FileReader fr = new FileReader("path\to\file\filename");
```

OR

```Java
File file = new File("path\to\file\filename");
FileWriter fw = new FileWriter(file);
FileReader fr = new FileReader(file);
```

A stream must be closed before another instance uses it. Two different streams can run simultaneously.

The functions ```FileWriter.write(String str)``` can be used for writing into the file, while ```FileReader.read():int``` reads from the file and returns as ASCII integers.

### Buffered Read/Write and serialization

BufferedOutputStream is used to perform faster write operation as this does not access the HDD directly. It can be instantiated via an object of FileOutputStream.

```Java
File file = new File("path\to\file\filename");
FileOutputStream fw = new FileOutputStream(file);
BufferedOutputStream bw = new BufferedOutputStream(fw);
```
This can also be instantiated using:-

```Java
BufferedOutputStream bw = new BufferedOutputStream(
				new FileOutputStream(
						new File("path\to\file\filename")));
```

Similarly, BufferedInputStream can be used for reading from a file. This, in turn can be used for ObjectOutputStream object creation required to save objects in a file.

```Java
ObjectOutputStream stream = new ObjectOutputStream(
				new BufferedOutputStream(
						new FileOutputStream(new File("path\to\file\filename"))));
```

In order to write an object to a file, we must modify the class such that it implements Serializable from ```java.io.Serializable```.

Both input and output streams are available for use and can be used for storing an object as a binary data on the HDD.

For security, a particular member in an object may be restricted from objectWrite by using ```transient``` keyword.

```Java
	private transient String password;
```

In the above snippet, password will never be stored in a file.
