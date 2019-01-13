package com.practice.serialization;

import java.io.*;

/**
 * This class is explaining the Serialization in Java.
 *
 * transient and static members are not serialized.
 * If there is any change is the class while deserialization, it will give give
 * --{@link java.io.InvalidClassException} provided, the serialVesionUID is different.
 *
 * Static fields are not serialized because they are class variables and while serialization, we
 * serialize Objects.
 *
 * {@href : https://www.baeldung.com/java-serialization}
 * {@href : https://www.geeksforgeeks.org/serialization-in-java}
 *
 * If the class is not serializable and we try to writeObject usig ObjectOutputStream, then it will give
 * exception : {@link java.io.NotSerializableException}
 *
 *  ****** Enums are inherently serializable  !!!.
 *
 * @Author Vikas Katiyar email: vikaskatiyar@live.com
 * @Since 13-01-2019
 */
public class SerializationDemo {

    public static void main(String args[]) throws IOException, ClassNotFoundException {

        String fileName = "./resources/serializedFile";

        Student student = new Student();
        student.setName("Vikas");
        student.setCode("1020034");
        student.setTransientData("transientData");
        student.setEnumSerializable(EnumSerializable.INSTANCE);
        ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(fileName));
        outputStream.writeObject(student);
        System.out.println("Serialization is complete !!!");

        ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(fileName));
        Student student1 = (Student)inputStream.readObject();
        System.out.println(student1.getName());
        System.out.println(Student.getCode());
        System.out.println(student1.getTransientData());
        System.out.println(student1.getEnumSerializable());

    }
}
