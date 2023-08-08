package Collection;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

/*
 * Serialization 
 * -> Object is converted into byte-stream.It is mainly used in Hibernate, JPA
 * -> ObjectOutputStream used for conversion
 * -> FileOutputStream used for saving.
 * -> The serialization and deserialization process is platform-independent, 
 * 	it means you can serialize an object on one platform and deserialize it on a different platform.
 * 
 * Deserialization: 
 * -> The Byte-Stream is converted into object.
 * -> ObjectInputStream used for conversion
 * -> FileInputStream used for saving
 * -> For serializing the object, we call the writeObject() method of ObjectOutputStream class, 
 *  and for deserialization we call the readObject() method of ObjectInputStream class.
 */

public class PropertiesDemo {
public static void main(String args[]) throws IOException {
	Properties p=new Properties();
	FileInputStream fis=new FileInputStream("C://Users//DELL//Documents//PropertiesDemo");
	p.load(fis);
	System.out.println(p);
	String ss=p.getProperty("Raj");
	System.out.println(ss);
	p.setProperty("Raj", "500");
	FileOutputStream fos=new FileOutputStream("C://Users//DELL//Documents//PropertiesDemo");
	p.store(fos, "Updated price");
}

}

