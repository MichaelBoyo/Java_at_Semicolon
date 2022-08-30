package C15_Java.serialize;

import java.io.*;

public class Example {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        serialize(); readSerializeFile();
    }

    private static void readSerializeFile() throws IOException, ClassNotFoundException {
        System.out.println(new ObjectInputStream(new FileInputStream("dog")).readObject());
    }

    private static void serialize() throws IOException {
        new ObjectOutputStream(new FileOutputStream("dog")).writeObject(new Dog("kikelomo", 32));
    }
}
