package com.practice.serialization;

import java.io.Serializable;

/**
 * This class is used to elaborate Serializable.
 *
 * @Author Vikas Katiyar email: vikaskatiyar@live.com
 * @Since 13-01-2019
 */
public class Student implements Serializable {

    /** if we do not explicitly declare the serialVersionUID, the JVM automatically generates one for us.
     * but this number is Compiler dependent and hence its recommended that we explicitly declare one.
      */
    public static final long serialVersionUID = 1l;

    /**
     * when an object has a reference to another object, these objects must implement the Serializable interface separately,
     * or else a NotSerializableException will be thrown
     */
    static String code; /** static members can not be serialized because they are class members. */
    transient String transientData; /** transient members can not be serialized. */
    private EnumSerializable enumSerializable;

    public EnumSerializable getEnumSerializable() {
        return enumSerializable;
    }

    public void setEnumSerializable(EnumSerializable enumSerializable) {
        this.enumSerializable = enumSerializable;
    }

    public String getTransientData() {
        return transientData;
    }

    public void setTransientData(String transientData) {
        this.transientData = transientData;
    }

    public static String getCode() {
        return code;
    }

    public static void setCode(String code) {
        Student.code = code;
    }

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
